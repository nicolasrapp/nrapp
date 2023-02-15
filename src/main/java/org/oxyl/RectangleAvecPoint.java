package org.oxyl;

public class RectangleAvecPoint {

    private Point centre;
    private double longueur;
    private double largeur;
    private double angle;

    public RectangleAvecPoint (Point centre, double longueur, double largeur, double angle){
        setCentre(centre);
        setLongueur(longueur);
        setLargeur(largeur);
        setAngle(angle);
    }

    public RectangleAvecPoint (RectangleAvecPoint rectangle){
        this(rectangle.getCentre(), rectangle.getLongueur(), rectangle.getLargeur(), rectangle.getAngle());
    }

    public RectangleAvecPoint() {
        this (new Point(), 1,1,0);
    }

    public void deplacer (double distanceX, double distanceY){
        this.centre.setX(this.centre.getX() + distanceX);
        this.centre.setY(this.centre.getY() + distanceY);
    }

    public boolean isCarre () {
        return (this.longueur == this.largeur);
    }

    public void redimensionner(double f) {
        setLongueur(this.longueur*f);
        setLargeur(this.largeur*f);
    }

    public void tourner (double theta){
        setAngle(this.angle + theta);
    }


    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public Point getCentre() {
        return centre;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getAngle() {
        return angle;
    }

    public double getLongueur() {
        return longueur;
    }
}
