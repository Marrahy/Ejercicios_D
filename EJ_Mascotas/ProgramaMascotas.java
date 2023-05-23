package EJ_Mascotas;

import java.util.ArrayList;

public class ProgramaMascotas {
    
    public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        mascotas.add(new Perro("Leo", 5, false));
        mascotas.add(new Perro("Arya", 2, true));
        // mascotas.add(new Gato("Carramantari", 2, "Naranja"));
        // mascotas.add(new Gato("qwe", 1, "Negro"));
        // mascotas.add(new Canario("Perico", 2, true));
        // mascotas.add(new Canario("Kiko", 1, false));

        for (Mascota m: mascotas) {
            System.out.println("Mascotas: " + m.toString());
        }
    }

}
