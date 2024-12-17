/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.ColaboradorController;
import controller.SalasController;
import javax.swing.JOptionPane;
import model.Colaborador;
import model.Salas;

/**
 *
 * @author lldua
 */
public class Telacadastrasalas extends javax.swing.JFrame {

    /**
     * Creates new form Telacadastrasalas
     */
    Colaborador colaborador;
    public Telacadastrasalas(Colaborador usuario) {
        initComponents();
        colaborador = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        camposala = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campocapacidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campotipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campodescricao = new javax.swing.JTextField();
        botao_salvar = new javax.swing.JButton();
        Botao_vlotar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(984, 656));
        setMinimumSize(new java.awt.Dimension(984, 656));

        jPanel1.setMaximumSize(new java.awt.Dimension(984, 656));
        jPanel1.setMinimumSize(new java.awt.Dimension(984, 656));
        jPanel1.setPreferredSize(new java.awt.Dimension(984, 656));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("NOME DA SALA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 30));
        jPanel1.add(camposala, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 210, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("CAPACIDADE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));
        jPanel1.add(campocapacidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("TIPO DA SALA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 30));
        jPanel1.add(campotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("DESCRIÇAO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));
        jPanel1.add(campodescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 210, 90));

        botao_salvar.setBackground(new java.awt.Color(0, 204, 204));
        botao_salvar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        botao_salvar.setForeground(new java.awt.Color(255, 255, 255));
        botao_salvar.setText("SALVAR");
        botao_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_salvarActionPerformed(evt);
            }
        });
        jPanel1.add(botao_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 180, 50));

        Botao_vlotar.setBackground(new java.awt.Color(0, 204, 204));
        Botao_vlotar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Botao_vlotar.setForeground(new java.awt.Color(255, 255, 255));
        Botao_vlotar.setText("VOLTAR");
        Botao_vlotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_vlotarActionPerformed(evt);
            }
        });
        jPanel1.add(Botao_vlotar, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 10, 110, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ProjetosJava\\ReservasalasSenaiImagens\\Design imagem de fundo senai 984x656.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_salvarActionPerformed
        // TODO add your handling code here:
        try {
    // Cria a instância do controlador
    SalasController controller = new SalasController();
    
    
             Salas salas = new Salas(
             camposala.getText(),        // String para idsala
             campocapacidade.getText(),  // String para capacidade
             campotipo.getText(),        // String para tipo
             campodescricao.getText()    // String para descricao
         );


        boolean salvos = controller.cadastrandoSalas(salas);
           
           if(salvos){
              JOptionPane.showMessageDialog (null,"Produto cadastrado com Sucesso!"); 
           }else{
              JOptionPane.showMessageDialog (null,"Produto não cadastrado!");  
           }
        }catch(Exception e){
           System.err.print("Erro ao cadastrar"+e);
        }    
    
    }//GEN-LAST:event_botao_salvarActionPerformed

    private void Botao_vlotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_vlotarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(
            null, 
            "Deseja realmente sair?", 
            "Confirmação", 
            JOptionPane.OK_CANCEL_OPTION
        );
        
        // Verifica a resposta do usuário
        if (resposta == JOptionPane.OK_OPTION) {
            // Voltar para a tela Home
            TelaHome home = new TelaHome(colaborador);
            home.setVisible(true);
            dispose(); // Fecha a tela atual
        }  
    }//GEN-LAST:event_Botao_vlotarActionPerformed

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
            java.util.logging.Logger.getLogger(Telacadastrasalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telacadastrasalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telacadastrasalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telacadastrasalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Colaborador usuario = null;
                new Telacadastrasalas(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_vlotar;
    private javax.swing.JButton botao_salvar;
    private javax.swing.JTextField campocapacidade;
    private javax.swing.JTextField campodescricao;
    private javax.swing.JTextField camposala;
    private javax.swing.JTextField campotipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}