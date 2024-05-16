
package com.mycompany.sistemadevendas.dao;

import java.util.List;
import model.Produto;

public interface ProdutoDAO {
    boolean cadastrarProduto(Produto produto);
    Produto consultarProduto(int id);
    List<Produto> listarProdutos();
    // Outros métodos se necessário
}