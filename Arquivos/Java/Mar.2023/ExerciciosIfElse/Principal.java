package ExerciciosIfElse;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Exercicios objetoApp = new Exercicios();
        System.out.println("Digite qual o exercício deseja executar:");
        double numeroExercicio = scan.nextDouble();
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
        } else if (numeroExercicio == 6) {
            objetoApp.exercicio6();
        } else if (numeroExercicio == 7) {
            objetoApp.exercicio7(); 
        } else {
            System.out.println("Digite um número válido.");
        }
        scan.close();
    }
}

