public class Pessoa {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    protected String nome;

    public Pessoa(String nome, String email, int CPF) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
    }

    protected  String email;
    protected  int CPF;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", CPF=" + CPF +
                '}';
    }




}
