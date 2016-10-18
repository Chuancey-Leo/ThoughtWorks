package edu.tw.tools;

import static org.junit.Assert.*;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* unitPriceTool Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 17, 2016</pre> 
* @version 1.0 
*/ 
public class unitPriceToolTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

    /**
    *
    * Method: getTimePrice(String dateType, String time)
    *
    */
    @Test
    public void testGetTimePrice01() throws Exception {
    //TODO: Test goes here...
        assertEquals(120, new unitPriceTool().getTimePrice("weekday", "20:00~22:00"));
    }

    @Test
    public void testGetTimePrice02() throws Exception {
        //TODO: Test goes here...
        assertEquals(120, new unitPriceTool().getTimePrice("weekend", "09:00~12:00"));
    }

    @Test
    public void testGetTimePrice03() throws Exception {
        //TODO: Test goes here...
        assertEquals(150, new unitPriceTool().getTimePrice("weekend", "14:00~17:00"));
    }

    @Test
    public void testGetTimePrice04() throws Exception {
        //TODO: Test goes here...
        assertEquals(200, new unitPriceTool().getTimePrice("weekday", "19:00~22:00"));
    }

    @Test
    public void testGetTimePrice05() throws Exception {
        //TODO: Test goes here...
        assertEquals(150, new unitPriceTool().getTimePrice("weekday", "12:00~15:00"));
    }

    @Test
    public void testGetTimePrice06() throws Exception {
        //TODO: Test goes here...
        assertEquals(100, new unitPriceTool().getTimePrice("weekday", "15:00~17:00"));
    }

    @Test
    public void testGetTimePrice07() throws Exception {
        //TODO: Test goes here...
        assertEquals(110, new unitPriceTool().getTimePrice("weekday", "10:00~13:00"));
    }

    @Test
    public void testGetTimePrice08() throws Exception {
        //TODO: Test goes here...
        assertEquals(100, new unitPriceTool().getTimePrice("weekday", "16:00~18:00"));
    }

    @Test
    public void testGetTimePrice09() throws Exception {
        //TODO: Test goes here...
        assertEquals(120, new unitPriceTool().getTimePrice("weekday", "20:00~22:00"));
    }

    @Test
    public void testGetTimePrice10() throws Exception {
        //TODO: Test goes here...
        assertEquals(100, new unitPriceTool().getTimePrice("weekend", "13:00~15:00"));
    }


} 
