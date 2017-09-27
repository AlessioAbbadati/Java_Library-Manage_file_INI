import Manage_File_INI.Section;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abbadaati Alessio & Dinaro Salvatore
 */
public class TestSection {
    
    public TestSection() {
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
    public void testAddRemoveParam(){
        Section s=new Section("Section1");
        s.addParam("Param1", "25");
        assertEquals("25", s.getParam("Param1"));
        s.removeParam("Param1");
        assertEquals(null, s.getParam("Param1"));
    }
    
}
