package aoe.Utils;
import aoe.Civilizacion;
import aoe.Edificios.*;
import aoe.Hilos.*;
import java.util.TimerTask;
import aoe.Hilos.Reponedor;
/**
 *
 * @author Andrés
 */
public class Temporizador {
    java.util.Timer timer = new java.util.Timer();// --> Se define como atributo de la clase.
    int tiempo = 0;// --> Variable que iremos incrementando de uno en uno.
    int recursos=0;
    
    public Temporizador( MinaOro minaEspanol, Carpinteria carpinteriaEspanol,MinaOro minaVikinga, Carpinteria carpinteriaVikinga) {
            TimerTask tarea = new TimerTask() {
                @Override
                public void run() {
                    tiempo++;
                    //Si ha pasado 1 segundo se hace esto
                    if (tiempo % 1 == 0) {
                        ConseguirRecursos recursos = new ConseguirRecursos(minaEspanol,carpinteriaEspanol,minaVikinga,carpinteriaVikinga);
                        recursos.start();
                    }
                    //Si han pasado 5 segundos se hace esto
                    if (tiempo % 5 == 0) {
                       Batallas batalla = new Batallas(minaEspanol,carpinteriaEspanol,minaVikinga,carpinteriaVikinga);
                       batalla.start();
                    }
                    
                    //Si han pasado 20 segundos se hace esto
                    if (tiempo % 20 == 0) {
                        Reponedor reponedor = new Reponedor(carpinteriaEspanol,minaEspanol,minaVikinga,carpinteriaVikinga);
                        reponedor.start();
                    }
                    //Cuando ha llegado a 61 segundos, la simulacion se para
                    if (tiempo==61) {
                        timer.cancel();
                        System.out.println("Los edificios españoles han conseguido "+minaEspanol.getRecursosTotales()+" de oro y "+carpinteriaEspanol.getRecursosTotales()+" de madera en total");
                        System.out.println("Los edificios vikingos han conseguido "+minaVikinga.getRecursosTotales()+" de oro y "+carpinteriaVikinga.getRecursosTotales()+" de madera en total");
                    }
                }
            };
            //Se repetira todo cada segundo(El segundo campo indica cada cuantos segundos y el primero con cuanto retraso se ejecuta
            timer.schedule(tarea,0,1000);
    }
}
