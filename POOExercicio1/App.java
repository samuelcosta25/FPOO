package POOExercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // criar o objeto

Pessoa pessoa1 = new Pessoa(); // construtor vazio
pessoa1.setNome("Fabiana");
pessoa1.setAltura(1.69);
pessoa1.setDiaNascimento(14);
pessoa1.setMesNascimento(3);
pessoa1.setAnoNascimento(1999);
pessoa1.imprimir();
System.out.println("Idade"+pessoa1.getIdade());
    }
}
