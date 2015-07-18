package nifax.control.view.panel;

import nifax.control.view.util.Pnl;


/**
 *
 * @author NB
 */
public class PanelProductsAdmin extends Pnl {

    
    public PanelProductsAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbp_containerProduct = new nifax.control.view.util.Tbp();
        pnl_products = new nifax.control.view.util.Pnl_Tab();
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
        jlbl_barCode = new javax.swing.JLabel();
        lbl_codeProduct = new javax.swing.JLabel();
        lbl_codeAlternative = new javax.swing.JLabel();
        jtxtf_codeAlternative = new javax.swing.JTextField();
        jtxf_codeProduct = new javax.swing.JTextField();
        jtxf_barCode = new javax.swing.JTextField();
        pnl_rulesProduct = new javax.swing.JPanel();
        lbl_units = new javax.swing.JLabel();
        txf_equivalent = new javax.swing.JTextField();
        cbx_measure = new javax.swing.JComboBox();
        btn_searchMeasure = new javax.swing.JButton();
        lbl_an = new javax.swing.JLabel();
        lbl_equivalent = new javax.swing.JLabel();
        btn_plusRule = new javax.swing.JButton();
        scp_tblRules = new javax.swing.JScrollPane();
        tbl_rules = new javax.swing.JTable();
        btn_lessRule = new javax.swing.JButton();
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
        btn_save = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        tbp_containerProduct.setBackground(new java.awt.Color(51, 51, 51));
        tbp_containerProduct.setOpaque(true);

        pnl_principalProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));
        pnl_principalProduct.setPreferredSize(new java.awt.Dimension(460, 360));

        lbl_cost.setText("Costo : ");

        lbl_descProduct.setText("Descripcion :");

        lbl_category.setText("Categoria :");

        cbx_category.setEditable(true);

        lbl_money.setText("Moneda : ");

        cbx_money.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_searchCategory.setText("...");
        btn_searchCategory.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_searchMoneyProduct.setText("...");
        btn_searchMoneyProduct.setPreferredSize(new java.awt.Dimension(52, 28));

        pnl_codesProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigos"));

        jlbl_barCode.setText("De barra : ");

        lbl_codeProduct.setText("De Producto : ");

        lbl_codeAlternative.setText("Alternativo  :");

        javax.swing.GroupLayout pnl_codesProductLayout = new javax.swing.GroupLayout(pnl_codesProduct);
        pnl_codesProduct.setLayout(pnl_codesProductLayout);
        pnl_codesProductLayout.setHorizontalGroup(
            pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_codesProductLayout.createSequentialGroup()
                .addComponent(lbl_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_codesProductLayout.createSequentialGroup()
                .addGroup(pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_barCode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxf_codeProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jtxf_barCode)
                    .addComponent(jtxtf_codeAlternative))
                .addContainerGap())
        );
        pnl_codesProductLayout.setVerticalGroup(
            pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_codesProductLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_barCode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxf_barCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxf_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
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
                .addComponent(pnl_codesProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pnl_codesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        pnl_rulesProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Reglas de Cantidad"));

        lbl_units.setText("unidades");

        cbx_measure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_searchMeasure.setText("...");

        lbl_an.setText("Un");

        lbl_equivalent.setText("equivale a ");

        btn_plusRule.setText("+");

        tbl_rules.setModel(new javax.swing.table.DefaultTableModel(
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

        javax.swing.GroupLayout pnl_productsLayout = new javax.swing.GroupLayout(pnl_products);
        pnl_products.setLayout(pnl_productsLayout);
        pnl_productsLayout.setHorizontalGroup(
            pnl_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_rulesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        pnl_productsLayout.setVerticalGroup(
            pnl_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(pnl_rulesProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        tbp_containerProduct.addTab("Producto", pnl_products);

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
    private javax.swing.JLabel jlbl_barCode;
    private javax.swing.JTextField jtxf_barCode;
    private javax.swing.JTextField jtxf_codeProduct;
    private javax.swing.JTextField jtxtf_codeAlternative;
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
    private javax.swing.JPanel pnl_menuProduct;
    private javax.swing.JPanel pnl_offer;
    private javax.swing.JPanel pnl_principalOffer;
    private javax.swing.JPanel pnl_principalProduct;
    private javax.swing.JPanel pnl_principalRestoration;
    private javax.swing.JPanel pnl_principalStock;
    private javax.swing.JPanel pnl_products;
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
