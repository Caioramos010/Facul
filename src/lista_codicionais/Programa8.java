package lista_codicionais;

import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o codigo de usuario: ");
        int codigoDeUsuario = sc.nextInt();

        if (codigoDeUsuario == 12345){
            System.out.println("Insira a senha de usuario: ");
            int senhaDeUsuario = sc.nextInt();
            if (senhaDeUsuario == 54321){
                System.out.println("Acesso Permitido");
            }else{
                System.out.println("Senha Invalida");
            }
        }else {
            System.out.println("Codigo Errado");
        }





    }
}
