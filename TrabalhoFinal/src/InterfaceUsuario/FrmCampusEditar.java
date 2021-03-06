/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

import DomainModel.Campus;
import Negocio.CampusBO;
import javax.swing.JOptionPane;

/**
 *
 * @author John Kevin
 */
public class FrmCampusEditar extends javax.swing.JInternalFrame {
    Campus campus;
    CampusBO bo;

    /**
     * Creates new form FrmCampus
     */
    public FrmCampusEditar(Campus c, CampusBO cbo) {
        initComponents();
        this.campus = c;
        this.bo = cbo;
        
        carregaCampos();
    }

    private void carregaCampos() {
        TxtNome.setText(campus.getNome());
        TxtTelefone.setText(campus.getTelefone());
        TxtCidade.setText(campus.getCidade());
        TxtRua.setText(campus.getRua());
        TxtNumero.setText(Integer.toString(campus.getNumero()));
        
     }

    private void carregaObjeto() {
        campus.setNome(TxtNome.getText());
        campus.setTelefone(TxtTelefone.getText());
        campus.setCidade(TxtCidade.getText());
        campus.setRua(TxtRua.getText());
        campus.setNumero(Integer.parseInt(TxtNumero.getText()));
        
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
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnApagar.setText("Apagar");
        BtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarActionPerformed(evt);
            }
        });

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
                .addGap(18, 26, Short.MAX_VALUE)
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

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja Salvar?") == 0) {
                carregaObjeto();
                if (bo.Salvar(campus)) {
                    JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha ao salvar! Favor verificar os dados!");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!");
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente limpar os campos?")
                == 0) {
            TxtNome.setText(null);
            TxtTelefone.setText(null);
            TxtCidade.setText(null);
            TxtRua.setText(null);
            TxtNumero.setText(null);
            
            JOptionPane.showMessageDialog(rootPane, "Pronto!");
        }
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Remover?")
            == 0){
            
            if (bo.Apagar(campus)) {
                    JOptionPane.showMessageDialog(rootPane, "Apagado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Nao foi possivel apagar!");
                }
            
            
        }
    }//GEN-LAST:event_BtnApagarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Sair?") 
                == 0){
            this.dispose();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

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
