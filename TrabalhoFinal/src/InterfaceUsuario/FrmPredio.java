/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

/**
 *
 * @author John Kevin
 */
public class FrmPredio extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmPredio
     */
    public FrmPredio() {
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

        PnlPedido = new javax.swing.JPanel();
        TxtId = new javax.swing.JTextField();
        LblId = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        LblNome = new javax.swing.JLabel();
        LblIdFuncionario = new javax.swing.JLabel();
        TxtIdFuncionario = new javax.swing.JTextField();
        TxtCodCampus = new javax.swing.JTextField();
        LblCodCampus = new javax.swing.JLabel();
        BrnSalvar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setTitle("Cadastrar Pedido");

        PnlPedido.setBackground(new java.awt.Color(255, 255, 255));
        PnlPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Pedido", 0, 0, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PnlPedido.setToolTipText("Pedido");
        PnlPedido.setAutoscrolls(true);

        LblId.setText("ID:");

        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        LblNome.setText("Nome:");

        LblIdFuncionario.setText("ID Funcionario: ");

        TxtIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdFuncionarioActionPerformed(evt);
            }
        });

        LblCodCampus.setText("Cod Campus:");

        BrnSalvar.setText("Salvar");

        BtnLimpar.setText("Limpar");

        BtnCancelar.setText("Cancelar");

        javax.swing.GroupLayout PnlPedidoLayout = new javax.swing.GroupLayout(PnlPedido);
        PnlPedido.setLayout(PnlPedidoLayout);
        PnlPedidoLayout.setHorizontalGroup(
            PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPedidoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblCodCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblIdFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(LblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPedidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlPedidoLayout.createSequentialGroup()
                                .addComponent(BrnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCancelar))
                            .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtIdFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(TxtCodCampus))))
                    .addGroup(PnlPedidoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PnlPedidoLayout.setVerticalGroup(
            PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPedidoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblId))
                .addGap(18, 18, 18)
                .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNome))
                .addGap(18, 18, 18)
                .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblIdFuncionario)
                    .addComponent(TxtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCodCampus))
                .addGap(42, 42, 42)
                .addGroup(PnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrnSalvar)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnCancelar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdFuncionarioActionPerformed

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrnSalvar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JLabel LblCodCampus;
    private javax.swing.JLabel LblId;
    private javax.swing.JLabel LblIdFuncionario;
    private javax.swing.JLabel LblNome;
    private javax.swing.JPanel PnlPedido;
    private javax.swing.JTextField TxtCodCampus;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtIdFuncionario;
    private javax.swing.JTextField TxtNome;
    // End of variables declaration//GEN-END:variables
}