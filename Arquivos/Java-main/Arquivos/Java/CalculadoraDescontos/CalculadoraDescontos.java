package CalculadoraDescontos;
import java.util.Scanner;

public class CalculadoraDescontos {
    Scanner sc=new Scanner(system.in);
        public void calcular20(){
            System.out.println("Informe o preço do produto:");
            double precoProduto=sc.nextdouble();
            final int desconto20=20;
            double precoComDesconto= precoProduto-(precoProduto*desconto20/100);
            System.out.println("O preço com desconto é " +precoComDesconto+ " reais");

        }
        public void calcular30(){
            double precoProduto;
            precoProduto=200;
            final int desconto30=30;
            double precoComDesconto= precoProduto-(precoProduto*desconto30/100);
            System.out.println("O preço com desconto é " +precoComDesconto+ " reais");
        }

}