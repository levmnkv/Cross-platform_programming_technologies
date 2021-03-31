
public class Lab1 {

    public static void main(String[] args) {
        Point3d point3dOne = new Point3d(1.0, 2.0, 3.0);
        Point3d point3dTwo = new Point3d(2.0, 2.0, 4.0);
        Point3d point3dThree = new Point3d(1.0, 3.0, 5.0);
        System.out.println(point3dOne.comparePoints(point3dTwo));
        System.out.println(point3dOne.distanceTo(point3dTwo));
        System.out.println(computeArea(point3dOne, point3dTwo, point3dThree));
    }

    static double computeArea(Point3d point3dOne, Point3d point3dTwo, Point3d point3dThree){
        double x=point3dOne.distanceTo(point3dTwo);//расстояние от point3dOne до point3dTwo
        double y=point3dOne.distanceTo(point3dThree);//расстояние от point3dOne до point3dThree
        double z=point3dTwo.distanceTo(point3dThree);//расстояние от point3dTwo до point3dThree
        double per=(x+y+z)/2;
        return Math.ceil(Math.sqrt(per*(per-x)*(per-y)*(per-z)) * 100)/100;
    }
}