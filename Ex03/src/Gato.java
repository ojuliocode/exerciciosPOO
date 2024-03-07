public class Gato {
    public String cor;
    public int idade;
    public int velocidade;

    public Gato(String cor, int idade, int velocidade){
        this.cor = cor;
        this.idade = idade;
        this.velocidade = velocidade;
    }

    public void brincar(){
        System.out.println("Gato Brincando");
    }

    public void cacar(Rato rato){
        if (!rato.escondido && this.velocidade > rato.velocidade){
            System.out.println("Caca deu certo");
        }
        else {
            System.out.println("Caca nao deu certo");
        }
    }

    public String toString(){
        return "Status do Gato \nCor: " + this.cor + " Idade: " + this.idade + " Velocidade: " + this.velocidade;
    }
}