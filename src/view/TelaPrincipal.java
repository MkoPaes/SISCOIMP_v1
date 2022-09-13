package view;

import utils.GerenciadorJanelas;

public class TelaPrincipal extends javax.swing.JFrame {
    GerenciadorJanelas gerenciador; // Gerenciador das Janelas Internas
    
    // Construtor
    public TelaPrincipal() {
        initComponents();
        this.gerenciador = new GerenciadorJanelas(jdp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdp = new javax.swing.JDesktopPane();
        btnDados = new javax.swing.JButton();
        btnProfissionais = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnResultados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmDados = new javax.swing.JMenu();
        jmiViewD = new javax.swing.JMenuItem();
        jsD = new javax.swing.JPopupMenu.Separator();
        jmNewD = new javax.swing.JMenu();
        jmiNewF = new javax.swing.JMenuItem();
        jmiNewInfo = new javax.swing.JMenuItem();
        jmProfissional = new javax.swing.JMenu();
        jmiNewP = new javax.swing.JMenuItem();
        jmiViewP = new javax.swing.JMenuItem();
        jmAtendimentos = new javax.swing.JMenu();
        jmExames = new javax.swing.JMenu();
        jmiNewC = new javax.swing.JMenuItem();
        jmiNewE = new javax.swing.JMenuItem();
        jmiViewE = new javax.swing.JMenuItem();
        jsA = new javax.swing.JPopupMenu.Separator();
        jmResultados = new javax.swing.JMenu();
        jmiNewR = new javax.swing.JMenuItem();
        jmiViewR = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISCOIMP - Sistema de Controle de Informações Médicas Pessoal");
        setMinimumSize(new java.awt.Dimension(360, 338));
        setResizable(false);

        btnDados.setText("Seus Dados");
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });

