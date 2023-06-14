package servicio;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

public class servicioAnimales {
    private Animal perro1 = new Perro();
    private Animal gato1 = new Gato();
    private Animal caballo1 = new Caballo();

    public void cargarAnimales() {
        perro1 = new Perro("chiquito", "Carne", 6, "Collie");
        gato1 = new Gato("Abby ", "Pescado", 2, "Persa");
        caballo1 = new Caballo("Spirit ", "pasto", 8, "Criollo");
    }

    public void alimentarse() {

        System.out.println("El perro: " + perro1.getNombreAnimal() + " se alimenta de: " + perro1.getAlimentoAnimal());
        System.out.println("El gato: " + gato1.getNombreAnimal() + " se alimenta de: " + gato1.getAlimentoAnimal());
        System.out.println(
                "El caballo: " + caballo1.getNombreAnimal() + "se alimenta de: " + caballo1.getAlimentoAnimal());
    }

}
