package ExercicioRevisao1;

import java.util.Scanner;

public class Revisao {
    Scanner ler = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = ler.nextDouble();
        System.out.println("Digite o valor (R$) da hora do trabalhador: ");
        double valor = ler.nextDouble();
        double extras = horas - 200;
        double salarioExtra;
        if (extras >= 200) {
            salarioExtra = (extras * valor) * 1.5;
        } else {
            salarioExtra = extras * valor;
        }
         double salario = salarioExtra + (valor * 200);
        System.out.println("O salário final será de: " + salario);
        System.out.println("Quantidades horas trabalhadas: " + horas);
        System.out.println("Total de horas extra/descontos: " + extras + "  -- Correspondente a R$" + salarioExtra);
    }
}
