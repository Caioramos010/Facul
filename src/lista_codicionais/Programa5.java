package lista_codicionais;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade do produto em estoque");
        int quantProduto = sc.nextInt();
        System.out.println("Digite a quantidade maxima e minima do produto em estoque");
        int quantProdutoMax = sc.nextInt();
        int quantProdutoMin = sc.nextInt();
        double media = (quantProdutoMax+quantProdutoMin)/2;
        if (quantProduto >= media){
            System.out.println("Não é necessario efetua a compra desse produto");
        } else {
            System.out.println("Efetuar a compra desse produto");
        }
    }
}
