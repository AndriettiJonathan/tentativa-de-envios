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
public class ControleDespesa {
    ConexaoBD conex = new ConexaoBD();
    AcessoDespesa mod = new AcessoDespesa();    
    public void Salvar(AcessoDespesa mod){
           
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.con.prepareStatement("INSERT INTO \"despesas\" (valord,dpagod,dpagard,tipod,contad) values(?,?,?,?,?)");
            pst.setInt(1,mod.getValorD());
            pst.setInt(2,mod.getDpagoD());
            pst.setInt(3,mod.getDpagarD());
            pst.setString(4,mod.getTipoD());
            pst.setString(5,mod.getContaD());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados Salvos com Sucesso!!!");
                            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Salvo: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    public void Editar(AcessoDespesa mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update despesas set valord=?,dpagod=?,dpagard=?,tipod=?,contad=? where codigo=?");
            pst.setInt(1,mod.getValorD());
            pst.setInt(2,mod.getDpagoD());
            pst.setInt(3,mod.getDpagarD());
            pst.setString(4,mod.getTipoD());
            pst.setString(5,mod.getContaD());
            pst.setInt(6,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Alterados Com Sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Alterado: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Excluir(AcessoDespesa mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from despesas where codigo=?");
            pst.setInt(1,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Excluido para Sempre!!!\n\n hehehehehe...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Nada Apagado do Universo!: \n\n"+ex);
        }
        
        conex.desconecta();
    }
    
    public AcessoDespesa buscarDespesa(AcessoDespesa mod){
        conex.conexao();
        conex.executaSql("select *from despesas where tipod like'%"+mod.getBusca()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setValorD(conex.rs.getInt("valord"));
            mod.setDpagoD(conex.rs.getInt("dpagod"));
            mod.setDpagarD(conex.rs.getInt("dpagard"));
            mod.setTipoD(conex.rs.getString("tipod"));
            mod.setContaD(conex.rs.getString("contad"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Errooooo!!!\n\n Sem Dados: \n\n"+ex);
        }
        
        
        conex.desconecta();
        return mod;
    }
}
