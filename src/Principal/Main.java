package Principal;

import Utilidades.ManejoFicheros;
import Ventanas.Principal;
import elementos.Curso;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        File fichero = new File("cursos.obj");
        Principal ventana;
        ArrayList cur = new ArrayList();

        if (fichero.exists()) {
            ventana = new Principal((ArrayList<Curso>) ManejoFicheros.obtener("cursos.obj"));
        } else {
            ventana = new Principal();

        }
    }

}
