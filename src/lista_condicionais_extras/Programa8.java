package lista_condicionais_extras;

import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu IMC: ");
        double imc = sc.nextDouble();
        if (imc >= 40){
            System.out.println("Obesidade Grau III");
            
        } else if (imc >= 35) {
            System.out.println("Obesidade Grau II");

        } else if (imc >= 30) {
            System.out.println("Obesidade Grau I");


        } else if (imc >= 25) {
            System.out.println("Sobrepeso");

        } else if (imc >= 18.5) {
            System.out.println("Normal");
        }else {
            System.out.println("Abaixo do peso");

        }
    }
}
