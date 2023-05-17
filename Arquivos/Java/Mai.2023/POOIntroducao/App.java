package POOIntroducao;

public class App {
    public static void main(String[] args) {
        //criando objeto

        RegistraAluno aluno1 = new RegistraAluno();
        //Modificar atributos
        aluno1.setNome("Ana clara");
        aluno1.setEndereco("Rua 10");
        aluno1.setIdade(23);


        //acessar atributos
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("Endereço: "+aluno1.getEndereco());
        System.out.println("Idade: "+aluno1.getIdade());

    }
}
