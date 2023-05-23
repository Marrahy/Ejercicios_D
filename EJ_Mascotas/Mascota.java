package EJ_Mascotas;

abstract class Mascota {
    
    //Atributos
    protected String nombre;
    protected int edad;

    //Constructor vacio
    public Mascota(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    //Metodos
    public String toString() {
        return getClass().getSimpleName() + getNombre() + " tiene " + getEdad() + " años.";
    }

    public void cumpleaños() {
        edad += 1;
    }

    abstract void habla();
}
