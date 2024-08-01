package controller;

/**
 *
 * @author w15hy
 */
public abstract class Animales {

    String nombre;

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }

    public abstract String comer();

    public void dormir(String animal) {
        System.out.println("El " + animal + " " + nombre + " esta durmiendo");
    }

    ;
    
    public abstract String jugar();

}
