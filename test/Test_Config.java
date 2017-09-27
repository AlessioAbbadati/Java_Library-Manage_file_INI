/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Manage_File_INI.Config;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author 70657788
 */
public class Test_Config {
    
    public Test_Config() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAddSection(){
        Config c=new Config();
        c.addSection("Section1");
        assertEquals(true,c.ExistSection("Section1"));
        c.addSection("Section2");
        assertEquals(true,c.ExistSection("Section2"));
    }
    
    @Test
    public void testRemoveSection(){
        Config c=new Config();
        c.addSection("Section1");
        assertEquals(true,c.ExistSection("Section1"));
        c.removeSection("Section1");
        assertEquals(false,c.ExistSection("Section1"));
    }
    @Test
    public void testAddParam(){
        Config c=new Config();
        c.addSection("Section1");
        assertEquals(true,c.ExistSection("Section1"));
        c.addParam("Section1", "Param1", "25");
        assertEquals("25",c.getParam("Section1", "Param1"));
    }
}
