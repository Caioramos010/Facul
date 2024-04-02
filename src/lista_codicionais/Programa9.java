package lista_codicionais;

import java.util.Scanner;

public class Programa9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de Morangos em KG");
        int quantidadeMorango = sc.nextInt();
        System.out.println("Insira a quantidade de Maçãs em KG");
        int quantidadeMaca = sc.nextInt();
        double precoMorango = 0;
        double precoMaca = 0;

        if (quantidadeMorango > 5){
            precoMorango = quantidadeMorango*2.20;
        }else {
            precoMorango = quantidadeMorango*2.50;
        }
        if (quantidadeMaca > 5){
            precoMaca = quantidadeMaca*1.50;
        }else {
            precoMaca = quantidadeMaca*1.80;
        }

        double total = precoMorango+precoMaca;

        if (quantidadeMaca+quantidadeMorango > 8 || total > 25){
            total -= total*0.10;
        }
        System.out.println("O cliente deve Pagar R$:" + total);


    }
}
