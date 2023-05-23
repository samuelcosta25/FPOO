import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc2 = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        System.out.println("Digite o numero de linhas da matriz: ");
        int linha = sc2.nextInt();
        System.out.println("Digite o numero de colunas da matriz: ");
        int coluna = sc2.nextInt();
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("A matriz com os valores obedecendo as regras propostas é: ");

        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                    System.out.print(matriz[i][j] + " ");
                } else if (i == j) {
                    matriz[i][j] = 0;
                    System.out.print(matriz[i][j] + " ");
                } else if (i < j) {
                    matriz[i][j] = 2;
                    System.out.print(matriz[i][j] + " ");
                }

            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int sorteado = rd.nextInt(1000);
        int num = 0;
        int t = 1;

        while (num != sorteado) {
            System.out.println("");
            System.out.println("Tente adivinhar o número sorteado entre 0 e 1000: ");
            num = sc2.nextInt();
            if (sorteado > num) {
                System.out.println("O valor sorteado é maior do que seu palpite.");
                t++;
            } else if (sorteado < num) {
                System.out.println("O valor sorteado é menor do que seu palpite.");
                t++;
            }
        }
        System.out.println("Voce acertou! em " + t + " tentativas!");
    }

    public void exercicio3() {

        int tamanho = rd.nextInt(900) + 100; // Sorteia um número entre 100 e 1000
        int[] vetor = new int[tamanho];

        // Preenche o vetor com números aleatórios de 1 a 100
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }

        // Lista o vetor com números aleatórios
        System.out.println("Vetor: ");
       for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        
       }
           
        System.out.println();
       int contarParNoImpar = 0;
       int contarImparNoPar=0;
       System.out.println("");
        System.out.println("Vetor somente com números pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                if (i%2==0){
                    contarParNoImpar++;
                }
            }
        }
        System.out.println("");

        System.out.println("Vetor somente com números impares: ");
       
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                System.out.print(vetor[i] + " ");
                if (i%2==1){
                    contarImparNoPar++;
                }
            }
        }
        System.out.println();
       
        System.out.println("Quantidade de números pares nas posições ímpares: " + contarParNoImpar);

       
        System.out.println("Quantidade de números ímpares nas posições pares: " +contarImparNoPar);

    }
}
