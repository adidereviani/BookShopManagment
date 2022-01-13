/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author liron
 */
public class SellerUser extends User
{
    private ManageSellerAccount Seller;

    public SellerUser(ManageSellerAccount Seller, String UserName, String Password) { //constructor
        super(UserName, Password);
        this.Seller = Seller;
    }

    public ManageSellerAccount getSeller() {
        return Seller;
    }


    public String getUserName() {
        return UserName;
    }


    public String getPassword() {
        return Password;
    }
    
    
    public boolean LoginSeller(SellerUser SellerAcc) //Login As seller Account
    {
        //SQL functions //
        Connection Con = null; //DB 
        Statement St = null; //DB 
        ResultSet Rs = null; //DB 
    
            String Query = "select * from User1.UserTbl where UName='"+SellerAcc.getUserName()+"' and UPassword='"+SellerAcc.getPassword()+"'";
            String UserName = SellerAcc.getUserName();
            try 
            {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
                St = Con.createStatement();
                Rs = St.executeQuery(Query);
                if(Rs.next())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            catch (Exception e) 
            {  
            }
        return false;
    }
}


