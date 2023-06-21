package implementacion;

import java.util.Scanner;

import interfaz.CalculosFormas;

public class Circulo implements CalculosFormas {
    private double diametro;
    private double radio;
    private double PI = 3.14;
    private Scanner leer = new Scanner(System.in);

    @Override
    public void cacularPerimetro() {
        System.out.println("Ingrese el diametro del circulo para calcular su perimetro: ");
        diametro = leer.nextDouble();

        // Perímetro circulo: PI * diámetro.

        double perimetroCirculo = PI * diametro;

        System.out.println("El perimetro es: " + perimetroCirculo);
    }

    @Override
    public void calcularArea() {

        System.out.println("Ingrese el radio del circulo para calcular su area: ");
        radio = leer.nextDouble();
        // Área circulo: PI * radio ^ 2

        double areaCiculo = PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + areaCiculo);
    }

}
