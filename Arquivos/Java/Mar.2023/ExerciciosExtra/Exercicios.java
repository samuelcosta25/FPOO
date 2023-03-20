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

        System.out.println("O salário antes do reajuste é: "+salario);
        System.out.println("O percentual de aumento aplicado é: "+ reajuste);
        System.out.println("O valor do aumento foi de: "+reajusteFinal);
        System.out.println("O novo salário, após o aumento é de: "+salarioFinal);
         

    }

    public void exercicio5() {

    }
}
