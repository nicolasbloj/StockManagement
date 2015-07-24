/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.controller;

/**
 *
 * @author NB
 */
public class TicketController {

    private double iva21 = 0;
    private double iva105 = 0;
    private double subtotal = 0;
    private double total = 0;

    public void reCalculateSubTotal(double amount) {
        subtotal = subtotal + amount;
    }

    public void reCalculateTotal(double amountWithIva) {
        total = total + amountWithIva;
    }

    public void reCalculateIva(double iva, double ivaPercentage) {
        if (ivaPercentage == 21) {
            iva21 = iva21 + iva;
        } else if (ivaPercentage == 10.5) {
            iva105 = iva105 + iva;
        }
    }

    public double getIva21() {
        return iva21;
    }

    public void setIva21(double iva21) {
        this.iva21 = iva21;
    }

    public double getIva105() {
        return iva105;
    }

    public void setIva105(double iva105) {
        this.iva105 = iva105;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
