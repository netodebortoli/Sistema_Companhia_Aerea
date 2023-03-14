package Interface;

import Modelo.Fabricante;
import Modelo.Modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMSUNG
 */
public class DlgCadastroModelo extends javax.swing.JDialog {

    /**
     * Creates new form DlgCadastroModelo
     */
    public DlgCadastroModelo(java.awt.Frame parent, boolean modal) {
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

        tituloCadastroModelo = new javax.swing.JLabel();
        painelCapacidadeCarga = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        labelCapacidadeCarga = new javax.swing.JLabel();
        labelCapacidadePassageiros = new javax.swing.JLabel();
        textFieldCapacidadePassageiros = new javax.swing.JFormattedTextField();
        labelAutonomia = new javax.swing.JLabel();
        textFieldAutonomia = new javax.swing.JFormattedTextField();
        labelNomeModelo = new javax.swing.JLabel();
        textFieldNomeModelo = new javax.swing.JTextField();
        comboBox_Fabricante = new javax.swing.JComboBox<>();
        textFieldCapacidadeCarga = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Modelo");
        setResizable(false);

        tituloCadastroModelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCadastroModelo.setForeground(new java.awt.Color(0, 0, 153));
        tituloCadastroModelo.setText("Cadastrar Modelo");

        javax.swing.GroupLayout painelCapacidadeCargaLayout = new javax.swing.GroupLayout(painelCapacidadeCarga);
        painelCapacidadeCarga.setLayout(painelCapacidadeCargaLayout);
        painelCapacidadeCargaLayout.setHorizontalGroup(
            painelCapacidadeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelCapacidadeCargaLayout.setVerticalGroup(
            painelCapacidadeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Selecione o fabricante:");

        labelCapacidadeCarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapacidadeCarga.setText("Capacidade de carga:");

        labelCapacidadePassageiros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapacidadePassageiros.setText("Capacidade de passageiros:");

        textFieldCapacidadePassageiros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        labelAutonomia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAutonomia.setText("Autonomia:");

        textFieldAutonomia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        labelNomeModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeModelo.setText("Nome do modelo:");

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
                                .addComponent(tituloCadastroModelo)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldNomeModelo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBox_Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCapacidadeCarga)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldCapacidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCapacidadePassageiros)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(painelCapacidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelAutonomia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 40, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCadastroModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomeModelo)
                            .addComponent(textFieldNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCapacidadePassageiros)
                            .addComponent(textFieldCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(painelCapacidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAutonomia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapacidadeCarga)
                    .addComponent(textFieldCapacidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBox_Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarDadosCadastroModelo() {

        boolean valido = true;

        /*if (textFieldCodigoModelo.getText().trim().length() == 0) {;;
            JOptionPane.showMessageDialog(this, "O preenchimento do código é obrigatório");
            valido = false;
        }*/
        if (textFieldNomeModelo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "O preenchimento da nome do modelo é obrigatório");
            valido = false;
        }
        if (comboBox_Fabricante.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "A seleção do fabricante é obrigatória");
            valido = false;
        }
        if (textFieldAutonomia.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "O preenchimento da data é obrigatório");
            valido = false;
        }
        if (textFieldCapacidadeCarga.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "O preenchimento da capacidade de carga é obrigatório");
            valido = false;
        }
        if (textFieldCapacidadePassageiros.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "O preenchimento da capacidade de passageiros é obrigatório");
            valido = false;
        }

        return valido;
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if (validarDadosCadastroModelo()) {
            String nome = textFieldNomeModelo.getText();
            int capacidadePassageiros = Integer.parseInt(textFieldCapacidadePassageiros.getText());
            int capacidadeCarga = Integer.parseInt(textFieldCapacidadeCarga.getText());
            int autonomia = Integer.parseInt(textFieldAutonomia.getText());
            //Fabricante fabricante = null;

            Modelo objModelo = new Modelo(nome, capacidadePassageiros, capacidadeCarga, autonomia, 1);
            objModelo.salvarModelo();

            JOptionPane.showMessageDialog(this, "Modelo cadastrado com sucesso.");
            textFieldNomeModelo.setText("");
            textFieldCapacidadePassageiros.setText("");
            textFieldCapacidadeCarga.setText("");
            textFieldAutonomia.setText("");
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
            java.util.logging.Logger.getLogger(DlgCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadastroModelo dialog = new DlgCadastroModelo(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> comboBox_Fabricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAutonomia;
    private javax.swing.JLabel labelCapacidadeCarga;
    private javax.swing.JLabel labelCapacidadePassageiros;
    private javax.swing.JLabel labelNomeModelo;
    private javax.swing.JPanel painelCapacidadeCarga;
    private javax.swing.JFormattedTextField textFieldAutonomia;
    private javax.swing.JFormattedTextField textFieldCapacidadeCarga;
    private javax.swing.JFormattedTextField textFieldCapacidadePassageiros;
    private javax.swing.JTextField textFieldNomeModelo;
    private javax.swing.JLabel tituloCadastroModelo;
    // End of variables declaration//GEN-END:variables
}
