package bolt4_3;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt4_3 {

    public static void main(String[] args) {
        Circulo cir = new Circulo(7);
        System.out.println(cir.calcularArea());
        cir.setRadio(5);
        System.out.println(cir.calcularArea());
        System.out.println(cir.calcularLonxitude());
        
    }
    
}
