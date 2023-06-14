package entidad;

public class Gato extends Animal {
    private String alimentacionGato;

    public Gato() {
    }

    public Gato(String nombreAnimal, String alimentoAnimal, int edadAnimal, String razaAnimal) {
        super(nombreAnimal, alimentoAnimal, edadAnimal, razaAnimal);
        this.alimentacionGato = alimentoAnimal;
    }

}
