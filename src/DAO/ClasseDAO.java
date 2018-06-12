/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conectar.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Gerenciador_OS;

/**
 *
 * @author Arthur Felipe
 */
public class ClasseDAO {
    
    ConnectionFactory conex = new ConnectionFactory();
    private Connection con = null;
    PreparedStatement stmt = null;
    
    public ClasseDAO(
    
            
    
    ) throws SQLException {
       // con = ConnectionFactory.getConnection();
    }
    
    public void inserir(Gerenciador_OS gos){
        
        
        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            String sql = "insert into novo_chamado(Numero_os,Data_os,Responsavel_os,Descricao_os, Situacao_os) values (?,?,?,?,?)";
            
            stmt = con.prepareStatement(sql);
            
            
            stmt.setString(1, gos.getNumero_os());
            stmt.setString(2, gos.getData_os());
            stmt.setString(3, gos.getResponsavel_os());
            stmt.setString(4, gos.getDescricao_os());
            stmt.setString(5, gos.getSituacao_os());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados ! /nErro: "+ex.getMessage());
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
       }
        
    }
    
    public List<Gerenciador_OS> pesquisar(String gos){
    
        try {
            con = ConnectionFactory.getConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar ao banco de dados:" +ex.getMessage());
        }
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    List<Gerenciador_OS> gerenciador = new ArrayList<>();
    
    try{
    
        stmt = con.prepareStatement("SELECT * FROM novo_chamado WHERE Numero_os LIKE ?");
        stmt.setString(1, gos);
                
        rs = stmt.executeQuery();
        
    while(rs.next()){
        Gerenciador_OS grs = new Gerenciador_OS();
        
         grs.setNumero_os(rs.getString("Numero_os"));
         grs.setData_os(rs.getString("Data_os"));
         grs.setResponsavel_os(rs.getString("Responsavel_os"));
         grs.setDescricao_os(rs.getString("Descricao_os")); 
         gerenciador.add(grs);
        }
 
    }catch(SQLException ex){    
        JOptionPane.showMessageDialog(null,"Erro ao buscar numero da OS >>> " +ex.getMessage());
     }
    finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
     }
        return gerenciador;
    }
    
    public List<Gerenciador_OS> readAC() throws SQLException{
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Gerenciador_OS> gerenciadorACS = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("Select * FROM novo_chamado");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
                Gerenciador_OS gerenciadorAC = new Gerenciador_OS();
                
                gerenciadorAC.setId(rs.getInt("id"));
                gerenciadorAC.setNumero_os(rs.getString("Numero_os"));
                gerenciadorAC.setData_os(rs.getString("Data_os"));
                gerenciadorAC.setResponsavel_os(rs.getString("Responsavel_os"));
                gerenciadorAC.setDescricao_os(rs.getString("Descricao_os"));
                gerenciadorAC.setSituacao_os(rs.getString("Situacao_os"));
                gerenciadorACS.add(gerenciadorAC);
                
            }
                    
      } catch (SQLException ex) {
          
            JOptionPane.showMessageDialog(null, "Erro ClasseDAO em readAC: "+ex.getMessage());
            
      }finally{
        
      ConnectionFactory.closeConnection(con, stmt, rs);
            
      }
        
        return gerenciadorACS;
        
    }
    
    public void update(Gerenciador_OS gos){
        
        
        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            String sql = "UPDATE novo_chamado SET Numero_os = ?, Data_os = ?, Responsavel_os = ?, Descricao_os = ?, Situacao_os = ? WHERE id = ?";
            
            stmt = con.prepareStatement(sql);
            
            
            stmt.setString(1, gos.getNumero_os());
            stmt.setString(2, gos.getData_os());
            stmt.setString(3, gos.getResponsavel_os());
            stmt.setString(4, gos.getDescricao_os());
            stmt.setString(5, gos.getSituacao_os());
            stmt.setInt(6, gos.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar dados ! /nErro: "+ex.getMessage());
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
       }
        
    }
    
    public void delete(Gerenciador_OS gos){
        
        
        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            String sql = "DELETE FROM novo_chamado WHERE id = ?";
            
            stmt = con.prepareStatement(sql);
           
            stmt.setInt(1, gos.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao Excluir dados ! /nErro: "+ex.getMessage());
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
       }
        
    }
   

    /*public void create(Gerenciador_OS g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
