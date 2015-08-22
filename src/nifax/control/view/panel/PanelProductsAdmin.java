package nifax.control.view.panel;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import nifax.control.controller.PlusLess;
import nifax.control.view.cbx.Cbx_CategoryAction;
import nifax.control.view.event.pnl.Pnl_panelProductsAdminListener;
import nifax.control.view.event.tbl.Tbl_Listener;
import nifax.control.view.util.Pnl;

/**
 *
 * @author NB
 */
public class PanelProductsAdmin extends Pnl {

    public PanelProductsAdmin() {
        initComponents();
        addAncestorListener(new Pnl_panelProductsAdminListener(this));
    }

    public JLabel getLbl_DescRule() {
        return lbl_DescRule;
    }

    public JTextField getTxf_descRule() {
        return txf_descRule;
    }

    
    public JButton getBtn_searchMeasure() {
        return btn_searchMeasure;
    }

    public JLabel getLbl_descStock() {
        return lbl_descStock;
    }

    public JLabel getLbl_quantityStock() {
        return lbl_quantityStock;
    }

    public JTextField getTxf_descStock() {
        return txf_descStock;
    }

    public JTextField getTxf_quantityStock() {
        return txf_quantityStock;
    }

    
    public JLabel getJlbl_barCode1() {
        return jlbl_barCode1;
    }

    public JLabel getLbl_active() {
        return lbl_active;
    }

    public JLabel getLbl_codeProductOffer() {
        return lbl_codeProductOffer;
    }

    public JLabel getLbl_codeProductStock() {
        return lbl_codeProductStock;
    }

    public JLabel getLbl_codeProducttRestoration() {
        return lbl_codeProducttRestoration;
    }

    public JLabel getLbl_descProductOffer() {
        return lbl_descProductOffer;
    }

    public JLabel getLbl_descProductRestoration() {
        return lbl_descProductRestoration;
    }

    public JLabel getLbl_descProductStock() {
        return lbl_descProductStock;
    }

    public JPanel getPnl_productOffer() {
        return pnl_productOffer;
    }

    public JPanel getPnl_productRestoration() {
        return pnl_productRestoration;
    }

    public JPanel getPnl_productStock() {
        return pnl_productStock;
    }

    public JPanel getPnl_stateProduct() {
        return pnl_stateProduct;
    }

    public JTextField getTxf_codeAlternative() {
        return txf_codeAlternative;
    }

    public JTextField getTxf_codeProductOffer() {
        return txf_codeProductOffer;
    }

    public JTextField getTxf_codeProductRestoration() {
        return txf_codeProductRestoration;
    }

    public JTextField getTxf_codeProductStock() {
        return txf_codeProductStock;
    }

    public JTextField getTxf_descProductOffer() {
        return txf_descProductOffer;
    }

    public JTextField getTxf_descProductRestoration() {
        return txf_descProductRestoration;
    }

    public JTextField getTxf_descProductStock() {
        return txf_descProductStock;
    }

    public JComboBox getCbx_measureOffer() {
        return cbx_measureOffer;
    }

    public JTextField getTxf_codeProduct() {
        return txf_codeProduct;
    }

    public JButton getBtn_cancel() {
        return btn_cancel;
    }

    public JButton getBtn_delete() {
        return btn_delete;
    }

    public JButton getBtn_lessOffer() {
        return btn_lessOffer;
    }

    public JButton getBtn_lessRestoration() {
        return btn_lessRestoration;
    }

    public JButton getBtn_lessRule() {
        return btn_lessRule;
    }

    public JButton getBtn_lessStock() {
        return btn_lessStock;
    }

    public JButton getBtn_list() {
        return btn_list;
    }

    public JButton getBtn_plusOffer() {
        return btn_plusOffer;
    }

    public JButton getBtn_plusRestoration() {
        return btn_plusRestoration;
    }

    public JButton getBtn_plusRule() {
        return btn_plusRule;
    }

    public JButton getBtn_plusStock() {
        return btn_plusStock;
    }

    public JButton getBtn_save() {
        return btn_save;
    }

    public JButton getBtn_search() {
        return btn_search;
    }

    public JButton getBtn_searchBranchOffer() {
        return btn_searchBranchOffer;
    }

    public JButton getBtn_searchCategory() {
        return btn_searchCategory;
    }

    public JButton getBtn_searchMoneyProduct() {
        return btn_searchMoneyProduct;
    }

    public JButton getBtn_searchMoneyRestoration() {
        return btn_searchMoneyRestoration;
    }

    public JButton getBtn_searchMoneyStock() {
        return btn_searchMoneyStock;
    }

    public JButton getBtn_searchStore() {
        return btn_searchStore;
    }

    public JButton getBtn_searchStoreRestoration() {
        return btn_searchStoreRestoration;
    }

    public JComboBox getCbx_branchOffer() {
        return cbx_branchOffer;
    }

    public JComboBox getCbx_category() {
        return cbx_category;
    }

    public JComboBox getCbx_measure() {
        return cbx_measure;
    }

    public JComboBox getCbx_money() {
        return cbx_money;
    }

    public JComboBox getCbx_moneyOffer() {
        return cbx_measureOffer;
    }

    public JComboBox getCbx_measureRestoration() {
        return cbx_measureRestoration;
    }

    public JComboBox getCbx_measureStock() {
        return cbx_measureStock;
    }

    public JComboBox getCbx_storeRestoration() {
        return cbx_storeRestoration;
    }

    public JComboBox getCbx_storeStock() {
        return cbx_storeStock;
    }

    public JComboBox getCbx_iva() {
        return cbx_iva;
    }

