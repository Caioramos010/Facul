package lista_codicionais;

import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as três notas do aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        System.out.println("Insira a média de exercicios do aluno: ");
        double media = sc.nextDouble();

        double mediaDeAproveitamento = (nota1 + (nota2*2) + (nota3*3) + media)/7;
        char conceito;
        if (mediaDeAproveitamento >= 9) {
            conceito = 'A';
        } else if (mediaDeAproveitamento >= 7.5) {
            conceito = 'B';

        }else if (mediaDeAproveitamento >= 6) {
            conceito = 'C';

        }else {
            conceito = 'D';
        }
        System.out.println("O conceito do aluno foi: " + conceito);


    }
}
