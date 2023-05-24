package POOInterface.src;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(6);
        System.out.println("Nome: "+figura1.getNomeFigura());
        System.out.println("Area: "+figura1.getArea());
        System.out.println("Perimetro: "+figura1.getPerimetro());

        System.out.println();

        Retangulo figura2 = new Retangulo(4,6);
        System.out.println("Nome: "+figura2.getNomeFigura());
        System.out.println("Area: "+figura2.getArea());
        System.out.println("Perimetro: "+figura2.getPerimetro());

        System.out.println();

        Trapezio figura3 = new Trapezio(8,6,5,7,6);
        System.out.println("Nome: "+figura3.getNomeFigura());
        System.out.println("Area: "+figura3.getArea());
        System.out.println("Perimetro: "+figura3.getPerimetro());

    }
}
