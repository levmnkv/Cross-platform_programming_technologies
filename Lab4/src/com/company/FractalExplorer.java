package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class FractalExplorer {

    private int SCREEN_SIZE;
    private JImageDisplay display;
    private FractalGenerator fractalGenerator;
    private Rectangle2D.Double rectangle2d;

    public FractalExplorer(int SCREEN_SIZE){
        this.SCREEN_SIZE = SCREEN_SIZE;
        this.fractalGenerator = new Mandelbrot();
        this.rectangle2d = new Rectangle2D.Double(0,0,0,0);
        fractalGenerator.getInitialRange(this.rectangle2d);
    }

    public void drawFractal(){
        for(int i = 0; i < SCREEN_SIZE; i++){
            for(int j = 0; j < SCREEN_SIZE; j++){
                double xCoord = FractalGenerator.getCoord(rectangle2d.x,rectangle2d.x + rectangle2d.width, SCREEN_SIZE, i);
                double yCoord = FractalGenerator.getCoord(rectangle2d.y,rectangle2d.y + rectangle2d.height, SCREEN_SIZE, j);
                int iter = fractalGenerator.numIterations(xCoord,yCoord);
                if (iter == -1)display.drawPixel(i,j,0);
                else {
                    float hue = 0.7f + (float)iter / 200f;
                    display.drawPixel(i,j, Color.HSBtoRGB(hue,1f,1f));
                }
            }
        }
        display.repaint();
    }

    public void createAndShowGUI(){
        JFrame jFrame = new JFrame("Fractal Explorer");
        display = new JImageDisplay(SCREEN_SIZE, SCREEN_SIZE);
        JButton btn_reset = new JButton("Reset");
        btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fractalGenerator.getInitialRange(rectangle2d);
                drawFractal();
            }
        });
        display.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                double xCoord = FractalGenerator.getCoord(rectangle2d.x, rectangle2d.x + rectangle2d.width, SCREEN_SIZE, x);
                double yCoord = FractalGenerator.getCoord(rectangle2d.y, rectangle2d.y + rectangle2d.height, SCREEN_SIZE, y);
                fractalGenerator.recenterAndZoomRange(rectangle2d, xCoord, yCoord, 0.5);
                drawFractal();
            }
        });
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(display,BorderLayout.CENTER);
        jFrame.add(btn_reset,BorderLayout.SOUTH);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setResizable(false);
    }
}
