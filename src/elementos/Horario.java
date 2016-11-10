package elementos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Horario implements Serializable {

    private TreeSet<Hora>[] dia = new TreeSet[5];

    public Horario() {
        for (int i = 0; dia.length > i; i++) {
            dia[i] = new TreeSet();
        }
    }

    public void addHorasAsig(Asignatura a) {
        Iterator iter = a.getHorarios().iterator();
        Hora o;
        do {
            o = (Hora) iter.next();
            dia[o.getDia()].add(o);
        } while (iter.hasNext());
    }

    public TreeSet<Hora>[] getDia() {
        return dia;
    }

    public void setDia(TreeSet<Hora>[] dia) {
        this.dia = dia;
    }

    public Horario getClon() {
        Horario r = new Horario();
        TreeSet<Hora>[] m = new TreeSet[5];
        for (int i = 0; i < m.length; i++) {
            m[i] = getClonDia(i);
            
        }
        r.setDia(m);
        return r;
    }

    private TreeSet<Hora> getClonDia(int n) {
        TreeSet<Hora> r = new TreeSet();
        Iterator iter = dia[n].iterator();
        while (iter.hasNext()) {
            Hora m = (Hora) iter.next();
            r.add(m.getClon());
        }
        
        return r;
    }

}
