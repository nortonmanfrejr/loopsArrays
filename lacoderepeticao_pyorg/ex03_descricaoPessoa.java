package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex03_descricaoPessoa {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int idade;
        double salario;


        // Nome
        do {
            System.out.print("Nome:");
            nome = sc.next();
        }while(nome.length() <= 3);

        // Idade
        do {
            System.out.print("Idade:");
            idade = sc.nextInt();
        }while(idade < 0 && idade > 150);

        // Salario
        do {
            System.out.print("Salario:");
            salario = sc.nextDouble();
        }while(salario < 0);

        // Sexo
        do{
            System.out.print("Sexo:");
            sexo = sc.next();
        }while(!sexo.equalsIgnoreCase("f") &&
                !sexo.equalsIgnoreCase("h"));

        do {
            System.out.print("Estado Civil:");
            estadoCivil = sc.next();
        }while(!estadoCivil.equalsIgnoreCase("s") &&
                !estadoCivil.equalsIgnoreCase("c") &&
                !estadoCivil.equalsIgnoreCase("v") &&
                !estadoCivil.equalsIgnoreCase("d")
        );
    }
    /**
     * Faça um programa que leia e valide as seguintes informações:
     * Nome: maior que 3 caracteres; --
     * Idade: entre 0 e 150; --
     * Salário: maior que zero; --
     * Sexo: 'f' ou 'm'; --
     * Estado Civil: 's', 'c', 'v', 'd';
     * */
}
