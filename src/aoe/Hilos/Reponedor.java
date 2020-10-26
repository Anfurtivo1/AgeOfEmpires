
package aoe.Hilos;

import aoe.Edificios.*;

/**
 *
 * @author Andres
 */
public class Reponedor extends Thread{
    Carpinteria carpinteria;
    MinaOro minaOro;

    public Reponedor(Carpinteria carpinteria, MinaOro minaOro) {
        this.carpinteria = carpinteria;
        this.minaOro = minaOro;
    }
    
    
    
    @Override
    public void run(){
        if (carpinteria.getRecurso()<2500) {
            while (carpinteria.getRecurso()<=2500) {
                carpinteria.setRecurso(carpinteria.getRecurso()+1);
            }
            System.out.println("Reponedor reponiendo carpinteria");
        }else{
            System.out.println("Los depositos estaban llenos");
        }
        
        if (minaOro.getRecurso()<2000) {
            while (minaOro.getRecurso()<=2000) {
                minaOro.setRecurso(minaOro.getRecurso()+1);
            }
            System.out.println("Reponedor reponiendo mina de oro");
        }else{
            System.out.println("Los depositos estaban llenos");
        }
    }
}
