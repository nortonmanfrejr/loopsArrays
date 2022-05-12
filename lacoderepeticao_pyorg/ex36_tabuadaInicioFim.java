package lacoderepeticao_pyorg;


import java.util.Scanner;


public class ex36_tabuadaInicioFim {


    public static void main(String[] args){

        int fator, inicio, fim;

        Scanner sc = new Scanner(System.in);


        System.out.print("Tabuada do: ");
        fator = sc.nextInt();

        System.out.print("\nComeça por: ");
        inicio = sc.nextInt();

        System.out.print("\nTermina em: ");
        fim = sc.nextInt();


        // Validação caso Fim for menor que o Inicio
        while(fim < inicio){
            System.out.print("Numero final invalido!!\n<------------>\nTermina em: ");
            fim = sc.nextInt();
        }


        System.out.println("Sera impressa a tabuada do " + fator + " começa em " + inicio + " terminara em " + fim);
        for(int i = inicio; i <= fim; i++){
            System.out.println(fator + " X " + i + " = " + (i * fator));
        }

        System.out.println("------------------------------------");
    }

    /**
     *
     * Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário,
     * mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem
     * ser informados também pelo usuário, conforme exemplo abaixo:
     *
     *
     * Montar a tabuada de: 5
     * Começar por: 4
     * Terminar em: 7
     *
     * Vou montar a tabuada de 5 começando em 4 e terminando em 7:
     * 5 X 4 = 20
     * 5 X 5 = 25
     * 5 X 6 = 30
     * 5 X 7 = 35
     * Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
     *
     * */
}
