package com.sector572.utils.appinfo.lib.tests;

import com.sector572.utils.appinfo.lib.ApplicationInformation;
import java.util.ArrayList;
import java.util.List;
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
public class TestConstructor3InitializaitonMultipleLabelsAndResultingToString
{
    private ApplicationInformation appInfo;

    public TestConstructor3InitializaitonMultipleLabelsAndResultingToString()
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
        List<String> labels = new ArrayList<>();
        labels.add("-alpha");
        labels.add("+sha.aeafgh01");

        appInfo = new ApplicationInformation("Test Program",
                                             0,
                                             1,
                                             2,
                                             labels);
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testToString()
    {
        assertEquals("Test Program v0.1.2-alpha+sha.aeafgh01",
                     appInfo.toString());
    }
}
