/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

/**
 *
 * @author John Kevin
 */
public class FrmCampusEditar extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCampus
     */
    public FrmCampusEditar() {
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

        PnlEditarCampus = new javax.swing.JPanel();
        TxtNome = new javax.swing.JTextField();
        TxtTelefone = new javax.swing.JTextField();
        TxtCidade = new javax.swing.JTextField();
        TxtRua = new javax.swing.JTextField();
        TxtNumero = new javax.swing.JTextField();
        LblNome = new javax.swing.JLabel();
        LblTelefone = new javax.swing.JLabel();
        LblCidade = new javax.swing.JLabel();
        LblRua = new javax.swing.JLabel();
        LblNumero = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnApagar = new javax.swing.JButton();

        setTitle("Editar Campus");

        PnlEditarCampus.setBackground(new java.awt.Color(255, 255, 255));
        PnlEditarCampus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Campus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCidadeActionPerformed(evt);
            }
        });

        LblNome.setText("Nome:");

        LblTelefone.setText("Telefone:");

        LblCidade.setText("Cidade: ");

        LblRua.setText("Rua:");

        LblNumero.setText("Numero:");

        BtnCancelar.setText("Cancelar");

        BtnLimpar.setText("Limpar");

        BtnSalvar.setText("Salvar");

        BtnApagar.setText("Apagar");

        javax.swing.GroupLayout PnlEditarCampusLayout = new javax.swing.GroupLayout(PnlEditarCampus);
        PnlEditarCampus.setLayout(PnlEditarCampusLayout);
        PnlEditarCampusLayout.setHorizontalGroup(
            PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditarCampusLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LblRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(LblNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BtnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtNumero)
                    .addComponent(TxtRua)
                    .addComponent(TxtCidade)
                    .addComponent(TxtTelefone)
                    .addComponent(TxtNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlEditarCampusLayout.createSequentialGroup()
                        .addComponent(BtnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        PnlEditarCampusLayout.setVerticalGroup(
            PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditarCampusLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNome))
                .addGap(18, 18, 18)
                .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTelefone)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCidade)
                    .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblRua))
                .addGap(18, 18, 18)
                .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNumero)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(PnlEditarCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnApagar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlEditarCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlEditarCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LblCidade;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JLabel LblRua;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JPanel PnlEditarCampus;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtRua;
    private javax.swing.JTextField TxtTelefone;
    // End of variables declaration//GEN-END:variables
}
