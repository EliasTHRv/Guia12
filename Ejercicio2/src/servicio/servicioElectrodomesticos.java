package servicio;

import java.util.Scanner;

import entidad.Electrodomesticos;

public class servicioElectrodomesticos extends Electrodomesticos {

    private Scanner leer = new Scanner(System.in);
    private Electrodomesticos elec1 = new Electrodomesticos();

    /*
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
     * correcta,
     * sino es correcta usara la letra F por defecto. Este método se debe invocar al
     * crear el
     * objeto y no será visible.
     */

    protected void comprobarConsumoEnergetico() {

        Character.toLowerCase(elec1.getConsumoElectro());
        if (elec1.getConsumoElectro() <= 'a' && 'f' >= elec1.getConsumoElectro()) {
            elec1.setConsumoElectro(elec1.getConsumoElectro());
        } else {
            elec1.setConsumoElectro('f');
        }

    }

    /*
     * Método comprobarColor(String color): comprueba que el color es correcto, y si
     * no lo es,
     * usa el color blanco por defecto. Los colores disponibles para los
     * electrodomésticos son
     * blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas
     * o en
     * minúsculas. Este método se invocará al crear el objeto y no será visible.
     */

    protected void comprobarColor() {
        String[] auxColores = { "blanco", "negro", "rojo", "azul", "gris" };
        boolean auxBoo = true;

        for (int i = 0; i < auxColores.length; i++) {

            if (auxColores[i].equalsIgnoreCase(elec1.getColorElectro())) {
                elec1.setColorElectro(elec1.getColorElectro());
                auxBoo = false;
                break;
            }
        }
        if (auxBoo) {
            elec1.setColorElectro("blanco");
        }

    }

    /*
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena el
     * electrodoméstico, también llama los métodos para comprobar el color y el
     * consumo. Al
     * precio se le da un valor base de $1000.
     * 
     * precio, color,
     * consumo energético (letras entre A y F) y peso.
     */

    public Electrodomesticos crearElectrodomestico() {

        System.out.println("Ingrese el color del electrodomestico: ");
        elec1.setColorElectro(leer.nextLine());
        comprobarColor();

        System.out.println("Ingrese el consumo del electrodomestico");
        elec1.setConsumoElectro(leer.nextLine().charAt(0));
        comprobarConsumoEnergetico();
        // System.out.println(elec1.getConsumoElectro());
        elec1.setPrecioElectro(1000);

        System.out.println("Ingrese el peso del electrodomestico: ");
        elec1.setPesoElectro(leer.nextDouble());

        // elec1.setPrecioElectro(1000);

        return elec1;
    }

    /*
     * Método precioFinal(): según el consumo energético y su tamaño, aumentará el
     * valor del
     * precio. Esta es la lista de precios:
     * LETRA PRECIO
     * A $1000
     * B $800
     * C $600
     * D $500
     * E $300
     * F $100
     * PESO PRECIO
     * Entre 1 y 19 kg $100
     * Entre 20 y 49 kg $500
     * Entre 50 y 79 kg $800
     * Mayor que 80 kg $1000
     */

    public double precioFinal() {

        switch (elec1.getConsumoElectro()) {
            case 'a':
                elec1.setPrecioElectro(elec1.getPrecioElectro() + 1000);
                break;
            case 'b':
                elec1.setPrecioElectro(elec1.getPrecioElectro() + 800);
                break;
            case 'c':
                elec1.setPrecioElectro(elec1.getPrecioElectro() + 600);
                break;
            case 'd':
                elec1.setPrecioElectro(elec1.getPrecioElectro() + 500);
                break;
            case 'e':
                elec1.setPrecioElectro(elec1.getPrecioElectro() + 300);
                break;
            case 'f':
                elec1.setPrecioElectro(elec1.getPrecioElectro() + 100);
                break;
        }

        if (elec1.getPesoElectro() >= 1 && elec1.getPesoElectro() < 20) {
            elec1.setPrecioElectro(elec1.getPrecioElectro() + 100);
        } else if (elec1.getPesoElectro() >= 20 && elec1.getPesoElectro() < 49) {
            elec1.setPrecioElectro(elec1.getPrecioElectro() + 500);

        } else if (elec1.getPesoElectro() >= 50 && elec1.getPesoElectro() < 79) {
            elec1.setPrecioElectro(elec1.getPrecioElectro() + 800);

        } else if (elec1.getPesoElectro() > 80) {
            elec1.setPrecioElectro(elec1.getPrecioElectro() + 1000);

        }
        return elec1.getPrecioElectro();
    }

}
