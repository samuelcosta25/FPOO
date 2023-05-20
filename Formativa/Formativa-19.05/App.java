import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicios obj = new Exercicios();
        System.out.println("Digite qual exercicio deseja executar: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                obj.exercicio1();
                break;
            case 2:
            obj.exercicio2();
                break;
            case 3:
            obj.exercicio3();
                break;
            default:
            System.out.println("ERRO: Digite um valor válido!");
                break;
        }
        sc.close();
    }
}
