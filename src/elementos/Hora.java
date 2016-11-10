
package elementos;

import java.io.Serializable;


class Hora  implements Comparable<Hora> , Serializable{

    private int dia;
    private double horaIn, horaFin;
    private Asignatura asig;
    /*
    variable dia esta comprendido entre 0 asta el 4
    variable horaIn y horaFin tiene este formato hh,mm
    */

    public Hora(int dia, double horaIn, double horaFin, Asignatura asig) {
        this.dia = dia;
        this.horaIn = horaIn;
        this.horaFin = horaFin;
        this.asig = asig;
    }
    public Hora getClon(){
        Hora r = new Hora(dia, horaIn, horaFin, asig);
        return r;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getHoraIn() {
        return horaIn;
    }

    public void setHoraIn(double horaIn) {
        this.horaIn = horaIn;
    }

    public double getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(double horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public int compareTo(Hora t) {
        int r;
        if(this.horaIn - t.getHoraIn() > 0){
            r = 1;
        }else{
            r = -1;
        }
        return r;
    }
    
}
