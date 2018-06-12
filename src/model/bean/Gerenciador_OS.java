/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import javax.swing.JTextField;

/**
 *
 * @author Arthur Felipe
 */
public class Gerenciador_OS {
    
    private int id;
    private String Numero_os;
    private String Data_os;
    private String Responsavel_os;
    private String Descricao_os;
    public String setData_os;
    private String pesquisa;
    private String Situacao_os;

    
    public Gerenciador_OS(String Numero_os , String Data_os, String Responsavel_os, String Descricao_os, String Situacao_os){
        this.Descricao_os = Descricao_os;
        this.Numero_os = Numero_os;
        this.Responsavel_os = Responsavel_os;
        this.Data_os = Data_os;
        this.Situacao_os = Situacao_os;
       
    }

    public Gerenciador_OS() {
        
    }

    public String getDescricao_os() {
        return Descricao_os;
    }

    public void setDescricao_os(String Descricao_os) {
        this.Descricao_os = Descricao_os;
    }

    public String getData_os() {
        return Data_os;
    }

    public void setData_os(String Data_os) {
        this.Data_os = Data_os;
    }

    
    public String getNumero_os() {
        return Numero_os;
    }

    public void setNumero_os(String Numero_os) {
        this.Numero_os = Numero_os;
    }

    public String getResponsavel_os() {
        return Responsavel_os;
    }

    public void setResponsavel_os(String Responsavel_os) {
        this.Responsavel_os = Responsavel_os;
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getPesquisa() {
        return pesquisa;
    }
    
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public void setPesquisa(JTextField Numero_os) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSetData_os() {
        return setData_os;
    }

    public void setSetData_os(String setData_os) {
        this.setData_os = setData_os;
    }

    public String getSituacao_os() {
        return Situacao_os;
    }

    public void setSituacao_os(String Situacao_os) {
        this.Situacao_os = Situacao_os;
    }


    
    
}
