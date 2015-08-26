/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.validate;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author faka
 */
public class MyAlphaNumericFilter extends MyStringFilter{
    
    @Override
    public void replace(DocumentFilter.FilterBypass fb, int i, int i1, String string, AttributeSet as) throws BadLocationException {
        boolean a = true;
        for (int n = string.length(); n > 0; n--) {//an inserted string may be more than a single character i.e a copy and paste of 'aaa123d', also we iterate from the back as super.XX implementation will put last insterted string first and so on thus 'aa123d' would be 'daa', but because we iterate from the back its 'aad' like we want                
            char c = string.charAt(n - 1);//get a single character of the string
            if (Character.isAlphabetic(c) || Character.isDigit(c) || c == ' ') {//if its an alphabetic character or white space
                if(string.length()==1)
                    super.replace(fb, i, i1, String.valueOf(c).toUpperCase(), as);//allow update to take place for the given character
            } else {
                Toolkit.getDefaultToolkit().beep();
                a = false;
            }
        }        
        if(a && string.length()>1){
            super.replace(fb, i, i1, string.toUpperCase(), as);
        }
    }
}
    
