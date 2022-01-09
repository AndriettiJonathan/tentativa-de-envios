/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author Jonathan Andrietti
 */
public class tSistema extends javax.swing.JFrame {

    /**
     * Creates new form tSistema
     */
    public tSistema() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelInfo = new javax.swing.JInternalFrame();
        jPainelInterF = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTestoImpiracao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFechar = new javax.swing.JButton();
        jFundo = new javax.swing.JLabel();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jUsuario = new javax.swing.JMenuItem();
        jBanco = new javax.swing.JMenuItem();
        jProduto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        CadReceitas = new javax.swing.JMenuItem();
        EdReceitas = new javax.swing.JMenuItem();
        RemReceitas = new javax.swing.JMenuItem();
        ListReceitas = new javax.swing.JMenuItem();
        ListTReceitas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        CadDespesas = new javax.swing.JMenuItem();
        EdDespesas = new javax.swing.JMenuItem();
        RemDespesas = new javax.swing.JMenuItem();
        ListDespesas = new javax.swing.JMenuItem();
        ListTDespesas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        CadContas = new javax.swing.JMenuItem();
        EdContas = new javax.swing.JMenuItem();
        RemContas = new javax.swing.JMenuItem();
        ListContas = new javax.swing.JMenuItem();
        TranfSaldContas = new javax.swing.JMenuItem();
        ListSaldoTotal = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jAjuda = new javax.swing.JMenu();
        jInfo = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenu();
        jEncerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento Visão Futura");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setForeground(java.awt.Color.white);
        setLocationByPlatform(true);
        setName("SistemaPrincipal"); // NOI18N
        getContentPane().setLayout(null);

        jPainelInfo.setTitle("Bem Vindo!");
        jPainelInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jPainelInfo.setVisible(true);
        jPainelInfo.getContentPane().setLayout(null);

        jPainelInterF.setBackground(new java.awt.Color(255, 255, 255));
        jPainelInterF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPainelInterF.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoFinancas.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPainelInterF.add(jLabel1);
        jLabel1.setBounds(530, 60, 200, 134);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Sistema criado para gerenciar/controlar minha futura empresa baseado em um teste para Proway!");
        jPainelInterF.add(jLabel3);
        jLabel3.setBounds(10, 10, 610, 50);

