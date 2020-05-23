/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thisPc
 */
public class ContainerTest {
    private Container instance;
    
    @Before
    public void setUp() {
        instance = new Container();
    }

    @Test
    public void testContains() {
        int expResult = 0;
        int result = instance.contains();
        assertEquals(expResult, result);
    }
    
    @Test
    public void addNegativeAmount() {
        instance.add(-50);
        int expResult = 0;
        int result = instance.contains();
        assertEquals(expResult, result);
    }

   
}
