package elementos;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Asignatura implements Serializable, Comparable<Asignatura> {

    private String nombre, profesor, aula, contacto;
    private double horasSema;
    private Color color;
    private ArrayList<Hora> horarios = new ArrayList();
    private ArrayList<Examen> examenes = new ArrayList();
    private ArrayList<Trabajo> trabajos = new ArrayList();

    public Asignatura(String nombre, String profesor, String aula, double horasSema, Color color,String contacto) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.aula = aula;
        this.horasSema = horasSema;
        this.color = color;
        this.contacto = contacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void addTrabajo(Trabajo e) {
        trabajos.add(e);
    }

    public void addExamen(Examen e) {
        examenes.add(e);
    }

    public Asignatura getClon() {
        Asignatura r = new Asignatura(nombre, profesor, aula, horasSema, color, contacto);
        this.setExamenes(examenes);
        this.setHorarios(horarios);
        this.setTrabajos(trabajos);
        return r;
    }

    private ArrayList<Examen> getClonExamenes() {
        ArrayList<Examen> r = new ArrayList();
        Iterator iter = examenes.iterator();
        while (iter.hasNext()) {
            Examen m = (Examen) iter.next();
            r.add(m.getClon());
        }
        return r;
    }

    private ArrayList<Horario> getClonHorarios() {
        ArrayList<Horario> r = new ArrayList();
        Iterator iter = horarios.iterator();
        while (iter.hasNext()) {
            Horario m = (Horario) iter.next();
            r.add(m.getClon());
        }
        return r;
    }

    private ArrayList<Trabajo> getClonTrabajos() {
        ArrayList<Trabajo> r = new ArrayList();
        Iterator iter = horarios.iterator();
        while (iter.hasNext()) {
            Trabajo m = (Trabajo) iter.next();
            r.add(m.getClon());
        }
        return r;
    }
    //Gets

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public ArrayList<Trabajo> getTrabajos() {
        return trabajos;
    }

    public ArrayList<Hora> getHorarios() {
        return horarios;
    }

    public Color getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getAula() {
        return aula;
    }

    public double getHorasSema() {
        return horasSema;
    }
    //Sets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setHorasSema(double horasSema) {
        this.horasSema = horasSema;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setHorarios(ArrayList<Hora> horarios) {
        this.horarios = horarios;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public void setTrabajos(ArrayList<Trabajo> trabajos) {
        this.trabajos = trabajos;
    }

    @Override
    public int compareTo(Asignatura t) {
        int b = 0;
        int a = 0;
        try {
            a = Integer.parseInt(t.getNombre());
            b = Integer.parseInt(nombre);
        } catch (NumberFormatException e) {
            try {
                Integer.parseInt(nombre);
            } catch (NumberFormatException r) {

                return nombre.compareTo(t.getNombre());
            }
            return -1;
        }
        return (b - a);
    }
}
