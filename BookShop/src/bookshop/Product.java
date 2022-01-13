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
public abstract class Product implements Serializable
{
    protected int ID;
    protected int Price;
    protected int Quantity;

    public Product(int ID, int Price, int Quantity) {
        this.ID = ID;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public int getID() {
        return ID;
    }

    public int getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    
}
