
package com.mycompany.sistemadevendas.dao;


public class Conexaobanco {
    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "usuario";
    private static final String PASSWORD = "senha";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            throw new SQLException("Driver JDBC não encontrado", ex);
        }
    }
}
}
