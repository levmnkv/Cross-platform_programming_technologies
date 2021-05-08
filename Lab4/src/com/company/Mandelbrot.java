package com.company;


import java.awt.geom.Rectangle2D;

class Mandelbrot extends FractalGenerator{

    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2.0;
        range.y = -1.5;
        range.height = 3;
        range.width = 3;
    }

    public static final int MAX_ITERATIONS = 2000;

    @Override
    public int numIterations(double x, double y) {
        int iteration = 0;
        double x1 = 0, y1 = 0, _x1 = 0, _y1 = 0;
        while (x1*x1 - y1*y1 < 4 && iteration < MAX_ITERATIONS){
            _x1 = x1*x1 - y1*y1 + x;
            _y1 = 2*x1*y1 + y;
            x1 = _x1;
            y1 = _y1;
            iteration++;
        }
        if(iteration >= MAX_ITERATIONS) return -1;
            return iteration;
    }
}
