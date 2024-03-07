public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Amarelo", 1, 10);
        Rato rato = new Rato(2f);
        rato.esconder();
        gato.cacar(rato);
        rato.procurarComida();
        gato.cacar(rato);
        System.out.println(gato.toString());
    }
}