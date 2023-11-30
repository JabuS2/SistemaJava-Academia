package com.gsoftwareacad.controller;

import com.gsoftwareacad.telas.TelaPagamentos;
import com.gsoftwareacad.telas.TelaPlanos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PlanoController {
    
    private TelaPagamentos telaPagamentos;
    private TelaPlanos telaPlanos;
    private Connection conexao;
    private PreparedStatement pst;
    private ResultSet rs;

    public PlanoController(TelaPlanos telaPlanos, Connection conexao) {
        this.telaPlanos = telaPlanos;
        this.conexao = conexao;
    }

    public PlanoController(TelaPagamentos telaPagamentos, Connection conexao) {
        this.telaPagamentos = telaPagamentos;
        this.conexao = conexao;
    }

    public PlanoController(Connection conexao) {
        this.conexao = conexao;
    }

    public void alterar() {
        String sql = "update tbplanos set nomeplano=?, valor=? where idplano=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaPlanos.getTxtNomepPlano().getText());
            pst.setString(2, telaPlanos.getTxtValor().getText());
            pst.setString(3, telaPlanos.getTxtIdPlano().getText());

            if (telaPlanos.getTxtNomepPlano().getText().isEmpty()
                    || telaPlanos.getTxtValor().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Funcionário Alterado com sucesso!");
                    telaPlanos.limparCampos();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void adicionar() {
        String sql = "INSERT INTO tbplanos(nomeplano, valor) VALUES (?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaPlanos.getTxtNomepPlano().getText());
            pst.setString(2, telaPlanos.getTxtValor().getText());

            if (telaPlanos.getTxtNomepPlano().getText().isEmpty()
                    || telaPlanos.getTxtValor().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso!");
                    telaPlanos.limparCampos();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void deletar() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Plano", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tbplanos where idplano=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, telaPlanos.getTxtIdPlano().getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Plano Deletado com sucesso!");
                    telaPlanos.limparCampos();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public List<String> obterNomesPlanos() {
        List<String> nomesPlanos = new ArrayList<>();

        if (conexao == null) {
            // Tratar o caso em que a conexão é nula, lançar uma exceção ou retornar uma lista vazia, dependendo da lógica do seu aplicativo.
            return nomesPlanos;
        }

        String sql = "SELECT nomeplano FROM tbplanos";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                nomesPlanos.add(rs.getString("nomeplano"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return nomesPlanos;
    }

    public int obterIdPlanoPorNome(String nomePlano) {
        int idPlano = 0;  // Valor padrão ou valor que indique nenhum plano selecionado

        String sql = "SELECT idplano FROM tbplanos WHERE nomeplano = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nomePlano);
            rs = pst.executeQuery();

            if (rs.next()) {
                idPlano = rs.getInt("idplano");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return idPlano;
    }

}
