package com.company;

class Point2d {
    protected double xCoordinate;
    protected double yCoordinate;

    public Point2d(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public Point2d(){
        this(0.0,0.0);
    }

    public double getX(){
        return xCoordinate;
    }
    public double getY(){
        return yCoordinate;
    }

    public void setX(double value){
        xCoordinate = value;
    }
    public void setY(double value){
        yCoordinate = value;
    }
    public boolean comparePoints(Point2d point2d){
        return (this.xCoordinate == point2d.xCoordinate &&
                this.yCoordinate == point2d.yCoordinate);
    }
}
