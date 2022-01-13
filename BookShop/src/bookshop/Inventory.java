/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;
import java.io.*;

import com.sun.jdi.connect.spi.Connection;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
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
public class Inventory implements Serializable
{
      
    public void AddToInventory(PreparedStatement add, Book newBook) //AddBook
    {
        try
        {
            int row = add.executeUpdate();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void UpdateTheInventory(Book newBook, String Query, Statement Delete) //Update Book
    {     
        try
        {
            Delete.executeUpdate(Query);
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
        
}
