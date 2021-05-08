package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JComponent{
    private BufferedImage image;
    public JImageDisplay(int width, int height){
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        super.setPreferredSize(new Dimension(width, height));
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
    public void clearImage(){
        for(int i = 0; i < image.getHeight(); i++){
            for(int j = 0; j < image.getWidth(); j++){
                image.setRGB(i, j, 0);
            }
        }
    }
    public void drawPixel(int x, int y, int rgb){
        image.setRGB(x, y, rgb);
    }
    public BufferedImage getBufferedImage(){return image;}
}
