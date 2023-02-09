package Exercicio1;

import javax.sound.sampled.FloatControl;

public class Calculo {
    public static void main(String[] args){ 
       
    double distancia=180, preco=4.89, consumo=14, litros, valorTotal;
    litros=distancia/consumo;
    valorTotal=litros*preco;

    System.out.println("O valor gasto em reais total foi de: R$");
    System.out.println(valorTotal);
    }
}