package lista_codicionais;

import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero de litros que deseja abastecer");
        int litros = sc.nextInt();
        System.out.println("Insira o tipo de combustivel que deseja abastecer seu veiculo A para Alcool e G para gasolina: ");
        sc.nextLine();
        char tipo = sc.nextLine().charAt(0);


        System.out.println("O valor a ser pago é de: ");
        if (tipo == 'a' || tipo == 'A'){
            if (litros > 20){
                System.out.println(litros*(6.20-6.20*0.05));
            }else {
                System.out.println(litros*(6.20-6.20*0.03));
            }

        } else if (tipo == 'G' || tipo == 'g') {
            if (litros > 20){
                System.out.println(litros*(6.90-6.90*0.05));
            }else {
                System.out.println(litros*(6.90-6.90*0.03));
            }
            
        }else {
            System.out.println("Esse tipo de combustivel não está disponivel");
        }


    }
}
