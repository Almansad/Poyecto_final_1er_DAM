package elementos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Trabajo implements Serializable {

    private Calendar fecha;
    private Nota notaTra;
    private String descripcion, nombre;

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Nota getNotaTra() {
        return notaTra;
    }

    public void setNotaTra(Nota notaTra) {
        this.notaTra = notaTra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Trabajo getClon() {
        Trabajo r = new Trabajo();
        r.setFecha((Calendar) fecha.clone());
        r.setNombre(nombre);
        r.setNotaTra(notaTra.getClon());

        return r;
    }
}
