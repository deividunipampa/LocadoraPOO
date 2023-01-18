package Fonte;

public class Cliente {
    private String cpf;
    private String nome;
    private String habilitacao;
    private String endereco;
    private String telefone;

    public Cliente(String cpf, String nome, String habilitacao, String endereco, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.habilitacao = habilitacao;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getResumo(){
        String conteudo = "Nome: " + getNome() + ", CPF: " + getCpf();
        return conteudo;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "CPF:" + cpf +
                ", Nome: " + nome + '\'' +
                ", Habilitação: " + habilitacao + '\'' +
                ", Endereço: " + endereco + '\'' +
                ", Telefone: " + telefone;
    }
}