    public JTextField getJtxf_codeProduct() {
        return txf_codeProduct;
    }

    public JTextField getJtxtf_codeAlternative() {
        return txf_codeAlternative;
    }

    public JLabel getLbl_an() {
        return lbl_an;
    }

    public JLabel getLbl_branchOffer() {
        return lbl_branchOffer;
    }

    public JLabel getLbl_category() {
        return lbl_category;
    }

    public JLabel getLbl_codeAlternative() {
        return lbl_codeAlternative;
    }

    public JLabel getLbl_codeProduct() {
        return lbl_codeProduct;
    }

    public JLabel getLbl_cost() {
        return lbl_cost;
    }

    public JLabel getLbl_descOffer() {
        return lbl_descProductOffer;
    }

    public JLabel getLbl_descProduct() {
        return lbl_descProduct;
    }

    public JLabel getLbl_discount() {
        return lbl_descOffer;
    }

    public JLabel getLbl_discount2() {
        return lbl_discount2;
    }

    public JLabel getLbl_equivalent() {
        return lbl_equivalent;
    }

    public JLabel getLbl_lowPoint() {
        return lbl_lowPoint;
    }

    public JLabel getLbl_measureOffer() {
        return lbl_measureOffer;
    }

    public JLabel getLbl_measureRestoration() {
        return lbl_measureRestoration;
    }

    public JLabel getLbl_measureStock() {
        return lbl_measureStock;
    }

    public JLabel getLbl_midPoint() {
        return lbl_midPoint;
    }

    public JLabel getLbl_money() {
        return lbl_money;
    }


    public JLabel getLbl_productOffer() {
        return lbl_codeProductOffer;
    }

    public JLabel getLbl_quantityOffer() {
        return lbl_quantityOffer;
    }

    public JLabel getLbl_storeRestoration() {
        return lbl_storeRestoration;
    }

    public JLabel getLbl_storeStock() {
        return lbl_storeStock;
    }

    public JLabel getLbl_units() {
        return lbl_units;
    }

    public JPanel getPnl_branchesOffer() {
        return pnl_branchesOffer;
    }

    public JPanel getPnl_codesProduct() {
        return pnl_codesProduct;
    }

    public JPanel getPnl_codesProduct1() {
        return pnl_codesProduct1;
    }

    public JPanel getPnl_menuProduct() {
        return pnl_menuProduct;
    }

    public JPanel getPnl_offer() {
        return pnl_offer;
    }

    public JPanel getPnl_principalOffer() {
        return pnl_principalOffer;
    }

    public JPanel getPnl_principalProduct() {
        return pnl_principalProduct;
    }

    public JPanel getPnl_principalRestoration() {
        return pnl_principalRestoration;
    }

    public JPanel getPnl_principalStock() {
        return pnl_principalStock;
    }

    public JPanel getPnl_product() {
        return pnl_product;
    }

    public JPanel getPnl_restoration() {
        return pnl_restoration;
    }

    public JPanel getPnl_rulesProduct() {
        return pnl_rulesProduct;
    }

    public JPanel getPnl_stock() {
        return pnl_stock;
    }

    public JLabel getLbl_descRestoration() {
        return lbl_descRestoration;
    }

    public JLabel getLbl_peak() {
        return lbl_peak;
    }

    public JTextField getTxf_descRestoration() {
        return txf_descRestoration;
    }

    public JTextField getTxf_peak() {
        return txf_peak;
    }
    
    

    public JPanel getPnl_storeStock() {
        return pnl_storeStock;
    }

    public JPanel getPnl_storesRestoration() {
        return pnl_storesRestoration;
    }

    public JScrollPane getScp_tblRules() {
        return scp_tblRules;
    }

    public JScrollPane getScp_tblStoreOffer() {
        return scp_tblStoreOffer;
    }

    public JScrollPane getScp_tblStoreRestoration() {
        return scp_tblStoreRestoration;
    }

    public JScrollPane getScp_tblStoreStock() {
        return scp_tblStoreStock;
    }

    public JTable getTbl_offer() {
        return tbl_offer;
    }

    public JTable getTbl_restoration() {
        return tbl_restoration;
    }

    public JTable getTbl_rules() {
        return tbl_rules;
    }

    public JTable getTbl_stock() {
        return tbl_stock;
    }

    public JTabbedPane getTbp_containerProduct() {
        return tbp_containerProduct;
    }

    public JTextField getTxf_cost() {
        return txf_cost;
    }

    public JTextField getTxf_descOffer() {
        return txf_descOffer;
    }

    public JTextField getTxf_descProduct() {
        return txf_descProduct;
    }

    public JTextField getTxf_discount() {
        return txf_discount;
    }

    public JTextField getTxf_equivalent() {
        return txf_equivalent;
    }

    public JTextField getTxf_lowPoint() {
        return txf_lowPoint;
    }

    public JTextField getTxf_midPoint() {
        return txf_midPoint;
    }

    public JTextField getTxf_quantityOffer() {
        return txf_quantityOffer;
    }
    
    public JLabel getLbl_idProduct() {
        return lbl_idProduct;
    }
    
