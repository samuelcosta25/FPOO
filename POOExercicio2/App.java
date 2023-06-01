package POOExercicio2;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random(0);
        // vetor de objetos

        Agenda pessoas[] = new Agenda[10];
        // preencher o meu vetor/Array
        for (int i = 0; i < pessoas.length; i++) { // ele vai precnher as 10 posições
            // construtor de objetos
            pessoas[i] = new Agenda();
            // preencher os atributos
            pessoas[i].setNome("pessoas" +i);
            pessoas[i].setAltura(i);
            pessoas[i].setIdade(i + 18);
        }
        // buscador
        // enquanto nomeDigitado != nome Objeto
        // cont e procure
        String nomeDigitado = sc.nextLine();
        int buscador = 0;
        boolean teste=true;
        while (nomeDigitado != pessoas[buscador].getNome()) {
            buscador++;
        }
        System.out.println("Nome: " + pessoas[buscador].getNome() 
        + "Idade: " + pessoas[buscador].getIdade()
        + "Altura: " + pessoas[buscador].getAltura());
    }

}
