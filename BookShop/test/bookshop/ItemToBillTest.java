/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bookshop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author liron
 */
public class ItemToBillTest {
    
    public ItemToBillTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of AddBookToBill method, of class ItemToBill.
     */
    @Test
    public void testAddBookToBill() {
        System.out.println("AddBookToBill");
        ItemToBill Item = new ItemToBill("testBook", 5 , 10);
        ItemToBill instance = new ItemToBill("instantItem", 0 , 0);
        int expResult = 50;
        int result = instance.AddBookToBill(Item);
        assertEquals("the result should be 50!" ,expResult, result);
    }
    
}
