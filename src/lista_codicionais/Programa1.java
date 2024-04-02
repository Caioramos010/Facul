package lista_codicionais;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número de maçãs: ");
        int quantidadeMaca = sc.nextInt();
        double valorMaca = 1.30;
        if(quantidadeMaca >= 12){
            valorMaca = 1;

        }
        System.out.println("O valor das maçãs é de: ");
        System.out.println(valorMaca*quantidadeMaca);

    }

}
