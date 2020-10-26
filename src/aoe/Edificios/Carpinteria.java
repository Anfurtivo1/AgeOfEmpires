
package aoe.Edificios;

import aoe.Unidades.*;

/**
 *
 * @author Andrés
 */
public class Carpinteria extends Edificio{
    private Aldeano aldeanos[]= new Aldeano [16];
    private Caballero caballeros[] = new Caballero[9];
    private int recurso=2500;
    private int recursosTotales=0;

    public Carpinteria() {
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
    
    
    
    public Carpinteria rellenarCarpinteriaAldeanos(){
        Carpinteria carpinteria = new Carpinteria();
        for (int i = 0; i < carpinteria.aldeanos.length; i++) {
            Aldeano aldeano= new Aldeano(10,20,i);
           carpinteria.aldeanos[i]= aldeano;
           
        }
        return carpinteria;
    }
    
    public Carpinteria rellenarCarpinteriaCaballeros(){
        Carpinteria carpinteria = new Carpinteria();
        for (int i = 0; i < carpinteria.caballeros.length; i++) {
            Caballero caballero= new Caballero(10,20);
           carpinteria.caballeros[i]= caballero;
           
        }
        return carpinteria;
    }
    
}
