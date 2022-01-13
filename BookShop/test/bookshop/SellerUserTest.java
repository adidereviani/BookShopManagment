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
public class SellerUserTest {
    
    public SellerUserTest() {
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
     * Test of LoginSeller method, of class SellerUser.
     */
    @Test
    public void testLoginSeller() {
        System.out.println("LoginSeller");
        ManageSellerAccount sellerManage = new ManageSellerAccount(0,  "0",  "0");
        SellerUser SellerAcc = new SellerUser(sellerManage, "Adi", "1234");
        SellerUser instance = new SellerUser(sellerManage, "Adi", "1234");
        boolean expResult = true;
        boolean result = instance.LoginSeller(SellerAcc);
        assertEquals("the result should be true!" ,expResult, result);
        
        //wrong pass
        SellerUser SellerAcc2 = new SellerUser(sellerManage, "Adi", "12345");
        boolean expResult2 = false;
        boolean result2 = instance.LoginSeller(SellerAcc2);
        assertEquals("the result should be false!" ,expResult2, result2);
    }
    
}
