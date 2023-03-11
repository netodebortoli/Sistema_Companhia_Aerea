/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Interface;

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
        textFieldCodigoAeronave = new javax.swing.JTextField();
        painelDataAquisicao = new javax.swing.JPanel();
        labelDataAquisicao = new javax.swing.JLabel();
        formattedTextFieldDataAquisicao = new javax.swing.JFormattedTextField();
        painelSelecionarModelo = new javax.swing.JPanel();
        labelSelecionarModelo = new javax.swing.JLabel();
        comboBoxSelecionarModelo = new javax.swing.JComboBox<>();
        botaoCadastrarAeronave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloCadastroAeronave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCadastroAeronave.setForeground(new java.awt.Color(0, 0, 153));
        tituloCadastroAeronave.setText("Cadastrar Aeronave");

        labelCodigoAeronave.setText("Código da aeronave:");

        javax.swing.GroupLayout painelCodigoAeronaveLayout = new javax.swing.GroupLayout(painelCodigoAeronave);
        painelCodigoAeronave.setLayout(painelCodigoAeronaveLayout);
        painelCodigoAeronaveLayout.setHorizontalGroup(
            painelCodigoAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCodigoAeronaveLayout.createSequentialGroup()
                .addComponent(labelCodigoAeronave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldCodigoAeronave, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        painelCodigoAeronaveLayout.setVerticalGroup(
            painelCodigoAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCodigoAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelCodigoAeronave)
                .addComponent(textFieldCodigoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelDataAquisicao.setText("Data de aquisição:");

        try {
            formattedTextFieldDataAquisicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelDataAquisicaoLayout = new javax.swing.GroupLayout(painelDataAquisicao);
        painelDataAquisicao.setLayout(painelDataAquisicaoLayout);
        painelDataAquisicaoLayout.setHorizontalGroup(
            painelDataAquisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataAquisicaoLayout.createSequentialGroup()
                .addComponent(labelDataAquisicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formattedTextFieldDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDataAquisicaoLayout.setVerticalGroup(
            painelDataAquisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataAquisicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelDataAquisicao)
                .addComponent(formattedTextFieldDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelSelecionarModelo.setText("Selecione o modelo:");

        comboBoxSelecionarModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout painelSelecionarModeloLayout = new javax.swing.GroupLayout(painelSelecionarModelo);
        painelSelecionarModelo.setLayout(painelSelecionarModeloLayout);
        painelSelecionarModeloLayout.setHorizontalGroup(
            painelSelecionarModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecionarModeloLayout.createSequentialGroup()
                .addComponent(labelSelecionarModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxSelecionarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSelecionarModeloLayout.setVerticalGroup(
            painelSelecionarModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecionarModeloLayout.createSequentialGroup()
                .addGroup(painelSelecionarModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSelecionarModelo)
                    .addComponent(comboBoxSelecionarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        botaoCadastrarAeronave.setText("CADASTRAR");
        botaoCadastrarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarAeronaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCadastrarAeronave)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelCodigoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(tituloCadastroAeronave))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelSelecionarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCadastroAeronave)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelCodigoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSelecionarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(botaoCadastrarAeronave)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarAeronaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarAeronaveActionPerformed

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
    private javax.swing.JButton botaoCadastrarAeronave;
    private javax.swing.JComboBox<String> comboBoxSelecionarModelo;
    private javax.swing.JFormattedTextField formattedTextFieldDataAquisicao;
    private javax.swing.JLabel labelCodigoAeronave;
    private javax.swing.JLabel labelDataAquisicao;
    private javax.swing.JLabel labelSelecionarModelo;
    private javax.swing.JPanel painelCodigoAeronave;
    private javax.swing.JPanel painelDataAquisicao;
    private javax.swing.JPanel painelSelecionarModelo;
    private javax.swing.JTextField textFieldCodigoAeronave;
    private javax.swing.JLabel tituloCadastroAeronave;
    // End of variables declaration//GEN-END:variables
}
