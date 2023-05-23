package EJ_Figuras;

public class Cuadrado extends Figura{
    
    //Atributos
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //Setters
    public void setLado(double lado) {
        this.lado = lado;
    }

    //Getters
    public double getLado() {
        return lado;
    }

    //Metodos
    @Override
    double area() {
        return lado * lado;
    }
}
