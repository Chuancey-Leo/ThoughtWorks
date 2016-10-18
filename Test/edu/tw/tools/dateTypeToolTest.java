package edu.tw.tools;

import static org.junit.Assert.*;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* dateTypeTool Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 17, 2016</pre> 
* @version 1.0 
*/ 
public class dateTypeToolTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getDateType(String week) 
* 
*/ 
@Test
public void testGetDateType01() throws Exception {
//TODO: Test goes here...
    assertEquals("weekday", new dateTypeTool().getDateType("1"));
}

    @Test
    public void testGetDateType02() throws Exception {
        //TODO: Test goes here...
        assertEquals("weekday", new dateTypeTool().getDateType("2"));
    }

    @Test
    public void testGetDateType03() throws Exception {
        //TODO: Test goes here...
        assertEquals("weekday", new dateTypeTool().getDateType("3"));
    }

    @Test
    public void testGetDateType04() throws Exception {
        //TODO: Test goes here...
        assertEquals("weekday", new dateTypeTool().getDateType("4"));
    }

    @Test
    public void testGetDateType05() throws Exception {
        //TODO: Test goes here...
        assertEquals("weekday", new dateTypeTool().getDateType("5"));
    }

    @Test
    public void testGetDateType06() throws Exception {
        //TODO: Test goes here...
        assertEquals("weekend", new dateTypeTool().getDateType("6"));
    }

    @Test
    public void testGetDateType07() throws Exception {
        //TODO: Test goes here...
        assertEquals("weekend", new dateTypeTool().getDateType("7"));
    }


} 
