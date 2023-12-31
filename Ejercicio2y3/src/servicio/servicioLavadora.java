package servicio;

import entidad.Electrodomesticos;
import entidad.Lavadora;

public class servicioLavadora extends servicioElectrodomesticos {

    private Lavadora l1 = new Lavadora();
    /*
     * Método crearLavadora (): este método llama a crearElectrodomestico() de la
     * clase
     * padre, lo utilizamos para llenar los atributos heredados del padre y después
     * llenamos
     * el atributo propio de la lavadora.
     */

    public Lavadora crearLavadora() {
        Electrodomesticos lav1 = crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora: ");
        l1.setCargaLavadora(leer.nextDouble());

        l1.setColorElectro(lav1.getColorElectro());
        l1.setConsumoElectro(lav1.getConsumoElectro());
        l1.setPesoElectro(lav1.getPesoElectro());
        l1.setPrecioElectro(precioFinLav());
        // System.out.println(l1.getPrecioElectro());
        return l1;
    }

    /*
     * Método precioFinal(): este método será heredado y se le sumará la siguiente
     * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en
     * $500, si la
     * carga es menor o igual, no se incrementará el precio. Este método debe llamar
     * al
     * método padre y añadir el código necesario. Recuerda que las condiciones que
     * hemos
     * visto en la clase Electrodoméstico también deben afectar al precio.
     */

    private double precioFinLav() {
        l1.setPrecioElectro(super.precioFinal());
        if (l1.getCargaLavadora() > 30) {
            l1.setPrecioElectro(l1.getPrecioElectro() + 500);
        }
        return l1.getPrecioElectro();
    }

}
