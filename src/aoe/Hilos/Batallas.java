
package aoe.Hilos;

import aoe.Edificios.*;

/**
 *
 * @author Andres
 */
public class Batallas extends Thread{
    
    MinaOro minaEspanol;
    Carpinteria carpinteriaEspanol;

    public Batallas(MinaOro minaEspanol, Carpinteria carpinteriaEspanol) {
        this.minaEspanol = minaEspanol;
        this.carpinteriaEspanol = carpinteriaEspanol;
    }
    
    @Override
    public void start(){
        int sumaCaballerosEspanol=0;
        int aux=0;
        
        minaEspanol=minaEspanol.rellenarMinaCaballeros();
        carpinteriaEspanol=carpinteriaEspanol.rellenarCarpinteriaCaballeros();
        System.out.println("Rellenando los edificios de caballeros para la batalla");
        for (int i = 0; i < minaEspanol.getCaballeros().length; i++) {
            aux=minaEspanol.getCaballeros()[i].getNivelAtaque();
            sumaCaballerosEspanol=aux+sumaCaballerosEspanol;
        }

        for (int i = 0; i < carpinteriaEspanol.getCaballeros().length; i++) {
            aux=carpinteriaEspanol.getCaballeros()[i].getNivelAtaque();
            sumaCaballerosEspanol=aux+sumaCaballerosEspanol;
        }
        System.out.println("La capacidad de ataque de los caballeros españoles es "+sumaCaballerosEspanol);

    }
    
}