    public JCheckBox getChx_active() {
        return chx_active;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbp_containerProduct = new nifax.control.view.util.Tbp();
        pnl_product = new nifax.control.view.util.Pnl_Tab();
        pnl_principalProduct = new javax.swing.JPanel();
        txf_cost = new javax.swing.JTextField();
        lbl_cost = new javax.swing.JLabel();
        lbl_descProduct = new javax.swing.JLabel();
        txf_descProduct = new javax.swing.JTextField();
        lbl_category = new javax.swing.JLabel();
        cbx_category = new javax.swing.JComboBox();
        lbl_money = new javax.swing.JLabel();
        cbx_money = new javax.swing.JComboBox();
        btn_searchCategory = new javax.swing.JButton();
        btn_searchMoneyProduct = new javax.swing.JButton();
        pnl_codesProduct = new javax.swing.JPanel();
        lbl_codeProduct = new javax.swing.JLabel();
        lbl_codeAlternative = new javax.swing.JLabel();
        txf_codeAlternative = new javax.swing.JTextField();
        txf_codeProduct = new javax.swing.JTextField();
        lbl_idProduct = new javax.swing.JLabel();
        pnl_codesProduct1 = new javax.swing.JPanel();
        jlbl_barCode1 = new javax.swing.JLabel();
        cbx_iva = new javax.swing.JComboBox();
        pnl_stateProduct = new javax.swing.JPanel();
        lbl_active = new javax.swing.JLabel();
        chx_active = new javax.swing.JCheckBox();
        pnl_rulesProduct = new javax.swing.JPanel();
        lbl_units = new javax.swing.JLabel();
        txf_equivalent = new javax.swing.JTextField();
        cbx_measure = new javax.swing.JComboBox();
        btn_searchMeasure = new javax.swing.JButton();
        lbl_an = new javax.swing.JLabel();
        lbl_equivalent = new javax.swing.JLabel();
        btn_plusRule = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_PlusLess(this,PlusLess.PLUS,"+"));
        scp_tblRules = new javax.swing.JScrollPane();
        tbl_rules = new javax.swing.JTable();
        btn_lessRule = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_PlusLess(this,PlusLess.LESS,"-"));
        txf_descRule = new javax.swing.JTextField();
        lbl_DescRule = new javax.swing.JLabel();
        pnl_offer = new nifax.control.view.util.Pnl_Tab();
        pnl_principalOffer = new javax.swing.JPanel();
        pnl_branchesOffer = new javax.swing.JPanel();
        txf_descOffer = new javax.swing.JTextField();
        cbx_measureOffer = new javax.swing.JComboBox();
        lbl_measureOffer = new javax.swing.JLabel();
        cbx_branchOffer = new javax.swing.JComboBox();
        btn_lessOffer = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_PlusLess(this,PlusLess.LESS,"-"));
        btn_searchBranchOffer = new javax.swing.JButton();
        btn_plusOffer = new JButton(new nifax.control.view.event.btn.Btn_PlusLess(this,PlusLess.PLUS,"+"));
        lbl_descOffer = new javax.swing.JLabel();
        lbl_branchOffer = new javax.swing.JLabel();
        txf_quantityOffer = new javax.swing.JTextField();
        lbl_quantityOffer = new javax.swing.JLabel();
        lbl_discount2 = new javax.swing.JLabel();
        txf_discount = new javax.swing.JTextField();
        pnl_productOffer = new javax.swing.JPanel();
        txf_descProductOffer = new javax.swing.JTextField();
        lbl_descProductOffer = new javax.swing.JLabel();
        lbl_codeProductOffer = new javax.swing.JLabel();
        txf_codeProductOffer = new javax.swing.JTextField();
        scp_tblStoreOffer = new javax.swing.JScrollPane();
        tbl_offer = new javax.swing.JTable();
        pnl_restoration = new nifax.control.view.util.Pnl_Tab();
        pnl_principalRestoration = new javax.swing.JPanel();
        pnl_storesRestoration = new javax.swing.JPanel();
        txf_descRestoration = new javax.swing.JTextField();
        cbx_measureRestoration = new javax.swing.JComboBox();
        lbl_measureRestoration = new javax.swing.JLabel();
        btn_searchMoneyRestoration = new javax.swing.JButton();
        cbx_storeRestoration = new javax.swing.JComboBox();
        btn_lessRestoration = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_PlusLess(this,PlusLess.LESS,"-"));
        btn_searchStoreRestoration = new javax.swing.JButton();
        btn_plusRestoration = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_PlusLess(this,PlusLess.PLUS,"+"));
        lbl_descRestoration = new javax.swing.JLabel();
        lbl_storeRestoration = new javax.swing.JLabel();
        txf_lowPoint = new javax.swing.JTextField();
        lbl_lowPoint = new javax.swing.JLabel();
        lbl_midPoint = new javax.swing.JLabel();
        txf_midPoint = new javax.swing.JTextField();
        txf_peak = new javax.swing.JTextField();
        lbl_peak = new javax.swing.JLabel();
        pnl_productRestoration = new javax.swing.JPanel();
        txf_descProductRestoration = new javax.swing.JTextField();
        lbl_descProductRestoration = new javax.swing.JLabel();
        lbl_codeProducttRestoration = new javax.swing.JLabel();
        txf_codeProductRestoration = new javax.swing.JTextField();
        scp_tblStoreRestoration = new javax.swing.JScrollPane();
        tbl_restoration = new javax.swing.JTable();
        pnl_stock = new nifax.control.view.util.Pnl_Tab();
        pnl_principalStock = new javax.swing.JPanel();
        pnl_storeStock = new javax.swing.JPanel();
        txf_descStock = new javax.swing.JTextField();
        cbx_measureStock = new javax.swing.JComboBox();
        lbl_measureStock = new javax.swing.JLabel();
        btn_searchMoneyStock = new javax.swing.JButton();
        cbx_storeStock = new javax.swing.JComboBox();
        btn_lessStock = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_PlusLess(this,PlusLess.LESS,"-"));
        btn_searchStore = new javax.swing.JButton();
        btn_plusStock = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_PlusLess(this,PlusLess.PLUS,"+"));
        lbl_descStock = new javax.swing.JLabel();
        lbl_storeStock = new javax.swing.JLabel();
        txf_quantityStock = new javax.swing.JTextField();
        lbl_quantityStock = new javax.swing.JLabel();
        pnl_productStock = new javax.swing.JPanel();
        txf_descProductStock = new javax.swing.JTextField();
        lbl_descProductStock = new javax.swing.JLabel();
        lbl_codeProductStock = new javax.swing.JLabel();
        txf_codeProductStock = new javax.swing.JTextField();
        scp_tblStoreStock = new javax.swing.JScrollPane();
        tbl_stock = new javax.swing.JTable();
        pnl_menuProduct = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_adminAction(this,nifax.control.controller.Administration.SAVE,"Guardar"));
        btn_search = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_adminAction(this,nifax.control.controller.Administration.SEARCH,"Buscar"));
        btn_delete = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_adminAction(this,nifax.control.controller.Administration.DELETE,"ELiminar"));
        btn_list = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_adminAction(this,nifax.control.controller.Administration.LIST,"Listar"));
        btn_cancel = new javax.swing.JButton();

        tbp_containerProduct.setBackground(new java.awt.Color(51, 51, 51));
        tbp_containerProduct.setOpaque(true);

        pnl_principalProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));
        pnl_principalProduct.setPreferredSize(new java.awt.Dimension(460, 360));

        lbl_cost.setText("Costo : ");

        lbl_descProduct.setText("Descripcion :");

        lbl_category.setText("Categoria :");

        Cbx_CategoryAction sbm = new Cbx_CategoryAction(cbx_category);
        cbx_category.setModel(sbm);
        cbx_category.addItemListener(sbm);
        cbx_category.setEditable(true);

        lbl_money.setText("Moneda : ");
        lbl_money.setEnabled(false);

        cbx_money.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dolar", "Pesos" }));
        cbx_money.setEnabled(false);

        btn_searchCategory.setText("...");
        btn_searchCategory.setEnabled(false);
        btn_searchCategory.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_searchMoneyProduct.setText("...");
        btn_searchMoneyProduct.setEnabled(false);
        btn_searchMoneyProduct.setPreferredSize(new java.awt.Dimension(52, 28));

        pnl_codesProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigos"));

        lbl_codeProduct.setText("De Producto : ");

        lbl_codeAlternative.setForeground(new java.awt.Color(0, 0, 0));
        lbl_codeAlternative.setText("Alternativo  :");
        lbl_codeAlternative.setEnabled(false);

        txf_codeAlternative.setEnabled(false);

        lbl_idProduct.setForeground(new java.awt.Color(0, 0, 0));
        lbl_idProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_idProduct.setEnabled(false);

        javax.swing.GroupLayout pnl_codesProductLayout = new javax.swing.GroupLayout(pnl_codesProduct);
        pnl_codesProduct.setLayout(pnl_codesProductLayout);
        pnl_codesProductLayout.setHorizontalGroup(
            pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_codesProductLayout.createSequentialGroup()
                .addGroup(pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_codesProductLayout.createSequentialGroup()
                        .addComponent(lbl_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_codesProductLayout.createSequentialGroup()
                        .addComponent(lbl_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(pnl_codesProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_idProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_codesProductLayout.setVerticalGroup(
            pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_codesProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_idProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_codesProduct1.setBorder(javax.swing.BorderFactory.createTitledBorder("Impuestos"));

        jlbl_barCode1.setText("Iva : ");

        javax.swing.GroupLayout pnl_codesProduct1Layout = new javax.swing.GroupLayout(pnl_codesProduct1);
        pnl_codesProduct1.setLayout(pnl_codesProduct1Layout);
        pnl_codesProduct1Layout.setHorizontalGroup(
            pnl_codesProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_codesProduct1Layout.createSequentialGroup()
                .addComponent(jlbl_barCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnl_codesProduct1Layout.setVerticalGroup(
            pnl_codesProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_codesProduct1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnl_codesProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_barCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        pnl_stateProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        lbl_active.setText("Habilitado : ");

        chx_active.setSelected(true);
        chx_active.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnl_stateProductLayout = new javax.swing.GroupLayout(pnl_stateProduct);
        pnl_stateProduct.setLayout(pnl_stateProductLayout);
        pnl_stateProductLayout.setHorizontalGroup(
            pnl_stateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_stateProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_active, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chx_active, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_stateProductLayout.setVerticalGroup(
            pnl_stateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chx_active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_active, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_principalProductLayout = new javax.swing.GroupLayout(pnl_principalProduct);
        pnl_principalProduct.setLayout(pnl_principalProductLayout);
        pnl_principalProductLayout.setHorizontalGroup(
            pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_principalProductLayout.createSequentialGroup()
                .addGroup(pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_stateProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_codesProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_codesProduct1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_principalProductLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_money, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_cost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_descProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_principalProductLayout.createSequentialGroup()
                                .addComponent(cbx_category, 0, 162, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_searchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_principalProductLayout.createSequentialGroup()
                                .addComponent(cbx_money, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_searchMoneyProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txf_descProduct)
                            .addComponent(txf_cost))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_principalProductLayout.setVerticalGroup(
            pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_category, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_money, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchMoneyProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(pnl_codesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_codesProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(pnl_stateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_rulesProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Reglas de Cantidad"));

        lbl_units.setText("unidades");

        btn_searchMeasure.setText("...");
        btn_searchMeasure.setEnabled(false);

        lbl_an.setText("Un");

        lbl_equivalent.setText("equivale a ");

        btn_plusRule.setName("plus_less_measure");
        btn_plusRule.setText("+");

        tbl_rules.setName("TableRules");
        tbl_rules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "It", "Cod", "Medida", "Equivalente", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_rules.getTableHeader().setReorderingAllowed(false);
        scp_tblRules.setViewportView(tbl_rules);
        tbl_rules.getTableHeader().addMouseListener(new Tbl_Listener(this.tbl_rules));

        btn_lessRule.setName("plus_less_measure");
        btn_lessRule.setText("-");

        txf_descRule.setEnabled(false);

        lbl_DescRule.setText("Descripcion :");
        lbl_DescRule.setEnabled(false);

        javax.swing.GroupLayout pnl_rulesProductLayout = new javax.swing.GroupLayout(pnl_rulesProduct);
        pnl_rulesProduct.setLayout(pnl_rulesProductLayout);
        pnl_rulesProductLayout.setHorizontalGroup(
            pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rulesProductLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scp_tblRules, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_rulesProductLayout.createSequentialGroup()
                        .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_rulesProductLayout.createSequentialGroup()
                                .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_rulesProductLayout.createSequentialGroup()
                                        .addComponent(lbl_an, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rulesProductLayout.createSequentialGroup()
                                        .addComponent(lbl_equivalent, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txf_equivalent)
                                    .addComponent(cbx_measure, 0, 168, Short.MAX_VALUE)))
                            .addGroup(pnl_rulesProductLayout.createSequentialGroup()
                                .addComponent(lbl_DescRule, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txf_descRule)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_rulesProductLayout.createSequentialGroup()
                                .addComponent(btn_plusRule, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_lessRule, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_searchMeasure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_units, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 0, 0))
        );
        pnl_rulesProductLayout.setVerticalGroup(
            pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rulesProductLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_an, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_measure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchMeasure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_units, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_equivalent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_equivalent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_descRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DescRule, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusRule)
                    .addComponent(btn_lessRule))
                .addGap(9, 9, 9)
                .addComponent(scp_tblRules, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_productLayout = new javax.swing.GroupLayout(pnl_product);
        pnl_product.setLayout(pnl_productLayout);
        pnl_productLayout.setHorizontalGroup(
            pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_rulesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        pnl_productLayout.setVerticalGroup(
            pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE)
                    .addComponent(pnl_rulesProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tbp_containerProduct.addTab("Producto", pnl_product);

        pnl_offer.setName("Offer");

        pnl_principalOffer.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        pnl_branchesOffer.setBorder(javax.swing.BorderFactory.createTitledBorder("Por sucursal"));

        lbl_measureOffer.setText("Medida : ");

        cbx_branchOffer.setEditable(true);
        cbx_branchOffer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas", "Santiago", "Capital" }));
        cbx_branchOffer.setEnabled(false);

        btn_lessOffer.setName("plus_less_offer");
        btn_lessOffer.setText("-");
        btn_lessOffer.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_searchBranchOffer.setText("...");
        btn_searchBranchOffer.setEnabled(false);
        btn_searchBranchOffer.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_plusOffer.setName("plus_less_offer");
        btn_plusOffer.setText("+");
        btn_plusOffer.setPreferredSize(new java.awt.Dimension(52, 28));

        lbl_descOffer.setText("Descripcion :");

        lbl_branchOffer.setText("Sucursal : ");
        lbl_branchOffer.setEnabled(false);

        lbl_quantityOffer.setText("Cantidad : ");

        lbl_discount2.setText("Descuento : ");

        javax.swing.GroupLayout pnl_branchesOfferLayout = new javax.swing.GroupLayout(pnl_branchesOffer);
        pnl_branchesOffer.setLayout(pnl_branchesOfferLayout);
        pnl_branchesOfferLayout.setHorizontalGroup(
            pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                        .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_measureOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_branchOffer, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                                .addComponent(cbx_measureOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                                .addComponent(cbx_branchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_plusOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_searchBranchOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_lessOffer, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                        .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_discount2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_descOffer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(lbl_quantityOffer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txf_quantityOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_branchesOfferLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_descOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_branchesOfferLayout.setVerticalGroup(
            pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_branchesOfferLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_descOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_descOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_discount2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_quantityOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_quantityOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_measureOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_measureOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_branchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchBranchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_branchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lessOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        pnl_productOffer.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        txf_descProductOffer.setEnabled(false);

        lbl_descProductOffer.setText("Descripcion  :");

        lbl_codeProductOffer.setText("Codigo : ");

        txf_codeProductOffer.setEnabled(false);

        javax.swing.GroupLayout pnl_productOfferLayout = new javax.swing.GroupLayout(pnl_productOffer);
        pnl_productOffer.setLayout(pnl_productOfferLayout);
        pnl_productOfferLayout.setHorizontalGroup(
            pnl_productOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productOfferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_descProductOffer, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(lbl_codeProductOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnl_productOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_productOfferLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txf_descProductOffer, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(pnl_productOfferLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txf_codeProductOffer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_productOfferLayout.setVerticalGroup(
            pnl_productOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productOfferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codeProductOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_codeProductOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_productOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descProductOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descProductOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_principalOfferLayout = new javax.swing.GroupLayout(pnl_principalOffer);
        pnl_principalOffer.setLayout(pnl_principalOfferLayout);
        pnl_principalOfferLayout.setHorizontalGroup(
            pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalOfferLayout.createSequentialGroup()
                .addGroup(pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnl_productOffer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_branchesOffer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_principalOfferLayout.setVerticalGroup(
            pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalOfferLayout.createSequentialGroup()
                .addComponent(pnl_productOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnl_branchesOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tbl_offer.setName("TableOffers");
        tbl_offer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "It", "Cod", "Descripcion", "Descuento", "Cantidad", "Medida", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_offer.setRequestFocusEnabled(false);
        scp_tblStoreOffer.setViewportView(tbl_offer);
        if (tbl_offer.getColumnModel().getColumnCount() > 0) {
            tbl_offer.getColumnModel().getColumn(6).setResizable(false);
        }
        tbl_offer.getTableHeader().addMouseListener(new Tbl_Listener(this.tbl_offer));

        javax.swing.GroupLayout pnl_offerLayout = new javax.swing.GroupLayout(pnl_offer);
        pnl_offer.setLayout(pnl_offerLayout);
        pnl_offerLayout.setHorizontalGroup(
            pnl_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_offerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_tblStoreOffer, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );
        pnl_offerLayout.setVerticalGroup(
            pnl_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_offerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_principalOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scp_tblStoreOffer))
                .addContainerGap())
        );

        tbp_containerProduct.addTab("Oferta ", pnl_offer);

        pnl_restoration.setName("Restoration");

        pnl_principalRestoration.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        pnl_storesRestoration.setBorder(javax.swing.BorderFactory.createTitledBorder("Por deposito"));

        lbl_measureRestoration.setText("Medida : ");

        btn_searchMoneyRestoration.setText("...");
        btn_searchMoneyRestoration.setEnabled(false);
        btn_searchMoneyRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_lessRestoration.setName("plus_less_restoration");
        btn_lessRestoration.setText("-");
        btn_lessRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_searchStoreRestoration.setText("...");
        btn_searchStoreRestoration.setEnabled(false);
        btn_searchStoreRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_plusRestoration.setName("plus_less_restoration");
        btn_plusRestoration.setText("+");
        btn_plusRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        lbl_descRestoration.setText("Descripcion :");

        lbl_storeRestoration.setText("Deposito ");

        lbl_lowPoint.setText("Punto Min : ");

        lbl_midPoint.setText("Punto Rep  :");

        lbl_peak.setText("Punto Rep  :");

        javax.swing.GroupLayout pnl_storesRestorationLayout = new javax.swing.GroupLayout(pnl_storesRestoration);
        pnl_storesRestoration.setLayout(pnl_storesRestorationLayout);
        pnl_storesRestorationLayout.setHorizontalGroup(
            pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                        .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_measureRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_storeRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                                .addComponent(cbx_measureRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_searchMoneyRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                                .addComponent(cbx_storeRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                                        .addComponent(btn_plusRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_lessRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                                        .addComponent(btn_searchStoreRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(6, 6, 6))
                    .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                        .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_peak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_midPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_descRestoration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(lbl_lowPoint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txf_lowPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_storesRestorationLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_midPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_descRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_peak, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_storesRestorationLayout.setVerticalGroup(
            pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_storesRestorationLayout.createSequentialGroup()
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_descRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_descRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_peak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_peak, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_midPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_midPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_lowPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_lowPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_measureRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_measureRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_searchMoneyRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_storeRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchStoreRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_storeRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lessRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        pnl_productRestoration.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        txf_descProductRestoration.setEnabled(false);

        lbl_descProductRestoration.setText("Descripcion  :");

        lbl_codeProducttRestoration.setText("Codigo : ");

        txf_codeProductRestoration.setEnabled(false);

        javax.swing.GroupLayout pnl_productRestorationLayout = new javax.swing.GroupLayout(pnl_productRestoration);
        pnl_productRestoration.setLayout(pnl_productRestorationLayout);
        pnl_productRestorationLayout.setHorizontalGroup(
            pnl_productRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productRestorationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_descProductRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(lbl_codeProducttRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnl_productRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_productRestorationLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txf_descProductRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(pnl_productRestorationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txf_codeProductRestoration)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_productRestorationLayout.setVerticalGroup(
            pnl_productRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productRestorationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codeProducttRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_codeProductRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_productRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descProductRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descProductRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_principalRestorationLayout = new javax.swing.GroupLayout(pnl_principalRestoration);
        pnl_principalRestoration.setLayout(pnl_principalRestorationLayout);
        pnl_principalRestorationLayout.setHorizontalGroup(
            pnl_principalRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_storesRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_productRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_principalRestorationLayout.setVerticalGroup(
            pnl_principalRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalRestorationLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnl_productRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_storesRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_restoration.setName("TableRestorations");
        tbl_restoration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "It", "Cod", "Descripcion", "Punto Max", "Punto Rep", "Punto Min", "Medida", "Deposito", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scp_tblStoreRestoration.setViewportView(tbl_restoration);
        tbl_restoration.getTableHeader().addMouseListener(new Tbl_Listener(this.tbl_restoration));

        javax.swing.GroupLayout pnl_restorationLayout = new javax.swing.GroupLayout(pnl_restoration);
        pnl_restoration.setLayout(pnl_restorationLayout);
        pnl_restorationLayout.setHorizontalGroup(
            pnl_restorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_restorationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_tblStoreRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );
        pnl_restorationLayout.setVerticalGroup(
            pnl_restorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_restorationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_restorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_principalRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scp_tblStoreRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbp_containerProduct.addTab("Reposicion", pnl_restoration);

        pnl_stock.setName("Stock");

        pnl_principalStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        pnl_storeStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Por deposito"));

        lbl_measureStock.setText("Medida : ");

        btn_searchMoneyStock.setText("...");
        btn_searchMoneyStock.setEnabled(false);
        btn_searchMoneyStock.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_lessStock.setName("plus_less_stock");
        btn_lessStock.setText("-");
        btn_lessStock.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_searchStore.setText("...");
        btn_searchStore.setEnabled(false);
        btn_searchStore.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_plusStock.setName("plus_less_stock");
        btn_plusStock.setText("+");
        btn_plusStock.setPreferredSize(new java.awt.Dimension(52, 28));

        lbl_descStock.setText("Descripcion :");

        lbl_storeStock.setText("Deposito :");

        lbl_quantityStock.setText("Cantidad : ");

        javax.swing.GroupLayout pnl_storeStockLayout = new javax.swing.GroupLayout(pnl_storeStock);
        pnl_storeStock.setLayout(pnl_storeStockLayout);
        pnl_storeStockLayout.setHorizontalGroup(
            pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_storeStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_storeStockLayout.createSequentialGroup()
                        .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_measureStock, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_storeStockLayout.createSequentialGroup()
                                .addComponent(cbx_measureStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_searchMoneyStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_storeStockLayout.createSequentialGroup()
                                .addComponent(cbx_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_storeStockLayout.createSequentialGroup()
                                        .addComponent(btn_plusStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_lessStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnl_storeStockLayout.createSequentialGroup()
                                        .addComponent(btn_searchStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(6, 6, 6))
                    .addGroup(pnl_storeStockLayout.createSequentialGroup()
                        .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_storeStockLayout.createSequentialGroup()
                                .addComponent(lbl_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txf_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_storeStockLayout.createSequentialGroup()
                                .addComponent(lbl_quantityStock, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txf_quantityStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_storeStockLayout.setVerticalGroup(
            pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_storeStockLayout.createSequentialGroup()
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_quantityStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_quantityStock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_searchMoneyStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_measureStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbx_measureStock, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(6, 6, 6)
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lessStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        pnl_productStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        txf_descProductStock.setEnabled(false);

        lbl_descProductStock.setText("Descripcion  :");

        lbl_codeProductStock.setText("Codigo : ");

        txf_codeProductStock.setEnabled(false);

        javax.swing.GroupLayout pnl_productStockLayout = new javax.swing.GroupLayout(pnl_productStock);
        pnl_productStock.setLayout(pnl_productStockLayout);
        pnl_productStockLayout.setHorizontalGroup(
            pnl_productStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_descProductStock, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(lbl_codeProductStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnl_productStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_productStockLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txf_descProductStock, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(pnl_productStockLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txf_codeProductStock)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_productStockLayout.setVerticalGroup(
            pnl_productStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codeProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_codeProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_productStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_principalStockLayout = new javax.swing.GroupLayout(pnl_principalStock);
        pnl_principalStock.setLayout(pnl_principalStockLayout);
        pnl_principalStockLayout.setHorizontalGroup(
            pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_storeStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_principalStockLayout.createSequentialGroup()
                .addComponent(pnl_productStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_principalStockLayout.setVerticalGroup(
            pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalStockLayout.createSequentialGroup()
                .addComponent(pnl_productStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_stock.setName("TableStocks");
        tbl_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "It", "Cod", "Descripcion", "Cantidad", "Deposito", "Medida", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scp_tblStoreStock.setViewportView(tbl_stock);
        tbl_stock.getTableHeader().addMouseListener(new Tbl_Listener(this.tbl_stock));

        javax.swing.GroupLayout pnl_stockLayout = new javax.swing.GroupLayout(pnl_stock);
        pnl_stock.setLayout(pnl_stockLayout);
        pnl_stockLayout.setHorizontalGroup(
            pnl_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_stockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_tblStoreStock, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );
        pnl_stockLayout.setVerticalGroup(
            pnl_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_stockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_principalStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scp_tblStoreStock, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbp_containerProduct.addTab("Stock", pnl_stock);

        pnl_menuProduct.setBackground(new java.awt.Color(51, 51, 51));
        pnl_menuProduct.setBorder(null);

        btn_save.setText("Guardar");

        btn_search.setText("Buscar");

        btn_delete.setText("Eliminar");

        btn_list.setText("Listar");

        btn_cancel.setText("Cancelar");

        javax.swing.GroupLayout pnl_menuProductLayout = new javax.swing.GroupLayout(pnl_menuProduct);
        pnl_menuProduct.setLayout(pnl_menuProductLayout);
        pnl_menuProductLayout.setHorizontalGroup(
            pnl_menuProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuProductLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btn_save)
                .addGap(10, 10, 10)
                .addComponent(btn_search)
                .addGap(10, 10, 10)
                .addComponent(btn_delete)
                .addGap(10, 10, 10)
                .addComponent(btn_list)
                .addGap(10, 10, 10)
                .addComponent(btn_cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_menuProductLayout.setVerticalGroup(
            pnl_menuProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuProductLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_menuProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_search)
                    .addComponent(btn_delete)
                    .addComponent(btn_list)
                    .addComponent(btn_cancel)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(tbp_containerProduct)
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_menuProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbp_containerProduct)
                .addGap(0, 0, 0)
                .addComponent(pnl_menuProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_lessOffer;
    private javax.swing.JButton btn_lessRestoration;
    private javax.swing.JButton btn_lessRule;
    private javax.swing.JButton btn_lessStock;
    private javax.swing.JButton btn_list;
    private javax.swing.JButton btn_plusOffer;
    private javax.swing.JButton btn_plusRestoration;
    private javax.swing.JButton btn_plusRule;
    private javax.swing.JButton btn_plusStock;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_searchBranchOffer;
    private javax.swing.JButton btn_searchCategory;
    private javax.swing.JButton btn_searchMeasure;
    private javax.swing.JButton btn_searchMoneyProduct;
    private javax.swing.JButton btn_searchMoneyRestoration;
    private javax.swing.JButton btn_searchMoneyStock;
    private javax.swing.JButton btn_searchStore;
    private javax.swing.JButton btn_searchStoreRestoration;
    private javax.swing.JComboBox cbx_branchOffer;
    private javax.swing.JComboBox cbx_category;
    private javax.swing.JComboBox cbx_iva;
    private javax.swing.JComboBox cbx_measure;
    private javax.swing.JComboBox cbx_measureOffer;
    private javax.swing.JComboBox cbx_measureRestoration;
    private javax.swing.JComboBox cbx_measureStock;
    private javax.swing.JComboBox cbx_money;
    private javax.swing.JComboBox cbx_storeRestoration;
    private javax.swing.JComboBox cbx_storeStock;
    private javax.swing.JCheckBox chx_active;
    private javax.swing.JLabel jlbl_barCode1;
    private javax.swing.JLabel lbl_DescRule;
    private javax.swing.JLabel lbl_active;
    private javax.swing.JLabel lbl_an;
    private javax.swing.JLabel lbl_branchOffer;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_codeAlternative;
    private javax.swing.JLabel lbl_codeProduct;
    private javax.swing.JLabel lbl_codeProductOffer;
    private javax.swing.JLabel lbl_codeProductStock;
    private javax.swing.JLabel lbl_codeProducttRestoration;
    private javax.swing.JLabel lbl_cost;
    private javax.swing.JLabel lbl_descOffer;
    private javax.swing.JLabel lbl_descProduct;
    private javax.swing.JLabel lbl_descProductOffer;
    private javax.swing.JLabel lbl_descProductRestoration;
    private javax.swing.JLabel lbl_descProductStock;
    private javax.swing.JLabel lbl_descRestoration;
    private javax.swing.JLabel lbl_descStock;
    private javax.swing.JLabel lbl_discount2;
    private javax.swing.JLabel lbl_equivalent;
    private javax.swing.JLabel lbl_idProduct;
    private javax.swing.JLabel lbl_lowPoint;
    private javax.swing.JLabel lbl_measureOffer;
    private javax.swing.JLabel lbl_measureRestoration;
    private javax.swing.JLabel lbl_measureStock;
    private javax.swing.JLabel lbl_midPoint;
    private javax.swing.JLabel lbl_money;
    private javax.swing.JLabel lbl_peak;
    private javax.swing.JLabel lbl_quantityOffer;
    private javax.swing.JLabel lbl_quantityStock;
    private javax.swing.JLabel lbl_storeRestoration;
    private javax.swing.JLabel lbl_storeStock;
    private javax.swing.JLabel lbl_units;
    private javax.swing.JPanel pnl_branchesOffer;
    private javax.swing.JPanel pnl_codesProduct;
    private javax.swing.JPanel pnl_codesProduct1;
    private javax.swing.JPanel pnl_menuProduct;
    private javax.swing.JPanel pnl_offer;
    private javax.swing.JPanel pnl_principalOffer;
    private javax.swing.JPanel pnl_principalProduct;
    private javax.swing.JPanel pnl_principalRestoration;
    private javax.swing.JPanel pnl_principalStock;
    private javax.swing.JPanel pnl_product;
    private javax.swing.JPanel pnl_productOffer;
    private javax.swing.JPanel pnl_productRestoration;
    private javax.swing.JPanel pnl_productStock;
    private javax.swing.JPanel pnl_restoration;
    private javax.swing.JPanel pnl_rulesProduct;
    private javax.swing.JPanel pnl_stateProduct;
    private javax.swing.JPanel pnl_stock;
    private javax.swing.JPanel pnl_storeStock;
    private javax.swing.JPanel pnl_storesRestoration;
    private javax.swing.JScrollPane scp_tblRules;
    private javax.swing.JScrollPane scp_tblStoreOffer;
    private javax.swing.JScrollPane scp_tblStoreRestoration;
    private javax.swing.JScrollPane scp_tblStoreStock;
    private javax.swing.JTable tbl_offer;
    private javax.swing.JTable tbl_restoration;
    private javax.swing.JTable tbl_rules;
    private javax.swing.JTable tbl_stock;
    private javax.swing.JTabbedPane tbp_containerProduct;
    private javax.swing.JTextField txf_codeAlternative;
    private javax.swing.JTextField txf_codeProduct;
    private javax.swing.JTextField txf_codeProductOffer;
    private javax.swing.JTextField txf_codeProductRestoration;
    private javax.swing.JTextField txf_codeProductStock;
    private javax.swing.JTextField txf_cost;
    private javax.swing.JTextField txf_descOffer;
    private javax.swing.JTextField txf_descProduct;
    private javax.swing.JTextField txf_descProductOffer;
    private javax.swing.JTextField txf_descProductRestoration;
    private javax.swing.JTextField txf_descProductStock;
    private javax.swing.JTextField txf_descRestoration;
    private javax.swing.JTextField txf_descRule;
    private javax.swing.JTextField txf_descStock;
    private javax.swing.JTextField txf_discount;
    private javax.swing.JTextField txf_equivalent;
    private javax.swing.JTextField txf_lowPoint;
    private javax.swing.JTextField txf_midPoint;
    private javax.swing.JTextField txf_peak;
    private javax.swing.JTextField txf_quantityOffer;
    private javax.swing.JTextField txf_quantityStock;
    // End of variables declaration//GEN-END:variables
}
