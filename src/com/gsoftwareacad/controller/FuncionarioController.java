/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gsoftwareacad.controller;


import com.gsoftwareacad.telas.TelaFuncionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author guisa
 */
public class FuncionarioController {
    
    private TelaFuncionario telaFuncionario;
    private Connection conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public FuncionarioController(TelaFuncionario telaFuncionario, Connection conexao) {
        this.telaFuncionario = telaFuncionario;
        this.conexao = conexao;
    }    
    
        public void alterar(){
        String sql = "update tbfuncionarios set nomefunc=?,funcaofunc=?, contatofunc=?, salariofunc=? where idfunc=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaFuncionario.getTxtFunNome().getText());
            pst.setString(2, telaFuncionario.getTxtFunFun().getText());
            pst.setString(3, telaFuncionario.getTxtFunCtt().getText());
            pst.setString(4, telaFuncionario.getTxtFunSal().getText());
            pst.setString(5, telaFuncionario.getTxtFunId().getText());
            
            if (telaFuncionario.getTxtFunNome().getText().isEmpty()
                || telaFuncionario.getTxtFunFun().getText().isEmpty()|| telaFuncionario.getTxtFunSal().getText().isEmpty() ){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Funcionario Alterado com sucesso!");
                    telaFuncionario.limparCampos();
                }
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        } 
    }
    
        
    public void adicionar() {
        String sql = "INSERT INTO tbfuncionarios(nomefunc, funcaofunc, contatofunc, salariofunc) VALUES (?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaFuncionario.getTxtFunNome().getText());
            pst.setString(2, telaFuncionario.getTxtFunFun().getText());
            pst.setString(3, telaFuncionario.getTxtFunCtt().getText());
            pst.setString(4, telaFuncionario.getTxtFunSal().getText());

            if (telaFuncionario.getTxtFunNome().getText().isEmpty()
                || telaFuncionario.getTxtFunFun().getText().isEmpty()|| telaFuncionario.getTxtFunSal().getText().isEmpty() ){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Funcionario adicionado com sucesso!");
                    telaFuncionario.limparCampos();

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void deletar(){
        
        int confirma =JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Cliente","Atenção",JOptionPane.YES_NO_OPTION);
        
        if (confirma==JOptionPane.YES_OPTION){
            
            String sql = "delete from tbfuncionarios where idfunc=?";
            try {

                pst = conexao.prepareStatement(sql);
                pst.setString(1, telaFuncionario.getTxtFunId().getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Funcionario Deletado com sucesso!");
                    telaFuncionario.limparCampos();
                }

            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);        
            }            
            
        }
        

    }    
 
}
