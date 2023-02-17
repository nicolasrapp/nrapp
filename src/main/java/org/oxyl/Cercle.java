package org.oxyl;

public class Cercle {
    private double centreX;
    private double centreY;
    private double rayon;

    private int lecercle;

    private static int NOMBRE_DE_CERCLES;


    public Cercle(double centreX, double centreY, double rayon ) {
        setCentreX(centreX);
        setCentreY(centreY);
        setRayon(rayon);
        NOMBRE_DE_CERCLES++;
    }

    public Cercle(Cercle cercle){
        this(cercle.getCentreX(), cercle.getCentreY(), cercle.getRayon());
    }

    public Cercle(){
        this(0,0,1);
    }

    public void deplacer(double distanceX, double distanceY){
        setCentreX(this.centreX + distanceX);
        setCentreY(this.centreY + distanceY);
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

    public void tourner(double theta){

    }


    public String toString(){
        return "CentreX = " + centreX + "\nCentreY = " + centreY + "\nRayon = " + rayon;
    }

    public double getCentreX(){
        return centreX;
    }

    public double getCentreY(){
        return centreY;
    }

    public double getRayon() {
        return rayon;
    }

    public static int getNombreDeCercles() {
        return NOMBRE_DE_CERCLES;
    }

    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }

    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }

    public static void setNombreDeCercles(int nombreDeCercles) {
        NOMBRE_DE_CERCLES = nombreDeCercles;
    }

    public void setRayon(double rayon) {
        if (rayon < 0){
            this.rayon = 0;
        }
        else {
            this.rayon = rayon;
        }
    }



}


