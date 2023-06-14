package entidad;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente: */

public class Animal {

    protected String nombreAnimal;
    protected String alimentoAnimal;
    protected int edadAnimal;
    protected String razaAnimal;

    public Animal() {
    }

    public Animal(String nombreAnimal, String alimentoAnimal, int edadAnimal, String razaAnimal) {
        this.nombreAnimal = nombreAnimal;
        this.alimentoAnimal = alimentoAnimal;
        this.edadAnimal = edadAnimal;
        this.razaAnimal = razaAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getAlimentoAnimal() {
        return alimentoAnimal;
    }

    public void setAlimentoAnimal(String alimentoAnimal) {
        this.alimentoAnimal = alimentoAnimal;
    }

    public int getEdadAnimal() {
        return edadAnimal;
    }

    public void setEdadAnimal(int edadAnimal) {
        this.edadAnimal = edadAnimal;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

}
