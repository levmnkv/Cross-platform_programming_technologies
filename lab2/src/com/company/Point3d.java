package com.company;

class Point3d extends Point2d {
    protected double zCoordinate;
    public Point3d(double xCoordinate, double yCoordinate, double zCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
    }

    public double getZ(){return zCoordinate;}
    public void setZ(double value) {
        zCoordinate = value;
    }

    public Point3d(){
        this(0.0,0.0,0.0);
    }
    public double distanceTo(Point3d point3d){
        double distance;
        distance = Math.ceil(Math.sqrt(
                   Math.pow((point3d.xCoordinate-this.xCoordinate), 2)
                  +Math.pow((point3d.yCoordinate-this.yCoordinate), 2)
                  +Math.pow((point3d.zCoordinate-this.zCoordinate), 2))*100)/100;
        return distance;
    }

    public boolean comparePoints(Point3d point3d) {
        return super.comparePoints(point3d) && this.zCoordinate == point3d.zCoordinate;
    }
}
