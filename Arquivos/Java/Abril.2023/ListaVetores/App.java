import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercicios objeto = new Exercicios();

        System.out.println("Digite qual exercício deseja executar:");
        int numeroExercicio = input.nextInt();
        if (numeroExercicio == 1) {
            objeto.exercicio1();
        } else if (numeroExercicio == 2) {
            objeto.exercicio2();
        } else if (numeroExercicio == 3) {
            objeto.exercicio3();
        } else if (numeroExercicio == 4) {
            objeto.exercicio4();
        } else {
            System.out.println("Digite um número válido.");
        }
        input.close();
    }
}