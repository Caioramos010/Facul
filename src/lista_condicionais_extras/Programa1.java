package lista_condicionais_extras;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println(num + " Domingo");
                break;

            case 2:
                System.out.println(num + " Segunda");
                break;

            case 3:
                System.out.println(num + " Terça");
                break;

            case 4:
                System.out.println(num + " Quarta");
                break;

            case 5:
                System.out.println(num + " Quinta");
                break;

            case 6:
                System.out.println(num + " Sexta");
                break;

            case 7:
                System.out.println(num + " Sábado");
                break;

            default:{
                System.out.println("Digita um número valido pelo menos");
                break;
            }

        }

    }
}
