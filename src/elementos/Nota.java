
package elementos;

import java.io.Serializable;


public class Nota implements Serializable{
    private double nota, porcen;

    public Nota(double nota, double porcen) {
        this.nota = nota;
        this.porcen = porcen;
    }
    public Nota getClon(){
        Nota r = new Nota(nota, porcen);
        return r;
    }
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPorcen() {
        return porcen;
    }

    public void setPorcen(double porcen) {
        this.porcen = porcen;
    }
   

}
