package edu.tw.tools;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* yardTotal Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 17, 2016</pre> 
* @version 1.0 
*/ 
public class yardTotalTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount01() throws Exception {
    //TODO: Test goes here...
        assertEquals(2, new yardTotal().getYardCount(7));
    }


    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount02() throws Exception {
    //TODO: Test goes here...
        assertEquals(2, new yardTotal().getYardCount(14));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount03() throws Exception {
        //TODO: Test goes here...
        assertEquals(4, new yardTotal().getYardCount(22));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount04() throws Exception {
        //TODO: Test goes here...
        assertEquals(0, new yardTotal().getYardCount(3));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount05() throws Exception {
        //TODO: Test goes here...
        assertEquals(2, new yardTotal().getYardCount(15));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount06() throws Exception {
        //TODO: Test goes here...
        assertEquals(2, new yardTotal().getYardCount(12));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount07() throws Exception {
        //TODO: Test goes here...
        assertEquals(3, new yardTotal().getYardCount(19));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount08() throws Exception {
        //TODO: Test goes here...
        assertEquals(3, new yardTotal().getYardCount(16));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount09() throws Exception {
        //TODO: Test goes here...
        assertEquals(1, new yardTotal().getYardCount(5));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount10() throws Exception {
        //TODO: Test goes here...
        assertEquals(2, new yardTotal().getYardCount(11));
    }

    /**
     * Method: getYardCount(int M)
     */
    @Test
    public void testGetYardCount11() throws Exception {
        //TODO: Test goes here...
        assertEquals(0, new yardTotal().getYardCount(0));
    }


}





