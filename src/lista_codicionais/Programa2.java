package lista_codicionais;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota 1 do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Insira a nota 2 do aluno: ");
        double nota2 = sc.nextDouble();
        double mediaAritimetica = nota1+nota2/2;
        if(mediaAritimetica >= 7){
            System.out.println("O aluno foi aprovado com a média " + mediaAritimetica);
        }else {
            System.out.println("O aluno foi reporvado com a média " + mediaAritimetica);
        }

    }
}
