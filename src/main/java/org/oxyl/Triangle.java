package org.oxyl;

public class Triangle {

    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    private static int NOMBRE_DE_TRIANGLES;

    public Triangle (double x1, double y1, double x2, double y2, double x3, double y3){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setX3(x3);
        setY3(y3);
    }

    public Triangle (Triangle triangle){
        this(triangle.getX1(), triangle.getY1(), triangle.getX2(), triangle.getY2(), triangle.getX3(), triangle.getY3());
    }

    public Triangle (){
        this(0,0,0,1,0.5,0.5);
    }

    public void deplacer (double distanceX, double distanceY){
        setX1(this.x1+distanceX);
        setX2(this.x2+distanceX);
        setX3(this.x3+distanceX);

        setY1(this.y1+distanceY);
        setY2(this.y2+distanceY);
        setY3(this.y3+distanceY);

    }


    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

}
