/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDados;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import BaseDados.AcessoReceita;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jonathan Andrietti
 */
public class ControleReceita {
    
    ConexaoBD conex = new ConexaoBD();
    AcessoReceita mod = new AcessoReceita();
    
    public void Salvar(AcessoReceita mod){
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.con.prepareStatement("INSERT INTO \"receitas\" (nome,valor,treceita,dpago,dpagar,conta) values(?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setInt(2,mod.getValor());
            pst.setString(3,mod.getTreceita());
            pst.setInt(4,mod.getDpago());
            pst.setInt(5,mod.getDpagar());
            pst.setString(6,mod.getConta());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados Salvos com Sucesso!!!");
                            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Salvo: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Editar(AcessoReceita mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update receitas set nome=?,valor=?,treceita=?,dpago=?,dpagar=?,conta=? where codigo=?");
            pst.setString(1,mod.getNome());
            pst.setInt(2,mod.getValor());
            pst.setString(3,mod.getTreceita());
            pst.setInt(4,mod.getDpago());
            pst.setInt(5,mod.getDpagar());
            pst.setString(6,mod.getConta());
            pst.setInt(7,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Alterados Com Sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Alterado: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Excluir(AcessoReceita mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from receitas where codigo=?");
            pst.setInt(1,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Excluido para Sempre!!!\n\n hehehehehe...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Apagado do Universo!: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    
    public AcessoReceita buscarReceita(AcessoReceita mod){
        conex.conexao();
        conex.executaSql("select *from receitas where nome like'%"+mod.getBusca()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setValor(conex.rs.getInt("valor"));
            mod.setTreceita(conex.rs.getString("treceita"));
            mod.setDpago(conex.rs.getInt("dpago"));
            mod.setDpagar(conex.rs.getInt("dpagar"));
            mod.setConta(conex.rs.getString("conta"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Sem Dados: \n\n"+ex);
        }
        
        
        conex.desconecta();
        return mod;
    }
}