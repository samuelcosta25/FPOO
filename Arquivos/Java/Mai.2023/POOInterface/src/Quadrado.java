package POOInterface.src;

public class Quadrado implements figurasGeometricas {
    int lado;

        //construtor
    public int getlado() {
        return lado;
    }

    // Métodos da calsse figurasGeometricas (inteface)
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        double area=lado*lado;
        return area;
    }

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub

        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        int Perimetro=lado*4;
        return Perimetro;
    }

    public void setlado(int lado) {
        this.lado = lado;
    }
    
}
