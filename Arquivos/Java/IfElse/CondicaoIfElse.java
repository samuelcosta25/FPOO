package IfElse;

import java.util.Scanner;

public class CondicaoIfElse {
    Scanner sc = new Scanner(System.in);
    public void decisaoIfElse(){
        System.out.println("Digite o preço do produto: ");
        double precoProduto = sc.nextDouble();
        double desconto = 0;
        if (precoProduto<100){
            desconto=0;
        }
        else if (precoProduto>=100 && precoProduto<200){
            desconto=5;
        } 
        else if (precoProduto>=200 && precoProduto<300){
            desconto=10;
        }
        double descontoFinal=(precoProduto*desconto)/100;
        double precoFinal=precoProduto-descontoFinal;
        System.out.println("O preço final com desconto é: "+precoFinal);
    }
}
