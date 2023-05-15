package ListaExtraMatriz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Exercicios obj = new Exercicios();
        System.out.println("Digite o exercicio que será executado: ");
        int ex = read.nextInt();
        switch (ex) {
            case 1:
                obj.exercicio1();
                break;
            case 2:
                obj.exercicio2();
                break;
            case 3:
                obj.exercicio3();
                break;
            case 4:
                obj.exercicio4();
                break;
            case 5:
                obj.exercicio5();
                break;
            case 6:
                obj.exercicio6();
                break;
            default:
                System.out.println("Digite um valor válido!");
                break;
        }
        read.close();
    }

}