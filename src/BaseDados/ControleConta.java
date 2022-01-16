/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDados;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Andrietti
 */
public class ControleConta {
    
    ConexaoBD conex = new ConexaoBD();
    AcessoConta mod = new AcessoConta();   
    
    
    public void Salvar(AcessoConta mod){
           
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.con.prepareStatement("INSERT INTO \"contas\" (ccorrente,agencia,banco,saldo) values(?,?,?,?)");
            pst.setInt(1,mod.getCcorrente());
            pst.setInt(2,mod.getAgencia());
            pst.setString(3,mod.getBanco());
            pst.setInt(4,mod.getSaldo());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados Salvos com Sucesso!!!");
                            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Salvo: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Editar(AcessoConta mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update contas set ccorrente=?,agencia=?,banco=?,saldo=? where codigo=?");
            pst.setInt(1,mod.getCcorrente());
            pst.setInt(2,mod.getAgencia());
            pst.setString(3,mod.getBanco());
            pst.setInt(4,mod.getSaldo());
            pst.setInt(5,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Alterados Com Sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Alterado: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Excluir(AcessoConta mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from contas where codigo=?");
            pst.setInt(1,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Excluido para Sempre!!!\n\n hehehehehe...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Apagado do Universo!: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    
    public AcessoConta buscarConta(AcessoConta mod){
        conex.conexao();
        conex.executaSql("select *from contas where banco like'%"+mod.getBusca()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setCcorrente(conex.rs.getInt("ccorrente"));
            mod.setAgencia(conex.rs.getInt("agencia"));
            mod.setBanco(conex.rs.getString("banco"));
            mod.setSaldo(conex.rs.getInt("saldo"));            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Sem Dados: \n\n"+ex);
        }
        
        
        conex.desconecta();
        return mod;
    }
}
   