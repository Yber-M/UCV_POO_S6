/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.FormulaController;

import java.util.Map;



/**
 *
 * @author Marcia Casas
 */
public class View extends javax.swing.JFrame {

    FormulaController fml_ctrl = new FormulaController();

    public View() {
        initComponents();

        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo1, "src\\img\\fondoUno.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo2, "src\\img\\fondoUno.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo3, "src\\img\\fondoUno.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ValorNtxt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TermNtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Sumatoriatxt = new javax.swing.JTextField();
        Salirbtn = new javax.swing.JButton();
        Calcularbtn = new javax.swing.JButton();
        Limpiarbtn = new javax.swing.JButton();
        lblFondo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ValorN_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Sumatoriatxt1 = new javax.swing.JTextField();
        Calcularbtn1 = new javax.swing.JButton();
        Limpiarbtn1 = new javax.swing.JButton();
        Salirbtn1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TamanoN_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalidaP3_txt = new javax.swing.JTextArea();
        Calcularbtn2 = new javax.swing.JButton();
        Limpiarbtn2 = new javax.swing.JButton();
        Salirbtn2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblFondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P3.setBackground(new java.awt.Color(255, 255, 0));
        P3.setForeground(new java.awt.Color(51, 51, 51));
        P3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        P3.setFont(new java.awt.Font("mononoki", 1, 20)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ej1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 240, 110));

        jLabel4.setFont(new java.awt.Font("mononoki", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INGRESE EL VALOR DE N:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        ValorNtxt.setFont(new java.awt.Font("mononoki", 2, 18)); // NOI18N
        ValorNtxt.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(ValorNtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 290, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code Retina", 1, 18))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        jLabel3.setText("El Valor del término N es:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 50));

        TermNtxt.setEditable(false);
        TermNtxt.setBackground(new java.awt.Color(51, 51, 51));
        TermNtxt.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        TermNtxt.setForeground(new java.awt.Color(0, 255, 51));
        jPanel5.add(TermNtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 190, 50));

