package com.sector572.utils.appinfo.lib;

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
public class ApplicationInformationTest
{
    private ApplicationInformation basicAppInfo;
    private ApplicationInformation appInfoWithDesc;
    private ApplicationInformation appInfoWithLabel;
    private ApplicationInformation appInfoWithMultiLabel;
    private ApplicationInformation appInfoWithDescAndLabel;
    private ApplicationInformation appInfoWithDescAndMultiLabel;

    public ApplicationInformationTest()
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
        basicAppInfo = new ApplicationInformation(
                "Test Program",
                0,
                1,
                2);

        appInfoWithDesc = new ApplicationInformation(
                "Test Program",
                "This is a test program.",
                0,
                1,
                2);

        List<String> labels = new ArrayList<>();
        labels.add("-alpha");

        appInfoWithLabel = new ApplicationInformation(
                "Test Program",
                0,
                1,
                2,
                labels);

        List<String> multiLabels = new ArrayList<>();
        multiLabels.add("-alpha");
        multiLabels.add("+sha.aeafgh01");

        appInfoWithMultiLabel = new ApplicationInformation(
                "Test Program",
                0,
                1,
                2,
                multiLabels);

        List<String> descLabels = new ArrayList<>();
        descLabels.add("-alpha");

        appInfoWithDescAndLabel = new ApplicationInformation(
                "Test Program",
                "This is a test program.",
                0,
                1,
                2,
                descLabels);

        List<String> descMultiLabels = new ArrayList<>();
        descMultiLabels.add("-alpha");
        descMultiLabels.add("+sha.aeafgh01");

        appInfoWithDescAndMultiLabel = new ApplicationInformation(
                "Test Program",
                "This is a test program.",
                0,
                1,
                2,
                descMultiLabels);
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testBasicVersionInformation()
    {
        String expected = "Test Program v0.1.2";
        String actual = basicAppInfo.toString();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testConstructorWithDescriptionVersionString()
    {
        String expected = "Test Program v0.1.2";
        String actual = appInfoWithDesc.toString();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testConstructorWithDescriptionDescription()
    {
        String expected = "This is a test program.";
        String actual = appInfoWithDesc.getDescription();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testConstructorWithLabel()
    {
        String expected = "Test Program v0.1.2-alpha";
        String actual = appInfoWithLabel.toString();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testConstructorWithMultiLabels()
    {
        String expected = "Test Program v0.1.2-alpha+sha.aeafgh01";
        String actual = appInfoWithMultiLabel.toString();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testConstructorWithDescriptionAndLabelVersionString()
    {
        String expected = "Test Program v0.1.2-alpha";
        String actual = appInfoWithDescAndLabel.toString();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testConstructorWithDescriptionAndLabelDescription()
    {
        String expected = "This is a test program.";
        String actual = appInfoWithDescAndLabel.getDescription();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testConstructorWithDescriptionAndMultiLabelVersionString()
    {
        String expected = "Test Program v0.1.2-alpha+sha.aeafgh01";
        String actual = appInfoWithDescAndMultiLabel.toString();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testConstructorWithDescriptionAndMultiLabelDescription()
    {
        String expected = "This is a test program.";
        String actual = appInfoWithDescAndMultiLabel.getDescription();

        assertEquals(expected,
                     actual);
    }

    @Test
    public void testAddLabel()
    {
        List<String> expected = new ArrayList<>();
        expected.add("TestLabel");

        ApplicationInformation appInfo = new ApplicationInformation(
                "Label Test",
                1,
                0,
                0);
        
        appInfo.addLabel("TestLabel");
        
        assertEquals(expected,
                     appInfo.getLabels());
    }

    @Test
    public void testAddLabelVersionString()
    {
        String expected = "Label Test v1.0.0-TestLabel";

        ApplicationInformation appInfo = new ApplicationInformation(
                "Label Test",
                1,
                0,
                0);
        
        appInfo.addLabel("-TestLabel");
        
        assertEquals(expected,
                     appInfo.toString());
    }
}
