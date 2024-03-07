public class Rato {
    public boolean escondido;
    public float velocidade;

    public Rato(float velocidade){
        this.escondido = false;
        this.velocidade = velocidade;
    }

    public void esconder(){
        this.escondido = true;
        System.out.println("Rato escondido");
    }

    public void procurarComida(){
        this.escondido = false;
        System.out.println("Rato nao ta mais escondido");
    }

    public String toString(){
        return "Status do Rato \nVelocidade: " + this.velocidade + " Escondido: " + this.escondido;
    }
}