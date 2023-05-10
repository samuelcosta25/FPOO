package ListaExtraMatriz;

import java.util.Random;

public class Exercicios {

    Random rd = new Random();

 public void exercicio1(){
    int matriz[][] = new int[4][4];
    for (int i = 0; i < matriz.length; i++) {
        System.out.print("| ");
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j]=i*j;
            System.out.print(matriz[i][j]+" ");
        }
        System.out.println("|");
    }
 }   

 public void exercicio2(){
    int matriz[][] = new int[4][4];
    int maior=0;
    int k=0;
    int l=0;
    for (int i = 0; i < matriz.length; i++) {
        System.out.print("| ");
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j]=rd.nextInt(10);
            System.out.print(matriz[i][j]+" ");
            if (matriz[i][j]>maior) {
                maior=matriz[i][j];
                k=i;
                l=j;
            }
        }
        System.out.println("|");
    }
    System.out.println("O maior valor é: "+maior);
    System.out.println("Suas coordenadas são: "+k+" e "+l);
 }   
}
