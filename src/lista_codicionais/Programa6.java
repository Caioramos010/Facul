package lista_codicionais;

import java.util.Scanner;

    public class Programa6 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o nome do primeiro time e quantos gols foram marcados por ele: ");
            String time1 = sc.nextLine();
            int gol1 = sc.nextInt();
            System.out.println("Insira o nome do segundo time e quantos gols foram marcados por ele: ");
            sc.nextLine();
            String time2 = sc.nextLine();
            int gol2 = sc.nextInt(); 

            if (gol1 == gol2){
                System.out.println("A partida ficou empatada");
            } else if (gol1 > gol2) {
                System.out.println("O time " + time1 + " ganhou a partida");

            }else {
                System.out.println("O time " + time2 + " ganhou a partida");
            }


    }

}
