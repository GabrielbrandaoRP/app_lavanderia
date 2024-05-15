public class Pessoa {

    public Pessoa(int idP, String nome, int idade) {
        this.idP = idP;
        this.nome = nome;
        this.idade = idade;
    }

    protected int idP;

    @Override
    public String toString() {
        return "Pessoa{" +
                "idP=" + idP +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    protected String nome;
    protected int idade;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
