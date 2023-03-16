package Interface;

import Modelo.Modelo;
import Modelo.Aeronave;
import static Persistencia.MyDatabaseOperations.getAllModelos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMSUNG
 */
public class DlgCadastroAeronave extends javax.swing.JDialog {

    /**
     * Creates new form DlgCadastroAeronave
     */
    public DlgCadastroAeronave(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DefaultComboBoxModel model = new DefaultComboBoxModel( getAllModelos());
        comboBox_Modelo.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloCadastroAeronave = new javax.swing.JLabel();
        painelCodigoAeronave = new javax.swing.JPanel();
        labelCodigoAeronave = new javax.swing.JLabel();
        textFieldCodigoAeronave = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelDataAquisicao = new javax.swing.JLabel();
        txtDtAquisicao = new javax.swing.JFormattedTextField();
        comboBox_Modelo = new javax.swing.JComboBox<>();
        labelSelecionarModelo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aeronave");
        setResizable(false);

        tituloCadastroAeronave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCadastroAeronave.setForeground(new java.awt.Color(0, 0, 153));
        tituloCadastroAeronave.setText("Cadastrar Aeronave");

        labelCodigoAeronave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCodigoAeronave.setText("Código da Aeronave:");

        textFieldCodigoAeronave.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout painelCodigoAeronaveLayout = new javax.swing.GroupLayout(painelCodigoAeronave);
        painelCodigoAeronave.setLayout(painelCodigoAeronaveLayout);
        painelCodigoAeronaveLayout.setHorizontalGroup(
            painelCodigoAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCodigoAeronaveLayout.createSequentialGroup()
                .addComponent(labelCodigoAeronave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCodigoAeronave, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        );
        painelCodigoAeronaveLayout.setVerticalGroup(
            painelCodigoAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCodigoAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelCodigoAeronave)
                .addComponent(textFieldCodigoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        labelDataAquisicao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataAquisicao.setText("Data de aquisição:");

        try {
            txtDtAquisicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelSelecionarModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSelecionarModelo.setText("Selecione o modelo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tituloCadastroAeronave)
                                .addGap(50, 50, 50))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelDataAquisicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDtAquisicao))
                            .addComponent(painelCodigoAeronave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelSelecionarModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBox_Modelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCadastroAeronave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(painelCodigoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSelecionarModelo)
                    .addComponent(comboBox_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataAquisicao)
                    .addComponent(txtDtAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarDadosCadastroAeronave() {

        boolean valido = true;
        String date = "  /  /   ";

        if (textFieldCodigoAeronave.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "O preenchimento do código da aeronave é obrigatório.");
            valido = false;
        }
        if (comboBox_Modelo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "A seleção de um modelo é obrigatório.");
            valido = false;
        }
        if ( txtDtAquisicao.getText().contains(date) ) {
            JOptionPane.showMessageDialog(this, "O preenchimento da data de aquisição é obrigatório.");
            valido = false;
        }
      
        return valido;
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if ( validarDadosCadastroAeronave() ) {

            int codigo = Integer.parseInt(textFieldCodigoAeronave.getText());
            String dataAquisicao = txtDtAquisicao.getText();
            Modelo mdl = (Modelo) comboBox_Modelo.getSelectedItem();
        
            Aeronave objAeronave = new Aeronave(codigo, dataAquisicao, null, true, mdl);
            objAeronave.salvarAeronave();

            JOptionPane.showMessageDialog(this, "Aeronave cadastrada com sucesso.");
            textFieldCodigoAeronave.setText("");
            txtDtAquisicao.setText("");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadastroAeronave dialog = new DlgCadastroAeronave(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> comboBox_Modelo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCodigoAeronave;
    private javax.swing.JLabel labelDataAquisicao;
    private javax.swing.JLabel labelSelecionarModelo;
    private javax.swing.JPanel painelCodigoAeronave;
    private javax.swing.JFormattedTextField textFieldCodigoAeronave;
    private javax.swing.JLabel tituloCadastroAeronave;
    private javax.swing.JFormattedTextField txtDtAquisicao;
    // End of variables declaration//GEN-END:variables
}
