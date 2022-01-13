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
public class AdminUserTest {
    
    public AdminUserTest() {
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
     * Test of LoginAdmin method, of class AdminUser.
     */
    @Test
    public void testLoginAdmin() {
        System.out.println("LoginAdmin");
        AdminUser AdminAcc = new AdminUser("Admin", "Password");
        AdminUser instance = new AdminUser("Admin", "Password");
        boolean expResult = true;
        boolean result = instance.LoginAdmin(AdminAcc);
        System.out.println(result);
        System.out.println(expResult);
        /*if(result != expResult)
        {
            fail("The results are not equal.");
        }*/
        
        //check True
        assertEquals("the result should be true!" ,expResult, result);
        assertTrue("the result should be true!", result);
        
        //check False
        AdminUser AdminAcc2 = new AdminUser("Admin", "1234");
        boolean expResult2 = false;
        boolean result2 = instance.LoginAdmin(AdminAcc2);
        assertEquals("the result should be false!" ,expResult, result);
        assertFalse("the result should be false!", result2);
    }

    /**
     * Test of addNewSellerAcc method, of class AdminUser.
     */
    @Test
    public void testAddNewSellerAcc() {
        System.out.println("addNewSellerAcc");
        ManageSellerAccount sellerManage = new ManageSellerAccount(0,  "0",  "0");
        SellerUser Seller = new SellerUser(sellerManage, "Bar", "1234");
        AdminUser instance = new AdminUser("Admin", "Password");
        boolean expResult = true;
        boolean result = instance.addNewSellerAcc(Seller);
        assertEquals("the result should be true!", expResult, result);

    }

    /**
     * Test of DeleteSellerAcc method, of class AdminUser.
     */
    @Test
    public void testDeleteSellerAcc() {
        System.out.println("DeleteSellerAcc");
        ManageSellerAccount sellerManage = new ManageSellerAccount(0,  "0",  "0");
        SellerUser Seller = new SellerUser(sellerManage, "Bar", "1234");
        AdminUser instance = new AdminUser("Admin", "Password");
        boolean expResult = true;
        boolean result = instance.DeleteSellerAcc(Seller);
        assertEquals("the result should be true!", expResult, result);
    }

    /**
     * Test of EditSellerAcc method, of class AdminUser.
     */
    @Test
    public void testEditSellerAcc() {
        System.out.println("EditSellerAcc");
        ManageSellerAccount sellerManage = new ManageSellerAccount(0,  "0",  "0");
        SellerUser Seller = new SellerUser(sellerManage, "Bar", "1234");
        AdminUser instance = new AdminUser("Admin", "Password");
        boolean expResult = true;
        boolean result = instance.EditSellerAcc(Seller);
        assertEquals("the result should be true!", expResult, result);
    }

    /**
     * Test of AddBook method, of class AdminUser.
     */
    @Test
    public void testAddBook() {
        System.out.println("AddBook");
        Book newBook = new Book("testBook", "testing", "Journal", 18, 12, 100);
        AdminUser instance = new AdminUser("Admin", "Password");
        boolean expResult = true;
        boolean result = instance.AddBook(newBook);
        assertEquals("the result should be true!",expResult, result);
    }

    /**
     * Test of DeleteBook method, of class AdminUser.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("DeleteBook");
        Book newBook = new Book("testBook2", "testing2", "Journal", 19, 12, 100);
        AdminUser instance = new AdminUser("Admin", "Password");
        boolean expResult = true;
        boolean result = instance.DeleteBook(newBook);
        assertEquals("the result should be true!",expResult, result);
        
    }

    /**
     * Test of EditBook method, of class AdminUser.
     */
    @Test
    public void testEditBook() {
        System.out.println("EditBook");
        Book newBook = new Book("testBook2", "testing3", "Journal", 19, 12, 100);
        AdminUser instance = new AdminUser("Admin", "Password");
        boolean expResult = true;
        boolean result = instance.EditBook(newBook);
        assertEquals("the result should be true!",expResult, result);
    }
    
}
