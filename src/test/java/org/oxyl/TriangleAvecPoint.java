package org.oxyl;

public class TriangleAvecPoint {

    private Point point1;
    private Point point2;
    private Point point3;

    public TriangleAvecPoint (Point point1, Point point2, Point point3){
        setPoint1(point1);
        setPoint2(point2);
        setPoint3(point3);
    }

    public TriangleAvecPoint (TriangleAvecPoint triangle){
        this (triangle.getPoint1(), triangle.getPoint2(), triangle.getPoint3());
    }

    public TriangleAvecPoint () {
        this (new Point(), new Point(), new Point());
    }

    public void deplacer (double distanceX, double distanceY){
        this.point1.setX(this.point1.getX()+distanceX);
        this.point2.setX(this.point2.getX()+distanceX);
        this.point3.setX(this.point3.getX()+distanceX);

        this.point1.setY(this.point1.getY()+distanceY);
        this.point2.setY(this.point2.getY()+distanceY);
        this.point3.setY(this.point3.getY()+distanceY);


    }


    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
}
