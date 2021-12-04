
package View;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Splash_GUI extends javax.swing.JFrame {

    public Splash_GUI() {
        initComponents();
        
        //----------------------Inicio----------------------------
                new Thread(){
        
        public void run() {
        
        
        for (int i=0; i<101; i++){
                    try {
                        sleep(60); 
                        
                        progresso.setValue(i);
                        
                        if(progresso.getValue() == 10){
                        
                            mensagem.setText("Carregando");
                            sleep(2000);
                                                       
                        
                        }else if (progresso.getValue() <=30){
                            mensagem.setText("Preparando arquivos");
                          sleep(100);  
                        } else if (progresso.getValue() <=99){
                            mensagem.setText("Fazendo alugns ajustes");
                            
                        }else{
                            mensagem.setText("Finalizado");
                        
                        sleep(3000);
                        
                       new Login_GUI().setVisible(true);
			dispose();
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        
        
        }        
            }
        
        }.start();
        
    
        
        //----------------------Termino-------------------------
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        progresso = new javax.swing.JProgressBar();
        mensagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelImage1.setBackground(new java.awt.Color(204, 255, 255));
        panelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wall.jpg"))); // NOI18N
        panelImage1.setLayout(null);

        progresso.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        progresso.setForeground(new java.awt.Color(204, 255, 204));
        progresso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        progresso.setStringPainted(true);
        panelImage1.add(progresso);
        progresso.setBounds(120, 170, 176, 20);

        mensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelImage1.add(mensagem);
        mensagem.setBounds(120, 210, 170, 30);

        jLabel1.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Agenda");
        panelImage1.add(jLabel1);
        jLabel1.setBounds(150, 20, 140, 50);

        getContentPane().add(panelImage1);
        panelImage1.setBounds(0, 0, 407, 300);

        setSize(new java.awt.Dimension(407, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mensagem;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JProgressBar progresso;
    // End of variables declaration//GEN-END:variables
}