        jTestoImpiracao.setBackground(new java.awt.Color(255, 204, 51));
        jTestoImpiracao.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jTestoImpiracao.setForeground(new java.awt.Color(153, 0, 0));
        jTestoImpiracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTestoImpiracao.setText("\"Nada se cria, tudo se transforma\"");
        jTestoImpiracao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));
        jPainelInterF.add(jTestoImpiracao);
        jTestoImpiracao.setBounds(20, 80, 510, 60);

        jPainelInfo.getContentPane().add(jPainelInterF);
        jPainelInterF.setBounds(0, 30, 690, 180);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sistema de Gerenciamento Financeiro/Estoque para Empresa");
        jPainelInfo.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 370, 20);

        jFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair_1.png"))); // NOI18N
        jFechar.setText("Fechar");
        jFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharActionPerformed(evt);
            }
        });
        jPainelInfo.getContentPane().add(jFechar);
        jFechar.setBounds(583, 0, 110, 30);

        getContentPane().add(jPainelInfo);
        jPainelInfo.setBounds(220, 150, 704, 242);

        jFundo.setBackground(new java.awt.Color(255, 255, 255));
        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Seguro-garantia-judicial.jpg"))); // NOI18N
        jFundo.setFocusTraversalPolicyProvider(true);
        jFundo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jFundo.setOpaque(true);
        getContentPane().add(jFundo);
        jFundo.setBounds(0, -2, 1430, 870);

        jMenu1.setText("Cadastro");

        jUsuario.setText("Usuários");
        jMenu1.add(jUsuario);

        jBanco.setText("Bancos");
        jBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBancoActionPerformed(evt);
            }
        });
        jMenu1.add(jBanco);

        jProduto.setText("Produto");
        jMenu1.add(jProduto);

        jMenuPrincipal.add(jMenu1);

        jMenu4.setText("Receitas");

        CadReceitas.setText("Cadastrar receitas");
        CadReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadReceitasActionPerformed(evt);
            }
        });
        jMenu4.add(CadReceitas);

        EdReceitas.setText("Editar receitas");
        jMenu4.add(EdReceitas);

        RemReceitas.setText("Remover receitas");
        jMenu4.add(RemReceitas);

        ListReceitas.setText("Listar receitas");
        jMenu4.add(ListReceitas);

        ListTReceitas.setText("Listar total de receitas");
        jMenu4.add(ListTReceitas);

        jMenuPrincipal.add(jMenu4);

        jMenu5.setText("Despesas");

        CadDespesas.setText("Cadastrar despesas");
        jMenu5.add(CadDespesas);

        EdDespesas.setText("Editar despesas");
        jMenu5.add(EdDespesas);

        RemDespesas.setText("Remover despesas");
        jMenu5.add(RemDespesas);

        ListDespesas.setText("Listar despesas");
        jMenu5.add(ListDespesas);

        ListTDespesas.setText("Listar total de despesas");
        jMenu5.add(ListTDespesas);

        jMenuPrincipal.add(jMenu5);

        jMenu6.setText("Contas");

        CadContas.setText("Cadastrar conta");
        jMenu6.add(CadContas);

        EdContas.setText("Editar conta");
        jMenu6.add(EdContas);

        RemContas.setText("Remover conta");
        jMenu6.add(RemContas);

        ListContas.setText("Listar contas");
        jMenu6.add(ListContas);

        TranfSaldContas.setText("Transferir saldo entre contas");
        jMenu6.add(TranfSaldContas);

        ListSaldoTotal.setText("Listar saldo total");
        jMenu6.add(ListSaldoTotal);

        jMenuPrincipal.add(jMenu6);

        jMenu3.setText("Consulta");
        jMenuPrincipal.add(jMenu3);

        jAjuda.setText("Ajuda");

        jInfo.setText("Info");
        jInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInfoActionPerformed(evt);
            }
        });
        jAjuda.add(jInfo);

        jMenuPrincipal.add(jAjuda);

        jSair.setText("Sair");

        jEncerrar.setText("Encerrar Sistema");
        jEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEncerrarActionPerformed(evt);
            }
        });
        jSair.add(jEncerrar);

        jMenuPrincipal.add(jSair);

        setJMenuBar(jMenuPrincipal);

        setSize(new java.awt.Dimension(1389, 831));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBancoActionPerformed

    private void jFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharActionPerformed
        jPainelInfo.dispose();
    }//GEN-LAST:event_jFecharActionPerformed

    private void jEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jEncerrarActionPerformed

    private void jInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInfoActionPerformed
        tSistema tela = new tSistema();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jInfoActionPerformed

    private void CadReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadReceitasActionPerformed
        CadReceitas tela = new CadReceitas();
        tela.setVisible(true);
    }//GEN-LAST:event_CadReceitasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadContas;
    private javax.swing.JMenuItem CadDespesas;
    private javax.swing.JMenuItem CadReceitas;
    private javax.swing.JMenuItem EdContas;
    private javax.swing.JMenuItem EdDespesas;
    private javax.swing.JMenuItem EdReceitas;
    private javax.swing.JMenuItem ListContas;
    private javax.swing.JMenuItem ListDespesas;
    private javax.swing.JMenuItem ListReceitas;
    private javax.swing.JMenuItem ListSaldoTotal;
    private javax.swing.JMenuItem ListTDespesas;
    private javax.swing.JMenuItem ListTReceitas;
    private javax.swing.JMenuItem RemContas;
    private javax.swing.JMenuItem RemDespesas;
    private javax.swing.JMenuItem RemReceitas;
    private javax.swing.JMenuItem TranfSaldContas;
    private javax.swing.JMenu jAjuda;
    private javax.swing.JMenuItem jBanco;
    private javax.swing.JMenuItem jEncerrar;
    private javax.swing.JButton jFechar;
    private javax.swing.JLabel jFundo;
    private javax.swing.JMenuItem jInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JInternalFrame jPainelInfo;
    private javax.swing.JPanel jPainelInterF;
    private javax.swing.JMenuItem jProduto;
    private javax.swing.JMenu jSair;
    private javax.swing.JLabel jTestoImpiracao;
    private javax.swing.JMenuItem jUsuario;
    // End of variables declaration//GEN-END:variables
}
