package controller;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author w15hy
 */
public abstract class Habitats {

    public final int espacios = 2;

    public ArrayList<Animales> ocupantesHabitat = new ArrayList<Animales>();

    public abstract void mensajeHabitad();

    public boolean estaLLeno() {
        return ((ocupantesHabitat.size() + 1) > espacios);
    }
    
}