        jLabel2.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        jLabel2.setText("La Sumatoria hasta el Termino N es: ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 50));

        Sumatoriatxt.setEditable(false);
        Sumatoriatxt.setBackground(new java.awt.Color(51, 51, 51));
        Sumatoriatxt.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        Sumatoriatxt.setForeground(new java.awt.Color(0, 255, 51));
        Sumatoriatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumatoriatxtActionPerformed(evt);
            }
        });
        jPanel5.add(Sumatoriatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 190, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 550, 200));

        Salirbtn.setBackground(new java.awt.Color(255, 51, 51));
        Salirbtn.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Salirbtn.setForeground(new java.awt.Color(255, 255, 255));
        Salirbtn.setText("SALIR");
        Salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Salirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 150, 50));

        Calcularbtn.setBackground(new java.awt.Color(51, 102, 255));
        Calcularbtn.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Calcularbtn.setForeground(new java.awt.Color(255, 255, 255));
        Calcularbtn.setText("CALCULAR");
        Calcularbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Calcularbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 150, 50));

        Limpiarbtn.setBackground(new java.awt.Color(255, 204, 0));
        Limpiarbtn.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Limpiarbtn.setForeground(new java.awt.Color(51, 51, 51));
        Limpiarbtn.setText("LIMPIAR");
        Limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 150, 50));
        jPanel1.add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

        P3.addTab("P1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ej2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 380, 100));

        ValorN_txt.setFont(new java.awt.Font("mononoki", 2, 18)); // NOI18N
        ValorN_txt.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(ValorN_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 310, 50));

        jLabel7.setFont(new java.awt.Font("mononoki", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("La sumatoria es: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 240, 30));

        Sumatoriatxt1.setEditable(false);
        Sumatoriatxt1.setBackground(new java.awt.Color(51, 51, 51));
        Sumatoriatxt1.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        Sumatoriatxt1.setForeground(new java.awt.Color(0, 255, 51));
        Sumatoriatxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sumatoriatxt1ActionPerformed(evt);
            }
        });
        jPanel2.add(Sumatoriatxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 260, 50));

        Calcularbtn1.setBackground(new java.awt.Color(51, 102, 255));
        Calcularbtn1.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Calcularbtn1.setForeground(new java.awt.Color(255, 255, 255));
        Calcularbtn1.setText("CALCULAR");
        Calcularbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcularbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(Calcularbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 150, 50));

        Limpiarbtn1.setBackground(new java.awt.Color(255, 204, 0));
        Limpiarbtn1.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Limpiarbtn1.setForeground(new java.awt.Color(51, 51, 51));
        Limpiarbtn1.setText("LIMPIAR");
        Limpiarbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiarbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(Limpiarbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 150, 50));

        Salirbtn1.setBackground(new java.awt.Color(255, 51, 51));
        Salirbtn1.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Salirbtn1.setForeground(new java.awt.Color(255, 255, 255));
        Salirbtn1.setText("SALIR");
        Salirbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salirbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(Salirbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 150, 50));

        jLabel9.setFont(new java.awt.Font("mononoki", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INGRESE EL VALOR DE N:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        jPanel2.add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

        P3.addTab("P2", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TamanoN_txt.setFont(new java.awt.Font("mononoki", 2, 18)); // NOI18N
        TamanoN_txt.setForeground(new java.awt.Color(0, 153, 153));
        TamanoN_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamanoN_txtActionPerformed(evt);
            }
        });
        jPanel3.add(TamanoN_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 160, 50));

        SalidaP3_txt.setEditable(false);
        SalidaP3_txt.setBackground(new java.awt.Color(51, 51, 51));
        SalidaP3_txt.setColumns(20);
        SalidaP3_txt.setFont(new java.awt.Font("mononoki", 1, 21)); // NOI18N
        SalidaP3_txt.setForeground(new java.awt.Color(0, 255, 51));
        SalidaP3_txt.setLineWrap(true);
        SalidaP3_txt.setRows(5);
        jScrollPane1.setViewportView(SalidaP3_txt);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 540, 250));

        Calcularbtn2.setBackground(new java.awt.Color(51, 102, 255));
        Calcularbtn2.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Calcularbtn2.setText("CALCULAR");
        Calcularbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcularbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(Calcularbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, 50));

        Limpiarbtn2.setBackground(new java.awt.Color(255, 204, 0));
        Limpiarbtn2.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Limpiarbtn2.setForeground(new java.awt.Color(51, 51, 51));
        Limpiarbtn2.setText("LIMPIAR");
        Limpiarbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiarbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(Limpiarbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, 50));

        Salirbtn2.setBackground(new java.awt.Color(255, 51, 51));
        Salirbtn2.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        Salirbtn2.setForeground(new java.awt.Color(255, 255, 255));
        Salirbtn2.setText("SALIR");
        Salirbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salirbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(Salirbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 150, 50));

        jLabel10.setFont(new java.awt.Font("mononoki", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("INDICA EL TAMAÑO DEL VECTOR:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 50));
        jPanel3.add(lblFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

        P3.addTab("P3", jPanel3);

        getContentPane().add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirbtnActionPerformed

    private void CalcularbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularbtnActionPerformed
        // VARIABLES
        int N;
        double sumatoria, terminoN;

        //DATOS
        N = Integer.parseInt(ValorNtxt.getText());
        //PROCESO
        sumatoria = fml_ctrl.calcular_sumatoria_simple(N);
        terminoN = fml_ctrl.TerminoN(N);
        //SALIDA
        Sumatoriatxt.setText(String.valueOf(sumatoria));
        TermNtxt.setText(String.valueOf(terminoN));

        Calcularbtn.setEnabled(false);
    }//GEN-LAST:event_CalcularbtnActionPerformed

    private void LimpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarbtnActionPerformed
        // TODO add your handling code here:
        ValorNtxt.setText("");
        Sumatoriatxt.setText("");
        TermNtxt.setText("");
        Calcularbtn.setEnabled(true);
    }//GEN-LAST:event_LimpiarbtnActionPerformed

    private void SumatoriatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumatoriatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumatoriatxtActionPerformed

    private void Sumatoriatxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sumatoriatxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sumatoriatxt1ActionPerformed

    private void Calcularbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcularbtn1ActionPerformed
        // TODO add your handling code here:
        // VARIABLES
        int n;
        double sumatoriaDoble;
        //DATOS
        n = Integer.parseInt(ValorN_txt.getText());
        //PROCESO
        sumatoriaDoble = fml_ctrl.calcular_sumatoria_doble(n);
        //SALIDA
        Sumatoriatxt1.setText(String.valueOf(sumatoriaDoble));
        Calcularbtn1.setEnabled(false);
    }//GEN-LAST:event_Calcularbtn1ActionPerformed

    private void Limpiarbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiarbtn1ActionPerformed
        // TODO add your handling code here:
        ValorN_txt.setText("");
        Sumatoriatxt1.setText("");
        Calcularbtn1.setEnabled(true);
    }//GEN-LAST:event_Limpiarbtn1ActionPerformed

    private void Salirbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salirbtn1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Salirbtn1ActionPerformed

    private void TamanoN_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamanoN_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TamanoN_txtActionPerformed

    private void Calcularbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcularbtn2ActionPerformed
        SalidaP3_txt.setText("");
        
        //VARIABLES
        int tamanoN;
        //DATOS
        tamanoN = Integer.parseInt(TamanoN_txt.getText());
        Map<String, String> vector = fml_ctrl.generar_vectores(tamanoN);

        SalidaP3_txt.append(vector.get("vector1") + "\n");
        SalidaP3_txt.append(vector.get("vector2") + "\n");
        SalidaP3_txt.append(vector.get("vector_suma") + "\n");
        SalidaP3_txt.append(vector.get("elementos_comun") + "\n");
        Calcularbtn2.setEnabled(false);
    }//GEN-LAST:event_Calcularbtn2ActionPerformed

    private void Limpiarbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiarbtn2ActionPerformed
        // TODO add your handling code here:
        TamanoN_txt.setText("");
        SalidaP3_txt.setText("");
        Calcularbtn2.setEnabled(true);
    }//GEN-LAST:event_Limpiarbtn2ActionPerformed

    private void Salirbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salirbtn2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Salirbtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcularbtn;
    private javax.swing.JButton Calcularbtn1;
    private javax.swing.JButton Calcularbtn2;
    private javax.swing.JButton Limpiarbtn;
    private javax.swing.JButton Limpiarbtn1;
    private javax.swing.JButton Limpiarbtn2;
    private javax.swing.JTabbedPane P3;
    private javax.swing.JTextArea SalidaP3_txt;
    private javax.swing.JButton Salirbtn;
    private javax.swing.JButton Salirbtn1;
    private javax.swing.JButton Salirbtn2;
    private javax.swing.JTextField Sumatoriatxt;
    private javax.swing.JTextField Sumatoriatxt1;
    private javax.swing.JTextField TamanoN_txt;
    private javax.swing.JTextField TermNtxt;
    private javax.swing.JTextField ValorN_txt;
    private javax.swing.JTextField ValorNtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblFondo3;
    // End of variables declaration//GEN-END:variables
}
