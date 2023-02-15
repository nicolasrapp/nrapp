package org.oxyl;

public class Point {

    private  double x;
    private double y;

    public Point (double x, double y){
        setX(x);
        setY(y);
    }

    public Point (Point point){
        this(point.getX(), point.getY());
    }

    public Point () {
        this(0,0);

    }

    public boolean equals (Object object) {
        if (object.getClass() == this.getClass()){
            return ((Point) object).getX() == this.x && ((Point) object).getY() == this.y;
        }
        else {
            return false;
        }
    }

    public double calculerDistance (Point point) {
        double distance = Math.sqrt(Math.pow(point.getX()-this.x, 2) + Math.pow(point.getY()-this.y, 2));
        return distance;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


}
