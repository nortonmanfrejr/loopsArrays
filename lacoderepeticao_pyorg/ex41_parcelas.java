package lacoderepeticao_pyorg;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex41_parcelas {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale local = new Locale("pt", "BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(local);
        System.out.println("\nQuantidade de Parcelas  % de Juros sobre o valor inicial da dívida\n1       0\n3       10\n6       15\n9       20\n12      25");
        System.out.println("\n<-------------------------------------------->\n");
        System.out.print("Valor divida: R$ ");
        double divida = sc.nextDouble();
        System.out.println();
        System.out.println("Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela");

        for(int i = 1; i <= 12; ++i) {
            double juros = 0.0;
            double valorJuros = 0.0;
            double nDivida = 0.0;
            PrintStream var10000;
            String var10001;
            if (i == 1) {
                var10000 = System.out;
                var10001 = moeda.format(divida);
                var10000.println(var10001 + "     0               " + i + "                       " + moeda.format(divida / (double)i));
            } else if (i == 3) {
                juros = 0.1;
                valorJuros = divida * juros;
                nDivida = divida + valorJuros;
                var10000 = System.out;
                var10001 = moeda.format(nDivida);
                var10000.println(var10001 + "     " + moeda.format(valorJuros) + "       " + i + "                       " + moeda.format(nDivida / (double)i));
            } else if (i == 6) {
                juros = 0.15;
                valorJuros = divida * juros;
                nDivida = divida + valorJuros;
                var10000 = System.out;
                var10001 = moeda.format(nDivida);
                var10000.println(var10001 + "     " + moeda.format(valorJuros) + "       " + i + "                       " + moeda.format(nDivida / (double)i));
            } else if (i == 9) {
                juros = 0.2;
                valorJuros = divida * juros;
                nDivida = divida + valorJuros;
                var10000 = System.out;
                var10001 = moeda.format(nDivida);
                var10000.println(var10001 + "     " + moeda.format(valorJuros) + "       " + i + "                       " + moeda.format(nDivida / (double)i));
            } else if (i == 12) {
                juros = 0.25;
                valorJuros = divida * juros;
                nDivida = divida + valorJuros;
                var10000 = System.out;
                var10001 = moeda.format(nDivida);
                var10000.println(var10001 + "     " + moeda.format(valorJuros) + "       " + i + "                      " + moeda.format(nDivida / (double)i));
            }
        }

    }
}

