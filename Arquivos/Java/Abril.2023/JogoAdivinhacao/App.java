package JogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        exemplos objeto = new exemplos();

        System.out.println("Digite qual exercício deseja executar:");
        int numeroExercicio = input.nextInt();
        if (numeroExercicio == 1) {
            objeto.exercicio1();
        } else if (numeroExercicio == 2) {
            objeto.exercicio2();
        } else if (numeroExercicio == 3) {
            objeto.exercicio3();
        } else 
            System.out.println("Digite um número válido.");
        }
        input.close();
    }
}
