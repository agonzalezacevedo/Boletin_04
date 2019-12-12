package bolt4_4;

/**
 *
 * agonzalezacevedo
 */
public class Conta {

    private String nomeCliente;
    private String númeroConta;
    private double tipoInterese;
    private double saldo;

    public Conta() {
    }

    public Conta(String nomeCliente, String númeroConta, double tipoInterese, double saldo) {
        this.nomeCliente = nomeCliente;
        this.númeroConta = númeroConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeC) {
        nomeCliente = nomeC;
    }

    public String getNúmeroConta() {
        return númeroConta;
    }

    public void setNúmeroConta(String númeroC) {
        númeroConta = númeroC;
    }

    public double getTipoInterese() {
        return tipoInterese;
    }

    public void setTipoInterese(double tipoI) {
        tipoInterese = tipoI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double ingreso) {
        saldo = ingreso + saldo;
    }

    public void reintegrar(double reintegro) {
        if (saldo < 0) {
            System.out.println("Non tes suficiente saldo na conta para retirar");
        } else {
            saldo = reintegro - saldo;
        }
    }

    public void transferencia(Conta conta2, double importe) {
        this.saldo = saldo - importe;
        conta2.ingresar(importe);
    }
    /**
     * permita pasar diñeiro dunha conta a outra Exemplo de uso do método
     * transferencia: cuentaOrigen.transferencia( cuentaDestino, importe); que
     * indica que queremos facer unha transferencia desde cuentaOrigen a
     * cuentaDestino do importe indicado.
     */
}
