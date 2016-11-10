package Utilidades;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ManejoFicheros {

    /**
     * Metodo que guarda el objeto en el fichero con la opcion de evitar el
     * encabezado (StreamCorruptedException)
     *
     * @param nomFichero Nombre del fichero
     * @param ob
     */
    public static void guardar(String nomFichero, ArrayList list) {
        ObjectOutputStream escri;
        try {
            escri = new ObjectOutputStream(new FileOutputStream(nomFichero));
            for (int i = 0; i < list.size(); i++) {
                Object elementAt = list.get(i);
                escri.writeObject(elementAt);
            }
            escri.close();
        } catch (IOException ex) {
            System.out.println("Algo ha ido mal");
        }

    }

    /**
     * Leer los objetos de un fichero
     *
     * @param nomFichero nombre del fichero
     * @return ArrayList de los objetos que han sido leidos en el fichero
     */
    public static ArrayList obtener(String nomFichero) {
        ArrayList r = new ArrayList();
        ObjectInputStream sacar = null;
        try {
            sacar = new ObjectInputStream(new FileInputStream(nomFichero));

        } catch (IOException e) {
            System.out.println("Algo a salido mal");
        }
        try {

            while (true) {
                r.add(sacar.readObject());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Fin del fichero");
        } catch (IOException ex) {
            System.out.println("Fin del fichero");
        }
        return r;
    }
}
