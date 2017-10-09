package nifax.control.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import nifax.control.model.ProdRelEntity;
import nifax.control.model.Offer;
import nifax.control.model.ProductMeasure;
import nifax.control.model.Restoration;
import nifax.control.model.Stock;
import nifax.control.model.modeler.HQLOperation;
import nifax.control.util.Message;
import nifax.control.util.Table;
import nifax.control.view.panel.PanelProductsAdmin;
import nifax.control.util.Number;

/**
 *
 * @author NB
 */
public class PlusLess implements ActionController {

    private static PlusLess instance = null;

    protected PlusLess() {
    }

    public static PlusLess getInstance() {
        if (instance == null) {
            instance = new PlusLess();
        }
        return instance;
    }

    //
    public static final int PLUS = 0;
    public static final int LESS = 1;

    //Buttons name
    public static final String Measure = "plus_less_measure";
    public static final String Offer = "plus_less_offer";
    public static final String Restoration = "plus_less_restoration";
    public static final String Stock = "plus_less_stock";

    
    @Override   //Add final to Variables
    public Boolean operate(JPanel panel, final String btnName, final int action) {

        switch (action) {
            case PLUS:
                return plus(panel, btnName);
            case LESS:
                return less(panel, btnName);
        }
        return Boolean.FALSE;

    }

    private Boolean plus(JPanel panel, String componentName) {
        try {
            switch (componentName) {
                case Measure:
                    return plusMeasure((PanelProductsAdmin) panel);
                case Offer:
                    return plusOffer((PanelProductsAdmin) panel);
                case Restoration:
                    return plusRestoration((PanelProductsAdmin) panel);
                case Stock:
                    return plusStock((PanelProductsAdmin) panel);
            }
            return Boolean.TRUE;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, Message.NumberFormatException, Message.NumberFormatExceptionTitle, JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;

        }
    }

