/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Andrietti
 */
public class ConexaoBD {  
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/Controle";
    private String usuario = "postgres";
    private String senha = "12481632";
    public Connection con; 
    
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão de Dados Ok!\n:)");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Errooooo, sem conexão!\n\n:("+ex.getMessage());
        }
        
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Errooooo, sem conexão!\n\n:("+ex.getMessage());
        }
        
    }
    
    public void desconecta(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconexão de Dados Ok!\n\n:)");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Errrroooo!!!!\n não fechou banco!\n:)"+ex.getMessage());
        }
    }
}
