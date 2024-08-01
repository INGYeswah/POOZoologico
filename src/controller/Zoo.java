package controller;

public class Zoo {

    String ubicacion;
    String Nombre;

    public Zoo(String ubicacion, String Nombre) {
        this.ubicacion = ubicacion;
        this.Nombre = Nombre;
    }

    public String add(Animales animal, Habitats habitat) {
        if (!habitat.estaLLeno()) {
            habitat.ocupantesHabitat.add(animal);
            return "Se ha agregado el animal";
        } else {
            return "El habitat esta lleno no se puede agregar";
        }
    }

    public String retirar(Animales animal, Habitats habitat) {
        if (!habitat.ocupantesHabitat.isEmpty()) {
            habitat.ocupantesHabitat.remove(animal);
            return "El animal se ha retirado.";

        } else {
            return ("El habitat esta vacio, no se pudo retirar");
        }
    }

}
