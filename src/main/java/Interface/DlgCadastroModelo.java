package Interface;
import Modelo.Fabricante;
import Modelo.Modelo;
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
        painelNomeModelo = new javax.swing.JPanel();
        labelNomeModelo = new javax.swing.JLabel();
        textFieldNomeModelo = new javax.swing.JTextField();
        painelAutonomia = new javax.swing.JPanel();
        labelAutonomia = new javax.swing.JLabel();
        textFieldAutonomia = new javax.swing.JTextField();
        painelCapacidadePassageiros = new javax.swing.JPanel();
        labelCapacidadePassageiros = new javax.swing.JLabel();
        textFieldCapacidadePassageiros = new javax.swing.JTextField();
        painelCapacidadeCarga = new javax.swing.JPanel();
        labelCapacidadeCarga = new javax.swing.JLabel();
        textFieldCapacidadePassageiros1 = new javax.swing.JTextField();
        painelSelecionarFabricante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbBox_Fabricante = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloCadastroModelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCadastroModelo.setForeground(new java.awt.Color(0, 0, 153));
        tituloCadastroModelo.setText("Cadastrar Modelo");

        labelNomeModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeModelo.setText("Nome do modelo:");

        javax.swing.GroupLayout painelNomeModeloLayout = new javax.swing.GroupLayout(painelNomeModelo);
        painelNomeModelo.setLayout(painelNomeModeloLayout);
        painelNomeModeloLayout.setHorizontalGroup(
            painelNomeModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        painelNomeModeloLayout.setVerticalGroup(
            painelNomeModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeModeloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelNomeModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeModelo)
                    .addComponent(textFieldNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        labelAutonomia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAutonomia.setText("Autonomia:");

        javax.swing.GroupLayout painelAutonomiaLayout = new javax.swing.GroupLayout(painelAutonomia);
        painelAutonomia.setLayout(painelAutonomiaLayout);
        painelAutonomiaLayout.setHorizontalGroup(
            painelAutonomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAutonomiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAutonomia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelAutonomiaLayout.setVerticalGroup(
            painelAutonomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAutonomiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAutonomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutonomia)
                    .addComponent(textFieldAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        labelCapacidadePassageiros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapacidadePassageiros.setText("Capacidade de passageiros:");

        javax.swing.GroupLayout painelCapacidadePassageirosLayout = new javax.swing.GroupLayout(painelCapacidadePassageiros);
        painelCapacidadePassageiros.setLayout(painelCapacidadePassageirosLayout);
        painelCapacidadePassageirosLayout.setHorizontalGroup(
            painelCapacidadePassageirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadePassageirosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCapacidadePassageiros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        painelCapacidadePassageirosLayout.setVerticalGroup(
            painelCapacidadePassageirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadePassageirosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCapacidadePassageirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapacidadePassageiros)
                    .addComponent(textFieldCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        labelCapacidadeCarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapacidadeCarga.setText("Capacidade de carga:");

        javax.swing.GroupLayout painelCapacidadeCargaLayout = new javax.swing.GroupLayout(painelCapacidadeCarga);
        painelCapacidadeCarga.setLayout(painelCapacidadeCargaLayout);
        painelCapacidadeCargaLayout.setHorizontalGroup(
            painelCapacidadeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadeCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCapacidadeCarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldCapacidadePassageiros1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCapacidadeCargaLayout.setVerticalGroup(
            painelCapacidadeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadeCargaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCapacidadeCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapacidadeCarga)
                    .addComponent(textFieldCapacidadePassageiros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Selecione o fabricante:");

        javax.swing.GroupLayout painelSelecionarFabricanteLayout = new javax.swing.GroupLayout(painelSelecionarFabricante);
        painelSelecionarFabricante.setLayout(painelSelecionarFabricanteLayout);
        painelSelecionarFabricanteLayout.setHorizontalGroup(
            painelSelecionarFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecionarFabricanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBox_Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSelecionarFabricanteLayout.setVerticalGroup(
            painelSelecionarFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecionarFabricanteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSelecionarFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbBox_Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(painelCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(painelCapacidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(painelAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(painelSelecionarFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tituloCadastroModelo)
                                .addGap(149, 149, 149))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCadastroModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelCapacidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelSelecionarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String nome = textFieldNomeModelo.getText();
        int capacidadePassageiros = Integer.parseInt(textFieldCapacidadePassageiros.getText());
        int capacidadeCarga = Integer.parseInt(textFieldCapacidadePassageiros1.getText());
        int autonomia = Integer.parseInt(textFieldAutonomia.getText());
        Fabricante fabricante = null;

        Modelo objModelo = new Modelo(nome,capacidadePassageiros, capacidadeCarga, autonomia, fabricante);
        objModelo.salvarModelo();
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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JComboBox<String> cmbBox_Fabricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAutonomia;
    private javax.swing.JLabel labelCapacidadeCarga;
    private javax.swing.JLabel labelCapacidadePassageiros;
    private javax.swing.JLabel labelNomeModelo;
    private javax.swing.JPanel painelAutonomia;
    private javax.swing.JPanel painelCapacidadeCarga;
    private javax.swing.JPanel painelCapacidadePassageiros;
    private javax.swing.JPanel painelNomeModelo;
    private javax.swing.JPanel painelSelecionarFabricante;
    private javax.swing.JTextField textFieldAutonomia;
    private javax.swing.JTextField textFieldCapacidadePassageiros;
    private javax.swing.JTextField textFieldCapacidadePassageiros1;
    private javax.swing.JTextField textFieldNomeModelo;
    private javax.swing.JLabel tituloCadastroModelo;
    // End of variables declaration//GEN-END:variables
}
