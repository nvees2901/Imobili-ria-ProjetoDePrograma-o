package imobiliaria;

import java.util.Date;

public class Venda {
    private Date dataVenda;
    private String cpfCliente;
    private String codigoImovel;
    private double valor;
    private String status;

    public Venda(Date dataVenda, String cpfCliente, String codigoImovel, double valor, String status) {
        this.dataVenda = dataVenda;
        this.cpfCliente = cpfCliente;
        this.codigoImovel = codigoImovel;
        this.valor = valor;
        this.status = status;
    }

    public Date getDataVenda() { return dataVenda; }
    public String getCpfCliente() { return cpfCliente; }
    public String getCodigoImovel() { return codigoImovel; }
    public double getValor() { return valor; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Venda [Data Venda=" + dataVenda + ", Cliente=" + cpfCliente + ", Imóvel=" + codigoImovel + ", Valor=" + valor + ", Status=" + status + "]";
    }
}
