import java.util.Scanner;

public class Aluno {
    public int np1;
    public int np2;
    public int periodo;
    public int matricula;
    public String nome;

    public Aluno(int matricula, int np1, int np2, int periodo, String nome){
        this.np1 = np1;
        this.np2 = np2;
        this.periodo = periodo;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int calculaMedia(){
        int media = (np1 + np2)/2;

        if (media >= 60){
            System.out.println("Aluno passou com media: " + media);
        }
        else if (media >= 30){
            System.out.println("Tem que fazer np3. Media: " + media);
            calculaNP3(media);
        }
        else {
            System.out.println("Reprovado com media: " + media);
        }

        return media;
    }

    public int calculaNP3(int media){
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Entre com a nota da NP3: ");
        int np3 = inputUser.nextInt();

        int mediaDepoisDaNp3 = (media + np3) / 2;

        if (mediaDepoisDaNp3 >= 50){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        System.out.println("Media do aluno: " + mediaDepoisDaNp3);
        inputUser.close();

        return mediaDepoisDaNp3;
    }

    public String toString(){
        return "Matricula: " + this.matricula + " NP1: " + this.np1 + " NP2: " + this.np2 + " Periodo: " + this.periodo + " Nome: " + this.nome;
    }
}