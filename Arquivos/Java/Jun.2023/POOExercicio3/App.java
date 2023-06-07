package POOExercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Elevador elevador1 = new Elevador(10, 15);

        elevador1.inicializar();
        boolean ligado=true;
        while (ligado) {
            System.out.println("Informe a ação desejada"
            +"\n1-Entrar"
            +"\n2-Descer"
            +"\n3-Subir"
            +"\n4-Descer"
            +"\n5-Desligar");
            int acao= sc.nextInt();
            switch (acao) {
                case 1:
                    System.out.println("Capacidade atual: "+elevador1.entrar());
                break;
                case 2:
                System.out.println("Capacidade atual: "+elevador1.sair());
                break;
                case 3:
                System.out.println("Informe a quantidade de andares para subir:");
                System.out.println("Andar atual: "+elevador1.subir(sc.nextInt()));
                break;
                case 4:
                System.out.println("Informe a quantidade de andares para descer:");
                System.out.println("Andar atual: "+elevador1.descer(sc.nextInt()));
                break;
                case 5:
                ligado=false;
                break;
                default:
                System.out.println("Informe um numero válido!");
                    break;
            }
        }
        sc.close();
    }
}
