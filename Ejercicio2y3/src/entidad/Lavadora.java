package entidad;

public class Lavadora extends Electrodomesticos {
    private double cargaLavadora;

    public Lavadora() {
    }

    public Lavadora(double precioElectro, String colorElectro, char consumoElectro, double pesoElectro,
            double cargaLavadora) {
        super(precioElectro, colorElectro, consumoElectro, pesoElectro);
        this.cargaLavadora = cargaLavadora;
    }

    public double getCargaLavadora() {
        return cargaLavadora;
    }

    public void setCargaLavadora(double cargaLavadora) {
        this.cargaLavadora = cargaLavadora;
    }

}