    private Boolean less(JPanel panel, String componentName) {
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                Message.DialogDelete, Message.DialogConfirmationTitle,
                JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {

                switch (componentName) {
                    case Measure:
                        return lessMeasure((PanelProductsAdmin) panel);
                    case Offer:
                        return lessOffer((PanelProductsAdmin) panel);
                    case Restoration:
                        return lessRestoration((PanelProductsAdmin) panel);
                    case Stock:
                        return lessStock((PanelProductsAdmin) panel);
                }
            }
            return Boolean.TRUE;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, Message.NumberFormatException, Message.NumberFormatExceptionTitle, JOptionPane.ERROR_MESSAGE);
            return Boolean.FALSE;

        }
    }

    private Boolean plusMeasure(PanelProductsAdmin panelProductsAdmin) {
        String measure = panelProductsAdmin.getCbx_measure().getSelectedItem().toString();
        double equivalent = Double.parseDouble(panelProductsAdmin.getTxf_equivalent().getText());
        if (!Table.InCellTable(measure, panelProductsAdmin.getTbl_rules(), "Medida")) {

            DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_rules().getModel();

            Vector vector = new Vector();
            vector.add(tableModel.getRowCount() + 1);
            vector.add("");
            vector.add(measure);
            vector.add((Number.round(equivalent)));
            vector.add(false);

            tableModel.insertRow(tableModel.getRowCount(), vector);

        } else {
            JOptionPane.showMessageDialog(null,
                Message.MeasureAlreadyLoaded, "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        return Boolean.TRUE;
    }

    private Boolean lessMeasure(PanelProductsAdmin panelProductsAdmin) {
        return this.gralLess(panelProductsAdmin.getTbl_rules(), PlusLess.Measure);
    }

    private Boolean plusOffer(PanelProductsAdmin panelProductsAdmin) {

        String description = panelProductsAdmin.getTxf_descOffer().getText();
        double discount = Double.parseDouble(panelProductsAdmin.getTxf_discount().getText());
        double quantity = Double.parseDouble(panelProductsAdmin.getTxf_quantityOffer().getText());
        String measureSelected = panelProductsAdmin.getCbx_measureOffer().getSelectedItem().toString();

        if (productHasRule(panelProductsAdmin, measureSelected)) {

            DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_offer().getModel();

            Vector vector = new Vector();
            vector.add(tableModel.getRowCount() + 1);
            vector.add("");
            vector.add(description);

            vector.add(Number.round(discount));
            vector.add(Number.round(quantity));

            vector.add(measureSelected);

            vector.add(false);

            tableModel.insertRow(tableModel.getRowCount(), vector);
        } else {
            JOptionPane.showMessageDialog(null,
                Message.ProductNotHasRule, Message.Warning, JOptionPane.WARNING_MESSAGE);
        }

        return Boolean.TRUE;
    }

    private Boolean lessOffer(PanelProductsAdmin panelProductsAdmin) {
        return this.gralLess(panelProductsAdmin.getTbl_offer(), PlusLess.Offer);
    }

    private Boolean plusRestoration(PanelProductsAdmin panelProductsAdmin) {
        double peak = Double.parseDouble(panelProductsAdmin.getTxf_peak().getText());
        double midPoint = Double.parseDouble(panelProductsAdmin.getTxf_midPoint().getText());
        double lowPoint = Double.parseDouble(panelProductsAdmin.getTxf_lowPoint().getText());

        String description = panelProductsAdmin.getTxf_descRestoration().getText();

        String measureSelected = panelProductsAdmin.getCbx_measureRestoration().getSelectedItem().toString();
        String storeSelected = panelProductsAdmin.getCbx_storeRestoration().getSelectedItem().toString();

        if (!Table.InCellTable(storeSelected, panelProductsAdmin.getTbl_restoration(), "Deposito")) {

            if (productHasRule(panelProductsAdmin, measureSelected)) {
                DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_restoration().getModel();

                Vector vector = new Vector();
                vector.add(tableModel.getRowCount() + 1);
                vector.add("");
                vector.add(description);
                vector.add(Number.round(peak));
                vector.add(Number.round(midPoint));
                vector.add(Number.round(lowPoint));
                vector.add(measureSelected);
                vector.add(storeSelected);

                vector.add(false);

                tableModel.insertRow(tableModel.getRowCount(), vector);

            } else {
                JOptionPane.showMessageDialog(null,
                    Message.ProductNotHasRule, Message.Warning, JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                Message.StoreAlreadyLoaded, Message.Warning, JOptionPane.WARNING_MESSAGE);
        }
        return Boolean.TRUE;
    }

    private Boolean lessRestoration(PanelProductsAdmin panelProductsAdmin) {
        return this.gralLess(panelProductsAdmin.getTbl_restoration(), PlusLess.Restoration);
    }

    private Boolean plusStock(PanelProductsAdmin panelProductsAdmin) {
        String description = panelProductsAdmin.getTxf_descStock().getText();
        double quantity = Double.parseDouble(panelProductsAdmin.getTxf_quantityStock().getText());
        String storeSelected = panelProductsAdmin.getCbx_storeStock().getSelectedItem().toString();
        String measureSelected = panelProductsAdmin.getCbx_measureStock().getSelectedItem().toString();

        if (!Table.InCellTable(storeSelected, panelProductsAdmin.getTbl_stock(), "Deposito")) {

            if (productHasRule(panelProductsAdmin, measureSelected)) {
                DefaultTableModel tableModel = (DefaultTableModel) panelProductsAdmin.getTbl_stock().getModel();

                Vector vector = new Vector();
                vector.add(tableModel.getRowCount() + 1);
                vector.add("");
                vector.add(description);
                vector.add(Number.round(quantity));
                vector.add(storeSelected);
                vector.add(measureSelected);

                vector.add(false);

                tableModel.insertRow(tableModel.getRowCount(), vector);

            } else {
                JOptionPane.showMessageDialog(null,
                    Message.ProductNotHasRule, Message.Warning, JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                Message.StoreAlreadyLoaded, Message.Warning, JOptionPane.WARNING_MESSAGE);
        }

        return Boolean.TRUE;
    }

    private Boolean lessStock(PanelProductsAdmin panelProductsAdmin) {
        return this.gralLess(panelProductsAdmin.getTbl_stock(), PlusLess.Stock);
    }

    private Boolean gralLess(JTable table, String Entity) {

        int indexCheck = table.getColumnModel().getColumnIndex("");
        int indexIt = table.getColumnModel().getColumnIndex("It");
        int indexCod = table.getColumnModel().getColumnIndex("Cod");

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        List<Integer> rowsToDelete = new ArrayList<Integer>();

        for (int i = 0; i < table.getRowCount(); i++) {

            if (table.getValueAt(i, indexCheck).equals(true)) {
                rowsToDelete.add((Integer) table.getValueAt(i, indexIt));
            }

        }

        rowsToDelete.stream().forEach((row) -> {

            for (int i = 0; i < table.getRowCount(); i++) {

                if (table.getValueAt(i, indexIt).equals(row)) {

                    if (table.getValueAt(i, indexCod).toString().trim().length() != 0) {

                        ProdRelEntity entity = null;
                        switch (Entity) {
                            case Offer:
                                entity = new Offer(Long.parseLong(table.getValueAt(i, indexCod).toString()));
                                break;
                            case Measure:
                                entity = new ProductMeasure(Long.parseLong(table.getValueAt(i, indexCod).toString()));
                                break;
                            case Stock:
                                entity = new Stock(Long.parseLong(table.getValueAt(i, indexCod).toString()));
                                break;
                            case Restoration:
                                entity = new Restoration(Long.parseLong(table.getValueAt(i, indexCod).toString()));
                                break;
                        }

                        HQLOperation.getInstance().Delete(entity);

                    }

                    tableModel.removeRow(i);
                }

            }
        });

        //Order table by it
        for (int i = 0; i < table.getRowCount(); i++) {
            table.setValueAt(i + 1, i, indexIt);
        }

        return Boolean.TRUE;

    }

    private boolean productHasRule(PanelProductsAdmin panelProductsAdmin, String measure) {
        int indexMeasure = panelProductsAdmin.getTbl_rules().getColumnModel().getColumnIndex("Medida");
        for (int i = 0; i < panelProductsAdmin.getTbl_rules().getRowCount(); i++) {
            System.out.println(panelProductsAdmin.getTbl_rules().getValueAt(i, indexMeasure).toString() + "-"
                + measure);
            if (panelProductsAdmin.getTbl_rules().getValueAt(i, indexMeasure).toString().equals(measure)) {
                return true;
            }
        }
        return false;
    }

}
