package POOInterface.src;

public class Retangulo implements figurasGeometricas {
    int largura;
    int comprimento;
    
    public Retangulo(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }
    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        int area = largura*comprimento;
        return area;
    }
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Retangulo";
    }
    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        int perimetro = 2*comprimento + 2*largura;
        return perimetro;
    }
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
}
