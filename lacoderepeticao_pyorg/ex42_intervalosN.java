package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex42_intervalosN {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;

        while(true) {
            System.out.print("Digite um numero: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Intervalo 1 --> [0-25]: " + intervalo1 + " numeros.");
                System.out.println("Intervalo 2 --> [26-50]: " + intervalo2 + " numeros.");
                System.out.println("Intervalo 3 --> [51-75]: " + intervalo3 + " numeros.");
                System.out.println("Intervalo 4 --> [76-100]: " + intervalo4 + " numeros.");
                return;
            }

            if (n < 26) {
                ++intervalo1;
            } else if (n < 51) {
                ++intervalo2;
            } else if (n < 76) {
                ++intervalo3;
            } else if (n < 101) {
                ++intervalo4;
            } else {
                System.out.println("Este numero não se enquandra nos intervalos pré-definidos");
            }

            ++count;
        }
    }
}
