package POOExercicio1;

public class Pessoa {
    // atributos ( Nome,altura,dataNascimento) data: dia que nasceu, mes que nasceu, ano que nasceu 
    String Nome;
    Double Altura;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    // construtores
    public Pessoa(String Nome, Double Altura, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.Nome = Nome;
        this.Altura = Altura;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }
     public Pessoa() {
    }
    // gets and sets
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public Double getAltura() {
        return Altura;
    }
    public void setAltura(Double Altura) {
        this.Altura = Altura;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
   // outros métodos 
   // 2 tipos de métodos
   public void imprimir() {
    System.out.println("Nome: "+Nome);
    System.out.println("Altura: "+Altura);
    System.out.println("Data Nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
   }
   
   public int getIdade(){
    int idade;
    if(diaNascimento<=30 && mesNascimento<=5){
     idade = 2023 - anoNascimento;
    }else{
     idade = 2023 - anoNascimento -1;
    }
    return idade;
   }
   
}
