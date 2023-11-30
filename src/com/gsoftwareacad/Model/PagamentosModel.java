/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gsoftwareacad.Model;

/**
 *
 * @author guisa
 */
import java.sql.Timestamp;

public class PagamentosModel {
    private int idpagamento;
    private int idcli;
    private int idplano;
    private Timestamp datapagamento;

    // Construtor vazio
    public PagamentosModel() {
    }

    // Construtor com parâmetros
    public PagamentosModel(int idpagamento, int idcli, int idplano, Timestamp datapagamento) {
        this.idpagamento = idpagamento;
        this.idcli = idcli;
        this.idplano = idplano;
        this.datapagamento = datapagamento;
    }

    // Métodos getter e setter

    public int getIdpagamento() {
        return idpagamento;
    }

    public void setIdpagamento(int idpagamento) {
        this.idpagamento = idpagamento;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public int getIdplano() {
        return idplano;
    }

    public void setIdplano(int idplano) {
        this.idplano = idplano;
    }

    public Timestamp getDatapagamento() {
        return datapagamento;
    }

    public void setDatapagamento(Timestamp datapagamento) {
        this.datapagamento = datapagamento;
    }
}
