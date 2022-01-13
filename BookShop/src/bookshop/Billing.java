
package bookshop;

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
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        CountRow();
        BillNumTb.setEditable(false);
        
    }
    
    //get the seller name from Login
    public Billing (String SellerName)
    {
        initComponents();
        UnameLbl.setText(SellerName);
        DisplayBooks();
        BookNameTb.setEditable(false); //cant changr the title cell
        PriceTb.setEditable(false); //cant changr the price cell
        CountRow();
        BillNumTb.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UnameLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BookNameTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        QtyTb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        AddToBillBtn = new javax.swing.JButton();
        ClientNameTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        GrdTotalLbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BillNumTb = new javax.swing.JTextField();

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
                .addGap(325, 325, 325)
                .addComponent(jLabel2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2)
        );

        UnameLbl.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        UnameLbl.setForeground(new java.awt.Color(102, 51, 255));
        UnameLbl.setText("Users");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/user.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 255));
        jLabel9.setText("Price");

        BookNameTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BookNameTb.setForeground(new java.awt.Color(0, 153, 153));
        BookNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameTbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 255));
        jLabel8.setText("Book Title");

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 255));
        jLabel7.setText("Client Name");

        QtyTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QtyTb.setForeground(new java.awt.Color(0, 153, 153));
        QtyTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyTbActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 51, 255));
        jLabel10.setText("Quantity");

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Books List");

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

        printBtn.setBackground(new java.awt.Color(102, 51, 255));
        printBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("Print");
        printBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBtnMouseClicked(evt);
            }
        });
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        AddToBillBtn.setBackground(new java.awt.Color(102, 51, 255));
        AddToBillBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddToBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddToBillBtn.setText("Add To Bill");
        AddToBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBillBtnMouseClicked(evt);
            }
        });
        AddToBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBillBtnActionPerformed(evt);
            }
        });

        ClientNameTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ClientNameTb.setForeground(new java.awt.Color(0, 153, 153));
        ClientNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientNameTbActionPerformed(evt);
            }
        });

        PriceTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(0, 153, 153));
        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

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

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        GrdTotalLbl.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        GrdTotalLbl.setForeground(new java.awt.Color(0, 179, 179));
        GrdTotalLbl.setText("Total:");

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Books Bill");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/back.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 51, 255));
        jLabel12.setText("Bill Num");

        BillNumTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BillNumTb.setForeground(new java.awt.Color(0, 153, 153));
        BillNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillNumTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BillNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BookNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClientNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddToBillBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GrdTotalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(UnameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(QtyTb)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(BookNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BillNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ClientNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 130, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(AddToBillBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResetBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(printBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(GrdTotalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BookNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameTbActionPerformed

    private void QtyTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyTbActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printBtnActionPerformed

    private void AddToBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBillBtnActionPerformed

    private void ClientNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientNameTbActionPerformed

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed
   
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
    
    //X Button
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);// close
    }//GEN-LAST:event_jLabel2MouseClicked

    
    int Stock = 0;
    //Show selected raw info on cells
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        BookNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        Stock = Integer.valueOf(model.getValueAt(MyIndex, 4).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked

    //save the bill in DB
    private void SaveBill()
    {
        if(BillNumTb.getText().isEmpty() || ClientNameTb.getText().isEmpty())//Check if the fields are empty
        {
            JOptionPane.showMessageDialog(this, "Missing Information");//error msg
        }
        else
        {
            try 
            {
                Customer Client = new Customer(ClientNameTb.getText());
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
                PreparedStatement add = Con.prepareStatement("insert into BillTbl values(?,?,?,?)");
                add.setInt(1, Integer.valueOf(BillNumTb.getText())); // add Bill Number
                add.setString(2, UnameLbl.getText()); // add Seller Name
                add.setString(3, Client.getName()); // add Client
                add.setInt(4, Integer.valueOf(GrdTotal) ); // add Total
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Bill Saved"); //Saved Msg
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }

    // reset all
    private void Reset()
    {
        BookNameTb.setText("");
        PriceTb.setText("");
        QtyTb.setText("");
        ClientNameTb.setText("");
        BillTxt.setText(""); //reset bill
        GrdTotalLbl.setText("Total:"); // reset total price
        i=0;
        GrdTotal = 0; // reset total price var
        GrdTotalLbl.setText("");
    }
    
    int BId, n = 0;
    int StockArr[] = new int [50];
    int IdArr[] = new int [50];
    private void UpdateBook()
    {
        StockArr[n] = Stock;
        IdArr[n] = BId;
        n +=1;
        
        int newQty = Stock - Integer.valueOf(QtyTb.getText());
        try 
            {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
                
                String Query = "Update User1.BookTbl set Quantity="+newQty+" where BID="+BId;
                Statement Delete = Con.createStatement();
                Delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Book Updated"); //Added Msg
                DisplayBooks(); //refresh the Books Table - add the new book
                
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
    }
    
    int i = 0 , Total =0, GrdTotal = 0;// i = the index of the added book, Total = total price for each book
    //Add To Biil Button
    private void AddToBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBillBtnMouseClicked
        if(QtyTb.getText().isEmpty() || BookNameTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(Integer.valueOf(QtyTb.getText())> Stock)
        {
            JOptionPane.showMessageDialog(this,"No Enough Books In Stock");
        }
        else
        {
            String Title = BookNameTb.getText();
            int Price = Integer.valueOf(PriceTb.getText());
            int Quantity = Integer.valueOf(QtyTb.getText());
            
            ItemToBill Item = new ItemToBill(Title, Quantity, Price);
            Total = Item.AddBookToBill(Item);
            
            
            i++;
            if(i==1)
            {
                BillTxt.setText(BillTxt.getText()+"    ===================== Book Shop ===================== \n"+ "Num                  Product                  Price                  Quantity                  Total\n"+i+"                     "+BookNameTb.getText()+"                "+PriceTb.getText()+"                            "+QtyTb.getText()+"                         "+Total+"\n");
            }
            else
            {
                BillTxt.setText(BillTxt.getText()+i+"                     "+BookNameTb.getText()+"                "+PriceTb.getText()+"                            "+QtyTb.getText()+"                         "+Total+"\n");
            }
            GrdTotal = GrdTotal + Total; //total for all books
            
            GrdTotalLbl.setText("Total: "+GrdTotal+"$ "); // print the total price for the bill
            UpdateBook(); //Update the book Stock
           
        }
    }//GEN-LAST:event_AddToBillBtnMouseClicked

    
    //Print Button
    private void printBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseClicked
        boolean noMissingData = false;
        try 
        {
            if(BillNumTb.getText().isEmpty() || ClientNameTb.getText().isEmpty())//Check if the fields are empty
            {
                JOptionPane.showMessageDialog(this, "Missing Information");//error msg
            }
            else
            {
                BillTxt.print();
                CountRow();
                noMissingData = true;
                n=0; 
            }
            
        } 
        catch (Exception e) {}
        if(noMissingData == true)
        {
            SaveBill();
            CountRow();
            Reset();
            
        }
    }//GEN-LAST:event_printBtnMouseClicked

    Statement St1 = null; //DB 
    ResultSet Rs1 = null; //DB 
    
    //count the Rows - Bill Num
    private void CountRow()
    {
        try 
        {
           Bill newBillNum = new Bill();
           int Id;
           Id = newBillNum.BillNum();
           BillNumTb.setText(Id+"");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    //Reset Button
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        int k; 
        try 
            {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
                for( k = n ; k >= 0 ; k--) //return the Original Stocks before add to bill
                {
                String Query = "Update User1.BookTbl set Quantity="+String.valueOf(StockArr[k])+" where BID="+String.valueOf(IdArr[k]);
                Statement Delete = Con.createStatement();
                Delete.executeUpdate(Query);
                }
                n = 0;
                JOptionPane.showMessageDialog(this, "Books Stocks Updated"); //Added Msg
                DisplayBooks(); //refresh the Books Table - add the new book
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        Reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void BillNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillNumTbActionPerformed

    //Logout Button
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBillBtn;
    private javax.swing.JTextField BillNumTb;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField BookNameTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JTextField ClientNameTb;
    private javax.swing.JLabel GrdTotalLbl;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel UnameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton printBtn;
    // End of variables declaration//GEN-END:variables
}
