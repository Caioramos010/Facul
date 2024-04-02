package lista_condicionais_extras;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o sálario do funcionario: ");
        double salarioBruto = sc.nextDouble();

        if (salarioBruto > 3000 ){
            salarioBruto -= salarioBruto*0.20;
            
        } else if (salarioBruto >= 1000) {
            salarioBruto -= salarioBruto*0.10;

        }else{
            salarioBruto -= salarioBruto*0.05;
        }
        System.out.println("salario liquido: " + salarioBruto);

    }
}
