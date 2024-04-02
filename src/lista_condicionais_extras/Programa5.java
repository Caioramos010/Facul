package lista_condicionais_extras;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a altura e o sexo: ");
        double altura = sc.nextDouble();
        sc.nextLine();
        String sexo = sc.nextLine();

        if (sexo == "Masculino"){
            double pesoIdeal = (72.7*altura)-58;

        }else if(sexo == "Feminino"){
            double pesoIdeal = (62.1*altura)-44.7;

        }else
            System.out.println("Você digitou o sexo errado");

        System.out.println("O peso ideal da pessoa é: ");
    }
}
