package entidad;

/* Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos. */
public class Electrodomesticos {
    protected double precioElectro;
    protected String colorElectro;
    protected char consumoElectro;
    protected double pesoElectro;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precioElectro, String colorElectro, char consumoElectro, double pesoElectro) {
        this.precioElectro = precioElectro;
        this.colorElectro = colorElectro;
        this.consumoElectro = consumoElectro;
        this.pesoElectro = pesoElectro;
    }

    public double getPrecioElectro() {
        return precioElectro;
    }

    public void setPrecioElectro(double precioElectro) {
        this.precioElectro = precioElectro;
    }

    public String getColorElectro() {
        return colorElectro;
    }

    public void setColorElectro(String colorElectro) {
        this.colorElectro = colorElectro;
    }

    public char getConsumoElectro() {
        return consumoElectro;
    }

    public void setConsumoElectro(char consumoElectro) {
        this.consumoElectro = consumoElectro;
    }

    public double getPesoElectro() {
        return pesoElectro;
    }

    public void setPesoElectro(double pesoElectro) {
        this.pesoElectro = pesoElectro;
    }

}
