package servicio;
/* Los métodos que se implementara serán:
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
 */

import java.util.Scanner;

import entidad.Electrodomesticos;
import entidad.Televisor;

public class servicioTelevisor extends servicioElectrodomesticos {

    private Scanner leer = new Scanner(System.in);
    private Electrodomesticos tele1 = crearElectrodomestico();
    private Televisor tv1 = new Televisor();
    private String sinto;

    public Televisor creaTelevisor() {

        tv1.setColorElectro(tele1.getColorElectro());
        tv1.setConsumoElectro(tele1.getConsumoElectro());
        tv1.setPesoElectro(tele1.getPesoElectro());
        System.out.println("Ingrese las pulgadas del televisor: ");
        tv1.setPulgadasTv(leer.nextInt());
        System.out.println("Ingrese si tiene sintonizador o no: S/N ");
        sinto = leer.next();

        tv1.setSintonizadorTv(sintonizadoSioNo());
        tv1.setPrecioElectro(super.precioFinal());

        return tv1;
    }

    /*
     * • Método precioFinal(): este método será heredado y se le sumará la siguiente
     * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
     * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
     * aumentará
     * $500. Recuerda que las condiciones que hemos visto en la clase
     * Electrodomestico
     * también deben afectar al precio.
     */

    public double precioFintv() {

        if (tv1.getPulgadasTv() > 40) {
            tv1.setPrecioElectro(tv1.getPrecioElectro() * 1.30);
        }

        if (tv1.isSintonizadorTv()) {
            tv1.setPrecioElectro(tv1.getPrecioElectro() + 500);
        }

        return tv1.getPrecioElectro();
    }

    private boolean sintonizadoSioNo() {

        if (sinto.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }
    }

}
