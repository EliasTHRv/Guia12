package servicio;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Electrodomesticos;
import entidad.Lavadora;
import entidad.Televisor;

/*
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */

public class servicioArrayelectrodomesticos {

    private ArrayList<Electrodomesticos> listaElectro = new ArrayList<>();
    private Scanner leer = new Scanner(System.in);
    private servicioLavadora la1 = new servicioLavadora();
    private servicioTelevisor t1 = new servicioTelevisor();

    public void menuLista() {
        int opcion = 0;
        String confirmacion = "";

        do {

            System.out.println("1: Cargar un televisor: ");
            System.out.println("2: Cargar una lavadora: ");
            System.out.println("3: Precio total de los electrodomesticos: ");
            System.out.println("4: Salir. ");
            System.out.println("Que desea hacer? ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    listaElectro.add(t1.crearTelevisor());
                    break;
                case 2:
                    listaElectro.add(la1.crearLavadora());
                    break;
                case 3:
                    precioFinalElectros();
                    break;
                case 4:
                    System.out.println("Confirmar para salir: S/N");
                    confirmacion = leer.next();
                    break;
            }

        } while (!confirmacion.equalsIgnoreCase("s"));

    }

    private void precioFinalElectros() {
        double sumaLavafinal = 0;
        double sumaTelefinal = 0;
        for (Electrodomesticos electro : listaElectro) {

            if (electro instanceof Lavadora) {

                double sumaLava = electro.getPrecioElectro();
                sumaLavafinal += sumaLava;

            } else if (electro instanceof Televisor) {
                double sumaTele = electro.getPrecioElectro();
                sumaTelefinal += sumaTele;
            }
        }
        System.out.println("La suma de todos los TV es: $" + sumaTelefinal);
        System.out.println("La suma de todas las Lavadoras es: $" + sumaLavafinal);

        System.out
                .println("El precio total de todos los electrodometicos: " + " $:" + (sumaLavafinal + sumaTelefinal));
    }
}