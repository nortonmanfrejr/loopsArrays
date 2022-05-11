package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex11_ex10Soma {

    /**
     * Altere o programa anterior para mostrar no final a soma dos números.
     * */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int soma = 0;


        System.out.println("Valor minimo: ");
        int valorMin = sc.nextInt();

        System.out.println("Valor maximo: ");
        int valorMax = sc.nextInt();

        if(valorMin < valorMax){
            for(int i = valorMin + 1; i < valorMax; i++) {
                System.out.print(i + " ");
                soma += i;
            }
        }else if(valorMin > valorMax){
            for(int i = valorMin - 1; i > valorMax; i--) {
                System.out.print(i + " ");
                soma += i;
            }
        }


        System.out.println("\nA soma dos valores que estão entre " + valorMin + " e " +  valorMax + " é de " + soma);

    }
}
