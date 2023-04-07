package JogoAdivinhacao;

public class exemplos{
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);
    
    public void exercicio1(){
        int iteracao=0;
        while (iteracao<100) {
            System.out.println("Execucao numero: "+iteracao);
            iteracao+=1;
        }
    }

    public void exercicio2(){
    
        int nAleatorio= rd.nextInt(10);
        boolean tentarNovamente = true;
        System.out.println("Aperte CTRL+C, a qualquer momento, para parar.");
        
        // Enquanto tentarNovamente igual a true, itera novamente.
        while (tentarNovamente) {
        System.out.print("Tente adivinhar o número: ");
        int numero = sc.nextInt();
        // Repare que a relação abaixo e a de diferença,
        // enquanto diferente, retorna true e, por isso,
        // tenta novamente.
        tentarNovamente = nAleatorio != numero;
        if (tentarNovamente) {
        System.out.println("Errado!");
        }
        }
        System.out.println("Parabéns! Você adivinhou. Era o número "+ nAleatorio);
        
        System.out.println("Fim!");
        System.out.println("============================");
    }
}