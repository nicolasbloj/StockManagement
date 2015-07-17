package nifax.control.view.panel;


/**
 *
 * @author NB
 */
public class PanelProductsAdmin extends javax.swing.JPanel {

    
    public PanelProductsAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbp_container = new javax.swing.JTabbedPane();
        pnl_products = new nifax.control.view.util.Jp_Tab();
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
        pnl_offer = new nifax.control.view.util.Jp_Tab();
        pnl_restoration = new nifax.control.view.util.Jp_Tab();
        pnl_stock = new nifax.control.view.util.Jp_Tab();
        pnl_principalStock = new javax.swing.JPanel();
        lbl_descStock = new javax.swing.JLabel();
        txf_descStock = new javax.swing.JTextField();
        lbl_product = new javax.swing.JLabel();
        cbx_product = new javax.swing.JComboBox();
        btn_searchProduct = new javax.swing.JButton();
        pnl_storeStock = new javax.swing.JPanel();
        txf_quantity = new javax.swing.JTextField();
        cbx_moneyStock = new javax.swing.JComboBox();
        lbl_measureStock = new javax.swing.JLabel();
        btn_searchMoneyStock = new javax.swing.JButton();
        cbx_storeStock = new javax.swing.JComboBox();
        btn_lessStock = new javax.swing.JButton();
        scp_tblStoreStock = new javax.swing.JScrollPane();
        tbl_stock = new javax.swing.JTable();
        btn_searchStore = new javax.swing.JButton();
        btn_plusStock = new javax.swing.JButton();
        lbl_quantity = new javax.swing.JLabel();
        lbl_storeStock = new javax.swing.JLabel();
        pnl_menu = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        tbp_container.setBackground(new java.awt.Color(51, 51, 51));
        tbp_container.setOpaque(true);

