package lista_condicionais_extras;

import java.util.Scanner;

public class Programa9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a leitura do atual do medidor");
        int alturaAtual = sc.nextInt();
        System.out.println("Insira a leitura do mês passado do medidor");
        int alturaPassada = sc.nextInt();
        System.out.println("Insira o tipo da conta do medidor");
        sc.nextLine();
        String tipo = sc.nextLine();

        int alturaTotal = alturaAtual-alturaPassada;
        double valorTotal = 0;

        if (tipo.equals("Residencial")){
            if (alturaTotal >25 ){
                valorTotal = alturaTotal*4.25;
            } else if(alturaTotal >= 10){
                valorTotal = alturaTotal*2.50;
            }else {
                valorTotal = alturaTotal;
            }

        }else {
            if (alturaTotal >25 ){
                valorTotal = alturaTotal*4.9;
            } else if(alturaTotal >= 10){
                valorTotal = alturaTotal*2.9;
            }else {
                valorTotal = alturaTotal*1.3;
            }

        }
        if (valorTotal < 35){
            valorTotal = 35;
        }

        System.out.println("O total da conta foi de " + valorTotal + 35);



    }
}
