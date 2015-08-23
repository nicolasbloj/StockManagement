package nifax.control.view.event.cbx;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JComboBox;
import nifax.control.model.modeler.HQLOperation;

/**
 *
 * @author faka
 */
public class Cbx_CategoryAction extends Cbx_AutoCompleteSuggestionAction{

    public Cbx_CategoryAction(JComboBox jcb) {
        super(jcb);
    }
        
        
    @Override
    public void keyReleased(KeyEvent e) {
        db.clear();
        List ls = HQLOperation.getInstance().SelectLike("Category", "description", cbe.getItem().toString().toUpperCase());
        ls.stream().forEach((l) -> {
            db.add((String) l);
        });  
        boolean ret = getSuggestedWords(e); 
        if (ret)
            cb.transferFocus();
    }
}
