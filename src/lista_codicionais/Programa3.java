package lista_codicionais;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a hora de inicio: ");
        int hora1 = sc.nextInt();
        System.out.println("Insira a nota de encerramento:");
        int hora2 = sc.nextInt();
        int difHora = hora2-hora1;

        if (difHora < 24){
            System.out.println("A duração do jogo foi de " + difHora + " horas");

        }else {
            System.out.println("Jogo antigiu o tempo maximo de 24 horas.");
        }


    }

}
