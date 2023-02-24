package ExercicioDecisaoIF;

import java.util.Scanner;

public class EstruturaDecisaoIf {
    Scanner sc = new Scanner(System.in);
    public void decisaoIF() {
        System.out.println("Qual o valor do produto?");
        double produto = sc.nextDouble();
        double desconto = 0;
        if (produto >= 100 && produto<200) {
            desconto = 5;
        }
        if (produto >= 200) {
            desconto = 10;
        }
        double descontoFinal = (produto * desconto) / 100;
        double precoFinal = produto - descontoFinal;
        System.out.println("Preço final do produto é: " + precoFinal);
    }
}
