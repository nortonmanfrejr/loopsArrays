package lacoderepeticao_pyorg;

import java.util.Scanner;
public class ex37_academia {

    public static void main(String[] args){


        int id, idMaisBaixo = 0, idMaisAlto = 0, idMaisGordo = 0, idMaisMagro = 0, count = 0;
        double altura, peso;
        double maisMagro = Integer.MAX_VALUE, maisBaixo = Integer.MAX_VALUE;
        double maisGordo = Integer.MIN_VALUE, maisAlto = Integer.MIN_VALUE;
        double somaPeso = 0, somaAltura = 0, mediaAltura, mediaPeso;

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("Codigo do cliente: ");
            id = sc.nextInt(); // Captura de ID

            // Finalizador de tarefa
            if(id == 0){
                break;
            }

            count++; // Contador

            System.out.print("Altura do cliente: ");
            altura = sc.nextDouble(); // Captura da altura do cliente
            somaAltura += altura;
            System.out.print("Peso do cliente: ");
            peso = sc.nextDouble(); // Captura do peso do cliente
            somaPeso += peso;

            // Dados do mais alto
            if(altura > maisAlto){
                maisAlto = altura;
                idMaisAlto = id;
            }

            // Dados do mais baixo
            if(altura < maisBaixo){
                maisBaixo = altura;
                idMaisBaixo = id;
            }

            // Dados do mais gordo
            if(peso > maisGordo){
                maisGordo = peso;
                idMaisGordo = id;
            }

            // Dados do mais magro
            if(peso < maisMagro){
                maisMagro = peso;
                idMaisMagro = id;
            }
        }

        mediaAltura = somaAltura / count;
        mediaPeso = somaPeso / count;

        System.out.println("O mais alto mede " + maisAlto + "cm e seu ID é " + idMaisAlto); // Usuario mais alto
        System.out.println("O mais baixo medo " + maisBaixo + "cm e seu ID é " + idMaisBaixo); // Usuario mais baixo
        System.out.println("O mais gordo pesa " + maisGordo + "KGs e seu ID é " + idMaisGordo); // Usuario mais gordo
        System.out.println("O mais magro peso " + maisMagro + "KGs e seu ID é " + idMaisMagro); // Usuario mais magro
        System.out.println("Altura média: " + mediaAltura + "cm.\nPeso médio: " + mediaPeso + "KGs."); // Media de altura e peso
    }



}
/**
 *
 *
 * Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto,
 * o mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que pergunte a cada um
 * dos clientes da academia seu código, sua altura e seu peso. O final da digitação de dados deve ser dada quando o
 * usuário digitar 0 (zero) no campo código. Ao encerrar o programa também deve ser informados os códigos e
 * valores do clente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos
 * pesos dos clientes
 *
 *
 * */