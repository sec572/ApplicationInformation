package com.sector572.utils.appinfo.lib.tests;

import com.sector572.utils.appinfo.lib.ApplicationInformation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddie
 */
public class TestConstructor2InitializaitonAndResultingToString
{
    private ApplicationInformation appInfo;

    public TestConstructor2InitializaitonAndResultingToString()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
        appInfo = new ApplicationInformation("Test Program",
                                             "This is a test program.",
                                             0,
                                             1,
                                             2);
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testToString()
    {
        assertEquals("Test Program v0.1.2",
                     appInfo.toString());
    }
    
    @Test
    public void testDescription()
    {
        assertEquals("This is a test program.",
                     appInfo.getDescription());
    }
}