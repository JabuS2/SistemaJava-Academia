package com.gsoftwareacad.controller;

import com.gsoftwareacad.Model.PagamentosModel;
import com.gsoftwareacad.telas.TelaPagamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;


public class PagamentosController {

    private TelaPagamentos telaPagamentos;
    private Connection conexao;
    private PreparedStatement pst;
    private ResultSet rs;

    public PagamentosController(TelaPagamentos telaPagamentos, Connection conexao) {
        this.telaPagamentos = telaPagamentos;
        this.conexao = conexao;
    }

    public void adicionar() {
        String sql = "INSERT INTO tbpagamentos(idcli, idplano, datapagamento) VALUES (?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, telaPagamentos.getTxtIdCli().getText());
            pst.setString(2, telaPagamentos.getTxtPlanId().getText());
            pst.setString(3, telaPagamentos.getTxtPagData().getText());
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
            java.util.Date parsedDate = dateFormat.parse(telaPagamentos.getTxtPagData().getText());
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

            pst.setDate(3, sqlDate);

            if (telaPagamentos.getTxtIdCli().getText().isEmpty()
                    || telaPagamentos.getTxtPlanId().getText().isEmpty() || telaPagamentos.getTxtPagData().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso!");
                    telaPagamentos.limparCampos();

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
