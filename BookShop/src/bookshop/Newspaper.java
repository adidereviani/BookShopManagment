/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;

/**
 *
 * @author liron
 */
public class Newspaper extends Book
{
    public Newspaper(String Title, String Author, String Category, int ID, int Price, int Quantity) {
        super(Title, Author, "Newspaper", ID, Price, Quantity);
        System.out.println("new Newspaper");
    }
}
