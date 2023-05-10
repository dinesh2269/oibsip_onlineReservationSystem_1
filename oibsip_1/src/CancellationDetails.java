/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dinesh
 */
import java.sql.*;
public class CancellationDetails extends javax.swing.JFrame {

    /**
     * Creates new form CancellationDetails
     */
    private ResultSet rs;
    private int pnr;
    public CancellationDetails(ResultSet rs) {
        this.rs=rs;
        initComponents();
        try{
            pnr=rs.getInt("pnr");
            pnrno.setText(String.valueOf(pnr));
            trainno.setText(String.valueOf(rs.getInt("trainnumber")));
            trainname.setText(rs.getString("trainname"));
            passengername.setText(rs.getString("passengername"));
            gender.setText(rs.getString("gender"));
            age.setText(String.valueOf(rs.getInt("age")));
            phno.setText(String.valueOf(rs.getInt("phonenumber")));
            classtype.setText(rs.getString("classtype"));
            doj.setText(rs.getString("doj"));
            from.setText(rs.getString("source"));
            to.setText(rs.getString("destination"));
            
            
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
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
        pnrno1 = new javax.swing.JLabel();
        pnrno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        trainno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trainname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passengername = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        phno = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        classtype = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        doj = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        from = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        cancebtn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        pnrno1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        pnrno1.setText("PNR ");

        pnrno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnrno.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel3.setText("Train Number");

        trainno.setBackground(new java.awt.Color(204, 204, 204));
        trainno.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel5.setText("Train Name");

        trainname.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel7.setText("Passenger Name");

        passengername.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel9.setText("Gender");

        gender.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel11.setText("Age");

        age.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel13.setText("Phone Number");

        phno.setText("jLabel14");

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel15.setText("Class Type");

        classtype.setText("jLabel16");

        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel17.setText("Date Of Jouney");

        doj.setText("jLabel18");

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel19.setText("From");

        from.setText("jLabel20");

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel21.setText("To");

        to.setText("jLabel22");

        cancebtn.setText("Cancel Ticket");
        cancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancebtnActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnrno1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnrno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passengername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trainno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(classtype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(trainname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 15, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(phno, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(doj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(back)
                        .addGap(29, 29, 29)
                        .addComponent(cancebtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnrno1)
                    .addComponent(pnrno))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trainname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trainno)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengername)
                    .addComponent(jLabel9)
                    .addComponent(gender)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(phno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(classtype)
                        .addComponent(doj)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(from)
                        .addComponent(jLabel21))
                    .addComponent(to))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(cancebtn))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ticket Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancebtnActionPerformed
        int option=javax.swing.JOptionPane.showConfirmDialog(this, "Confirm ticket cancellation by pressing Yes.");
        if(option==javax.swing.JOptionPane.OK_OPTION)
        {
            Connection conn;
            try{
                   Class.forName("com.mysql.cj.jdbc.Driver");
                   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/reservation","root","root");
                   if(conn!=null)
                   {
                       String stmt="delete from bookings where pnr=?";
                       PreparedStatement st=conn.prepareStatement(stmt);
                       st.setInt(1,pnr);
                       boolean b=st.execute();
                       if(b==false)
                       {
                           javax.swing.JOptionPane.showMessageDialog(this, "Ticket Cancelled Successfully.");
                           this.setVisible(false);
                           Home home=new Home();
                           home.setVisible(true);
                       }
                   }
            }
            catch(ClassNotFoundException | SQLException e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_cancebtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        CancelForm cancel=new CancelForm();
        cancel.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(CancellationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancellationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancellationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancellationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CancellationDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton back;
    private javax.swing.JButton cancebtn;
    private javax.swing.JLabel classtype;
    private javax.swing.JLabel doj;
    private javax.swing.JLabel from;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passengername;
    private javax.swing.JLabel phno;
    private javax.swing.JLabel pnrno;
    private javax.swing.JLabel pnrno1;
    private javax.swing.JLabel to;
    private javax.swing.JLabel trainname;
    private javax.swing.JLabel trainno;
    // End of variables declaration//GEN-END:variables
}