package entidad;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente: */

public class Perro extends Animal {

    private String alimentacionPerro;

    public Perro() {
    }

    public Perro(String nombreAnimal, String alimentoAnimal, int edadAnimal, String razaAnimal) {
        super(nombreAnimal, alimentoAnimal, edadAnimal, razaAnimal);
        this.alimentacionPerro = alimentoAnimal;
    }

}
