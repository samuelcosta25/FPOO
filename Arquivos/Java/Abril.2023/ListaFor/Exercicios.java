import java.net.InetAddress;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio7() {
        int vetor[] = new int[] { 1, 2, 3, 5, 7 };
        int soma = 0;
        int mult = 1;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            mult *= vetor[i];
        }
        System.out.println("O valor da soma é: " + soma);
        System.out.println("O valor da multiplicação é: " + mult);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor [" + i + "]=" + vetor[i]);
        }
    }

    public void exercicio8() {
        String nome[] = new String[5];
        int idade[] = new int[5];
        double altura[] = new double[5];
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Informe o nome da pessoa:");
            nome[i] = sc.next();
            System.out.print("Informe a idade da pessoa:");
            idade[i] = sc.nextInt();
            System.out.print("Informe a altura da pessoa:");
            altura[i] = sc.nextDouble();
            System.out.println("=============================");
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("Nome: " + nome[i]);
            System.out.println("Idade: " + idade[i]);
            System.out.println("Altura: " + altura[i]);
            System.out.println("+++++++++++++++++++++++");
        }
    }
    public void exercicio9() {
        //soma dos quadrados dos elementos do vetor
        int vetor[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int soma=0;
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i]*vetor[i];
        }
        System.out.println("a Soma dos Quadrados é "+soma);
    }
}