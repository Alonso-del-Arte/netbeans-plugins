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

/**
 *
 * @author Alonso del Arte
 */
public class MatchInventor {
    
    private final Pattern pattern;
    
    // TODO: Write Javadoc once I get this working correctly
    // The idea is that this will try to come up with an example 
    // <code>String</code> that matches the regular expression.
    String getExample() {
        return "Sorry, not implemented yet";
    }
    
    MatchInventor(Pattern patt) {
        this.pattern = patt;
    }
    
}
