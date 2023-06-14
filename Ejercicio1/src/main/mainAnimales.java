package main;

import servicio.servicioAnimales;

public class mainAnimales {
    public static void main(String[] args) {
        servicioAnimales s1 = new servicioAnimales();

        s1.cargarAnimales();
        s1.alimentarse();
    }
}
