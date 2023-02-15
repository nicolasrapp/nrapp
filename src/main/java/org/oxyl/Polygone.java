package org.oxyl;

abstract class Polygone {
    protected Point point;

    public Polygone (Point point){
        setPoint(point);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
