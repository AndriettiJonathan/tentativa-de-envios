/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDados;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonathan Andrietti
 */
public class TabelaConta extends AbstractTableModel{
    private static final long serialVersionUID = 1L;
    
    private ArrayList linhas= null;
    private String[] colunas= null;
    
public TabelaConta(ArrayList lin, String[] col){
    setLinhas(lin);
    setColunas(col);
    
}

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    private void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    private void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    @Override
    public int getColumnCount(){
        return colunas.length;
        
    }
    
    @Override
    public int getRowCount(){
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    
    @Override
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}

