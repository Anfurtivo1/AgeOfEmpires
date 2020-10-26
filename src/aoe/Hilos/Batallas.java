
package aoe.Hilos;

import aoe.Edificios.*;

/**
 *
 * @author Andres
 */
public class Batallas extends Thread{
    
    MinaOro minaEspanol;
    Carpinteria carpinteriaEspanol;
    MinaOro minaVikinga;
    Carpinteria carpinteriaVikinga;

    public Batallas(MinaOro minaEspanol, Carpinteria carpinteriaEspanol,MinaOro minaVikinga,Carpinteria carpinteriaVikinga) {
        this.minaEspanol = minaEspanol;
        this.carpinteriaEspanol = carpinteriaEspanol;
        this.minaVikinga = minaVikinga;
        this.carpinteriaVikinga = carpinteriaVikinga;
    }
    
    @Override
    public void start(){
        int sumaCaballerosEspanol=0;
        int sumaCaballerosVikingo=0;
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
        
        minaVikinga=minaVikinga.rellenarMinaCaballeros();
        carpinteriaVikinga=carpinteriaVikinga.rellenarCarpinteriaCaballeros();
        System.out.println("Rellenando los edificios de caballeros para la batalla");
        for (int i = 0; i < minaVikinga.getCaballeros().length; i++) {
            aux=minaVikinga.getCaballeros()[i].getNivelAtaque();
            sumaCaballerosVikingo=aux+sumaCaballerosVikingo;
        }

        for (int i = 0; i < carpinteriaVikinga.getCaballeros().length; i++) {
            aux=carpinteriaVikinga.getCaballeros()[i].getNivelAtaque();
            sumaCaballerosVikingo=aux+sumaCaballerosVikingo;
        }
        System.out.println("La capacidad de ataque de los caballeros vikingos es "+sumaCaballerosVikingo);
        
        if (sumaCaballerosVikingo>sumaCaballerosEspanol) {
            System.out.println("Los vikingos tienen mas capacidad de ataque");
        }
        else{
            System.out.println("Los Españoles tienen mas capacidad de ataque");
        }

    }
    
}
