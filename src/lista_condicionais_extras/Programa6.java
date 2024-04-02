package lista_condicionais_extras;

import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado: 10 a 1000");
        int valor = sc.nextInt();
        int nota100 = valor / 100;
        int aux100 = valor % 100;
        int nota50 = aux100 / 50;
        int aux50 = aux100 % 50;
        int nota10 = aux50 / 10;
        int aux10 = aux50 % 10;
        int nota5 = aux10 / 5;
        int aux5 = aux10 % 5;
        int nota1 = aux5/1;

        System.out.println("Notas de 100:" + nota100);
        System.out.println("Notas de 50:" + nota50);
        System.out.println("Notas de 10:" + nota10);
        System.out.println("Notas de 5:" + nota5);
        System.out.println("Notas de 1:" + nota1);
        System.out.println("Notas de 100:" + nota100);

    }
}
