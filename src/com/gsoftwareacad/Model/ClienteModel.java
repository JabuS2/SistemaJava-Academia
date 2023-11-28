/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gsoftwareacad.Model;

/**
 *
 * @author guisa
 */

public class ClienteModel {

    private int idcli;
    private String nomecli;
    private String endcli;
    private String fonecli;
    private String emailcli;

        public ClienteModel() {
    }

    public ClienteModel(int idcli, String nomecli, String endcli, String fonecli, String emailcli) {
        this.idcli = idcli;
        this.nomecli = nomecli;
        this.endcli = endcli;
        this.fonecli = fonecli;
        this.emailcli = emailcli;
    }

    
    
    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getEndcli() {
        return endcli;
    }

    public void setEndcli(String endcli) {
        this.endcli = endcli;
    }

    public String getFonecli() {
        return fonecli;
    }

    public void setFonecli(String fonecli) {
        this.fonecli = fonecli;
    }

    public String getEmailcli() {
        return emailcli;
    }

    public void setEmailcli(String emailcli) {
        this.emailcli = emailcli;
    }
}
