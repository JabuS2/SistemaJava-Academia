/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gsoftwareacad.Model;

/**
 *
 * @author guisa
 */
public class PlanosModel {

    private int idplano;
    private String nomeplano;
    private double valor;

    // Construtor
    public PlanosModel(int idplano, String nomeplano, double valor) {
        this.idplano = idplano;
        this.nomeplano = nomeplano;
        this.valor = valor;
    }

    // Métodos Getters e Setters
    public int getIdplano() {
        return idplano;
    }

    public void setIdplano(int idplano) {
        this.idplano = idplano;
    }

    public String getNomeplano() {
        return nomeplano;
    }

    public void setNomeplano(String nomeplano) {
        this.nomeplano = nomeplano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Outros métodos, se necessário
}
