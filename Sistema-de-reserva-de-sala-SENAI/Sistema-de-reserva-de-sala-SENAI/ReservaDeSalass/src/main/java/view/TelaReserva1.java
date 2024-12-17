/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.ReservarController;
import controller.SalasController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Colaborador;
import model.Reservar;

/**
 *
 * @author lldua
 */
public class TelaReserva1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaReserva1
     */
    int idReserva;
     Colaborador colaborador;
    public TelaReserva1(Colaborador usuario) {
        initComponents();
        // Listagem();
        colaborador = usuario;
    }
        public void Listagem(){

        ReservarController controller = new ReservarController();
        
        List<Reservar> listareserva = controller.listaReserva();
       
        DefaultTableModel modeloTabela = (DefaultTableModel) tabela_ocupados.getModel();
        modeloTabela.setRowCount(0);
        
       // Verificando se a lista não é nula
            if(listareserva != null && !listareserva.isEmpty()){
               // Jogando os dados para dentro da minha tabela
              for(Reservar reserva: listareserva){
                // Criando uma nova linha para a tabela
                Object[] linha={
               reserva.getSala(),
               reserva.getColaborador(),
              
                };

                modeloTabela.addRow(linha);
              }
          }else{
             JOptionPane.showMessageDialog(this,"Nenhum produto encontrado.");
          }
        
        }
        private void LimparCampos(){
        camposala.setText("");
       campocoborador.setText("");
        campohora.setText("");
        campodata.setText("");
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
        campohora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campocoborador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campodata = new javax.swing.JTextField();
        salvar_home = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_ocupados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(984, 656));
        jPanel1.setMinimumSize(new java.awt.Dimension(984, 656));
        jPanel1.setPreferredSize(new java.awt.Dimension(984, 656));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("SALA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 50, 30));
        jPanel1.add(camposala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("HORÁRIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        campohora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campohoraActionPerformed(evt);
            }
        });
        jPanel1.add(campohora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("COLABORADOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        campocoborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocoboradorActionPerformed(evt);
            }
        });
        jPanel1.add(campocoborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("DATA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        campodata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campodataActionPerformed(evt);
            }
        });
        jPanel1.add(campodata, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 200, 40));

        salvar_home.setBackground(new java.awt.Color(0, 204, 204));
        salvar_home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        salvar_home.setForeground(new java.awt.Color(255, 255, 255));
        salvar_home.setText("SALVAR");
        salvar_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_homeActionPerformed(evt);
            }
        });
        jPanel1.add(salvar_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 130, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("SALAS OCUPADAS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("GERAR RELATORIO");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 190, 40));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("VOLTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 100, 40));

        tabela_ocupados.setBackground(new java.awt.Color(204, 255, 255));
        tabela_ocupados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SALA", "CAPACIDADE", "TIPO DA SALA", "DESECRIÇAO"
            }
        ));
        tabela_ocupados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_ocupadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_ocupados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 830, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ProjetosJava\\ReservasalasSenaiImagens\\Design imagem de fundo senai 984x656.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 980, 670));

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

    private void salvar_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_homeActionPerformed
        // TODO add your handling code here:
        try {
    // Cria a instância do controlador
           ReservarController  controller = new ReservarController();
    
    
             Reservar reservar = new Reservar(
             camposala.getText(),        // String para idsala
             campocoborador.getText(),  // String para capacidade
             campohora.getText(),        // String para tipo
             campodata.getText()    // String para descricao
         );


        boolean salvos = controller.cadastrandoReservar(reservar);
           
           if(salvos){
              JOptionPane.showMessageDialog (null,"Produto cadastrado com Sucesso!"); 
           }else{
              JOptionPane.showMessageDialog (null,"Produto não cadastrado!");  
           }
        }catch(Exception e){
           System.err.print("Erro ao cadastrar"+e);
        }    
    
    }//GEN-LAST:event_salvar_homeActionPerformed

    private void campocoboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocoboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocoboradorActionPerformed

    private void campohoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campohoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campohoraActionPerformed

    private void campodataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campodataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campodataActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabela_ocupadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_ocupadosMouseClicked
        // TODO add your handling code here:
         int linhaSelecionada = tabela_ocupados.getSelectedRow();
        
       // verificando se alguma linha foi selecionada
       if(linhaSelecionada>=0){
       
       DefaultTableModel modelotabela = (DefaultTableModel) tabela_ocupados.getModel();
       
       // jogando os dados da tabela para os campos de texto
        this.idReserva = Integer.parseInt(modelotabela.getValueAt(linhaSelecionada,0).toString());
       camposala.setText(modelotabela.getValueAt(linhaSelecionada,1).toString());
       campocoborador.setText(modelotabela.getValueAt(linhaSelecionada,2).toString());
       campohora.setText(modelotabela.getValueAt(linhaSelecionada,3).toString());
       campodata.setText(modelotabela.getValueAt(linhaSelecionada,4).toString());
           
       }//fim do if
    }//GEN-LAST:event_tabela_ocupadosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Colaborador usuario = null;
                new TelaReserva1(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campocoborador;
    private javax.swing.JTextField campodata;
    private javax.swing.JTextField campohora;
    private javax.swing.JTextField camposala;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salvar_home;
    private javax.swing.JTable tabela_ocupados;
    // End of variables declaration//GEN-END:variables
}