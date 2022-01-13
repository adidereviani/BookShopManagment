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
public class ItemToBill implements Serializable
{
    private String BookTitle;
    private int ItemAmount;
    private int Price;
    private static int i = 0;

    public ItemToBill(String BookTitle, int ItemAmount, int Price) {
        this.BookTitle = BookTitle;
        this.ItemAmount = ItemAmount;
        this.Price = Price;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public int getItemAmount() {
        return ItemAmount;
    }

    public int getPrice() {
        return Price;
    }

    public int AddBookToBill(ItemToBill Item)
    {
        int Total = 0;// Total = total price for each book
        
        Total = Integer.valueOf(Item.getPrice())*Integer.valueOf(Item.getItemAmount()); //total for each book

        
        return Total;

        
    }
    
}
