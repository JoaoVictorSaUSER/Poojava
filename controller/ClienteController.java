
package com.mycompany.sistemadevendas.controller;


public class ClienteController {
    import dao.ClienteDAO;
import dao.ClienteDAOImpl;
import model.Cliente;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAOImpl();
    }

    public boolean cadastrarCliente(Cliente cliente) {
        return clienteDAO.cadastrarCliente(cliente);
    }

    public Cliente consultarCliente(int id) {
        return clienteDAO.consultarCliente(id);
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarClientes();
    }
    // Outros métodos se necessário
}

}
