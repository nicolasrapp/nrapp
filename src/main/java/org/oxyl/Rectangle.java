package org.oxyl;

public class Rectangle {

    private double centreX;
    private double centreY;
    private double longueur;
    private double largeur;
    private double angle;

    private static int NOMBRE_DE_RECTANGLE;

    public Rectangle (double centreX, double centreY, double longueur, double largeur, double angle){
        setCentreX(centreX);
        setCentreY(centreY);
        setLongueur(longueur);
        setLargeur(largeur);
        setAngle(angle);
    }

    public Rectangle (Rectangle rectangle){
        this(rectangle.getCentreX(), rectangle.getCentreY(), rectangle.getLongueur(), rectangle.getLargeur(), rectangle.getAngle());
    }

    public Rectangle (){
        this(0,0,1,1,0);
    }

    public void deplacer (double distanceX, double distanceY){
        setCentreX(this.centreX + distanceX);
        setCentreY(this.centreY + distanceY);
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

    public double getCentreX(){
        return centreX;
    }

    public double getCentreY() {
        return centreY;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getAngle() {
        return angle;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }

    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setLargeur(double largeur) {
        if (largeur < 0){
            this.largeur = 0;
        }
        else {
            this.largeur = largeur;
        }
    }

    public void setLongueur(double longueur) {
        if (longueur < 0){
            this.longueur = 0;
        }
        else {
            this.longueur = longueur;
        }
    }


}
