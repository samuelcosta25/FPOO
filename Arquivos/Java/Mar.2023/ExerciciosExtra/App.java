package ExerciciosExtra;

import java.util.Scanner;

public class  App{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Exercicios objetoApp = new Exercicios();

        System.out.println("Digite qual exercício deseja executar:");
        int numeroExercicio = scan.nextInt();
        if (numeroExercicio == 1) {
            objetoApp.exercicio1();
        } else if (numeroExercicio == 2) {
            objetoApp.exercicio2();
        } else if (numeroExercicio == 3) {
            objetoApp.exercicio3();
        } else if (numeroExercicio == 4) {
            objetoApp.exercicio4();
        } else if (numeroExercicio == 5) {
            objetoApp.exercicio5();
        } else {
            System.out.println("Digite um número válido.");
        }
        scan.close();

    }

}
