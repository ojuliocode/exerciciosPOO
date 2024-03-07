public class Jogador {
    public int energia;
    public int vida;
    public Arma arma;

    public Jogador(){
        this.vida = 15;
    }

    public Jogador(Arma arma, int energia, int vida){
        this.energia = energia;
        this.vida = vida;
        this.arma = arma;
    }

    public void atacar(Jogador alvo){
        if (this.energia >= this.arma.custoDeEnergia){
            this.energia = this.energia - this.arma.custoDeEnergia;
            alvo.vida = alvo.vida - this.arma.dano;
            System.out.println("Hit no alvo");
        }
    }

    public String toString(){
        return "Energia: " + this.energia + "\nVida: " + this.vida + "\nDano: " + this.arma.dano + "\nCusto: " + this.arma.custoDeEnergia;
    }
}