package entidad;

public class Caballo extends Animal {

    private String alimentacionCaballo;

    public Caballo() {
    }

    public Caballo(String nombreAnimal, String alimentoAnimal, int edadAnimal, String razaAnimal) {
        super(nombreAnimal, alimentoAnimal, edadAnimal, razaAnimal);
        this.alimentacionCaballo = alimentoAnimal;
    }

}
