package EJ_Figuras;

public class Circulo extends Figura{

    //Atributos
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    //Setters
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Getters
    public double getRadio() {
        return radio;
    }

    //Metodos
    @Override
    double area() {
        return 3.1415 * (radio * radio);
    }
}
