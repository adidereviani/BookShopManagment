/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshop;

import static bookshop.AdminUser.*;
import javax.swing.JOptionPane; //for the massages
import java.sql.Connection; //to the DB connection
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author liron
 */
public class Books extends javax.swing.JFrame {

    /**
     * Creates new form Books
     */
    public Books() {
        initComponents();
        DisplayBooks();//Show the TBL of the Books in the start
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsersBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        QuantityTb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        AuthorTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NameTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BookIdTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        PrintBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CatCb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(884, 599));

        UsersBtn.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        UsersBtn.setForeground(new java.awt.Color(102, 51, 255));
        UsersBtn.setText("Users");
        UsersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersBtnMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/user.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(15, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/books.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 255));
        jLabel5.setText("Books");

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

        PriceTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(0, 153, 153));
        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 51, 255));
        jLabel11.setText("Price");

        QuantityTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QuantityTb.setForeground(new java.awt.Color(0, 153, 153));
        QuantityTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityTbActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 51, 255));
        jLabel10.setText("Quantity");

        AuthorTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AuthorTb.setForeground(new java.awt.Color(0, 153, 153));
        AuthorTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorTbActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 255));
        jLabel9.setText("Author");

        NameTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameTb.setForeground(new java.awt.Color(0, 153, 153));
        NameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 255));
        jLabel8.setText("Title");

        BookIdTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BookIdTb.setForeground(new java.awt.Color(0, 153, 153));
        BookIdTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIdTbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 255));
        jLabel7.setText("ID");

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

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 51, 255));
        jLabel13.setText("Books List");

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Author", "Category", "Quantity", "Price"
            }
        ));
        BooksTable.setRowHeight(25);
        BooksTable.setSelectionBackground(new java.awt.Color(195, 247, 234));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BooksTable);

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

        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/back.png"))); // NOI18N
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 51, 255));
        jLabel14.setText("Category");

        CatCb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CatCb.setForeground(new java.awt.Color(51, 51, 51));
        CatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Journal", "Leisure", "Newspaper", "Noval", "Magazine" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BookIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AuthorTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(44, 44, 44)
                                            .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(219, 219, 219))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)
                                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34)
                                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(174, 174, 174)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(239, 239, 239)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(NameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(75, 75, 75)
                                        .addComponent(QuantityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LogoutBtn)
                        .addGap(361, 361, 361)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(UsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AuthorTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(QuantityTb)
                            .addComponent(CatCb))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PrintBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed

    private void QuantityTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityTbActionPerformed

    private void AuthorTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorTbActionPerformed

    private void NameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTbActionPerformed

    private void BookIdTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIdTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIdTbActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    //X Button
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);// close
    }//GEN-LAST:event_jLabel2MouseClicked
    
    //SQL functions //
    Connection Con = null; //DB 
    Statement St = null; //DB 
    ResultSet Rs = null; //DB 
    
    //show the DB table
    private void DisplayBooks()
    {
        try 
        {
           Con =  DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
           St = Con.createStatement();
           Rs = St.executeQuery("select * from User1.BookTbl");
           BooksTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } 
        catch (Exception e) 
        {
            
        }
    }
    
    //Reset Cells
    private void Reset()
    {
        BookIdTb.setText("");
        NameTb.setText("");
        AuthorTb.setText("");
        CatCb.setSelectedIndex(0);
        QuantityTb.setText("");
        PriceTb.setText("");
    }
    
    //Add Book Button
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(BookIdTb.getText().isEmpty() || NameTb.getText().isEmpty() || AuthorTb.getText().isEmpty() || CatCb.getSelectedIndex() == -1 || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty())//Check if the fields are empty
        {
            JOptionPane.showMessageDialog(this, "Missing Information");//error msg
        }
        else
        {
            try 
            {
                String Title = NameTb.getText();
                String Author = AuthorTb.getText();
                int ID = Integer.valueOf(BookIdTb.getText());
                String Category = CatCb.getSelectedItem().toString();
                int Quantity = Integer.valueOf(QuantityTb.getText());
                int Price = Integer.valueOf(PriceTb.getText());
                Book newBook = null;
                
                if(Category == "Journal")
                {
                    newBook = new Journal(Title, Author, Category, ID, Price, Quantity);
                }
                else if(Category == "Leisure")
                {
                    newBook = new Leisure(Title, Author, Category, ID, Price, Quantity);
                }
                else if(Category == "Newspaper")
                {
                    newBook = new Newspaper(Title, Author, Category, ID, Price, Quantity);
                }
                else if(Category == "Noval")
                {
                    newBook = new Noval(Title, Author, Category, ID, Price, Quantity);
                }
                else if(Category == "Magazine")
                {
                    newBook = new Magazine(Title, Author, Category, ID, Price, Quantity);
                }

                boolean permmision = false;
                permmision = AddBook(newBook);

                if (permmision == true)
                {
                    JOptionPane.showMessageDialog(this, "Book Added"); //Added Msg
                    DisplayBooks(); //refresh the Books Table - add the new book
                    Reset(); // resert cells after added book
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "ERROR with Book Add");
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    //Reset Cells Button
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        Reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    //Delete Book Button
    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(BookIdTb.getText().isEmpty() )//Check if the field are empty
        {
            JOptionPane.showMessageDialog(this, "Missing Information - Select Book to Delete");//error msg
        }
        else
        {
            try 
            {
                int ID = Integer.valueOf(BookIdTb.getText());
                
                Book newBook = new Book(null, null, null, ID, 0, 0);
                boolean permmision = false;
                permmision = DeleteBook(newBook);
                
                if (permmision == true)
                {
                    JOptionPane.showMessageDialog(this, "Book Deleted"); //Added Msg
                    DisplayBooks(); //refresh the Books Table - add the new book
                    Reset(); // resert cells after added book
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "ERROR with Book Add");
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    //Show selected raw info on cells
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BookIdTb.setText(model.getValueAt(MyIndex, 0).toString());
        NameTb.setText(model.getValueAt(MyIndex, 1).toString());
        AuthorTb.setText(model.getValueAt(MyIndex, 2).toString());
        CatCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        QuantityTb.setText(model.getValueAt(MyIndex, 4).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked

    //Edit Book Button
    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(BookIdTb.getText().isEmpty() || NameTb.getText().isEmpty() || AuthorTb.getText().isEmpty() || CatCb.getSelectedIndex() == -1 || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty())//Check if the fields are empty
        {
            JOptionPane.showMessageDialog(this, "Missing Information - Select Book to Edit");//error msg
        }
        else
        {
            try 
            {
                String Title = NameTb.getText();
                String Author = AuthorTb.getText();
                int ID = Integer.valueOf(BookIdTb.getText());
                String Category = CatCb.getSelectedItem().toString();
                int Quantity = Integer.valueOf(QuantityTb.getText());
                int Price = Integer.valueOf(PriceTb.getText());

                Book newBook = null;
                
                if(Category == "Journal")
                {
                    newBook = new Journal(Title, Author, Category, ID, Price, Quantity);
                }
                else if(Category == "Leisure")
                {
                    newBook = new Leisure(Title, Author, Category, ID, Price, Quantity);
                }
                else if(Category == "Newspaper")
                {
                    newBook = new Newspaper(Title, Author, Category, ID, Price, Quantity);
                }
                else if(Category == "Noval")
                {
                    newBook = new Noval(Title, Author, Category, ID, Price, Quantity);
                }
                else if(Category == "Magazine")
                {
                    newBook = new Magazine(Title, Author, Category, ID, Price, Quantity);
                }
                
                boolean permmision = false;
                permmision = EditBook(newBook);

                if (permmision == true)
                {
                    JOptionPane.showMessageDialog(this, "Book Updated"); //Added Msg
                    DisplayBooks(); //refresh the Books Table - add the new book
                    Reset(); // resert cells after added book
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "ERROR with Book Add");
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    //Print Books List Button
    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try 
        {
            BooksTable.print(); 
        } 
        catch (Exception e) 
        {
            
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    //Logout Button
    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked

    //Users Button
    private void UsersBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersBtnMouseClicked
        new Users().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsersBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuthorTb;
    private javax.swing.JTextField BookIdTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JTextField NameTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QuantityTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel UsersBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
