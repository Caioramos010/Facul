package lista_condicionais_extras;

import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int classVitima = 0;
        System.out.println("Você ja trabalhou com a vitima?");
        String perg1 = sc.nextLine();
        if (perg1.equals("Sim")){
            classVitima ++;
        }
        System.out.println("Você ja telefonou para a vitima?");
        String perg2 = sc.nextLine();
        if (perg2.equals("Sim")){
            classVitima ++;
        }
        System.out.println("Você mora proximo a vitima?");
        String perg3 = sc.nextLine();
        if (perg3.equals("Sim")){
            classVitima ++;
        }
        System.out.println("Você devia dinheiro a vitima?");
        String perg4 = sc.nextLine();
        if (perg4.equals("Sim")){
            classVitima ++;
        }
        System.out.println("Você esteve no local do cirme");
        String perg5 = sc.nextLine();
        if (perg5.equals("Sim")){
            classVitima ++;
        }
        System.out.println("Classificação da vitima: " + classVitima);


    }
}
