package bolt4_1;

import java.util.Scanner;

public class Bolt4_1 {

    public static void main(String[] args) {
        int veloc;
        Scanner sc = new Scanner(System.in);
        Coche veh = new Coche();
        System.out.println("Introducir valor de aceleración: ");
        veloc=sc.nextInt();
        veh.acelerar(veloc);
        System.out.println("Valor da velocidade al acelerar= "+veh.getVelocidade());
        System.out.println("Introducir valor de frenado: ");
        veloc=sc.nextInt();
        veh.frenar(veloc);
        System.out.println("Valor da velocidade al frenar= "+veh.getVelocidade());
        
    }
    
}
