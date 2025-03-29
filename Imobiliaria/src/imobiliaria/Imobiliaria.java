package imobiliaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.text.SimpleDateFormat;

public class Imobiliaria {
    private List<Imovel> listaImoveis;
    private List<Cliente> listaClientes;
    private List<Venda> listaVendas;

    public Imobiliaria() {
        this.listaImoveis = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaVendas = new ArrayList<>();
    }

    
    public void cadastrarImovel(Imovel imovel) {
        listaImoveis.add(imovel);
        System.out.println("Imóvel cadastrado com sucesso!");
    }

   
    public void cadastrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    
    public void cadastrarVenda(Venda venda) {
        listaVendas.add(venda);
        System.out.println("Venda cadastrada com sucesso!");
    }

   
    public boolean cancelarVenda(String cpfCliente, String codigoImovel, Date dataVenda) {
        for (Venda venda : listaVendas) {
            if (venda.getCpfCliente().equals(cpfCliente) &&
                venda.getCodigoImovel().equals(codigoImovel) &&
                venda.getDataVenda().equals(dataVenda)) {  

                venda.setStatus("Cancelada");
                System.out.println("Venda cancelada com sucesso!");
                return true;
            }
        }
        System.out.println("Venda não encontrada ou já cancelada.");
        return false;
    }

 
 
 
 
    public void relatorioVendas(Date dataInicial) {
        if (listaVendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
            return;
        }

        double totalVendas = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("=== Relatório de Vendas a partir de " + sdf.format(dataInicial) + " ===");
        for (Venda venda : listaVendas) {
            if (!venda.getDataVenda().before(dataInicial)) { // Filtra apenas as vendas a partir da data informada
                System.out.println("Data: " + sdf.format(venda.getDataVenda()) +
                                   " | Cliente: " + venda.getCpfCliente() +
                                   " | Imóvel: " + venda.getCodigoImovel() +
                                   " | Valor: R$ " + venda.getValor());

                totalVendas += venda.getValor(); // Agora soma todas as vendas listadas
            }
        }
        System.out.println("Total das Vendas no Período: R$ " + totalVendas);
    }



}
