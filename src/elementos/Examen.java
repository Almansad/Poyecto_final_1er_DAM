package elementos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Examen implements Serializable {

    private Calendar fecha;
    private Nota notaExa;
    private String descripcion, nombre;

    public Examen(Calendar fecha, String descripcion, String nombre) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Examen getClon() {
        Examen r = new Examen(fecha, descripcion, nombre);
        return r;
    }

}
