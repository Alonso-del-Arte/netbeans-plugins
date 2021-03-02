/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workbench.netbeans.plugins.regex;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests of the MatchInventor class.
 * @author Alonso del Arte
 */
public class MatchInventorTest {
    
    /**
     * Test of getExample method, of class MatchInventor.
     */
    @Test
    public void testGetExample() {
        System.out.println("getExample");
        String expected = "example";
        Pattern pattern = Pattern.compile(expected);
        MatchInventor inventor = new MatchInventor(pattern);
        String actual = inventor.getExample();
        assertEquals(expected, actual);
    }
    
}
