package lacoderepeticao_pyorg;

import java.util.Scanner;


public class ex2_nomeSenha {

    /**
     * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
     * mostrando uma mensagem de erro e voltando a pedir as informações.
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        boolean valid= false;
        String nome, senha;

        do{
            System.out.print("Nome:");
            nome = sc.next();

            System.out.print("Senha:");
            senha = sc.next();

            if(senha.equalsIgnoreCase(nome)){

                System.out.println(("Senha invalida, tente novamente!"));
            } else {
                valid = true;
                System.out.println("Bem vindo, " + nome);
            }
        }while(!valid);

    }
}
