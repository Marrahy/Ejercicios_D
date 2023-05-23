package EJ_Figuras;

public class Rectangulo extends Figura {
    
    //Atributos
    protected double ancho;
    protected double largo;

    //Constructor
    public Rectangulo(double ancho, double largo) {
        setLargo(largo);
        setAncho(ancho);
    }

    //Setters
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //Getters
    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    //Metodos
    @Override
    double area() {
        return ancho * largo;
    }
}
