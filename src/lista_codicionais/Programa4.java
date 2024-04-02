package lista_codicionais;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as Horas trabalhadas no mês: ");
        int horasTrabalhadasMes = sc.nextInt();
        System.out.println("Insira o salario pago por hora: ");
        double salarioPorHora = sc.nextDouble();

        System.out.println("O salario total é de: ");

        if (horasTrabalhadasMes > 160){
            int horasExtras = horasTrabalhadasMes-160;
            double salarioTotal1 = (160 + (horasExtras + horasExtras*0.5)) * salarioPorHora;
            System.out.println(salarioTotal1);

        }else {
            double salarioTotal2 =  horasTrabalhadasMes*salarioPorHora;
            System.out.println(salarioTotal2);
        }



    }
}
