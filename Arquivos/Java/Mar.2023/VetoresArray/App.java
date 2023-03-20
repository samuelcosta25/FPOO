package VetoresArray;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vetores obj = new vetores();
        System.out.println("Digite o exercicio a ser executado:");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                obj.exemplo1();
                break;
            case 2:
                obj.exemplo2();
                break;
            case 3:
                obj.exercicio1();
                break;
            case 4:
                obj.exercicio2();
                break;
            default:
                System.out.println("Digite um numero valido");
                break;
        }
        sc.close();
    }

}
