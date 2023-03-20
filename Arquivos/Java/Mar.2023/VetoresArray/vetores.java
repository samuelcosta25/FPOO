package VetoresArray;

import java.util.Scanner;

public class vetores {
    Scanner scanner=new Scanner(System.in);
    public void exemplo1(){
        double[] valores = new double[]{10.5, 20, 7, 30.6, 40.4};
        System.out.println("Primeira posição - Indice 0"+valores[0]);
        System.out.println("Segunda posição - Indice 1"+valores[1]);
        System.out.println("Terceira posição - Indice 2"+valores[2]);
        System.out.println("Quarta posição - Indice 3"+valores[3]);

        valores[0]=15.6;
        System.out.println("Primeira posição - Indice 0"+valores[0]);
    }
    public void exemplo2(){
        int vetorInt[]= new int[5];
        System.out.println("Digite 5 valores inteiros:");
        vetorInt[0]=scanner.nextInt();
        vetorInt[1]=scanner.nextInt();
        vetorInt[2]=scanner.nextInt();
        vetorInt[3]=scanner.nextInt();
        vetorInt[4]=scanner.nextInt();
        System.out.println("Indice 0: "+vetorInt[0]);
        System.out.println("Indice 1: "+vetorInt[1]);
        System.out.println("Indice 2: "+vetorInt[2]);
        System.out.println("Indice 3: "+vetorInt[3]);
        System.out.println("Indice 4: "+vetorInt[4]);
    }
    public void exercicio1(){
        double vetor10[]= new double[10];
        System.out.println("Digite 10 valores reais:");
        vetor10[0]=scanner.nextDouble();
        vetor10[1]=scanner.nextDouble();
        vetor10[2]=scanner.nextDouble();
        vetor10[3]=scanner.nextDouble();
        vetor10[4]=scanner.nextDouble();
        vetor10[5]=scanner.nextDouble();
        vetor10[6]=scanner.nextDouble();
        vetor10[7]=scanner.nextDouble();
        vetor10[8]=scanner.nextDouble();
        vetor10[9]=scanner.nextDouble();
        System.out.println("Indice 9: "+vetor10[9]);
        System.out.println("Indice 8: "+vetor10[8]);
        System.out.println("Indice 7: "+vetor10[7]);
        System.out.println("Indice 6: "+vetor10[6]);
        System.out.println("Indice 5: "+vetor10[5]);
        System.out.println("Indice 4: "+vetor10[4]);
        System.out.println("Indice 3: "+vetor10[3]);
        System.out.println("Indice 2: "+vetor10[2]);
        System.out.println("Indice 1: "+vetor10[1]);
        System.out.println("Indice 0: "+vetor10[0]);
    }

    public void exercicio2(){
        double vetorNotas[]= new double[4];
        System.out.println("Digite as 4 notas:");
        vetorNotas[0]=scanner.nextDouble();
        vetorNotas[1]=scanner.nextDouble();
        vetorNotas[2]=scanner.nextDouble();
        vetorNotas[3]=scanner.nextDouble();
        double media=(vetorNotas[0]+vetorNotas[1]+vetorNotas[2]+vetorNotas[3])/4;
        System.out.println("Media final: "+media);
      
    }    

}
