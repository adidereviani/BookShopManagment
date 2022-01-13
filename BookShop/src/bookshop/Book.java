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
public class Book extends Product
{
    protected String Title;
    protected String Author;
    private String Category;
    //protected String Category;

    public Book(String Title, String Author, String Category, int ID, int Price, int Quantity) {
        super(ID, Price, Quantity);
        this.Title = Title;
        this.Author = Author;
        this.Category = Category;
        //this.Category = Category;
    }


    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

   public String getCategory() {
        return Category;
    }

}
