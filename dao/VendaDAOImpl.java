
package com.mycompany.sistemadevendas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Venda;

public class VendaDAOImpl implements VendaDAO {

    @Override
    public boolean realizarVenda(Venda venda) {
        String sql = "INSERT INTO vendas (cliente_id, produto_id, quantidade, total, forma_pagamento) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, venda.getCliente().getId());
            stmt.setInt(2, venda.getProduto().getId());
            stmt.setInt(3, venda.getQuantidade());
            stmt.setDouble(4, venda.getTotal());
            stmt.setString(5, venda.getFormaPagamento().name());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}