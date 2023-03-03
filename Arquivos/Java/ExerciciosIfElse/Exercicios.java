package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite um primeiro valor:");
        double valor1 = sc.nextDouble();
        System.out.println("Digite um segundo valor diferente do primeiro:");
        double valor2 = sc.nextDouble();
        if (valor1 == valor2) {
            System.out.println("Os valores são iguais: " + valor1 + "=" + valor2);
        }
        if (valor1 > valor2) {
            System.out.println("O primeiro valor é maior que o segundo: " + valor1 + " > " + valor2);
        } else {
            System.out.println("O segundo valor é maior que o primeiro: " + valor1 + " < " + valor2);
        }
    }

    public void exercicio2() {
        System.out.println("Digite o ano de nascimento:");
        int ano = sc.nextInt();
        int idade = 2023 - ano;
        if (idade >= 16) {
            System.out.println("Voto válido, indivíduo maior de idade");
        } else {
            System.out.println("Voto inválido, indivíduo menor de idade");
        }
    }

    public void exercicio3() {
        System.out.println("Digite a senha:");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void exercicio4() {
        double preco = 0;
        System.out.println("Digite a quantidade de maças compradas:");
        int quant = sc.nextInt();
        if (quant < 12) {
            preco = quant * 0.30;
        } else {
            preco = quant * 0.25;
        }
        System.out.println("O valor total da compra foi de: R$" + preco);
    }

    public void exercicio5() {
        System.out.println("Digite o primeiro valor:");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o primeiro valor:");
        double valor2 = sc.nextDouble();
        System.out.println("Digite o primeiro valor:");
        double valor3 = sc.nextDouble();
        if (valor1 < valor2 && valor2 < valor3) {
            System.out.println("Os valores em ordem crescente são: " + valor1 + "<" + valor2 + "<" + valor3);
        } else if (valor1 < valor3 && valor3 < valor2) {
            System.out.println("Os valores em ordem crescente são: " + valor1 + "<" + valor3 + "<" + valor2);
        } else if (valor2 < valor1 && valor1 < valor3) {
            System.out.println("Os valores em ordem crescente são: " + valor2 + "<" + valor1 + "<" + valor3);
        } else if (valor2 < valor3 && valor3 < valor1) {
            System.out.println("Os valores em ordem crescente são: " + valor2 + "<" + valor3 + "<" + valor1);
        } else if (valor3 < valor1 && valor1 < valor2) {
            System.out.println("Os valores em ordem crescente são: " + valor3 + "<" + valor1 + "<" + valor2);
        } else if (valor3 < valor2 && valor2 < valor1) {
            System.out.println("Os valores em ordem crescente são: " + valor3 + "<" + valor2 + "<" + valor1);
        } else {
            System.out.println("ERRO: Dois ou mais dos valores digitados são iguais.");
        }
    }

    public void exercicio6() {
        double pesoIdeal;
        System.out.println("Digite o sexo do indivíduo (1-feminino ou 2-masculino):");
        int sexo = sc.nextInt();
        System.out.println("Digite a altura do indivíduo em metros:");
        double altura = sc.nextDouble();
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal para essa mulher é de " + pesoIdeal);
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para esse homem é de " + pesoIdeal + "kg.");
        } else {
            System.out.println("Sexo inválido.");
        }
    }

}
