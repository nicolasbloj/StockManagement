package nifax.control.view.panel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import nifax.control.view.cbx.Cbx_CategoryAction;
import nifax.control.view.event.btn.Btn_lessRule;
import nifax.control.view.event.btn.Btn_plusRule;
import nifax.control.view.event.btn.Btn_saveAction;
import nifax.control.view.event.btn.Btn_searchAction;
import nifax.control.view.event.pnl.Pnl_panelProductsAdminListener;
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

    public JButton getBtn_searchMeasure() {
        return btn_searchMeasure;
    }

    public JButton getBtn_searchMoneyOffer() {
        return btn_searchMoneyOffer;
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

    public JButton getBtn_searchProductOffer() {
        return btn_searchProductOffer;
    }

    public JButton getBtn_searchProductStock() {
        return btn_searchProductStock;
    }

    public JButton getBtn_searchRestoration() {
        return btn_searchRestoration;
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
        return cbx_moneyOffer;
    }

    public JComboBox getCbx_moneyRestoration() {
        return cbx_moneyRestoration;
    }

    public JComboBox getCbx_moneyStock() {
        return cbx_moneyStock;
    }

    public JComboBox getCbx_productOffer() {
        return cbx_productOffer;
    }

    public JComboBox getCbx_productRestoration() {
        return cbx_productRestoration;
    }

    public JComboBox getCbx_productStock() {
        return cbx_productStock;
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
        return lbl_descOffer;
    }

    public JLabel getLbl_descProduct() {
        return lbl_descProduct;
    }

    public JLabel getLbl_descRestoration() {
        return lbl_descRestoration;
    }

    public JLabel getLbl_descStock() {
        return lbl_descStock;
    }

    public JLabel getLbl_discount() {
        return lbl_discount;
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

    public JLabel getLbl_peak() {
        return lbl_peak;
    }

    public JLabel getLbl_productOffer() {
        return lbl_productOffer;
    }

    public JLabel getLbl_productRestoration() {
        return lbl_productRestoration;
    }

    public JLabel getLbl_productStock() {
        return lbl_productStock;
    }

    public JLabel getLbl_quantityOffer() {
        return lbl_quantityOffer;
    }

    public JLabel getLbl_quantityStock() {
        return lbl_quantityStock;
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

    public JTextField getTxf_descRestoration() {
        return txf_descRestoration;
    }

    public JTextField getTxf_descStock() {
        return txf_descStock;
    }

    public JTextField getTxf_discount() {
        return txf_discount;
    }

    public JTextField getTxf_discount2() {
        return txf_discount2;
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

    public JTextField getTxf_peak() {
        return txf_peak;
    }

    public JTextField getTxf_quantityOffer() {
        return txf_quantityOffer;
    }

    public JTextField getTxf_quantityStock() {
        return txf_quantityStock;
    }

    public JLabel getLbl_idProduct() {
        return lbl_idProduct;
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
        pnl_rulesProduct = new javax.swing.JPanel();
        lbl_units = new javax.swing.JLabel();
        txf_equivalent = new javax.swing.JTextField();
        cbx_measure = new javax.swing.JComboBox();
        btn_searchMeasure = new javax.swing.JButton();
        lbl_an = new javax.swing.JLabel();
        lbl_equivalent = new javax.swing.JLabel();
        btn_plusRule = new javax.swing.JButton(new Btn_plusRule(this));
        scp_tblRules = new javax.swing.JScrollPane();
        tbl_rules = new javax.swing.JTable();
        btn_lessRule = new javax.swing.JButton(new Btn_lessRule(this));
        pnl_offer = new nifax.control.view.util.Pnl_Tab();
        pnl_principalOffer = new javax.swing.JPanel();
        lbl_descOffer = new javax.swing.JLabel();
        txf_descOffer = new javax.swing.JTextField();
        lbl_productOffer = new javax.swing.JLabel();
        cbx_productOffer = new javax.swing.JComboBox();
        btn_searchProductOffer = new javax.swing.JButton();
        pnl_branchesOffer = new javax.swing.JPanel();
        txf_discount = new javax.swing.JTextField();
        cbx_moneyOffer = new javax.swing.JComboBox();
        lbl_measureOffer = new javax.swing.JLabel();
        btn_searchMoneyOffer = new javax.swing.JButton();
        cbx_branchOffer = new javax.swing.JComboBox();
        btn_lessOffer = new javax.swing.JButton();
        btn_searchBranchOffer = new javax.swing.JButton();
        btn_plusOffer = new javax.swing.JButton();
        lbl_discount = new javax.swing.JLabel();
        lbl_branchOffer = new javax.swing.JLabel();
        txf_quantityOffer = new javax.swing.JTextField();
        lbl_quantityOffer = new javax.swing.JLabel();
        lbl_discount2 = new javax.swing.JLabel();
        txf_discount2 = new javax.swing.JTextField();
        scp_tblStoreOffer = new javax.swing.JScrollPane();
        tbl_offer = new javax.swing.JTable();
        pnl_restoration = new nifax.control.view.util.Pnl_Tab();
        pnl_principalRestoration = new javax.swing.JPanel();
        lbl_descRestoration = new javax.swing.JLabel();
        txf_descRestoration = new javax.swing.JTextField();
        lbl_productRestoration = new javax.swing.JLabel();
        cbx_productRestoration = new javax.swing.JComboBox();
        btn_searchRestoration = new javax.swing.JButton();
        pnl_storesRestoration = new javax.swing.JPanel();
        txf_peak = new javax.swing.JTextField();
        cbx_moneyRestoration = new javax.swing.JComboBox();
        lbl_measureRestoration = new javax.swing.JLabel();
        btn_searchMoneyRestoration = new javax.swing.JButton();
        cbx_storeRestoration = new javax.swing.JComboBox();
        btn_lessRestoration = new javax.swing.JButton();
        btn_searchStoreRestoration = new javax.swing.JButton();
        btn_plusRestoration = new javax.swing.JButton();
        lbl_peak = new javax.swing.JLabel();
        lbl_storeRestoration = new javax.swing.JLabel();
        txf_lowPoint = new javax.swing.JTextField();
        lbl_lowPoint = new javax.swing.JLabel();
        lbl_midPoint = new javax.swing.JLabel();
        txf_midPoint = new javax.swing.JTextField();
        scp_tblStoreRestoration = new javax.swing.JScrollPane();
        tbl_restoration = new javax.swing.JTable();
        pnl_stock = new nifax.control.view.util.Pnl_Tab();
        pnl_principalStock = new javax.swing.JPanel();
        lbl_descStock = new javax.swing.JLabel();
        txf_descStock = new javax.swing.JTextField();
        lbl_productStock = new javax.swing.JLabel();
        cbx_productStock = new javax.swing.JComboBox();
        btn_searchProductStock = new javax.swing.JButton();
        pnl_storeStock = new javax.swing.JPanel();
        txf_quantityStock = new javax.swing.JTextField();
        cbx_moneyStock = new javax.swing.JComboBox();
        lbl_measureStock = new javax.swing.JLabel();
        btn_searchMoneyStock = new javax.swing.JButton();
        cbx_storeStock = new javax.swing.JComboBox();
        btn_lessStock = new javax.swing.JButton();
        btn_searchStore = new javax.swing.JButton();
        btn_plusStock = new javax.swing.JButton();
        lbl_quantityStock = new javax.swing.JLabel();
        lbl_storeStock = new javax.swing.JLabel();
        scp_tblStoreStock = new javax.swing.JScrollPane();
        tbl_stock = new javax.swing.JTable();
        pnl_menuProduct = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton(new Btn_saveAction(this));
        btn_search = new javax.swing.JButton(new Btn_searchAction(this));
        btn_delete = new javax.swing.JButton();
        btn_list = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        tbp_containerProduct.setBackground(new java.awt.Color(51, 51, 51));
        tbp_containerProduct.setOpaque(true);

        pnl_product.setName("Product");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pnl_principalProductLayout = new javax.swing.GroupLayout(pnl_principalProduct);
        pnl_principalProduct.setLayout(pnl_principalProductLayout);
        pnl_principalProductLayout.setHorizontalGroup(
            pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalProductLayout.createSequentialGroup()
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
                .addGap(10, 61, Short.MAX_VALUE))
            .addGroup(pnl_principalProductLayout.createSequentialGroup()
                .addGroup(pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_codesProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_codesProduct1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_principalProductLayout.setVerticalGroup(
            pnl_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalProductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_codesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_codesProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pnl_rulesProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Reglas de Cantidad"));

        lbl_units.setText("unidades");

        btn_searchMeasure.setText("...");
        btn_searchMeasure.setEnabled(false);

        lbl_an.setText("Un");

        lbl_equivalent.setText("equivale a ");

        btn_plusRule.setText("+");

        tbl_rules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "It", "Cod", "Medida", "Equivalente", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
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

        btn_lessRule.setText("-");

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
                                .addComponent(lbl_an, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rulesProductLayout.createSequentialGroup()
                                .addComponent(lbl_equivalent, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txf_equivalent)
                            .addComponent(cbx_measure, 0, 168, Short.MAX_VALUE))
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
                .addGap(10, 10, 10)
                .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_plusRule)
                    .addComponent(btn_lessRule))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_tblRules, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                    .addComponent(pnl_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(pnl_rulesProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        tbp_containerProduct.addTab("Producto", pnl_product);

        pnl_offer.setName("Offer");

        pnl_principalOffer.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        lbl_descOffer.setText("Descripcion  :");

        lbl_productOffer.setText("Producto : ");

        cbx_productOffer.setEditable(true);

        btn_searchProductOffer.setText("...");
        btn_searchProductOffer.setPreferredSize(new java.awt.Dimension(52, 28));

        pnl_branchesOffer.setBorder(javax.swing.BorderFactory.createTitledBorder("Por sucursal"));

        cbx_moneyOffer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_measureOffer.setText("Medida : ");

        btn_searchMoneyOffer.setText("...");
        btn_searchMoneyOffer.setPreferredSize(new java.awt.Dimension(52, 28));

        cbx_branchOffer.setEditable(true);
        cbx_branchOffer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas", "Santiago", "Capital" }));

        btn_lessOffer.setText("-");
        btn_lessOffer.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_searchBranchOffer.setText("...");
        btn_searchBranchOffer.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_plusOffer.setText("+");
        btn_plusOffer.setPreferredSize(new java.awt.Dimension(52, 28));

        lbl_discount.setText("Descuento : ");

        lbl_branchOffer.setText("Sucursal : ");

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
                                .addComponent(cbx_moneyOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_searchMoneyOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                                .addComponent(cbx_branchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                                        .addComponent(btn_plusOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_lessOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                                        .addComponent(btn_searchBranchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(6, 6, 6))
                    .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                        .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_discount2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_discount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(lbl_quantityOffer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_branchesOfferLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txf_quantityOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_branchesOfferLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_discount2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_branchesOfferLayout.setVerticalGroup(
            pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_branchesOfferLayout.createSequentialGroup()
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_discount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_discount2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_quantityOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_quantityOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_measureOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_moneyOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_searchMoneyOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_branchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchBranchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_branchOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_branchesOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lessOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout pnl_principalOfferLayout = new javax.swing.GroupLayout(pnl_principalOffer);
        pnl_principalOffer.setLayout(pnl_principalOfferLayout);
        pnl_principalOfferLayout.setHorizontalGroup(
            pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalOfferLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_productOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_descOffer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_descOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_productOffer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_searchProductOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnl_branchesOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_principalOfferLayout.setVerticalGroup(
            pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalOfferLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_productOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_productOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchProductOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_branchesOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_offer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_offer.setRequestFocusEnabled(false);
        scp_tblStoreOffer.setViewportView(tbl_offer);

        javax.swing.GroupLayout pnl_offerLayout = new javax.swing.GroupLayout(pnl_offer);
        pnl_offer.setLayout(pnl_offerLayout);
        pnl_offerLayout.setHorizontalGroup(
            pnl_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_offerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_tblStoreOffer, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );
        pnl_offerLayout.setVerticalGroup(
            pnl_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_offerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_principalOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scp_tblStoreOffer, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbp_containerProduct.addTab("Oferta ", pnl_offer);

        pnl_restoration.setName("Restoration");

        pnl_principalRestoration.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        lbl_descRestoration.setText("Descripcion  :");

        lbl_productRestoration.setText("Producto : ");

        cbx_productRestoration.setEditable(true);

        btn_searchRestoration.setText("...");
        btn_searchRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        pnl_storesRestoration.setBorder(javax.swing.BorderFactory.createTitledBorder("Por deposito"));

        cbx_moneyRestoration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_measureRestoration.setText("Medida : ");

        btn_searchMoneyRestoration.setText("...");
        btn_searchMoneyRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        cbx_storeRestoration.setEditable(true);
        cbx_storeRestoration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas", "Santiago", "Capital" }));

        btn_lessRestoration.setText("-");
        btn_lessRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_searchStoreRestoration.setText("...");
        btn_searchStoreRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_plusRestoration.setText("+");
        btn_plusRestoration.setPreferredSize(new java.awt.Dimension(52, 28));

        lbl_peak.setText("Punto Max : ");

        lbl_storeRestoration.setText("Deposito ");

        lbl_lowPoint.setText("Punto Min : ");

        lbl_midPoint.setText("Punto Rep  :");

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
                                .addComponent(cbx_moneyRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(lbl_midPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_peak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(lbl_lowPoint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_storesRestorationLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txf_lowPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_storesRestorationLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_midPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_peak, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_storesRestorationLayout.setVerticalGroup(
            pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_storesRestorationLayout.createSequentialGroup()
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_peak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_peak, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(cbx_moneyRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_searchMoneyRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_storeRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchStoreRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_storeRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_storesRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lessRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout pnl_principalRestorationLayout = new javax.swing.GroupLayout(pnl_principalRestoration);
        pnl_principalRestoration.setLayout(pnl_principalRestorationLayout);
        pnl_principalRestorationLayout.setHorizontalGroup(
            pnl_principalRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalRestorationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_principalRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_productRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_descRestoration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_descRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_productRestoration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_searchRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnl_storesRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_principalRestorationLayout.setVerticalGroup(
            pnl_principalRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalRestorationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_principalRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_productRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_productRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalRestorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_storesRestoration, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_restoration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scp_tblStoreRestoration.setViewportView(tbl_restoration);

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
                    .addComponent(scp_tblStoreRestoration, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbp_containerProduct.addTab("Reposicion", pnl_restoration);

        pnl_stock.setName("Stock");

        pnl_principalStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        lbl_descStock.setText("Descripcion  :");

        lbl_productStock.setText("Producto : ");

        cbx_productStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_searchProductStock.setText("...");
        btn_searchProductStock.setPreferredSize(new java.awt.Dimension(52, 28));

        pnl_storeStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Por deposito"));

        cbx_moneyStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_measureStock.setText("Medida : ");

        btn_searchMoneyStock.setText("...");
        btn_searchMoneyStock.setPreferredSize(new java.awt.Dimension(52, 28));

        cbx_storeStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_lessStock.setText("-");
        btn_lessStock.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_searchStore.setText("...");
        btn_searchStore.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_plusStock.setText("+");
        btn_plusStock.setPreferredSize(new java.awt.Dimension(52, 28));

        lbl_quantityStock.setText("Cantidad : ");

        lbl_storeStock.setText("Deposito :");

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
                                .addComponent(cbx_moneyStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(lbl_quantityStock, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txf_quantityStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl_storeStockLayout.setVerticalGroup(
            pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_storeStockLayout.createSequentialGroup()
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_quantityStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_quantityStock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_measureStock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_moneyStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_searchMoneyStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lessStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout pnl_principalStockLayout = new javax.swing.GroupLayout(pnl_principalStock);
        pnl_principalStock.setLayout(pnl_principalStockLayout);
        pnl_principalStockLayout.setHorizontalGroup(
            pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalStockLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_productStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_descStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_productStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_searchProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnl_storeStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_principalStockLayout.setVerticalGroup(
            pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalStockLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_productStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_productStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scp_tblStoreStock.setViewportView(tbl_stock);

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
                    .addComponent(scp_tblStoreStock, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbp_containerProduct.addTab("Stock", pnl_stock);

        pnl_menuProduct.setBackground(new java.awt.Color(51, 51, 51));
        pnl_menuProduct.setBorder(null);

        btn_save.setText("Guardar");

        btn_search.setText("Buscar");

        btn_delete.setText("Eliminar");

        btn_list.setText("LUPA");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
    private javax.swing.JButton btn_searchMoneyOffer;
    private javax.swing.JButton btn_searchMoneyProduct;
    private javax.swing.JButton btn_searchMoneyRestoration;
    private javax.swing.JButton btn_searchMoneyStock;
    private javax.swing.JButton btn_searchProductOffer;
    private javax.swing.JButton btn_searchProductStock;
    private javax.swing.JButton btn_searchRestoration;
    private javax.swing.JButton btn_searchStore;
    private javax.swing.JButton btn_searchStoreRestoration;
    private javax.swing.JComboBox cbx_branchOffer;
    private javax.swing.JComboBox cbx_category;
    private javax.swing.JComboBox cbx_iva;
    private javax.swing.JComboBox cbx_measure;
    private javax.swing.JComboBox cbx_money;
    private javax.swing.JComboBox cbx_moneyOffer;
    private javax.swing.JComboBox cbx_moneyRestoration;
    private javax.swing.JComboBox cbx_moneyStock;
    private javax.swing.JComboBox cbx_productOffer;
    private javax.swing.JComboBox cbx_productRestoration;
    private javax.swing.JComboBox cbx_productStock;
    private javax.swing.JComboBox cbx_storeRestoration;
    private javax.swing.JComboBox cbx_storeStock;
    private javax.swing.JLabel jlbl_barCode1;
    private javax.swing.JLabel lbl_an;
    private javax.swing.JLabel lbl_branchOffer;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_codeAlternative;
    private javax.swing.JLabel lbl_codeProduct;
    private javax.swing.JLabel lbl_cost;
    private javax.swing.JLabel lbl_descOffer;
    private javax.swing.JLabel lbl_descProduct;
    private javax.swing.JLabel lbl_descRestoration;
    private javax.swing.JLabel lbl_descStock;
    private javax.swing.JLabel lbl_discount;
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
    private javax.swing.JLabel lbl_productOffer;
    private javax.swing.JLabel lbl_productRestoration;
    private javax.swing.JLabel lbl_productStock;
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
    private javax.swing.JPanel pnl_restoration;
    private javax.swing.JPanel pnl_rulesProduct;
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
    private javax.swing.JTextField txf_cost;
    private javax.swing.JTextField txf_descOffer;
    private javax.swing.JTextField txf_descProduct;
    private javax.swing.JTextField txf_descRestoration;
    private javax.swing.JTextField txf_descStock;
    private javax.swing.JTextField txf_discount;
    private javax.swing.JTextField txf_discount2;
    private javax.swing.JTextField txf_equivalent;
    private javax.swing.JTextField txf_lowPoint;
    private javax.swing.JTextField txf_midPoint;
    private javax.swing.JTextField txf_peak;
    private javax.swing.JTextField txf_quantityOffer;
    private javax.swing.JTextField txf_quantityStock;
    // End of variables declaration//GEN-END:variables
}
