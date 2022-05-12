package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex5_ex4repeticao {

    /**
     * Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
     * Valide a entrada e permita repetir a operação.
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        boolean toContinue = false;
        int count = 0;


        while(!toContinue){

            // Pais A
            System.out.print("População inicial Pais A: ");
            double habitantesA = sc.nextDouble();
            double rateA = (1+0.03);

            // Pais B
            System.out.print("População inicial Pais B: ");
            double habitantesB = sc.nextDouble();
            double rateB = (1+0.015);


            do {
                count++;
                habitantesA *= rateA;
                habitantesB *= rateB;
            }while(habitantesA <= habitantesB);


            System.out.println("Habitantes do Pais A: " + habitantesA +"\nHabitantes do Pais B: " + habitantesB);
            System.out.print("O Pais A levara em torno de " + count + " anos para superar o Pais B em população.");



            // Validação para reiniciar o teste
            System.out.print("\nDeseja refazer o teste [S/N] --> ");
            String valida = sc.next();
            if(valida.equalsIgnoreCase("n")){
            toContinue = true;

            }
        }
    }
}

