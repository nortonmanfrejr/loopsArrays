package lacoderepeticao_pyorg;


import java.util.Scanner;

public class ex20_ex17comRestricao {

    /**
     * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o
     * fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        boolean valida = false;
        int fatorial = 1;


        while(!valida){

            System.out.print("Digite um numero: ");
            int numb = sc.nextInt();

            if(numb > 0 && numb < 16){
                System.out.print(numb + " != ");

                for(int i = numb; i >= 1; i--){
                    fatorial *= i;
                }
                System.out.println(fatorial + " ");


                fatorial = 1; // Retornando o fatorial para 1
            }else{
                System.out.println("Valor invalido.\nDigite um numero");
                numb = sc.nextInt();
            }



            // Validação de retorno
            System.out.println("Deseja continuar a calcular fatorias [S/N]: ");
            String sContinua = sc.next();
            if(sContinua.equalsIgnoreCase("n"))
                valida = true;
        }
    }
}
