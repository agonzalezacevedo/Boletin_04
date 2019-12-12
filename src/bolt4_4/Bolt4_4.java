package bolt4_4;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt4_4 {

    public static void main(String[] args) {
        Conta co1 = new Conta("Alex", "32542384", 7, 900);
        co1.ingresar(90);
        System.out.println(co1.getSaldo());
        co1.reintegrar(200);
        System.out.println(co1.getSaldo());
        Conta co2 = new Conta("Maria", "46854373", 20, 600);
        System.out.println(co2.getSaldo());
        co1.transferencia(co2, 50);
        System.out.println(co1.getSaldo());
        System.out.println(co2.getSaldo());
    }

}
