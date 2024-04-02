package lista_condicionais_extras;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ano: ");
        int ano = sc.nextInt();
        if (ano % 4 == 0 ){
            System.out.println("Este é um ano bissexto");
        }else {
            System.out.println("Não é bissexto");
        }
    }
}
