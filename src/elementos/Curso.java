package elementos;

import Ventanas.CursoGUI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Curso implements Serializable {

    private String nombre;
    private TreeSet<Asignatura> asignatura = new TreeSet();
    private Horario horario;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignatura(TreeSet<Asignatura> asignatura) {
        this.asignatura = asignatura;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void addAsignatura(Asignatura a) {
        this.asignatura.add(a);
    }

    public Curso getClon() {
        Curso r = new Curso(nombre);
        r.setAsignatura(getClonAsignaturas());
        r.setHorario(horario);
        return r;
    }

    private TreeSet<Asignatura> getClonAsignaturas() {
        TreeSet<Asignatura> r = new TreeSet();
        Iterator iter = asignatura.iterator();
        while (iter.hasNext()) {
            Asignatura m = (Asignatura) iter.next();
            r.add(m.getClon());
        }
        return r;
    }

    public void crearHorario() {
        Iterator iter = this.asignatura.iterator();
        Asignatura a;
        horario = new Horario();
        do {
            a = (Asignatura) iter.next();
            horario.addHorasAsig(a);
        } while (iter.hasNext());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Asignatura> getAsignatura() {
        return asignatura;
    }

    public Horario getHorario() {
        return horario;
    }

}
