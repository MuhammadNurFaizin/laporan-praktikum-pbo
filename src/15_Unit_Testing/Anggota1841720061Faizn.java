package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Faizin 
 */
public class Anggota1841720061Faizin extends TestCase {

    Anggota1841720061Faizin instance;

    public Anggota1841720061Faizin() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720061Faizin("faizin", "Jl. Abdillah", "085877990684");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchFaizin method, of class Anggota1841720061Faizin.
     */
    @Test
    public void testSearchFaizin() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Anggota1841720061Faizin> expResult = instance.getByNamaAndAlamatAndTeleponFaizin(instance.getNamaFaizin(), instance.getAlamatFaizin(), instance.getTeleponFaizin());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveFaizin method, of class Anggota1841720061Faizin.
     */
    @Test
    public void testSaveFaizin() {
        System.out.println("search test");
        String keyword = "I Zoel";
        ArrayList<Anggota1841720061Faizin> result = instance.searchFaizin(keyword);
        ArrayList<Anggota1841720061Faizin> expResult = instance.getByNamaAndAlamatAndTeleponFaizin(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}
