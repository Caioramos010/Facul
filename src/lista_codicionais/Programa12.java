package lista_codicionais;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do empregado, seu ano de nascimento e seu ano de ingresso na empresa:");
        String nome = sc.nextLine();
        int anoNascimento = sc.nextInt();
        int anoIngresso = sc.nextInt();

        if (2024 - anoNascimento >= 65 || 2024 - anoIngresso >= 30 || (2024 - anoNascimento >= 60 && 2024 - anoIngresso >= 25 )){
            System.out.println(nome + " Esta Qualificado!");
        }else {
            System.out.println(nome + " Não está qualificado");
        }

    }
}
