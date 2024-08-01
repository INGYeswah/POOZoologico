package controller.animales;
import controller.Animales;

/**
 *
 * @author w15hy
 */
public class Pajaro extends Animales{

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return ("Has alimentando al pajaro " + nombre());
    }

    @Override
    public String jugar() {
        return ("El pajaro " + nombre() + " escucho tu silbido y ahora esta cantando...");
    }
    
}
