/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.palette.dialogues;

import me.dsnet.cetriolo.integration.completion.GerkinCompletionNames;

/**
 *
 * @author SessonaD
 */
public class NarrativeDialog extends javax.swing.JDialog {
    
    String description = null;
    boolean docVisible=true;
    /**
     * Creates new form StepDialog
     */
    public NarrativeDialog(java.awt.Frame parent, boolean modal, GerkinCompletionNames keywordTitle) {
        super(parent, modal);        
        initComponents();
        stepLabelWord.setText(" " +keywordTitle.display + " :");
        setTitle("Customize step definition - " + keywordTitle.display);
        setIconImage(keywordTitle.getIcon(16));
        jLabel1.setIcon(new javax.swing.ImageIcon(keywordTitle.getIcon(64)));
        //jTextArea1.setText(keywordTitle.getDocumentation());
        docEditorPane.setContentType("text/html");
        docEditorPane.setText(keywordTitle.getDocumentation());
        hideshowdoc();
    }

    public String getDescription() {
        return description;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stepLabelWord = new javax.swing.JLabel();
        stepDescriptionLabel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        docScrollPane = new javax.swing.JScrollPane();
        docEditorPane = new javax.swing.JEditorPane();
        showdoclabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(NarrativeDialog.class, "NarrativeDialog.title")); // NOI18N
        setIconImage(null);

        org.openide.awt.Mnemonics.setLocalizedText(stepLabelWord, org.openide.util.NbBundle.getMessage(NarrativeDialog.class, "NarrativeDialog.stepLabelWord.text")); // NOI18N

        stepDescriptionLabel.setText(org.openide.util.NbBundle.getMessage(NarrativeDialog.class, "NarrativeDialog.stepDescriptionLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(NarrativeDialog.class, "NarrativeDialog.jButton1.text")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(NarrativeDialog.class, "NarrativeDialog.jButton2.text")); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/narrative-asa64.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(NarrativeDialog.class, "NarrativeDialog.jLabel1.text")); // NOI18N

        docScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        docScrollPane.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        docScrollPane.setHorizontalScrollBar(null);

        docEditorPane.setEditable(false);
        docEditorPane.setContentType("text/html"); // NOI18N
        docEditorPane.setText(org.openide.util.NbBundle.getMessage(NarrativeDialog.class, "NarrativeDialog.docEditorPane.text")); // NOI18N
        docScrollPane.setViewportView(docEditorPane);

        showdoclabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        showdoclabel.setForeground(new java.awt.Color(0, 51, 255));
        org.openide.awt.Mnemonics.setLocalizedText(showdoclabel, org.openide.util.NbBundle.getMessage(NarrativeDialog.class, "NarrativeDialog.showdoclabel.text")); // NOI18N
        showdoclabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showdoclabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(showdoclabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(stepDescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stepLabelWord)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stepLabelWord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stepDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(showdoclabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        description = null;
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        description = stepDescriptionLabel.getText();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showdoclabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showdoclabelMouseClicked
        hideshowdoc();
    }//GEN-LAST:event_showdoclabelMouseClicked
    
    private void hideshowdoc(){
        docVisible = !docVisible;
        docEditorPane.setVisible(docVisible);
        docScrollPane.setVisible(docVisible);
        showdoclabel.setText(docVisible ? "(- hide documentation)":"(+ show documentation)");
        this.pack();
    }
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
            java.util.logging.Logger.getLogger(NarrativeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NarrativeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NarrativeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NarrativeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NarrativeDialog dialog = new NarrativeDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JEditorPane docEditorPane;
    private javax.swing.JScrollPane docScrollPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel showdoclabel;
    private javax.swing.JTextField stepDescriptionLabel;
    private javax.swing.JLabel stepLabelWord;
    // End of variables declaration//GEN-END:variables
}
