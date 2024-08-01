package controller.animales;

import controller.Animales;

/**
 *
 * @author w15hy
 */
public class Pulpo extends Animales{

    public Pulpo(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return ("Tiraste moluscos al acuario y el pulpo " + nombre() + "fue a comerlos");
    }

    @Override
    public String jugar() {
        return ("Pusiste el dedo en el acuario y el pulpo " + nombre() + " dio una vuelta");
    }
}
