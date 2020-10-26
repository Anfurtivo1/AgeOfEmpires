
package aoe.Unidades;

/**
 *
 * @author Andrés
 */
public class Caballero extends Unidades{
    private int nivelAtaque;

    public Caballero(int nivelAtaque, int vida) {
        super(vida);
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }
    
    
}
