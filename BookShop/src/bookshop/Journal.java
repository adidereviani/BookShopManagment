/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;

/**
 *
 * @author liron
 */
public class Journal extends Book
{

    public Journal(String Title, String Author, String Category, int ID, int Price, int Quantity) {
        super(Title, Author, "Journal", ID, Price, Quantity);
        System.out.println("new Journal");
    }

}
