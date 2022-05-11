package lacoderepeticao_pyorg;


import java.util.Scanner;

public class ex19_ex18Entre0e1000 {


    /***
     * Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
     *
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, soma = 0, n;
        boolean valida = false;


        while(!valida) {
            System.out.print("Digite um numero: ");
            n = sc.nextInt();

            while (n < 0 || n > 1000) {

                System.out.print("Numero invalido.\nDigite um numero: ");
                n = sc.nextInt();

            }

            if (maior > n) {
                maior = n;
            } else if (menor < n) {
                menor = n;
            }

            soma += n;

            System.out.println("Voce deseja continuar [S/N]: ");
            String sContinua = sc.next();

            if(sContinua.equalsIgnoreCase("n")){
                valida = true;
            }

        }


        System.out.println("O maior numero foi: " + maior);
        System.out.println("O menor numero foi: " + menor);
        System.out.println("A soma dos numeros foi: " + soma);
    }
}
