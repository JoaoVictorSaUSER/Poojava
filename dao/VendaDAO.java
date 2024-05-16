
package com.mycompany.sistemadevendas.dao;

import java.util.List;
import model.Venda;

public interface VendaDAO {
    boolean realizarVenda(Venda venda);
    // Outros métodos se necessário
}