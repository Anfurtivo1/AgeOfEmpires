
package aoe;

import aoe.Edificios.*;
import aoe.Unidades.*;

/**
 *
 * @author Andrés
 */
public class AOE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MinaOro minaEspanol = new MinaOro();
        Carpinteria carpinteriaEspanol= new Carpinteria();
        MinaOro minaVikinga = new MinaOro();
        Carpinteria carpinteriaVikinga= new Carpinteria();
        int aldeanoEspanol=100;
        int aldeanoVikingo=100;
        
        minaEspanol.rellenarMinaAldeanos();
        minaVikinga.rellenarMinaAldeanos();
        System.out.println("");
        
    }
    
}
