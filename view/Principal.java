
package com.mycompany.sistemadevendas.view;

import java.util.Scanner;
import controller.ClienteController;
import model.Cliente;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteController clienteController = new ClienteController();

        System.out.println("Sistema de Vendas");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Consultar Cliente");
        System.out.println("3. Listar Clientes");
        System.out.println("Escolha a opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do cliente:");
                String nome = scanner.nextLine();
                System.out.println("Digite o endereço do cliente:");
                String endereco = scanner.nextLine();

                Cliente novoCliente = new Cliente();
                novoCliente.setNome(nome);
                novoCliente.setEndereco(endereco);

                if (clienteController.cadastrarCliente(novoCliente))
                    System.out.println("Cliente cadastrado com sucesso!");
                else
                    System.out.println("Erro ao cadastrar cliente.");
                break;
            case 2:
                System.out.println("Digite o ID do cliente:");
                int idConsulta = scanner.nextInt();
                Cliente cliente = clienteController.consultarCliente(idConsulta);
                if (cliente != null)
                    System.out.println("Cliente encontrado: " + cliente.getNome() + ", " + cliente.getEndereco());
                else
                    System.out.println("Cliente não encontrado.");
                break;
            case 3:
                System.out.println("Listando clientes:");
                clienteController.listarClientes().forEach(c -> System.out.println(c.getNome() + ", " + c.getEndereco()));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}