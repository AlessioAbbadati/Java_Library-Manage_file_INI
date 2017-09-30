import Manage_File_INI.Config;
import Manage_File_INI.SectionAlreadyExistException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Abbadati Alessio & Dinaro Salvatore
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
    
    /*
    *
    *
    */
    @Test
    public void testAddSection(){
        boolean exception1=false;
        boolean exception2=false;
        boolean exception3=false;
        
        Config c=new Config();
        try {
            c.addSection("Section1");
        } catch (SectionAlreadyExistException ex) {exception1=true;}
        assertEquals(true,c.ExistSection("Section1"));
        assertFalse(exception1);
        
        try {
            c.addSection("Section1");
        } catch (SectionAlreadyExistException ex) {exception2=true;}
        assertFalse(exception2);
        
        try {
            c.addSection("Section2");
        } catch (SectionAlreadyExistException ex) {exception3=true}
        assertEquals(true,c.ExistSection("Section2"));
        assertFalse(exception3);
    }
    
    @Test
    public void testRemoveSection() throws SectionAlreadyExistException{
        Config c=new Config();
        c.addSection("Section1");
        assertEquals(true,c.ExistSection("Section1"));
        c.removeSection("Section1");
        assertEquals(false,c.ExistSection("Section1"));
    }
    @Test
    public void testAddParam() throws SectionAlreadyExistException{
        Config c=new Config();
        c.addSection("Section1");
        assertEquals(true,c.ExistSection("Section1"));
        c.addParam("Section1", "Param1", "25");
        assertEquals("25",c.getParam("Section1", "Param1"));
    }
}
