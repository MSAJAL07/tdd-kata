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


    @Test 
    public void testMultiple(){
        assertEquals(10, app.Add("1,2,3,4"));
    }

    @Test 
    public void testNewLine(){
        assertEquals(10, app.Add("1\n2,3\n4"));
    }

    @Test 
    public void testDifferentDlimiters(){
        assertEquals(3, app.Add("//;\n1;2"));
    }


    @Test 
    public void testNegativeNumberOne(){
        try{
            app.Add("//;\n-1;2");
        }catch(Exception exception){
            assertEquals("Negatives not allowed: -1", exception.getMessage());
        }
    }



    @Test 
    public void testNegativeNumberMultiple(){
        try{
            app.Add("//;\n-1;2;-3");
        }catch(Exception exception){
            assertEquals("Negatives not allowed: -1 -3", exception.getMessage());
        }
    }

    @Test 
    public void testBiggerThan1000(){
        assertEquals(2, app.Add("//;\n1001;2"));
    }

    @Test 
    public void testDelimitersAnyLength(){
        assertEquals(6, app.Add("//[***]\n1***2***3"));
    }
}
