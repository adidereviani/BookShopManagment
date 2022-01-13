/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author liron
 */
public class AdminUser extends User
{
    //private int permmision;

    public AdminUser(String UserName, String Password) { //constructor
        super(UserName, Password);
    }

    
    public boolean LoginAdmin(AdminUser AdminAcc) //Login As Admin Account
    {
        if(AdminAcc.getUserName().equals("Admin") && AdminAcc.getPassword().equals("Password")) //Admin accoount
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    

    public static boolean addNewSellerAcc(SellerUser Seller) // Add Seller
    {
        Connection Con = null; //DB 

        try
        {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
            PreparedStatement add = Con.prepareStatement("insert into UserTbl values(?,?,?,?,?)");
            add.setInt(1, Seller.getSeller().getID()); // add ID
            add.setString(2, Seller.getUserName()); // add Name
            add.setString(3, Seller.getSeller().getPhone()); // add Phone
            add.setString(4, Seller.getSeller().getAddress()); // add Address
            add.setString(5, Seller.getPassword()); // add Password
            int row = add.executeUpdate();  
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        return true;

    }


    public static boolean DeleteSellerAcc(SellerUser Seller)
    {
        Connection Con = null; //DB 
        
        try
        {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
                int UId = Seller.getSeller().getID();
                String Query = "Delete from User1.UserTbl where UID="+String.valueOf(UId);//update DB
                Statement Delete = Con.createStatement();
                Delete.executeUpdate(Query);//update DB
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return true;
    }


 
            
    public static boolean EditSellerAcc(SellerUser Seller)
    {
        Connection Con = null; //DB 
        
        try
        {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
        String UId = String.valueOf(Seller.getSeller().getID());
        String Query = "Update User1.UserTbl set UName='"+Seller.getUserName()+"',UPhone='"+Seller.getSeller().getPhone()+"',UAddress='"+Seller.getSeller().getAddress()+"',UPassword='"+Seller.getPassword()+"' where UID="+UId; //update DB
        Statement Delete = Con.createStatement();
        Delete.executeUpdate(Query);//update DB
        }
        catch (Exception e) 
        {
                e.printStackTrace();
        }
        return true;
    }
    
    
    public static boolean AddBook(Book newBook)
    {
        Connection Con = null; //DB 
        try
        {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
            PreparedStatement add = Con.prepareStatement("insert into BookTbl values(?,?,?,?,?,?)");
            add.setInt(1, newBook.getID()); // add ID
            add.setString(2, newBook.getTitle()); // add Title
            add.setString(3, newBook.getAuthor()); // add Author
            add.setString(4, newBook.getCategory()); // add Category//
            add.setInt(5, newBook.getQuantity()); // add Quantity
            add.setInt(6, newBook.getPrice()); // add Price
            
        
            Inventory newInventory = new Inventory();
            newInventory.AddToInventory(add , newBook);  //***FIX ARRAY**          
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return true;
    }
    
    public static boolean DeleteBook(Book newBook)
    {
        Connection Con = null; //DB 
        try
        {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
            String BId = String.valueOf(newBook.getID());
            String Query = "Delete from User1.BookTbl where BID="+BId;//update DB
            Statement Delete = Con.createStatement();//update DB
            
            Inventory newInventory = new Inventory();
            newInventory.UpdateTheInventory(newBook, Query, Delete); 
        }
        catch (Exception e) 
        {
                e.printStackTrace();
        }
        return true;
    }
    
    public static boolean EditBook(Book newBook)
    {
        Connection Con = null; //DB 
        try
        {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
            String BId = String.valueOf(newBook.getID());
            String Query = "Update User1.BookTbl set Title='"+newBook.getTitle()+"',Author='"+newBook.getAuthor()+"',Category='"+newBook.getCategory()+"',Quantity="+newBook.getQuantity()+",Price="+newBook.getPrice()+" where BID="+BId;//update DB
            
            Statement Delete = Con.createStatement();//update DB
            
            Inventory newInventory = new Inventory();
            newInventory.UpdateTheInventory(newBook, Query, Delete); 
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return true;
    }
    
}
