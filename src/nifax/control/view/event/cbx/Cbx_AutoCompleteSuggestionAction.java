package nifax.control.view.event.cbx;

/**
 *
 * @author faka
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import nifax.control.util.UpperCaseDocument;

public class Cbx_AutoCompleteSuggestionAction extends AbstractListModel implements ComboBoxModel,
        KeyListener, ItemListener {

    ArrayList<String> db = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();
    String selection;
    JComboBox cb;
    ComboBoxEditor cbe;
    int currPos = 0;
    Object obj;

    public Cbx_AutoCompleteSuggestionAction(JComboBox jcb) {

        cb = jcb;
        cbe = jcb.getEditor();
        // here we add the key listener to the text field that the combobox is
        // wrapped around
        cbe.getEditorComponent().addKeyListener(this);

        // set up our "database" of items - in practice you will usuallu have a
        // proper db.
    }

    public void updateModel(String in) {
        data.clear();
        // lets find any items which start with the string the user typed, and
        // add it to the popup list
        // here you would usually get your items from a database, or some other
        // storage...
        db.stream().filter((s) -> (s.contains(in))).forEach((s) -> {
            data.add(s);
        });

        super.fireContentsChanged(this, 0, data.size());

        // this is a hack to get around redraw problems when changing the list
        // length of the displayed popups
        cb.hidePopup();
        cb.showPopup();
        if (!data.isEmpty()) {
            cb.setSelectedIndex(0);
        }
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Object getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        getSuggestedWords(e); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public boolean getSuggestedWords(KeyEvent e) {
        String str = cbe.getItem().toString().toUpperCase();
        JTextField jtf = (JTextField) cb.getEditor().getEditorComponent();
        jtf.setDocument( new UpperCaseDocument() );
        currPos = str.length();
        if (e.getKeyChar() == KeyEvent.CHAR_UNDEFINED) {
            if (e.getKeyCode() != KeyEvent.VK_ENTER) {
                cbe.setItem(str);
                jtf.setCaretPosition(currPos);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            cb.setSelectedIndex(cb.getSelectedIndex());
            return true;
        } else {
            updateModel(cb.getEditor().getItem().toString());
            cbe.setItem(str);
            jtf.setCaretPosition(currPos);
        }
        return false;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        cbe.setItem(e.getItem().toString());
        cb.setSelectedItem(e.getItem());
    }
}


