/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDados;

/**
 *
 * @author Jonathan Andrietti
 */
public class AcessoConta {
    
    private int Codigo;
    private int Ccorrente;
    private int Agencia;
    private String Banco;
    private int Saldo;
    private String Busca;

    /**
     * @return the Ccorrente
     */
    public int getCcorrente() {
        return Ccorrente;
    }

    /**
     * @param Ccorrente the Ccorrente to set
     */
    public void setCcorrente(int Ccorrente) {
        this.Ccorrente = Ccorrente;
    }

    /**
     * @return the Agencia
     */
    public int getAgencia() {
        return Agencia;
    }

    /**
     * @param Agencia the Agencia to set
     */
    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    /**
     * @return the Banco
     */
    public String getBanco() {
        return Banco;
    }

    /**
     * @param Banco the Banco to set
     */
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    /**
     * @return the Saldo
     */
    public int getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the Busca
     */
    public String getBusca() {
        return Busca;
    }

    /**
     * @param Busca the Busca to set
     */
    public void setBusca(String Busca) {
        this.Busca = Busca;
    }

    /**
     * @return the Numero
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Numero to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
    
}
