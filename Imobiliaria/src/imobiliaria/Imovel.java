package imobiliaria;

import java.util.Date;

public class Imovel {
    private String codigo;
    private String tipo;
    private Date dataCadastro;
    private String endereco;
    private String status; 

    public Imovel(String codigo, String tipo, Date dataCadastro, String endereco, String status) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        this.status = status;
    }

    public String getCodigo() { return codigo; }
    public String getTipo() { return tipo; }
    public Date getDataCadastro() { return dataCadastro; }
    public String getEndereco() { return endereco; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Imovel [Código=" + codigo + ", Tipo=" + tipo + ", Endereço=" + endereco + ", Status=" + status + "]";
    }
}

