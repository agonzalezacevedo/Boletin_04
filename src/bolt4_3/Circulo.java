package bolt4_3;

/**
 *
 * agonzalezacevedo
 */
public class Circulo {

    private double radio;
    private double PI = 3.14;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        double area = 2 * PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularLonxitude() {
        double lonxitude = 2 * PI * radio;
        return lonxitude;
    }
}
