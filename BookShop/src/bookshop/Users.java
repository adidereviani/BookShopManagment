/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshop;

import static bookshop.AdminUser.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author liron
 */
public class Users extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
    public Users() {
        initComponents();
        DisplayUsers();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        UNameTb = new javax.swing.JTextField();
        UIdTb = new javax.swing.JTextField();
        PhoneTb = new javax.swing.JTextField();
        AddressTb = new javax.swing.JTextField();
        PasswordTb = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        LogoutBtn = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/exit 2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Book Shop Software");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324)
                .addComponent(jLabel2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2)
        );

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setText("Users");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/user.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 255));
        jLabel5.setText("Books");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/books.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(15, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 255));
        jLabel7.setText("ID");

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 255));
        jLabel8.setText("Name");

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 255));
        jLabel9.setText("Phone");

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 51, 255));
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 51, 255));
        jLabel11.setText("Password");

        UNameTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNameTb.setForeground(new java.awt.Color(0, 153, 153));
        UNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNameTbActionPerformed(evt);
            }
        });

        UIdTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UIdTb.setForeground(new java.awt.Color(0, 153, 153));
        UIdTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIdTbActionPerformed(evt);
            }
        });

        PhoneTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PhoneTb.setForeground(new java.awt.Color(0, 153, 153));
        PhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTbActionPerformed(evt);
            }
        });

        AddressTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddressTb.setForeground(new java.awt.Color(0, 153, 153));
        AddressTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTbActionPerformed(evt);
            }
        });

        PasswordTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PasswordTb.setForeground(new java.awt.Color(0, 153, 153));
        PasswordTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTbActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(102, 51, 255));
        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(102, 51, 255));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(102, 51, 255));
        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Add");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(102, 51, 255));
        ResetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 255, 255));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address", "Password"
            }
        ));
        UsersTable.setRowHeight(25);
        UsersTable.setSelectionBackground(new java.awt.Color(195, 247, 234));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/back.png"))); // NOI18N
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(102, 51, 255));
        PrintBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 51, 255));
        jLabel13.setText("Users List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LogoutBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 384, 384))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(399, 399, 399))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UNameTbActionPerformed

    private void UIdTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIdTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIdTbActionPerformed

    private void PhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTbActionPerformed

    private void AddressTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTbActionPerformed

    private void PasswordTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTbActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    //SQL functions //
    Connection Con = null; //DB 
    Statement St = null; //DB 
    ResultSet Rs = null; //DB 
    
    //show the DB table
    private void DisplayUsers()
    {
        try 
        {
           Con =  DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
           St = Con.createStatement();
           Rs = St.executeQuery("select * from User1.UserTbl");
           UsersTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } 
        catch (Exception e) 
        {
            
        }
    }
    
    //reset cells
    private void Reset()
    {
        UIdTb.setText("");
        UNameTb.setText("");
        PhoneTb.setText("");
        AddressTb.setText("");
        PasswordTb.setText("");
    }
    
    //Add User Button
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(UIdTb.getText().isEmpty() || UNameTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || AddressTb.getText().isEmpty() || PasswordTb.getText().isEmpty())//Check if the fields are empty
        {
            JOptionPane.showMessageDialog(this, "Missing Information");//error msg
        }
        else
        {
            try 
            {
                String UserName = UNameTb.getText();
                String Password = PasswordTb.getText();
                int ID = Integer.valueOf(UIdTb.getText());
                String Phone = PhoneTb.getText();
                String Address = AddressTb.getText();
                
                ManageSellerAccount sellerManage = new ManageSellerAccount(ID,  Phone,  Address);
                SellerUser Seller = new SellerUser(sellerManage, UserName, Password);
                boolean permmision = false;
                permmision = addNewSellerAcc(Seller);

                if (permmision == true)
                {
                    JOptionPane.showMessageDialog(this, "User Added"); //Added Msg
                    DisplayUsers(); //refresh the Users Table - add the new User
                    Reset(); // resert cells after added User
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    //X Button
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);// close
    }//GEN-LAST:event_jLabel2MouseClicked

    //Reset Cells Button
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        Reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    //Logout Button
    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked

    //Print Users List Button
    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
                try 
        {
            UsersTable.print(); 
        } 
        catch (Exception e) 
        {
            
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    //Show selected raw info on cells
    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)UsersTable.getModel();
        int MyIndex = UsersTable.getSelectedRow();
        UIdTb.setText(model.getValueAt(MyIndex, 0).toString());
        UNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        PhoneTb.setText(model.getValueAt(MyIndex, 2).toString());
        AddressTb.setText(model.getValueAt(MyIndex, 3).toString());
        PasswordTb.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_UsersTableMouseClicked

    //Delete Book Button
    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(UIdTb.getText().isEmpty() )//Check if the field are empty
        {
            JOptionPane.showMessageDialog(this, "Missing Information - Select User to Delete");//error msg
        }
        else
        {
            try 
            {
                int ID = Integer.valueOf(UIdTb.getText());

                ManageSellerAccount sellerManage = new ManageSellerAccount(ID,  null,  null);
                SellerUser Seller = new SellerUser(sellerManage, null, null);
                boolean permmision = false;
                permmision = DeleteSellerAcc(Seller);

                if (permmision == true)
                {                    
                JOptionPane.showMessageDialog(this, "User Deleted"); //Added Msg
                DisplayUsers(); //refresh the Users Table - add the new user
                Reset(); // resert cells after added user
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "ERROR with User Delet");
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    //Edit User Button
    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(UIdTb.getText().isEmpty() || UNameTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || AddressTb.getText().isEmpty() || PasswordTb.getText().isEmpty())//Check if the fields are empty
        {
            JOptionPane.showMessageDialog(this, "Missing Information - Select User to Edit");//error msg

        }
        else
        {
            try 
            {
                String UserName = UNameTb.getText();
                String Password = PasswordTb.getText();
                int ID = Integer.valueOf(UIdTb.getText());
                String Phone = PhoneTb.getText();
                String Address = AddressTb.getText();
                
                ManageSellerAccount sellerManage = new ManageSellerAccount(ID,  Phone,  Address);
                SellerUser Seller = new SellerUser(sellerManage, UserName, Password);
                boolean permmision = false;
                permmision = EditSellerAcc(Seller);

                if (permmision == true)
                {
                    JOptionPane.showMessageDialog(this, "User Updated"); //Added Msg
                    DisplayUsers(); //refresh the Books Table - add the new book
                    Reset(); // resert cells after added book
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "ERROR with User Edit");
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    //Books Button
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Books().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JTextField PasswordTb;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField UIdTb;
    private javax.swing.JTextField UNameTb;
    private javax.swing.JTable UsersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
