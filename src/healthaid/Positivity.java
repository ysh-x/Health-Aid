/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthaid;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author gygshwr
 */
public class Positivity extends javax.swing.JFrame {

    /**
     * Creates new form Positivity
     */
    public Positivity() {
        initComponents();
        setLocationRelativeTo(null);
    }

        Random R = new Random();
        
             public static String[] Happy = {
            "\n\n\n  You’re off to great places, today is your day.\n   Your mountain is waiting, so get on your way.\n\n   By Dr. Seuss",
            "\n\n\n  You always pass failure on the way to success\n\n   By Mickey Rooney.",
            "\n\n\n  It always seems impossible until it is done. \n\n   By Nelson Mandela",
            "\n\n\n  Keep your face to the sunshine and you cannot \n  See a shadow.\n\n   By Helen Keller",
            "\n\n\n  Positive thinking will let you do everything better\n   than negative thinking will.\n\n   By Helen Keller",   
            
        };
            public static String[] Painful = {
            "\n\n\n  The wound is the place where the Light enters you.\n   Your mountain is waiting, so get on your way\n\n   By Rumi",
            "\n\n\n  Scars have the strange power to remind\n  Us that our past is real\n\n   By Cormac McCarthy.",
            "\n\n\n  The soul is healed by being with children. \n\n   By Fyodor Dostoevsky",
            "\n\n\n  Poetry heals the wounds inflicted by reason.\n\n   By Novalis",
            "\n\n\n  Change, like healing, takes time.\n\n   By Veronica Roth",   
            
        };
            
            public static String[] Sad = {
            "\n\n\n  People should find happiness in the little things,\n  Like family.\n\n   By Amenda",
            "\n\n\n  Happiness is not an ideal of reason,\n  But of imagination. \n\n   By Immanuel",
            "\n\n\n  The secret of happiness is freedom,\n  The secret of freedom is courage. \n\n   By Carrie Jones",
            "\n\n\n  The only way to find true happiness\n  Is to risk being completely cut open.\n\n   By Chuck Palahniuk",
            "\n\n\n  Nobody really cares if you’re miserable,\n  So you might as well be happy.\n\n   By Cynthia Nelms",   
            
        };
            
            public static String[] Angry = {
            "\n\n\n  The greatest remedy for anger is delay.\n\n   By Thomas Paine",
            "\n\n\n  God created anger to show your conflict\n  Not to show your hate. \n\n   By Jagdeesh",
            "\n\n\n  To remove your anger,\n  You need to remove your comfort \n\n   By Marie",
            "\n\n\n  What is bitterly done in uncontrolled anger\n  Cannot be undone\n\n   By Vinod Vargheese",
            "\n\n\n  Anger could be a gift only if it's used wisely\n\n   By Dido Stargaze",
            "\n\n\n  Be Slow to Anger 'Quick' to\n  Love Towards those Around You.\n\n   By Syed",
            
            
        };
            
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Mood = new javax.swing.JComboBox<>();
        view = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();
        Back1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Health Aid");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Mindfullness");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(56, 175, 238));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Health Aid");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Positivity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("How Do You Feel Now?");

        Mood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Happy", "Painful", "Sad", "Angry" }));

        view.setBackground(new java.awt.Color(204, 102, 255));
        view.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        view.setText("View Quote");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });

        Display.setColumns(20);
        Display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setLineWrap(true);
        Display.setRows(5);
        Display.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Display.setCaretColor(new java.awt.Color(255, 255, 255));
        Display.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Display.setFocusable(false);
        jScrollPane1.setViewportView(Display);

        Back1.setBackground(new java.awt.Color(255, 102, 102));
        Back1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back1.setText("Back");
        Back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(Mood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        // TODO add your handling code here:
        String mood = Mood.getSelectedItem().toString();
        
        if(mood.equals("Happy")) {
            int rand = R.nextInt(4);
            Display.setBackground(new Color(65,219,255));
            Display.setText(Happy[rand]);
            
        }
        
        else if(mood.equals("Painful")) {
            int rand = R.nextInt(4);
            Display.setBackground(new Color(102,225,102));
            Display.setText(Painful[rand]);
        }
        else if(mood.equals("Sad")) {
            int rand = R.nextInt(4);
            Display.setBackground(new Color(255,175,116));
            Display.setText(Sad[rand]);
        }
        else {
            int rand = R.nextInt(5);
            Display.setBackground(new Color(171,53,116));
            Display.setText(Angry[rand]);
            
        }
    }//GEN-LAST:event_viewMouseClicked

    private void Back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back1MouseClicked
        // TODO add your handling code here:
        showMessageDialog(this,"\n  Never Forget,\n  This Too Shall Pass.","REMINDER",JOptionPane.INFORMATION_MESSAGE);
        Login B = new Login();
        B.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back1MouseClicked

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
            java.util.logging.Logger.getLogger(Positivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Positivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Positivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Positivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Positivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JTextArea Display;
    private javax.swing.JComboBox<String> Mood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
