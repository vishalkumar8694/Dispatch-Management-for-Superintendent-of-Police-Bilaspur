/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import java.sql.*;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MADHURENDRA PURBAY
 */
public class public_from extends javax.swing.JFrame {
     Connection con=null;
    PreparedStatement pstmt=null;
 void last_data_from()
    {
         try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from sp where pref_no=5 ");
            String srno;
            String from;
            String to,dat,remark,date = null;
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            while (true)
            {
                int c=tm.getRowCount();
                if(c==0)
                break;
                else
                tm.removeRow(0);
            }
            while(rs.next())
            {
                srno=rs.getString("serial_no");
                from=rs.getString("from1");
                to=rs.getString("to");
                dat=rs.getString("date");
                remark=rs.getString("remarks");
                try
                {
                    SimpleDateFormat simpledateformat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
                    java.util.Date tempDate1=simpledateformat1.parse(dat);
                    SimpleDateFormat outputDateFormat1 = new SimpleDateFormat("dd-MMM-yyyy");
                    //System.out.println("Output date is = "+outputDateFormat.format(tempDate));
                    date=outputDateFormat1.format(tempDate1);
                } catch (ParseException ex)
                {
                    System.out.println("Parse Exception");
                }

                Object kk[]={srno,date,from,to,remark};
                tm.addRow(kk);
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error in connection "+e);
        }
    }
    
    /**
     * Creates new form public_from
     */
    public public_from() {
        initComponents();
        try
        {
            con=DriverManager.getConnection("jdbc:ucanaccess://.\\dispatch_public.accdb");
        }
        catch(Exception e)
        {
            System.out.println(e);
             JOptionPane.showMessageDialog(null,"Database connection error","Error",JOptionPane.ERROR_MESSAGE);
        }
 last_data_from();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtsno = new javax.swing.JTextField();
        txtd = new com.toedter.calendar.JDateChooser();
        txtremark = new javax.swing.JTextField();
        txtto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtfrom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtm = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 10, 600, 150);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Developed By: Madhurendra & Vishal");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 650, 240, 60);

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("जनता(अवाक)");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(600, 210, 160, 30);

        submit.setBackground(new java.awt.Color(204, 204, 204));
        submit.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 102, 102));
        submit.setText("जमा करें");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(1050, 470, 110, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("वापस");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 420, 100, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1030, 220, 110, 30);

        txtsno.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jPanel1.add(txtsno);
        txtsno.setBounds(210, 320, 70, 30);

        txtd.setDateFormatString("dd-MMM-yyyy");
        jPanel1.add(txtd);
        txtd.setBounds(340, 320, 140, 30);

        txtremark.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtremark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtremarkActionPerformed(evt);
            }
        });
        jPanel1.add(txtremark);
        txtremark.setBounds(1020, 320, 180, 30);

        txtto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttoActionPerformed(evt);
            }
        });
        jPanel1.add(txtto);
        txtto.setBounds(790, 320, 160, 30);

        jTable1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "क्रमांक", "तारीख", "से", "को", "टिप्पणी"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 580, 860, 60);

        txtfrom.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfromActionPerformed(evt);
            }
        });
        jPanel1.add(txtfrom);
        txtfrom.setBounds(540, 320, 190, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("प्रिंट");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 200, 90, 30);

        txtm.setColumns(20);
        txtm.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtm.setRows(5);
        jScrollPane2.setViewportView(txtm);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(770, 410, 210, 96);

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("क्रमांक");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(210, 280, 70, 30);

        jLabel13.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText(" तारीख");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(340, 280, 120, 30);

        jLabel14.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("को");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(850, 280, 50, 30);

        jLabel15.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("से");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(590, 280, 40, 30);

        jLabel16.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText(" टिप्पणी");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1040, 280, 120, 30);

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("मामला (संक्षेप में)");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(780, 370, 160, 30);

        jLabel18.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 51));
        jLabel18.setText("अंतिम डेटा प्रविष्टि");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(230, 540, 190, 30);

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("प्रेषण खंड");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 150, 190, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            // TODO add your handling code here:
          pstmt=con.prepareStatement("insert into public_f(serial_no,date,from1,to1,remarks,matter)values(?,?,?,?,?,?)");
            String n=txtsno.getText();
            n=n.trim();
            String to=txtto.getText();
            to=to.trim();
        String d=((JTextField)txtd.getDateEditor().getUiComponent()).getText();
            d=d.trim();
              String f=txtfrom.getText();
              f=f.trim();
               if(n.length()>0&&d.length()>0&&f.length()>0&&to.length()>0)
            {
            String remark=txtremark.getText();
            String mat=txtm.getText();
            pstmt.setString(1,n);
            pstmt.setString(2,d);
            pstmt.setString(3,f);
            pstmt.setString(4,to);
            pstmt.setString(5,remark);
            pstmt.setString(6,mat);
            int i=pstmt.executeUpdate();
            pstmt.clearParameters();
            if(i>=0)
            {
                JOptionPane.showMessageDialog(null,"Data inserted successfully","Data Insertion",JOptionPane.PLAIN_MESSAGE);
                txtsno.setText("");
                txtfrom.setText("");
                txtremark.setText("");
                try {
                    // TODO add your handling code here:
                    pstmt=con.prepareStatement("update sp set serial_no=?,date=?,to=?,from1=?,remarks=? where pref_no=?");
                    pstmt.setString(1,n);
                    pstmt.setString(2,((JTextField)txtd.getDateEditor().getUiComponent()).getText());
                    pstmt.setString(4,f);
                    pstmt.setString(3,to);
                    pstmt.setString(5,remark);
                    int p=5;
                    pstmt.setInt(6,p);
                    int i1=pstmt.executeUpdate();
                    pstmt.clearParameters();
                    if(i1>=0)
                    {
                        //JOptionPane.showMessageDialog(null,"Data inserted successfully","Data Insertion",JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        //  JOptionPane.showMessageDialog(null,"Data cannot be inserted","Insertion error",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialog(null,"Please check letter number"+ex,"Insertion  alert",JOptionPane.ERROR_MESSAGE);

                }
               last_data_from();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Data cannot be inserted","Insertion error",JOptionPane.ERROR_MESSAGE);
            }
            
             } else
            {
                 JOptionPane.showMessageDialog(null,"Plese check your important input","Insertion error",JOptionPane.ERROR_MESSAGE);   
                    }
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Please check letter number"+ex,"Insertion  alert",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_submitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      public_to_from ob=new public_to_from();
        ob.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        public_f ob=new public_f();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtremarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtremarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtremarkActionPerformed

    private void txttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoActionPerformed

    private void txtfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        public_f ob=new public_f();
        ob.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(public_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(public_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(public_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(public_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new public_from().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton submit;
    private com.toedter.calendar.JDateChooser txtd;
    private javax.swing.JTextField txtfrom;
    private javax.swing.JTextArea txtm;
    private javax.swing.JTextField txtremark;
    private javax.swing.JTextField txtsno;
    private javax.swing.JTextField txtto;
    // End of variables declaration//GEN-END:variables
}
