package EJ_Mascotas;

public class Perro extends Mascota {
    
    //Atributos
    protected boolean pulgas;

    //Constrcutor
    public Perro(String nombre, int edad, boolean pulgas) {
        super(nombre, edad);
        setPulgas(pulgas);
    }

    //Setter
    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public boolean getPulgas() {
        return pulgas;
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString() + " pulgas: " + ( (pulgas) ? "Sí" : "No" );
    }

    @Override
    public void habla() {
        System.out.println("Guau Guau");
    }
}
