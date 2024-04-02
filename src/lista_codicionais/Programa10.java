package lista_codicionais;

import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do produto, a quantidade adiquirida e o preço unitario");
        String nomeProduto = sc.nextLine();
        int quantidadeAdiquirida = sc.nextInt();
        double precoUnitario = sc.nextDouble();
        double precoTotal = quantidadeAdiquirida*precoUnitario;
        if (quantidadeAdiquirida > 10){
            precoTotal -= precoTotal*0.05;
        } else if (quantidadeAdiquirida > 5) {
            precoTotal -= precoTotal*0.03;
        } else {
            precoTotal -= precoTotal*0.02;
        }
        System.out.println("Total a pagar: " + precoTotal + " Pelo produto " + nomeProduto);


    }
}
