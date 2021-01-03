package sajal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;
    /**
     * Rigorous Test :-)
     */
    // @Test
    // public void shouldAnswerWithTrue()
    // {
    //     assertTrue( true );
    // }

    @Before
    public void setUp(){
         app = new App();
    }

    @Test
    public void testEmptyString(){
        assertEquals(0,app.Add(""));
    }

    @Test 
    public void testOne(){
        assertEquals(5, app.Add("5"));
    }

    @Test 
    public void testTwo(){
        assertEquals(5, app.Add("2,3"));
    }
}
