package com.gsoftwareacad.controller;

import com.gsoftwareacad.telas.TelaCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import com.gsoftwareacad.Model.ClienteModel;

public class ClienteController {
    
    private TelaCliente telaCliente;
    private Connection conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public ClienteController(TelaCliente telaCliente, Connection conexao) {
        this.telaCliente = telaCliente;
        this.conexao = conexao;
    }
    
    public void alterar(){
        String sql = "update tbclientes set nomecli=?,endcli=?, fonecli=?, emailcli=? where idcli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaCliente.getTxtNomeCli().getText());
            pst.setString(2, telaCliente.getTxtEndCli().getText());
            pst.setString(3, telaCliente.getTxtTelCli().getText());
            pst.setString(4, telaCliente.getTxtEmaiCli().getText());
            pst.setString(5, telaCliente.getTxtIdCli().getText());
            
            if (telaCliente.getTxtNomeCli().getText().isEmpty()
                || telaCliente.getTxtTelCli().getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Alterado com sucesso!");
                    telaCliente.limparCampos();
                }
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public void adicionar() {
        String sql = "INSERT INTO tbclientes(nomecli, endcli, fonecli, emailcli) VALUES (?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaCliente.getTxtNomeCli().getText());
            pst.setString(2, telaCliente.getTxtEndCli().getText());
            pst.setString(3, telaCliente.getTxtTelCli().getText());
            pst.setString(4, telaCliente.getTxtEmaiCli().getText());

            if (telaCliente.getTxtNomeCli().getText().isEmpty()
                || telaCliente.getTxtTelCli().getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
                    telaCliente.limparCampos();

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void deletar(){
        
        int confirma =JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Cliente","Atenção",JOptionPane.YES_NO_OPTION);
        
        if (confirma==JOptionPane.YES_OPTION){
            
            String sql = "delete from tbclientes where idcli=?";
            try {

                pst = conexao.prepareStatement(sql);
                pst.setString(1, telaCliente.getTxtIdCli().getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Deletado com sucesso!");
                    telaCliente.limparCampos();
                }

            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);        
            }            
            
        }
        

    }    
 
    
    
    
}
