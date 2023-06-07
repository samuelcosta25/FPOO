package POOExercicio3;

public class Elevador {
    //atributos
    int qtdePessoasAtual;
    int capacidadeMax;
    int maxAndares;
    int andarAtual;
   

    //metodos
    //construtor
     public Elevador(int capacidadeMax, int maxAndares) {
        this.capacidadeMax = capacidadeMax;
        this.maxAndares = maxAndares;
    }

  //sets e gets
    public int getQtdePessoasAtual() {
        return qtdePessoasAtual;
    }


    public void setQtdePessoasAtual(int qtdePessoasAtual) {
        this.qtdePessoasAtual = qtdePessoasAtual;
    }


    public int getAndarAtual() {
        return andarAtual;
    }


    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    //metodos proprios
    //inicializa
    public void inicializar(){
        andarAtual=0;
        qtdePessoasAtual=0;
    }

    //entrar
    public int entrar(){
        if (qtdePessoasAtual<capacidadeMax) {
        qtdePessoasAtual++;
        } else {
            System.out.println("Capacidade maxima de pessoas no limite! Nao entra mais ninguem");
        }
        return qtdePessoasAtual;
    }
    //sair
    public int sair(){
        if (qtdePessoasAtual>0) {
            qtdePessoasAtual--;
            } else {
                System.out.println("Não há ninguem para sair!");
            }
            return qtdePessoasAtual;
    }
    
    //subir
    public int subir(int qtdeAndares){
        if (andarAtual+qtdeAndares<=maxAndares) {
            andarAtual+=qtdeAndares;
        } else {
            System.out.println("Informe um valor valido!");
        }
        return andarAtual;
    }

     //descer
     public int descer(int qtdeAndares){
        if (andarAtual-qtdeAndares>=0) {
            andarAtual-=qtdeAndares;
        } else {
            System.out.println("Informe um valor valido!");
        }
        return andarAtual;
    }
    
}
