package imobiliaria;

import java.util.Date;

public class Cliente {
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private Date dataCadastro;

    public Cliente(String cpf, String nome, Date dataNascimento, Date dataCadastro) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
    }

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public Date getDataNascimento() { return dataNascimento; }
    public Date getDataCadastro() { return dataCadastro; }

    @Override
    public String toString() {
        return "Cliente [CPF=" + cpf + ", Nome=" + nome + ", Data Nascimento=" + dataNascimento + ", Data Cadastro=" + dataCadastro + "]";
    }
}
