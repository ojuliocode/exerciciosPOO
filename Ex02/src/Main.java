public class Main {
    public static void main(String[] args) {
        Arma arma = new Arma(5, 25);
        Jogador alvo = new Jogador();
        Jogador jogador = new Jogador(arma, 10, 10);
        System.out.println(jogador.toString());
        // Printar as infos do player
        jogador.atacar(alvo);
    }
}