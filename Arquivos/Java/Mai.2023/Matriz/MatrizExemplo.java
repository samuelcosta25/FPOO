package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // gerar preencher, imprimir e manipular matrizes
        // criar uma matriz 10x9
        int matriz[][] = new int[10][9];// bidimensional 10x9
        // preencher minha matriz
        for (int i = 0; i < 10; i++) {// 1º dimensão //linha
            for (int j = 0; j < 9; j++) {// 2º dimensão //coluna
                // System.out.print("matriz["+i+"]["+j+"]=");
                matriz[i][j] = rd.nextInt(10);
            }
        }
        // imprimir elemento por elemento da minha matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]="
                        + matriz[i][j]);
            }
        }
        // imprimir a matriz em formato linha x coluna
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        int somaL = 0;

        for (int i = 0; i < 9; i++) {
            somaL += matriz[3][i];

        }
        System.out.println("soma de linha 4= " + somaL);
        // somar todos os elementos da 4 linha

        int somaC = 0;

        for (int i = 0; i < 10; i++) {
            somaC += matriz[i][3];
        }
        System.out.println("soma da 4° coluna= " + somaC);
    }

    public void exercicio1() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(10);
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("|");
        }
        System.out.println("Matriz Transposta: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i] + " ");

            }
            System.out.println("|");

        }

    }
}