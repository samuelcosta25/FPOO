package POOInterface.src;

public class Trapezio implements figurasGeometricas{
    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;
    public int getBaseMaior() {
        return baseMaior;
    }
    public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        double area = ((baseMaior+baseMenor)*altura)/2;
        return area;
    }
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Trapezio";
    }
    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        double perimetro = baseMaior+baseMenor+lado1+lado2;
        return perimetro;
    }
    public int getBaseMenor() {
        return baseMenor;
    }
    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    
}
