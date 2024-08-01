package controller.animales;
import controller.Animales;

/**
 *
 * @author w15hy
 */

public class Cocodrilo extends Animales{

    public Cocodrilo(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return("Has alimentado al cocodrilo " + nombre() + " con carne de conejo");
    }

    @Override
    public String jugar() {
        return("El cocodrilo " + nombre() + " vio la pelota que le lanzaste y fue a romperla");
    }
    
}
