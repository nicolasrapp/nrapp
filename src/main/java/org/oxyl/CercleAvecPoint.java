package org.oxyl;

public class CercleAvecPoint {

    private Point centre;
    private double rayon;

    public CercleAvecPoint (Point centre, double rayon){
        setCentre(centre);
        setRayon(rayon);
    }

    public CercleAvecPoint (CercleAvecPoint cercle){
        this(cercle.getCentre(), cercle.getRayon());
    }

    public CercleAvecPoint () {
        this(new Point(),1);
    }

    public void deplacer (double distanceX, double distanceY){
        this.centre.setX(this.centre.getX()+distanceX);
        this.centre.setY(this.centre.getY()+distanceY);
    }

    public boolean isGrand(){
        if (this.rayon > 100){
            return true;
        }
        else return false;
    }

    public void redimensionner(double f){
        setRayon(this.rayon*f);
    }

    public void tourner(double theta) {
    }


    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRayon(double rayon) {
        if (rayon < 0){
            this.rayon = 0;
        }
        else {
            this.rayon = rayon;
        }
    }

    public double getRayon() {
        return rayon;
    }

    public Point getCentre() {
        return centre;
    }


}
