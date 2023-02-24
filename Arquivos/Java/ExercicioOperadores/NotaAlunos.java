package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    boolean mediaOk, freqOk;

    public void notas() {
        System.out.println("Informe a primeira nota do aluno:");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota do aluno:");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
        mediaOk = media>=50;
    }

    public void frequencia(){
        System.out.println("Informe a frequencia do aluno:");
        double freq = sc.nextDouble();
        freqOk = freq>=75;
    }
    public void passou(){
        boolean passou = mediaOk && freqOk;
        if (passou==true) {
            System.out.println("O aluno passou");
        }
        else {
            System.out.println("O aluno não passou");
        }
    }
}
