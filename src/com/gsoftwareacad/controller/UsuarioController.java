// UsuarioController.java
package com.gsoftwareacad.controller;

import com.gsoftwareacad.Model.UsuarioModel;
import com.gsoftwareacad.telas.TelaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioController {

    private TelaUsuario telaUsuario;
    private Connection conexao;
    private PreparedStatement pst;
    private ResultSet rs;

    public UsuarioController(TelaUsuario telaUsuario, Connection conexao) {
        this.telaUsuario = telaUsuario;
        this.conexao = conexao;
    }
    

    public void consultar() {
        String sql = "SELECT * FROM tbusuarios WHERE iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaUsuario.getTxtUsuId().getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                UsuarioModel usuario = new UsuarioModel(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                );

                // Atualiza a View com os dados do usuário
                telaUsuario.exibirUsuario(usuario);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não Cadastrado");
                telaUsuario.limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void adicionar() {
        String sql = "INSERT INTO tbusuarios(iduser, usuario, fone, login, senha, perfil) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaUsuario.getTxtUsuId().getText());
            pst.setString(2, telaUsuario.getTxtUsuNome().getText());
            pst.setString(3, telaUsuario.getTxtUsuFone().getText());
            pst.setString(4, telaUsuario.getTxtUsuLogin().getText());
            pst.setString(5, telaUsuario.getTxtUsuSenha().getText());
            pst.setString(6, telaUsuario.getCboUsuPerfil().getSelectedItem().toString());

            if (telaUsuario.getTxtUsuId().getText().isEmpty()
                || telaUsuario.getTxtUsuNome().getText().isEmpty()
                || telaUsuario.getTxtUsuLogin().getText().isEmpty()
                || telaUsuario.getTxtUsuSenha().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
                    telaUsuario.limparCampos();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void alterar(){
        String sql = "update tbusuarios set usuario=?,fone=?, login=?, senha=?, perfil=? where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaUsuario.getTxtUsuNome().getText());
            pst.setString(2, telaUsuario.getTxtUsuFone().getText());
            pst.setString(3, telaUsuario.getTxtUsuLogin().getText());
            pst.setString(4, telaUsuario.getTxtUsuSenha().getText());
            pst.setString(5, telaUsuario.getCboUsuPerfil().getSelectedItem().toString());
            pst.setString(6, telaUsuario.getTxtUsuId().getText());
            
            if (telaUsuario.getTxtUsuId().getText().isEmpty()
                || telaUsuario.getTxtUsuNome().getText().isEmpty()
                || telaUsuario.getTxtUsuLogin().getText().isEmpty()
                || telaUsuario.getTxtUsuSenha().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário Alterado com sucesso!");
                    telaUsuario.limparCampos();
                }
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public void deletar(){
        
        int confirma =JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este usuário","Atenção",JOptionPane.YES_NO_OPTION);
        
        if (confirma==JOptionPane.YES_OPTION){
            
            String sql = "delete from tbusuarios where iduser=?";
            try {

                pst = conexao.prepareStatement(sql);
                pst.setString(1, telaUsuario.getTxtUsuId().getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário Deletado com sucesso!");
                }

            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);        
            }            
            
        }
        

    }
}
