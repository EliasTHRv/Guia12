package servicio;

import implementacion.Circulo;
import implementacion.Rectangulo;

public class servicioFormas {
    private Circulo c1 = new Circulo();
    private Rectangulo r1 = new Rectangulo();

    public void calculosFinales() {

        c1.cacularPerimetro();
        c1.calcularArea();

        r1.cacularPerimetro();
        r1.calcularArea();

    }

}
