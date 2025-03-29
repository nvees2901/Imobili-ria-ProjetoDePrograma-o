package imobiliaria;

import java.util.Date;
import java.util.Scanner;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Imobiliaria imobiliaria = new Imobiliaria();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Imóvel");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Cadastrar Venda");
            System.out.println("4. Cancelar Venda");
            System.out.println("5. Relatório de Vendas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) break;

            switch (opcao) {
            case 1:
                System.out.print("Código do Imóvel: ");
                String codigo = scanner.nextLine();
                System.out.print("Tipo (Apartamento/Casa): ");
                String tipo = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Status (Vendido/Disponível): ");
                String status = scanner.nextLine();

                imobiliaria.cadastrarImovel(new Imovel(codigo, tipo, new Date(), endereco, status));
                break;

            case 2:
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                String dataNascStr = scanner.nextLine();
                Date dataNascimento = sdf.parse(dataNascStr);
                System.out.print("Data de Cadastro (dd/MM/yyyy): ");
                String dataCadStr = scanner.nextLine();
                Date dataCadastro = sdf.parse(dataCadStr);

                imobiliaria.cadastrarCliente(new Cliente(cpf, nome, dataNascimento, dataCadastro));
                break;

                case 3:
                	System.out.print("Data da Venda (dd/MM/yyyy): ");
                    String dataVendaStr = scanner.nextLine();
                    Date dataVenda = sdf.parse(dataVendaStr);
                    System.out.print("CPF do Cliente: ");
                    String cpfCliente = scanner.nextLine();
                    System.out.print("Código do Imóvel: ");
                    String codigoImovel = scanner.nextLine();
                    System.out.print("Valor da Venda: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Status da Venda (Realizada/Cancelada): ");
                    String statusv = scanner.nextLine();

                    imobiliaria.cadastrarVenda(new Venda(dataVenda, cpfCliente, codigoImovel, valor, statusv));
                    break;

                case 4:
                    System.out.print("CPF do Cliente: ");
                    String cpfClienteCancelamento = scanner.nextLine();

                    System.out.print("Código do Imóvel: ");
                    String codigoImovelCancelamento = scanner.nextLine();

                    System.out.print("Data da Venda (dd/MM/yyyy): ");
                    String dataVendaCancelamentoStr = scanner.nextLine();
                    Date dataVendaCancelamento = sdf.parse(dataVendaCancelamentoStr);

                    boolean sucesso = imobiliaria.cancelarVenda(cpfClienteCancelamento, codigoImovelCancelamento, dataVendaCancelamento);

                    if (sucesso) {
                        System.out.println("Venda cancelada com sucesso!");
                    } else {
                        System.out.println("Venda não encontrada ou já cancelada.");
                    }
                    break;

                    
                case 5:
                    System.out.print("Data Inicial (dd/MM/yyyy): ");
                    String dataInicialStr = scanner.nextLine();
                    Date dataInicial = sdf.parse(dataInicialStr);

                    imobiliaria.relatorioVendas(dataInicial);
                    break;

            }
        }
        scanner.close();
    }
}