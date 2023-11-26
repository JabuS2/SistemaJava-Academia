package com.gsoftwareacad.dal;

import java.sql.*;

public class ModuloConexao {

    public static Connection conector;

    public static Connection conector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_Academia_Gsoftware", "root", "123456");
            return conexao;
        } catch (Exception e) {
            System.err.println("Erro: " + e);
            return null;
        }
    }
}
