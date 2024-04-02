package exemplos;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número inteiro e posivo: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero " + numero +"É par");
        } else {
            System.out.println("O numero " + numero + "É impar");
        }


        teclado.close();
    }
}