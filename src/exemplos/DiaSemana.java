package exemplos;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Mensagem do dia!!!");
        System.out.println("Domingo");
        System.out.println("segunda");
        System.out.println("terca");
        System.out.println("quarta");
        System.out.println("quinta");
        System.out.println(" sexta");
        System.out.println("sabado");
        System.out.println("Escolha uma opçao");

        String opcao = teclado.nextLine();
        switch (opcao) {
            case "domingo": {
                System.out.println("O dia é Domingo");
                break;
            }
            case "segunda": {
                System.out.println("O dia é Domingo");
                break;
            }
            case ("terca"):{
                System.out.println("O dia é Domingo");
                break;
            }
            case ("quarta"):{
                System.out.println("O dia é Domingo");
                break;
            }
            case "quinta":{
                System.out.println("O dia é Domingo");
                break;
            }
            case "sexta": {
                System.out.println("O dia é Domingo");
                break;
            }
            case "sabado": {
                System.out.println("O dia é Domingo");
                break;
            }

            default:
                System.out.println();
        }

        teclado.close();
    }
}
