/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

import DomainModel.Campus;
import Negocio.CampusBO;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulo_000
 */
public class FrmListaCampus extends javax.swing.JInternalFrame {
    CampusBO bo;

    /**
     * Creates new form FrmListaCmpus
     */
    public FrmListaCampus() {
        initComponents();
        bo = new CampusBO();
        
        List<Campus> campus = bo.listarTodos();
        
        preencheTabela(campus);
    }
    
    private void preencheTabela(List<Campus> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nome");
        model.addColumn("Telefone");
        model.addColumn("Cidade");
        model.addColumn("Rua");
        model.addColumn("Numero");
        
        for (Campus c : lista) {
            Vector valores = new Vector();
            valores.add(0,c.getIdCampus());
            valores.add(1,c.getNome());
            valores.add(2,c.getTelefone());
            valores.add(3,c.getCidade());
            valores.add(4,c.getRua());
            valores.add(5,c.getNumero());
            
            model.addRow(valores);
        }
        TblListaCampus.setModel(model);
        TblListaCampus.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlListaCampus = new javax.swing.JPanel();
        SpnlListaCampus = new javax.swing.JScrollPane();
        TblListaCampus = new javax.swing.JTable();
        TxtPesquisar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();

        setTitle("Lista dos Campus");

        PnlListaCampus.setBackground(new java.awt.Color(255, 255, 255));
        PnlListaCampus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista dos Campus\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TblListaCampus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Cidade", "Rua", "Nº"
            }
        ));
        TblListaCampus.getTableHeader().setReorderingAllowed(false);
        TblListaCampus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblListaCampusMouseClicked(evt);
            }
        });
        SpnlListaCampus.setViewportView(TblListaCampus);

        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlListaCampusLayout = new javax.swing.GroupLayout(PnlListaCampus);
        PnlListaCampus.setLayout(PnlListaCampusLayout);
        PnlListaCampusLayout.setHorizontalGroup(
            PnlListaCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaCampusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpnlListaCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PnlListaCampusLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPesquisar)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListaCampusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );
        PnlListaCampusLayout.setVerticalGroup(
            PnlListaCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaCampusLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlListaCampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisar))
                .addGap(26, 26, 26)
                .addComponent(SpnlListaCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblListaCampusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblListaCampusMouseClicked
        Object valor = TblListaCampus.getValueAt( TblListaCampus.getSelectedRow(), 0);
        Campus c = bo.Abrir((int)valor);
        FrmCampusEditar janela = new FrmCampusEditar(c, bo);
        this.getParent().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TblListaCampusMouseClicked

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        Campus c = new Campus(0, "","","","",0);
        c.setNome(TxtPesquisar.getText());
                
        List<Campus> lista = bo.buscar(c);
        
        preencheTabela(lista);
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Sair?") 
                == 0){
            this.dispose();
        }
    }//GEN-LAST:event_BtnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JPanel PnlListaCampus;
    private javax.swing.JScrollPane SpnlListaCampus;
    private javax.swing.JTable TblListaCampus;
    private javax.swing.JTextField TxtPesquisar;
    // End of variables declaration//GEN-END:variables
}
