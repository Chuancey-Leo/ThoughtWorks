package edu.tw.tools;

import static org.junit.Assert.*;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* DateTool Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 17, 2016</pre> 
* @version 1.0 
*/ 
public class DateToolTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getWeekDay(String sDate) 
* 
*/ 
@Test
public void testGetWeekDay01() throws Exception {
//TODO: Test goes here...
    assertEquals("4", new DateTool().getWeekDay("2016-06-02"));
    System.out.println("pass");
}

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay02() throws Exception {
        //TODO: Test goes here...
        assertEquals("5", new DateTool().getWeekDay("2016-06-03"));
        System.out.println("pass");
    }

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay03() throws Exception {
        //TODO: Test goes here...
        assertEquals("6", new DateTool().getWeekDay("2016-06-04"));
        System.out.println("pass");
    }

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay04() throws Exception {
        //TODO: Test goes here...
        assertEquals("7", new DateTool().getWeekDay("2016-06-05"));
        System.out.println("pass");
    }

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay05() throws Exception {
        //TODO: Test goes here...
        assertEquals("1", new DateTool().getWeekDay("2016-06-06"));
        System.out.println("pass");
    }

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay06() throws Exception {
        //TODO: Test goes here...
        assertEquals("2", new DateTool().getWeekDay("2016-06-07"));
        System.out.println("pass");
    }

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay07() throws Exception {
        //TODO: Test goes here...
        assertEquals("3", new DateTool().getWeekDay("2016-06-08"));
        System.out.println("pass");
    }

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay08() throws Exception {
        //TODO: Test goes here...
        assertEquals("4", new DateTool().getWeekDay("2016-06-09"));
        System.out.println("pass");
    }

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay09() throws Exception {
        //TODO: Test goes here...
        assertEquals("5", new DateTool().getWeekDay("2016-06-10"));
        System.out.println("pass");
    }

    /**
     *
     * Method: getWeekDay(String sDate)
     *
     */
    @Test
    public void testGetWeekDay10() throws Exception {
        //TODO: Test goes here...
        assertEquals("6", new DateTool().getWeekDay("2016-06-11"));
        System.out.println("pass");
    }


} 
