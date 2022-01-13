/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;

import java.io.*;

/**
 *
 * @author liron
 */
public class Customer implements Serializable
{
    private String Name;

    public Customer(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
    

    
}
