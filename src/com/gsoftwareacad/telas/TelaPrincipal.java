/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gsoftwareacad.telas;

import com.gsoftwareacad.Model.PlanosModel;
import com.gsoftwareacad.controller.PlanoController;
import com.gsoftwareacad.icones.ImageUtils;
import java.awt.List;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author guisa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        initLogo();

    }


    private void initLogo() {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/gsoftwareacad/icones/LogoOficialSemFundo.png"));
        ImageIcon resizedIcon = ImageUtils.resizeImageIcon(originalIcon, 200, 150);
        lblLogo.setIcon(resizedIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        lblLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadCli = new javax.swing.JMenuItem();
        mencadFun = new javax.swing.JMenuItem();
        menCadUsu = new javax.swing.JMenuItem();
        menCadPlan = new javax.swing.JMenuItem();
        menPag = new javax.swing.JMenu();
        megEftPag = new javax.swing.JMenuItem();
        menAju = new javax.swing.JMenu();
        menAjuSob = new javax.swing.JMenuItem();
        menOpc = new javax.swing.JMenu();
        menOpcSai = new javax.swing.JMenuItem();
        menTelaPag = new javax.swing.JMenu();
        menCliPag = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal - Gsoftware");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(650, 475));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gsoftwareacad/icones/LogoOficialSemFundo.png"))); // NOI18N
        lblLogo.setMaximumSize(new java.awt.Dimension(200, 200));
        lblLogo.setMinimumSize(new java.awt.Dimension(200, 200));
        lblLogo.setPreferredSize(new java.awt.Dimension(200, 200));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblData.setText("Data");

        menCad.setText("Cadastro");

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadCli.setText("Cliente");
        menCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadCliActionPerformed(evt);
            }
        });
        menCad.add(menCadCli);

        mencadFun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mencadFun.setText("Funcionario");
        mencadFun.setEnabled(false);
        mencadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mencadFunActionPerformed(evt);
            }
        });
        menCad.add(mencadFun);

        menCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadUsu.setText("Usuarios");
        menCadUsu.setEnabled(false);
        menCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuActionPerformed(evt);
            }
        });
        menCad.add(menCadUsu);

        menCadPlan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadPlan.setText("Planos");
        menCadPlan.setEnabled(false);
        menCadPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadPlanActionPerformed(evt);
            }
        });
        menCad.add(menCadPlan);

        menu.add(menCad);

        menPag.setText("Pagamentos");

        megEftPag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        megEftPag.setText("Tipos De Planos");
        megEftPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megEftPagActionPerformed(evt);
            }
        });
        menPag.add(megEftPag);

        menu.add(menPag);

        menAju.setText("Ajuda");
        menAju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjuActionPerformed(evt);
            }
        });

        menAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menAjuSob.setText("Sobre");
        menAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjuSobActionPerformed(evt);
            }
        });
        menAju.add(menAjuSob);

        menu.add(menAju);

        menOpc.setText("Opções");

        menOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menOpcSai.setText("Sair");
        menOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcSaiActionPerformed(evt);
            }
        });
        menOpc.add(menOpcSai);

        menu.add(menOpc);

        menTelaPag.setText("Clientes");
        menTelaPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menTelaPagActionPerformed(evt);
            }
        });

        menCliPag.setText("Clientes Pagantes");
        menCliPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCliPagActionPerformed(evt);
            }
        });
        menTelaPag.add(menCliPag);

        menu.add(menTelaPag);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuario)
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(931, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjuSobActionPerformed

        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);

    }//GEN-LAST:event_menAjuSobActionPerformed

    private void menOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcSaiActionPerformed

        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (sair == JOptionPane.YES_OPTION) {
            // Código para sair do programa
            System.exit(0);
        }

    }//GEN-LAST:event_menOpcSaiActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));

    }//GEN-LAST:event_formWindowActivated

    private void menAjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menAjuActionPerformed

    private void menCadPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadPlanActionPerformed
        TelaPlanos plano = new TelaPlanos();
        plano.setVisible(true);
        desktop.add(plano);
    }//GEN-LAST:event_menCadPlanActionPerformed

    private void menCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuActionPerformed

        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);

    }//GEN-LAST:event_menCadUsuActionPerformed

    private void menCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadCliActionPerformed
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_menCadCliActionPerformed

    private void mencadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mencadFunActionPerformed
        TelaFuncionario funcionario = new TelaFuncionario();
        funcionario.setVisible(true);
        desktop.add(funcionario);

    }//GEN-LAST:event_mencadFunActionPerformed

    private void megEftPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megEftPagActionPerformed
        TelaPagamentos pagamenento = new TelaPagamentos();
        pagamenento.setVisible(true);
        desktop.add(pagamenento);
    }//GEN-LAST:event_megEftPagActionPerformed

    private void menTelaPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menTelaPagActionPerformed

    }//GEN-LAST:event_menTelaPagActionPerformed

    private void menCliPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCliPagActionPerformed
        TelaClientesPagantes clipag = new TelaClientesPagantes();
        clipag.setVisible(true);
        desktop.add(clipag);
    }//GEN-LAST:event_menCliPagActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblLogo;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem megEftPag;
    private javax.swing.JMenu menAju;
    private javax.swing.JMenuItem menAjuSob;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCli;
    public static javax.swing.JMenuItem menCadPlan;
    public static javax.swing.JMenuItem menCadUsu;
    private javax.swing.JMenuItem menCliPag;
    private javax.swing.JMenu menOpc;
    private javax.swing.JMenuItem menOpcSai;
    private javax.swing.JMenu menPag;
    private javax.swing.JMenu menTelaPag;
    public static javax.swing.JMenuItem mencadFun;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}
