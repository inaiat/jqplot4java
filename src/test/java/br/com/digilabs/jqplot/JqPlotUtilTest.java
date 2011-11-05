/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

import junit.framework.TestCase;

/**
 *
 * @author inaiat
 */
public class JqPlotUtilTest extends TestCase {
    
    public JqPlotUtilTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of createJquery method, of class JqPlotUtil.
     */
    public void testCreateJquery() {
        System.out.println("createJquery");
        JqPlot jqPlot = null;
        String divId = "";
        String expResult = "";
        String result = JqPlotUtil.createJquery(jqPlot, divId,"teste");
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
