
package aoe;

import static aoe.Civilizaciones.*;
import aoe.Edificios.*;
import aoe.Hilos.Reponedor;
import aoe.Unidades.*;
import aoe.Utils.Temporizador;
/**
 *
 * @author Andrés
 */
public class AOE {

    public static void main(String[] args) {
        Civilizacion espana = new Civilizacion(0,ESPANA);
        Civilizacion vikinga = new Civilizacion(0,VIKINGA);
        MinaOro minaEspanol = new MinaOro();
        MinaOro minaVikinga = new MinaOro();
        Carpinteria carpinteriaEspanol= new Carpinteria();
        Carpinteria carpinteriaVikinga= new Carpinteria();
        
        int aldeanoEspanol=100;
        int aldeanoVikingo=100;
        
        minaEspanol=minaEspanol.rellenarMinaAldeanos();
        aldeanoEspanol=aldeanoEspanol-10;
        minaVikinga=minaVikinga.rellenarMinaAldeanos();
        aldeanoVikingo=aldeanoVikingo-10;
        System.out.println("Se han llenado las minas");
        
        carpinteriaEspanol=carpinteriaEspanol.rellenarCarpinteriaAldeanos();
        aldeanoEspanol=aldeanoEspanol-16;
        carpinteriaVikinga=carpinteriaVikinga.rellenarCarpinteriaAldeanos();
        aldeanoVikingo=aldeanoVikingo-16;
        System.out.println("Se han llenado las carpinterias");
        
        Temporizador temporizador= new Temporizador(minaEspanol,carpinteriaEspanol,minaVikinga,carpinteriaVikinga);
        
        
    }
    
}
