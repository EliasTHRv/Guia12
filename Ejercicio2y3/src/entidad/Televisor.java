package entidad;
/* Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre. */

public class Televisor extends Electrodomesticos {
    private int pulgadasTv;
    private boolean sintonizadorTv;

    public Televisor() {
    }

    public Televisor(double precioElectro, String colorElectro, char consumoElectro, double pesoElectro) {
        super(precioElectro, colorElectro, consumoElectro, pesoElectro);
    }

    public int getPulgadasTv() {
        return pulgadasTv;
    }

    public void setPulgadasTv(int pulgadasTv) {
        this.pulgadasTv = pulgadasTv;
    }

    public boolean isSintonizadorTv() {
        return sintonizadorTv;
    }

    public void setSintonizadorTv(boolean sintonizadorTv) {
        this.sintonizadorTv = sintonizadorTv;
    }

}
