public class Pessoa {

    private String nome;
    private int idade;
    private String dataNascimento;

    public Pessoa(String nome, int idade, String dataNascimento){

        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;

    }

    public String getNome(){

        return this.nome;

    }

    public int getIdade(){

        return this.idade;

    }

    public String getDataNascimento() {

        return dataNascimento;

    }
}
