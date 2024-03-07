public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(253, 90, 55, 1, "Manoel Gomes");
        System.out.println(aluno.toString());
        aluno.calculaMedia();
    }
}