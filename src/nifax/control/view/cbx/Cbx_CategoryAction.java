package nifax.control.view.cbx;

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
        List ls = HQLOperation.getInstance().SelectLike("Category", "Description", cbe.getItem().toString());
        ls.stream().forEach((l) -> {
            db.add((String) l);
        });
        getSuggestedWords(e);
    }
}
