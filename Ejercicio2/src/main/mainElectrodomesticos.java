package main;

import servicio.servicioLavadora;
import servicio.servicioTelevisor;

public class mainElectrodomesticos {
    public static void main(String[] args) {

        System.out.println("CREANDO LAVADORA!!!");
        servicioLavadora lavadora1 = new servicioLavadora();
        lavadora1.crearLavadora();
        System.out.println("El precio de la lavadora es: " + lavadora1.precioFin());

        System.out.println("CREANDO TELEVISOR!!!");
        servicioTelevisor televisor1 = new servicioTelevisor();
        televisor1.creaTelevisor();
        System.out.println("El precio del televisor es: " + televisor1.precioFintv());

    }
}
