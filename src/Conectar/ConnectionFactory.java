/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Arthur Felipe
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/gerenciador_os";
    private static final String USER = "root";
    private static final String PASS = "";
    public ResultSet rs;
    public Statement stmt;
    public Connection con;
    
    public static Connection getConnection() throws SQLException{
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erro na conexao"+ex.getMessage());
            
        }
        
    }
    
    public void executaSql(String sql){
    
        try {
            stmt = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ExecutaSql: "+ex.getMessage());
        }
    }
    
    public static void closeConnection(Connection con){
    
        if(con != null){
        
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex.getMessage());
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
    
        if(stmt != null){
        
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex.getMessage());
            }
        }
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
    
        if(rs != null){
        
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex.getMessage());
            }
        }
        closeConnection(con, stmt);
    }
}
