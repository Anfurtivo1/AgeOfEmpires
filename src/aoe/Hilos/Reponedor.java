
package aoe.Hilos;

import aoe.Edificios.*;

/**
 *
 * @author Andres
 */
public class Reponedor extends Thread{
    Carpinteria carpinteriaEspanol;
    MinaOro minaOroEspanol;
    MinaOro minaVikinga;
    Carpinteria carpinteriaVikinga;

    public Reponedor(Carpinteria carpinteriaEspanol, MinaOro minaOroEspanol, MinaOro minaVikinga, Carpinteria carpinteriaVikinga) {
        this.carpinteriaEspanol = carpinteriaEspanol;
        this.minaOroEspanol = minaOroEspanol;
        this.minaVikinga = minaVikinga;
        this.carpinteriaVikinga = carpinteriaVikinga;
    }

    
    
    @Override
    public void run(){
        if (carpinteriaEspanol.getRecurso()<2500) {
            while (carpinteriaEspanol.getRecurso()<=2500) {
                carpinteriaEspanol.setRecurso(carpinteriaEspanol.getRecurso()+1);
            }
            System.out.println("Reponedor reponiendo carpinteria española");
        }else{
            System.out.println("Los depositos estaban llenos");
        }
        
        if (minaOroEspanol.getRecurso()<2000) {
            while (minaOroEspanol.getRecurso()<=2000) {
                minaOroEspanol.setRecurso(minaOroEspanol.getRecurso()+1);
            }
            System.out.println("Reponedor reponiendo mina de oro española");
        }else{
            System.out.println("Los depositos estaban llenos");
        }
        
        if (carpinteriaVikinga.getRecurso()<2500) {
            while (carpinteriaVikinga.getRecurso()<=2500) {
                carpinteriaVikinga.setRecurso(carpinteriaVikinga.getRecurso()+1);
            }
            System.out.println("Reponedor reponiendo carpinteria vikinga");
        }else{
            System.out.println("Los depositos estaban llenos");
        }
        
        if (minaVikinga.getRecurso()<2000) {
            while (minaVikinga.getRecurso()<=2000) {
                minaVikinga.setRecurso(minaVikinga.getRecurso()+1);
            }
            System.out.println("Reponedor reponiendo mina de oro vikinga");
        }else{
            System.out.println("Los depositos estaban llenos");
        }
        
    }
}
