
package aoe.Edificios;

import aoe.Unidades.*;

/**
 *
 * @author Andrés
 */
public class MinaOro extends Edificio{
    private Aldeano aldeanos[]= new Aldeano [10];
    private Caballero caballeros[] = new Caballero[7];
    private int recurso=2000;
    private int recursosTotales=0;

    public MinaOro() {
    }

    public Aldeano[] getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(Aldeano[] aldeanos) {
        this.aldeanos = aldeanos;
    }

    public Caballero[] getCaballeros() {
        return caballeros;
    }

    public void setCaballeros(Caballero[] caballeros) {
        this.caballeros = caballeros;
    }

    public int getRecurso() {
        return recurso;
    }

    public void setRecurso(int recurso) {
        this.recurso = recurso;
    }

    public int getRecursosTotales() {
        return recursosTotales;
    }

    public void setRecursosTotales(int recursosTotales) {
        this.recursosTotales = recursosTotales;
    }
    
    public MinaOro rellenarMinaAldeanos(){
        MinaOro mina = new MinaOro();
        for (int i = 0; i < mina.aldeanos.length; i++) {
            Aldeano aldeano= new Aldeano(10,20,i);
           mina.aldeanos[i]= aldeano; 
        }
        return mina;
    }
    
    public MinaOro rellenarMinaCaballeros(){
        MinaOro mina = new MinaOro();
        for (int i = 0; i < mina.caballeros.length; i++) {
            Caballero caballero= new Caballero(10,20);
           mina.caballeros[i]= caballero;
        }
        return mina;
    }
    
}
