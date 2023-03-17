package LacoRepeticao;

import java.util.Random;
import java.util.Scanner;

public class estruturas {
    Scanner sc = new Scanner(System.in);
    
    public void exercicioWhile () {
        int iteracao = 0;
        while (iteracao < 10) {
        System.out.println("Iteração de número " + iteracao + ".");
        iteracao+=1; // ou iteracao=interacao + 1;
    }
}
public void sorteio (){
    Random rd = new Random();
    int nSorteado = rd.nextInt(bound:10);

}
}
