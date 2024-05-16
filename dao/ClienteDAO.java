
package com.mycompany.sistemadevendas.dao;

import java.util.List;
import model.Cliente;

public interface ClienteDAO {
    boolean cadastrarCliente(Cliente cliente);
    Cliente consultarCliente(int id);
    List<Cliente> listarClientes();
    // Outros métodos se necessário
}