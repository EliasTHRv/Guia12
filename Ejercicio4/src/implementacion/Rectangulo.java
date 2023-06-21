package implementacion;

import java.util.Scanner;

import interfaz.CalculosFormas;

public class Rectangulo implements CalculosFormas {
    private double base;
    private double altura;
    private Scanner leer = new Scanner(System.in);

    @Override
    public void cacularPerimetro() {
        System.out.println("Ingrese la base y altura para calcular el perimetro del rectangulo: ");
        // Perímetro rectángulo: (base + altura) * 2.
        base = leer.nextDouble();
        altura = leer.nextDouble();

        double perimetroRectangulo = Math.pow((base + altura), 2);
        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
    }

    @Override
    public void calcularArea() {
        // Área rectángulo: base * altura
        double areaRectangulo = base * altura;
        System.out.println("El area del rectangulo es: " + areaRectangulo);
    }

}
