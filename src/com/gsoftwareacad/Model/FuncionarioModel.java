/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gsoftwareacad.Model;

/**
 *
 * @author guisa
 */
public class FuncionarioModel {
    private int idfunc;
    private String nomefunc;
    private String funcaofunc;
    private String contatofunc;
    private double salariofunc;

    public FuncionarioModel() {
        // Construtor padrão
    }

    public FuncionarioModel(int idfunc, String nomefunc, String funcaofunc, String contatofunc, double salariofunc) {
        this.idfunc = idfunc;
        this.nomefunc = nomefunc;
        this.funcaofunc = funcaofunc;
        this.contatofunc = contatofunc;
        this.salariofunc = salariofunc;
    }

    public int getIdfunc() {
        return idfunc;
    }

    public void setIdfunc(int idfunc) {
        this.idfunc = idfunc;
    }

    public String getNomefunc() {
        return nomefunc;
    }

    public void setNomefunc(String nomefunc) {
        this.nomefunc = nomefunc;
    }

    public String getFuncaofunc() {
        return funcaofunc;
    }

    public void setFuncaofunc(String funcaofunc) {
        this.funcaofunc = funcaofunc;
    }

    public String getContatofunc() {
        return contatofunc;
    }

    public void setContatofunc(String contatofunc) {
        this.contatofunc = contatofunc;
    }

    public double getSalariofunc() {
        return salariofunc;
    }

    public void setSalariofunc(double salariofunc) {
        this.salariofunc = salariofunc;
    }
}
