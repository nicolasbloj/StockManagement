/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.exception;

/**
 *
 * @author faka
 */
public class InitializeSessionException extends Exception {
    public InitializeSessionException(){
        super("No se pudo crear una nueva sesión");
    }
}