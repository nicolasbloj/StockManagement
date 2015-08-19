package nifax.control.controller;

import javax.swing.JPanel;

/**
 *
 * @author NB
 */
public interface ActionController {

    public Boolean operate(JPanel panel, String panelName, int action);
}
