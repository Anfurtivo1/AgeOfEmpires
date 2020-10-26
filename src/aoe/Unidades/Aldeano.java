
package aoe.Unidades;

/**
 *
 * @author Andrés
 */
public class Aldeano extends Unidades{
    private int capacidadTrabajo;
    private int turno;

    public Aldeano(int capacidadTrabajo,int turno, int vida) {
        super(vida);
        this.capacidadTrabajo = capacidadTrabajo;
        this.turno=turno;
    }

    public Aldeano() {
    }

    public int getCapacidadTrabajo() {
        return capacidadTrabajo;
    }

    public void setCapacidadTrabajo(int capacidadTrabajo) {
        this.capacidadTrabajo = capacidadTrabajo;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
