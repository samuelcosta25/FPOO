package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);

    public void notas() {
        System.out.println("Informe a primeira nota do aluno:");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota do aluno:");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
       public boolean mediaOk = media>=50;
    }

    public void frequencia(){
        System.out.println("Informe a frequencia do aluno:");
        double freq = sc.nextDouble();
        public boolean freqOk = freq>=75;
    }
    public void passou(){
        boolean passou = mediaOk && freqOk;
    }
}
