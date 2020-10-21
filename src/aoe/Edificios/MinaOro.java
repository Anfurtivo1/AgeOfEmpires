
package aoe.Edificios;

import aoe.Unidades.*;

/**
 *
 * @author Andrés
 */
public class MinaOro extends Edificio{
    private Aldeano aldeanos[]= new Aldeano [10];
    private Caballero caballeros[] = new Caballero[7];
    private int oro=2000;

    public MinaOro() {
    }
    
    public MinaOro rellenarMinaAldeanos(){
        MinaOro mina = new MinaOro();
        for (int i = 0; i < 10; i++) {
            Aldeano aldeano= new Aldeano(10,20);
            aldeano = mina.aldeanos[i];
        }
        return mina;
    }
    
}