        btnProfissionais.setText("Profissionais");
        btnProfissionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfissionaisActionPerformed(evt);
            }
        });

        btnAgenda.setText("Consultas/Exames");
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        btnResultados.setText("Resultados");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });

        jdp.setLayer(btnDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp.setLayer(btnProfissionais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp.setLayer(btnAgenda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp.setLayer(btnResultados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpLayout = new javax.swing.GroupLayout(jdp);
        jdp.setLayout(jdpLayout);
        jdpLayout.setHorizontalGroup(
            jdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDados, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgenda)
                    .addComponent(btnProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jdpLayout.setVerticalGroup(
            jdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnDados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jmDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Pessoal_24px.png"))); // NOI18N
        jmDados.setText("Seus Dados");

        jmiViewD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/View_24px.png"))); // NOI18N
        jmiViewD.setText("Visualizar");
        jmiViewD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiViewDActionPerformed(evt);
            }
        });
        jmDados.add(jmiViewD);
        jmDados.add(jsD);

        jmNewD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Novo_24px.png"))); // NOI18N
        jmNewD.setText("Adicionar");

        jmiNewF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Familiar_24px.png"))); // NOI18N
        jmiNewF.setText("Familiar");
        jmiNewF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewFActionPerformed(evt);
            }
        });
        jmNewD.add(jmiNewF);

        jmiNewInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Emergencia_24px.png"))); // NOI18N
        jmiNewInfo.setText("Informações de Emergência");
        jmiNewInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewInfoActionPerformed(evt);
            }
        });
        jmNewD.add(jmiNewInfo);

        jmDados.add(jmNewD);

        jMenuBar1.add(jmDados);

        jmProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Profissional_24px.png"))); // NOI18N
        jmProfissional.setText("Profissionais");

        jmiNewP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Novo_24px.png"))); // NOI18N
        jmiNewP.setText("Novo");
        jmiNewP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewPActionPerformed(evt);
            }
        });
        jmProfissional.add(jmiNewP);

        jmiViewP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/View_24px.png"))); // NOI18N
        jmiViewP.setText("Visualizar");
        jmiViewP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiViewPActionPerformed(evt);
            }
        });
        jmProfissional.add(jmiViewP);

        jMenuBar1.add(jmProfissional);

        jmAtendimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Atendimento_24px.png"))); // NOI18N
        jmAtendimentos.setText("Atendimentos");

        jmExames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Agenda_24px.png"))); // NOI18N
        jmExames.setText("Consultas/Exames");

        jmiNewC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Novo_24px.png"))); // NOI18N
        jmiNewC.setText("Agendar Consulta");
        jmiNewC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewCActionPerformed(evt);
            }
        });
        jmExames.add(jmiNewC);

        jmiNewE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Novo_24px.png"))); // NOI18N
        jmiNewE.setText("Agendar Exame");
        jmiNewE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewEActionPerformed(evt);
            }
        });
        jmExames.add(jmiNewE);

        jmiViewE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/View_24px.png"))); // NOI18N
        jmiViewE.setText("Visualizar");
        jmiViewE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiViewEActionPerformed(evt);
            }
        });
        jmExames.add(jmiViewE);

        jmAtendimentos.add(jmExames);
        jmAtendimentos.add(jsA);

        jmResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Resultado_24px.png"))); // NOI18N
        jmResultados.setText("Resultados");

        jmiNewR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/NovoResultado_24px.png"))); // NOI18N
        jmiNewR.setText("Enviar");
        jmiNewR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewRActionPerformed(evt);
            }
        });
        jmResultados.add(jmiNewR);

        jmiViewR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/View_24px.png"))); // NOI18N
        jmiViewR.setText("Visualizar");
        jmiViewR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiViewRActionPerformed(evt);
            }
        });
        jmResultados.add(jmiViewR);

        jmAtendimentos.add(jmResultados);

        jMenuBar1.add(jmAtendimentos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiNewFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewFActionPerformed
        TelaNewF telaNewF = new TelaNewF(new javax.swing.JFrame(), true);
        telaNewF.setVisible(true);
    }//GEN-LAST:event_jmiNewFActionPerformed

    private void jmiNewInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewInfoActionPerformed
        TelaNewInfo telaNewInfo = new TelaNewInfo(new javax.swing.JFrame(), true);
        telaNewInfo.setVisible(true);
    }//GEN-LAST:event_jmiNewInfoActionPerformed

    private void jmiNewPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewPActionPerformed
        TelaNewP telaNewP = new TelaNewP(new javax.swing.JFrame(), true);
        telaNewP.setVisible(true);
    }//GEN-LAST:event_jmiNewPActionPerformed

    private void jmiNewCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewCActionPerformed
        TelaNewC telaNewC = new TelaNewC(new javax.swing.JFrame(), true);
        telaNewC.setVisible(true);
    }//GEN-LAST:event_jmiNewCActionPerformed

    private void jmiNewEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewEActionPerformed
        TelaNewE telaNewE = new TelaNewE(new javax.swing.JFrame(), true);
        telaNewE.setVisible(true);
    }//GEN-LAST:event_jmiNewEActionPerformed

    private void jmiNewRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewRActionPerformed
        TelaNewR telaNewR = new TelaNewR(new javax.swing.JFrame(), true);
        telaNewR.setVisible(true);
    }//GEN-LAST:event_jmiNewRActionPerformed

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
        TelaViewUser telaViewUser = new TelaViewUser(new javax.swing.JFrame(), true);
        telaViewUser.setVisible(true);
    }//GEN-LAST:event_btnDadosActionPerformed

    private void btnProfissionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfissionaisActionPerformed
        TelaViewP telaViewP = new TelaViewP(new javax.swing.JFrame(), true);
        telaViewP.setVisible(true);
    }//GEN-LAST:event_btnProfissionaisActionPerformed

    private void jmiViewDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiViewDActionPerformed
        TelaViewUser telaViewUser = new TelaViewUser(new javax.swing.JFrame(), true);
        telaViewUser.setVisible(true);
    }//GEN-LAST:event_jmiViewDActionPerformed

    private void jmiViewPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiViewPActionPerformed
        TelaViewP telaViewP = new TelaViewP(new javax.swing.JFrame(), true);
        telaViewP.setVisible(true);
    }//GEN-LAST:event_jmiViewPActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        TelaViewAgenda telaViewAgenda = new TelaViewAgenda(new javax.swing.JFrame(), true);
        telaViewAgenda.setVisible(true);
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void jmiViewEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiViewEActionPerformed
        TelaViewAgenda telaViewAgenda = new TelaViewAgenda(new javax.swing.JFrame(), true);
        telaViewAgenda.setVisible(true);
    }//GEN-LAST:event_jmiViewEActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        TelaViewResultados telaViewResultados = new TelaViewResultados(new javax.swing.JFrame(), true);
        telaViewResultados.setVisible(true);
    }//GEN-LAST:event_btnResultadosActionPerformed

    private void jmiViewRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiViewRActionPerformed
        TelaViewResultados telaViewResultados = new TelaViewResultados(new javax.swing.JFrame(), true);
        telaViewResultados.setVisible(true);
    }//GEN-LAST:event_jmiViewRActionPerformed

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
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnDados;
    private javax.swing.JButton btnProfissionais;
    private javax.swing.JButton btnResultados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdp;
    private javax.swing.JMenu jmAtendimentos;
    private javax.swing.JMenu jmDados;
    private javax.swing.JMenu jmExames;
    private javax.swing.JMenu jmNewD;
    private javax.swing.JMenu jmProfissional;
    private javax.swing.JMenu jmResultados;
    private javax.swing.JMenuItem jmiNewC;
    private javax.swing.JMenuItem jmiNewE;
    private javax.swing.JMenuItem jmiNewF;
    private javax.swing.JMenuItem jmiNewInfo;
    private javax.swing.JMenuItem jmiNewP;
    private javax.swing.JMenuItem jmiNewR;
    private javax.swing.JMenuItem jmiViewD;
    private javax.swing.JMenuItem jmiViewE;
    private javax.swing.JMenuItem jmiViewP;
    private javax.swing.JMenuItem jmiViewR;
    private javax.swing.JPopupMenu.Separator jsA;
    private javax.swing.JPopupMenu.Separator jsD;
    // End of variables declaration//GEN-END:variables
}
