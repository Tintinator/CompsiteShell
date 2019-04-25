package compositeApp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OriginalCompositeAppTest {
    final String Correct = "test/Correct/";
    
    public OriginalCompositeAppTest() {
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
     * Test of main method, of class OriginalCompositeApp.
     */
    @Test
    public void originalTest() {
        RegTest.Utility.redirectStdOut("out.txt");
        String[] args = null;
        OriginalCompositeApp.main(args);
        RegTest.Utility.validate("out.txt", Correct+"orig.txt", false);
    }
    
    @Test
        public void frameworkPTest() {
        RegTest.Utility.redirectStdOut("out.txt");
        String[] args = null;
        PluginCompositeApp.main(args);
        RegTest.Utility.validate("out.txt", Correct+"orig.txt", false);
    }
        
    @Test
        public void frameworkDPTest() {
        RegTest.Utility.redirectStdOut("out.txt");
        String[] args = {"hi"};
        PluginCompositeApp.main(args);
        RegTest.Utility.validate("out.txt", Correct+"FrameDP.txt", false);
    }
    
}
