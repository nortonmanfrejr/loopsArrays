package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex39_alunosAltoBaixo {

    public static void main(String[] args) {
        int idMaisAlto = 0;
        int idMaisBaixo = 0;
        double altura = 0.0;
        double alunoAlto = -2.147483648E9;
        double alunoBaixo = 2.147483647E9;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; ++i) {
            System.out.print("Numero do aluno: ");
            int id = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble() / 100.0;
            if (altura > alunoAlto) {
                alunoAlto = altura;
                idMaisAlto = id;
            }

            if (altura < alunoBaixo) {
                alunoBaixo = altura;
                idMaisBaixo = id;
            }
        }

        System.out.println("" + alunoAlto + "cm --> ID: " + idMaisAlto);
        System.out.println("" + alunoBaixo + "cm --> ID: " + idMaisBaixo);
    }
}