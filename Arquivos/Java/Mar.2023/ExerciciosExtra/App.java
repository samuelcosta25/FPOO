package ExerciciosExtra;

import java.util.Scanner;

public class  App{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Exercicios objetoApp = new Exercicios();

        System.out.println("Digite qual exercício deseja executar:");
        int numeroExercicio = scan.nextInt();
        switch (numeroExercicio) {
            case 1: objetoApp.exercicio1();
            break;
            case 2: objetoApp.exercicio2();
            break;
            case 3: objetoApp.exercicio3();
            break;
            case 4: objetoApp.exercicio4();
            break;
            case 5: objetoApp.exercicio5();
            break;                
            default: System.out.println("Digite um número válido.");
            break;
        }
        scan.close();

    }

}
