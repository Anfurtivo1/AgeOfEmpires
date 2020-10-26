
package aoe;

/**
 *
 * @author Andres
 */
public class Civilizacion {
    private int almacenGeneral;
    private Civilizaciones civilizacion;

    public Civilizacion(int almacenGeneral, Civilizaciones civilizacion) {
        this.almacenGeneral = almacenGeneral;
        this.civilizacion = civilizacion;
    }

    public int getAlmacenGeneral() {
        return almacenGeneral;
    }

    public void setAlmacenGeneral(int almacenGeneral) {
        this.almacenGeneral = almacenGeneral;
    }
}
