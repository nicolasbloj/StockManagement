package nifax.control.view.event.pnl;

import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorEvent;
import nifax.control.data.MapDb;
import nifax.control.model.Iva;
import nifax.control.model.Measure;
import nifax.control.model.Store;
import nifax.control.view.panel.PanelProductsAdmin;

/**
 *
 * @author NB
 */
public class Pnl_panelProductsAdminListener extends Pnl_Listener {

    private final PanelProductsAdmin panelProductsAdmin;

    public Pnl_panelProductsAdminListener(PanelProductsAdmin panelProductsAdmin) {
        this.panelProductsAdmin = panelProductsAdmin;
    }

    @Override
    public void ancestorAdded(AncestorEvent event) {

        //Cbx Measure
        Map<String, Measure> measureList = MapDb.getMeasureList();

        Object[] StringMeasureList = measureList.keySet().toArray();

        panelProductsAdmin.getCbx_measure().setModel(new DefaultComboBoxModel(StringMeasureList));
        panelProductsAdmin.getCbx_measureRestoration().setModel(new DefaultComboBoxModel(StringMeasureList));
        panelProductsAdmin.getCbx_measureStock().setModel(new DefaultComboBoxModel(StringMeasureList));
        
        //In offer panel.
        panelProductsAdmin.getCbx_measureOffer().setModel(new DefaultComboBoxModel(StringMeasureList));
        
        //Cbx iva
        Map<Double, Iva> ivaList = MapDb.getIvaList();

        Object[] StringIvaList = ivaList.keySet().toArray();

        panelProductsAdmin.getCbx_iva().setModel(new DefaultComboBoxModel(StringIvaList));
        
        //Cbx Store 
        Map<String, Store> storeList = MapDb.getStoreList();

        Object[] StringStoreList = storeList.keySet().toArray();

        panelProductsAdmin.getCbx_storeStock().setModel(new DefaultComboBoxModel(StringStoreList));
        panelProductsAdmin.getCbx_storeRestoration().setModel(new DefaultComboBoxModel(StringStoreList));
        
        
        

    }

}
