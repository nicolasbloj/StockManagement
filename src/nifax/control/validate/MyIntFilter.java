/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.validate;

/**
 *
 * @author faka
 */
public class MyIntFilter extends MyNumberFilter{
    
    @Override
    public boolean test(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
        return false;
        }
    }
}
