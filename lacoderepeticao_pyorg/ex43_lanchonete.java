package lacoderepeticao_pyorg;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex43_lanchonete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale local = new Locale("pt", "BR");
        NumberFormat real = NumberFormat.getCurrencyInstance(local);
        double cachorroQuente = 1.2;
        double bauruSimples = 1.3;
        double bauruOvo = 1.5;
        double hamburguer = 1.2;
        double cheeseburguer = 1.3;
        double soda = 1.0;
        double somaProduto = 0.0;
        double somaValor = 0.0;
        System.out.println("Especificação   Código  Preço\nCachorro Quente 100     R$ 1,20\nBauru Simples   101     R$ 1,30\nBauru com ovo   102     R$ 1,50\nHambúrguer      103     R$ 1,20\nCheeseburguer   104     R$ 1,30\nRefrigerante    105     R$ 1,00\n\n<--------------------------------------->");

        while(true) {
            System.out.print("Codigo do produto --> ");
            int codigo = sc.nextInt();
            if (codigo == 0) {
                System.out.println();
                System.out.println("Quantidade de Produtos: " + somaProduto);
                PrintStream var10000 = System.out;
                String var10001 = real.format(somaValor);
                var10000.println("Valor total: " + var10001);
                return;
            }

            System.out.print("Quantidade --> ");
            int qntd = sc.nextInt();
            somaProduto += (double)qntd;
            System.out.println();
            if (codigo == 100) {
                System.out.print("" + codigo + " Cachorro Quente: " + real.format(cachorroQuente * (double)qntd));
                somaValor += cachorroQuente * (double)qntd;
            } else if (codigo == 101) {
                System.out.println("" + codigo + " Bauru Simples: " + real.format(bauruSimples * (double)qntd));
                somaValor += bauruSimples * (double)qntd;
            } else if (codigo == 102) {
                System.out.println("" + codigo + " Bauru com Ovo: " + real.format(bauruOvo * (double)qntd));
                somaValor += bauruOvo * (double)qntd;
            } else if (codigo == 103) {
                System.out.println("" + codigo + " Hambúrguer: " + real.format(hamburguer * (double)qntd));
                somaValor += hamburguer * (double)qntd;
            } else if (codigo == 104) {
                System.out.println("" + codigo + " Cheeseburguer: " + real.format(cheeseburguer * (double)qntd));
                somaValor += cheeseburguer * (double)qntd;
            } else if (codigo == 105) {
                System.out.println("" + codigo + " Refrigerante: " + real.format(soda * (double)qntd));
                somaValor += soda * (double)qntd;
            } else {
                System.out.println("Produto não disponivel no sistema.");
            }
        }
    }
}