        pnl_principalProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

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
                    .addComponent(txf_descProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(txf_cost))
                .addGap(10, 35, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_plusRule)
                    .addComponent(btn_lessRule))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_tblRules, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_productsLayout = new javax.swing.GroupLayout(pnl_products);
        pnl_products.setLayout(pnl_productsLayout);
        pnl_productsLayout.setHorizontalGroup(
            pnl_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_rulesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        pnl_productsLayout.setVerticalGroup(
            pnl_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_productsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_rulesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbp_container.addTab("Producto", pnl_products);

        javax.swing.GroupLayout pnl_offerLayout = new javax.swing.GroupLayout(pnl_offer);
        pnl_offer.setLayout(pnl_offerLayout);
        pnl_offerLayout.setHorizontalGroup(
            pnl_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        pnl_offerLayout.setVerticalGroup(
            pnl_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        tbp_container.addTab("Oferta ", pnl_offer);

        javax.swing.GroupLayout pnl_restorationLayout = new javax.swing.GroupLayout(pnl_restoration);
        pnl_restoration.setLayout(pnl_restorationLayout);
        pnl_restorationLayout.setHorizontalGroup(
            pnl_restorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        pnl_restorationLayout.setVerticalGroup(
            pnl_restorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        tbp_container.addTab("Reposicion", pnl_restoration);

        pnl_principalStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        lbl_descStock.setText("Descripcion  :");

        lbl_product.setText("Producto : ");

        cbx_product.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_searchProduct.setText("...");
        btn_searchProduct.setPreferredSize(new java.awt.Dimension(52, 28));

        pnl_storeStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Por deposito"));

        cbx_moneyStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_measureStock.setText("Medida : ");

        btn_searchMoneyStock.setText("...");
        btn_searchMoneyStock.setPreferredSize(new java.awt.Dimension(52, 28));

        cbx_storeStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_lessStock.setText("-");
        btn_lessStock.setPreferredSize(new java.awt.Dimension(52, 28));

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

        btn_searchStore.setText("...");
        btn_searchStore.setPreferredSize(new java.awt.Dimension(52, 28));

        btn_plusStock.setText("+");
        btn_plusStock.setPreferredSize(new java.awt.Dimension(52, 28));

        lbl_quantity.setText("Cantidad : ");

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
                        .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_storeStockLayout.createSequentialGroup()
                        .addComponent(scp_tblStoreStock, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnl_storeStockLayout.setVerticalGroup(
            pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_storeStockLayout.createSequentialGroup()
                .addGroup(pnl_storeStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_tblStoreStock, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout pnl_principalStockLayout = new javax.swing.GroupLayout(pnl_principalStock);
        pnl_principalStock.setLayout(pnl_principalStockLayout);
        pnl_principalStockLayout.setHorizontalGroup(
            pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalStockLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_descStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnl_storeStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_principalStockLayout.setVerticalGroup(
            pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalStockLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_product, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_stockLayout = new javax.swing.GroupLayout(pnl_stock);
        pnl_stock.setLayout(pnl_stockLayout);
        pnl_stockLayout.setHorizontalGroup(
            pnl_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_stockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(622, Short.MAX_VALUE))
        );
        pnl_stockLayout.setVerticalGroup(
            pnl_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_stockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tbp_container.addTab("Stock", pnl_stock);

        pnl_menu.setBackground(new java.awt.Color(51, 51, 51));
        pnl_menu.setBorder(null);

        btn_save.setText("Guardar");

        btn_search.setText("Buscar");

        btn_delete.setText("Eliminar");

        btn_cancel.setText("Cancelar");

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
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
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(tbp_container)
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbp_container)
                .addGap(0, 0, 0)
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_lessRule;
    private javax.swing.JButton btn_lessStock;
    private javax.swing.JButton btn_plusRule;
    private javax.swing.JButton btn_plusStock;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_searchCategory;
    private javax.swing.JButton btn_searchMeasure;
    private javax.swing.JButton btn_searchMoneyProduct;
    private javax.swing.JButton btn_searchMoneyStock;
    private javax.swing.JButton btn_searchProduct;
    private javax.swing.JButton btn_searchStore;
    private javax.swing.JComboBox cbx_category;
    private javax.swing.JComboBox cbx_measure;
    private javax.swing.JComboBox cbx_money;
    private javax.swing.JComboBox cbx_moneyStock;
    private javax.swing.JComboBox cbx_product;
    private javax.swing.JComboBox cbx_storeStock;
    private javax.swing.JLabel jlbl_barCode;
    private javax.swing.JTextField jtxf_barCode;
    private javax.swing.JTextField jtxf_codeProduct;
    private javax.swing.JTextField jtxtf_codeAlternative;
    private javax.swing.JLabel lbl_an;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_codeAlternative;
    private javax.swing.JLabel lbl_codeProduct;
    private javax.swing.JLabel lbl_cost;
    private javax.swing.JLabel lbl_descProduct;
    private javax.swing.JLabel lbl_descStock;
    private javax.swing.JLabel lbl_equivalent;
    private javax.swing.JLabel lbl_measureStock;
    private javax.swing.JLabel lbl_money;
    private javax.swing.JLabel lbl_product;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_storeStock;
    private javax.swing.JLabel lbl_units;
    private javax.swing.JPanel pnl_codesProduct;
    private javax.swing.JPanel pnl_menu;
    private javax.swing.JPanel pnl_offer;
    private javax.swing.JPanel pnl_principalProduct;
    private javax.swing.JPanel pnl_principalStock;
    private javax.swing.JPanel pnl_products;
    private javax.swing.JPanel pnl_restoration;
    private javax.swing.JPanel pnl_rulesProduct;
    private javax.swing.JPanel pnl_stock;
    private javax.swing.JPanel pnl_storeStock;
    private javax.swing.JScrollPane scp_tblRules;
    private javax.swing.JScrollPane scp_tblStoreStock;
    private javax.swing.JTable tbl_rules;
    private javax.swing.JTable tbl_stock;
    private javax.swing.JTabbedPane tbp_container;
    private javax.swing.JTextField txf_cost;
    private javax.swing.JTextField txf_descProduct;
    private javax.swing.JTextField txf_descStock;
    private javax.swing.JTextField txf_equivalent;
    private javax.swing.JTextField txf_quantity;
    // End of variables declaration//GEN-END:variables
}
