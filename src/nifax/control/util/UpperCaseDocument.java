/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author faka
 */

public class UpperCaseDocument extends PlainDocument {
    @Override
    public void insertString( int off, String string, AttributeSet attr ) {
        try {
            if( string != null )
                super.insertString( off, string.toUpperCase(), attr );
        } catch ( BadLocationException e ) {
        }
    }    
}
