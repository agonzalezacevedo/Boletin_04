package bolt4_1;

public class Coche {
    private int velocidade;

public Coche(){
    velocidade =0 ;
}

public int getVelocidade(){
    return this.velocidade;
}
public void acelerar (int valor){
    this.velocidade = this.velocidade + valor;
    }
public void frenar (int menos){
    this.velocidade = this.velocidade - menos;
    }
}
