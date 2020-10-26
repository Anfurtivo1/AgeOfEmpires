
package aoe.Hilos;

import aoe.Edificios.*;

/**
 *
 * @author Andres
 */
public class ConseguirRecursos extends Thread{
    MinaOro minaEspanol;
    Carpinteria carpinteriaEspanol;
    MinaOro minaVikinga;
    Carpinteria carpinteriaVikinga;

    public ConseguirRecursos(MinaOro minaEspanol, Carpinteria carpinteriaEspanol, MinaOro minaVikinga, Carpinteria carpinteriaVikinga) {
        this.minaEspanol = minaEspanol;
        this.carpinteriaEspanol = carpinteriaEspanol;
        this.minaVikinga = minaVikinga;
        this.carpinteriaVikinga = carpinteriaVikinga;
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
        recursos=0;
        for (int i = 0; i < minaVikinga.getAldeanos().length; i++) {
            recursos=minaVikinga.getAldeanos()[i].getCapacidadTrabajo();
            minaVikinga.setRecurso(minaVikinga.getRecurso()-recursos);
            minaVikinga.setRecursosTotales(minaVikinga.getRecursosTotales()+recursos);
            carpinteriaVikinga.setRecurso(carpinteriaVikinga.getRecurso()-recursos);
            carpinteriaVikinga.setRecursosTotales(carpinteriaVikinga.getRecursosTotales()+recursos);
        }
    }
}
