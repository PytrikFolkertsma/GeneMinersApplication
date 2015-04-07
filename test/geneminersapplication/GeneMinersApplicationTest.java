/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geneminersapplication;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author pfolkertsma & ngnodde
 */
public class GeneMinersApplicationTest {
    /**
     *
     */
    public GeneMinersApplicationTest() {
    }
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    /**
     *
     */
    @Before
    public void setUp() {
    }
    /**
     *
     */
    @After
    public void tearDown() {
    }
    /**
     * Test of loginUser method, of class GeneMinersApplication.
     */
    @Test
    public final void testLoginUser() {
        System.out.println("loginUser");
        GeneMinersApplication instance = new GeneMinersApplication();
        // Test if the user exists.
        boolean expResult = true;
        boolean result = instance.loginUser("Zaphod", "president");
        assertEquals(expResult, result);
        // Test if the user does not exists or if the password is not correct.
        expResult = false;
        result = instance.loginUser("Henk", "123");
        assertEquals(expResult, result);
    }
    /**
     * Test of searchGene method, of class GeneMinersApplication.
     */
    @Test
    public final void testSearchGene() {
        System.out.println("searchGene");
        GeneMinersApplication instance = new GeneMinersApplication();
        // Test if the gene is found.
        String expResult = "Gene found.";
        String result = instance.searchGene("APC");
        assertEquals(expResult, result);
        // Test if the gene is not found.
    }
    /**
     * Test of loadExpressionDataset method, of class GeneMinersApplication.
     */
    @Test
    public final void testLoadExpressionDataset() {
        System.out.println("loadExpressionDataset");
        GeneMinersApplication instance = new GeneMinersApplication();
        // Test if the experiment gets created.
        boolean expResult = true;
        boolean result = instance.loadExpressionDataset("dataset");
        assertEquals(expResult, result);
        // Test if the experiment gets not created.
        expResult = false;
        result = instance.loadExpressionDataset("failDataset");
        assertEquals(expResult, result);
    }
    /**
     * Test of createPlot method, of class GeneMinersApplication.
     */
    @Test
    public final void testCreatePlot() {
        System.out.println("createPlot");
        GeneMinersApplication instance = new GeneMinersApplication();
        ArrayList<String> genes = new ArrayList<>();
        genes.add("BRCA2");
        genes.add("APC");
        genes.add("BDNF");
        // Test if the plot gets created.
        boolean expResult = true;
        boolean result = instance.createPlot(genes);
        assertEquals(expResult, result);
        // Test if the plot gets not created.
        expResult = false;
        result = instance.createPlot(null);
        assertEquals(expResult, result);
    }
    /**
     * Test of createCluster method, of class GeneMinersApplication.
     */
    @Test
    public final void testCreateCluster() {
        System.out.println("createCluster");
        GeneMinersApplication instance = new GeneMinersApplication();
        ArrayList<String> genes = new ArrayList<>();
        genes.add("BRCA2");
        genes.add("APC");
        genes.add("BDNF");
        // Test if the cluster gets created.
        boolean expResult = true;
        boolean result = instance.createCluster(genes);
        assertEquals(expResult, result);
        // Test if the cluster gets not created.
        expResult = false;
        result = instance.createCluster(null);
        assertEquals(expResult, result);
    }
}
