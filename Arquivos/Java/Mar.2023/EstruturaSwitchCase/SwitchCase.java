package EstruturaSwitchCase;

import java.util.Scanner;

public class SwitchCase {
    Scanner scan = new Scanner(System.in);

    public void exercicioTeste() {
        System.out.println("Digite uma letra: ");
        String letra = scan.nextLine();
        switch (letra) {
            case "a":
            System.out.println(letra+" é uma vogal!");
            break;
            case "e":
            System.out.println(letra+" é uma vogal!");   
            break;
            case "i":
            System.out.println(letra+" é uma vogal!");   
            break;
            case "o":
            System.out.println(letra+" é uma vogal!");   
            break;
            case "u":
            System.out.println(letra+" é uma vogal!");   
            break;
            default:     System.out.println(letra+"  é uma consoante!");
                break;
        }
    
    }
    public void mes() {
            System.out.println("Digite o mês numericamente:");
            int mesNumero = scan.nextInt();
            switch (mesNumero) {
                case 1:
                    System.out.println("O mes é Janeiro.");
                break;
                case 2:
                    System.out.println("O mes é Fevereiro.");
                break;
                case 3:
                    System.out.println("O mes é Março.");
                break;
                case 4:
                    System.out.println("O mes é Abril.");
                break;
                case 5:
                    System.out.println("O mes é Maio.");
                break;
                case 6:
                    System.out.println("O mes é Junho.");
                break;
                case 7:
                    System.out.println("O mes é Julho.");
                break;
                case 8:
                    System.out.println("O mes é Agosto.");
                break;
                case 9:
                    System.out.println("O mes é Setembro.");
                break;
                case 10:
                    System.out.println("O mes é Outubro.");
                break;
                case 11:
                    System.out.println("O mes é Novembro.");
                break;
                case 12:
                    System.out.println("O mes é Dezembro.");
                break;
                default: System.out.println("Digite um valor válido!");
                break;
            }
    }
}
