package EJ_Figuras;

public class Triangulo extends Figura{

    //Atributos
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    //Metodos
    @Override
    double area() {
        return base * altura;
    }
}
