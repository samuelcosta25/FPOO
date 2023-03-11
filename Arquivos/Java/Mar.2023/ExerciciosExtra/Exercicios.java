package ExerciciosExtra;

import java.util.Scanner;

public class Exercicios {
    Scanner read = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite um valor inteiro: ");
        int valor1 = read.nextInt();
        boolean par = valor1 % 2 == 0;
        if (par == true) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }

    public void exercicio2() {

        System.out.println("Informe a nota do aluno:");
        double nota = read.nextDouble();
        if (nota >= 7) {
            System.out.println("O aluno foi aprovado.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("O aluno terá que fazer recuperação.");
        } else if (nota < 5) {
            System.out.println("O aluno foi reprovado.");
        } else {
            System.out.println("Digite uma nota entre 0 e 10");
        }
    }

    public void exercicio3() {
        System.out.println("Digite uma letra: ");
        char  letra = read.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é uma vogal!");
        } else {
            System.out.println("A letra é uma consoante!");
        }
    }

    public void exercicio4() {
        double reajuste=0;
        System.out.println("Digite o salário do colaborador:");
        double salario = read.nextDouble();
        if (salario<=1280){
            reajuste=0.2;
        } else 
        if (salario>1280 && salario<=1700){
            reajuste=0.15;
        } else 
        if (salario>1700 && salario<=2500){
            reajuste=0.1;
        } else 
        if (salario>2500){
            reajuste=0.05;
        } else {
            System.out.println("Digite um valor válido!");
        }
        double reajusteFinal=salario* reajuste;
        double salarioFinal=salario+reajusteFinal;
        double percentual = reajuste*100;

        System.out.println("O salário antes do reajuste é: "+salario);
        System.out.println("O percentual de aumento aplicado é: "+ percentual +"%");
        System.out.println("O valor do aumento foi de: "+reajusteFinal);
        System.out.println("O novo salário, após o aumento é de: "+salarioFinal);
    }

    public void exercicio5() {
        double desconto=0;
        System.out.println("Digite o valor de horas trabalhadas: ");
        double horas = read.nextDouble();
        System.out.println("Digite a  quantidade de horas trabalhadas: ");
        int quant = read.nextInt();
        double bruto= horas*quant;
        double fgts = bruto*0.11;
        double inss = bruto*0.1;
        if (bruto<=900) {
            desconto = 0;
        } else if (bruto>900 && bruto<=1500) {
            desconto = 5;
        } else if (bruto>1500 && bruto<=2500) {
            desconto = 10;
        } else if (bruto>2500) {
            desconto = 20;
        } else { 
            System.out.println("Digite um valor válido!"); 
        }
        double ir = (bruto*desconto)/100;
        double totalDesconto = ir+inss;
        double liquido = bruto-totalDesconto;
        System.out.println("Salário bruto ("+horas+"*"+quant+"): R$"+bruto);
        System.out.println("(-)IR ("+desconto+"%): R$"+ir);
        System.out.println("(-)INSS (10%): R$"+inss);
        System.out.println("FGTS (10%): R$"+fgts);
        System.out.println("Total de descontos: R$"+totalDesconto);
        System.out.println("Salário líquido: R$"+liquido);
    }

}
