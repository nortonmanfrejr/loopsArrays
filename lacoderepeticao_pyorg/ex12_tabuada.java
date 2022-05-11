package lacoderepeticao_pyorg;


import java.util.Scanner;

public class ex12_tabuada {

    /**
     *
     * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
     * O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo
     *
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.print("Sera gerada a tabuada do: ");
        int numero = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }

}
