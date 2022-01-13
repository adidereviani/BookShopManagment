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
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author liron
 */
public class Bill implements Serializable
{
    
    public int BillNum() // added the bill num in the seller account
    {
        //SQL functions //
        Connection Con = null; //DB 
        Statement St = null; //DB 
        ResultSet Rs = null; //DB
        int Id = 0;
        
        try
        {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
        St = Con.createStatement();
        Rs = St.executeQuery("select * from User1.BillTbl order by BNum DESC FETCH FIRST ROW ONLY");
        Rs.next();
        Id = Rs.getInt(1)+1;
        return Id;
        }
        
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return Id;
    }
    
}
