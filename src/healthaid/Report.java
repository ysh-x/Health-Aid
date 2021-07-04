/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthaid;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import  java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author gygshwr
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        setLocationRelativeTo(null);
     

    }
    
    String BMISuggestion[] = {
                                "    Eat more freqently\n   Try Smoothies and Shakes\n   Snack on Nuts and Cheese\n   Add Extras to your dishes for more calories\n",
                                "    Stay hydrated\n   Have a balanced Diet\n   Be regular in your exercise\n   Exercise for 60 - 90 Mins\n",
                                "    Drink water before meals\n   Eat eggs for breakfast\n   Drink Black coffee and Green Tea\n   Cut back on added sugar\n",
                                "    Consume less bad fat\n   Consume less procesed foods\n   Eat plenty of dietary fiber\n   Engage in regular aerobic - activity\n"
            
            

    
    };
    
    public void BMIChange(String BMI) {
        
        String Set = "   "+BMI;
        
        if(BMI.equals("Under Weight")) {
            Set = Set + "\n\n"+BMISuggestion[0];
            Disp.setText(Set);
            Disp.setBackground(new Color(196,255,145));
 
        }
        else if(BMI.equals("Normal")) {
            Set = Set + "\n\n"+BMISuggestion[1];
            Disp.setText(Set); 
             Disp.setBackground(new Color(121,255,57));
            
        }
        else if(BMI.equals("Over Weight")) { 
            Set = Set + "\n\n"+BMISuggestion[2];
            Disp.setText(Set);
            Disp.setBackground(new Color(235,138,62));
            
        }
        else if(BMI.equals("Obese")) {
            Set = Set + "\n\n"+BMISuggestion[3];
            Disp.setText(Set);
            Disp.setBackground(new Color(235,65,24));
            
        }
        
    }
 public void BPChange(String BMI) {
        
        String Set = "   "+BMI;
        
        if(BMI.equals("Under Weight")) {
            Set = Set + "\n\n"+BMISuggestion[0];
            Disp.setText(Set);
            Disp.setBackground(new Color(196,255,145));
 
        }
        else if(BMI.equals("Normal")) {
            Set = Set + "\n\n"+BMISuggestion[1];
            Disp.setText(Set); 
             Disp.setBackground(new Color(121,255,57));
            
        }
        else if(BMI.equals("Over Weight")) { 
            Set = Set + "\n\n"+BMISuggestion[2];
            Disp.setText(Set);
            Disp.setBackground(new Color(235,138,62));
            
        }
        else if(BMI.equals("Obese")) {
            Set = Set + "\n\n"+BMISuggestion[3];
            Disp.setText(Set);
            Disp.setBackground(new Color(235,65,24));
            
        }
        
    }
    
    public Report(String user) {
        initComponents();
        UserLabel.setText(user);
        setLocationRelativeTo(null);
      
        String U = UserLabel.getText();
        try{
            String url = "jdbc:h2:~/test";
          Connection C = DriverManager.getConnection(url,"sa","sa");
             String query = "Select RESULTS from BMIREPORT where username = '" +U + "';";
             System.out.println(query);
               Statement S = C.createStatement(); 
                ResultSet RS = S.executeQuery(query);
                
                while(RS.next()) {
                    String BMI = RS.getString("RESULTS");
                    System.out.println(BMI);
                    if(BMI != " ")
                        BMIChange(BMI);
                    else
                        showMessageDialog(this,"No Entries Found!","Error",JOptionPane.ERROR_MESSAGE);
                }
                
             
            
           C.close();
           S.close();
         } catch(SQLException E) { System.out.println(E); }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Disp = new javax.swing.JTextArea();
        Analysiss = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reduce = new javax.swing.JTextArea();

        jPanel3.setBackground(new java.awt.Color(56, 175, 238));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Health Aid");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Current user :");

        UserText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserText.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(56, 175, 238));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setText("Health Aid");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel3)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Report");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Current user :");

        UserLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserLabel.setText("jLabel1");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("BMI");

        Next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Next.setText("Next");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("SMART ANALYSIS");

        Disp.setColumns(20);
        Disp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Disp.setForeground(new java.awt.Color(255, 255, 255));
        Disp.setRows(5);
        jScrollPane2.setViewportView(Disp);

        Analysiss.setBackground(new java.awt.Color(255, 102, 102));
        Analysiss.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Analysiss.setText("SMART ANALYSIS");
        Analysiss.setBorder(null);
        Analysiss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnalysissMouseClicked(evt);
            }
        });

        Reduce.setBackground(new java.awt.Color(255, 255, 102));
        Reduce.setColumns(20);
        Reduce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reduce.setRows(5);
        jScrollPane1.setViewportView(Reduce);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(Analysiss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(167, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLabel)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Analysiss, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        // TODO add your handling code here:
       ReportFinal R = new ReportFinal(UserLabel.getText());
       R.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_NextMouseClicked

    private void AnalysissMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalysissMouseClicked
        // TODO add your handling code here:
         String U = UserLabel.getText();
        
        try{
            String url = "jdbc:h2:~/test";
            Connection C = DriverManager.getConnection(url,"sa","sa");
            String query = "Select WEIGHT,HEIGHT from BMIREPORT where username = '" +U + "';";
            System.out.println(query);
            Statement S = C.createStatement();
            ResultSet RS = S.executeQuery(query);

            while(RS.next()) {

                float Height = RS.getFloat("HEIGHT");
                float Weight = RS.getFloat("WEIGHT");

                float Actual = (24.9f * (Height/100) * (Height/100));
                float Difference = Weight - Actual;

                String Disp = "\n"+"  Your Actual Weight is supposed to be "+Float.toString(Actual)+
                " Kg(s) \n" + "  You have to reduce "+Float.toString(Difference)+" Kg(s)\n";

                Reduce.setText(Disp);
            }
              C.close();
           S.close();
        }
        catch(SQLException E) {
            System.out.println(E);
        }
    }//GEN-LAST:event_AnalysissMouseClicked
  
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Analysiss;
    private javax.swing.JTextArea Disp;
    private javax.swing.JButton Next;
    private javax.swing.JTextArea Reduce;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel UserText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
