
package aoe.Hilos;

import aoe.Edificios.*;

/**
 *
 * @author Andres
 */
public class ConseguirRecursos extends Thread{
    MinaOro minaEspanol;
    Carpinteria carpinteriaEspanol;

    public ConseguirRecursos(MinaOro minaEspanol, Carpinteria carpinteriaEspanol) {
        this.minaEspanol = minaEspanol;
        this.carpinteriaEspanol = carpinteriaEspanol;
    }
    
    
    
    public void run(){
        int recursos=0;
        for (int i = 0; i < minaEspanol.getAldeanos().length; i++) {
            recursos=minaEspanol.getAldeanos()[i].getCapacidadTrabajo();
            minaEspanol.setRecurso(minaEspanol.getRecurso()-recursos);
            minaEspanol.setRecursosTotales(minaEspanol.getRecursosTotales()+recursos);
            carpinteriaEspanol.setRecurso(carpinteriaEspanol.getRecurso()-recursos);
            carpinteriaEspanol.setRecursosTotales(carpinteriaEspanol.getRecursosTotales()+recursos);
        }
    }
}
