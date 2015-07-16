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

        jtp_container = new javax.swing.JTabbedPane();
        jp_products = new nifax.control.view.util.Jp_Tab();
        jp_principalProduct = new javax.swing.JPanel();
        jtxf_cost = new javax.swing.JTextField();
        jlbl_cost = new javax.swing.JLabel();
        jlbl_descProduct = new javax.swing.JLabel();
        jtxf_descProduct = new javax.swing.JTextField();
        jlbl_category = new javax.swing.JLabel();
        jcb_category = new javax.swing.JComboBox();
        jlbl_money = new javax.swing.JLabel();
        jcb_money = new javax.swing.JComboBox();
        jbtn_searchCategory = new javax.swing.JButton();
        jbtn_searchMoneyProduct = new javax.swing.JButton();
        jp_codesProduct = new javax.swing.JPanel();
        jlbl_barCode = new javax.swing.JLabel();
        lbl_codeProduct = new javax.swing.JLabel();
        lbl_codeAlternative = new javax.swing.JLabel();
        jtxtf_codeAlternative = new javax.swing.JTextField();
        jtxf_codeProduct = new javax.swing.JTextField();
        jtxf_barCode = new javax.swing.JTextField();
        jp_rulesProduct = new javax.swing.JPanel();
        jlbl_units = new javax.swing.JLabel();
        jtxf_equivalent = new javax.swing.JTextField();
        jcb_measure = new javax.swing.JComboBox();
        jbtn_searchMeasure = new javax.swing.JButton();
        jlbl_an = new javax.swing.JLabel();
        jlbl_equivalent = new javax.swing.JLabel();
        jbtn_plusRule = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_measures = new javax.swing.JTable();
        jbtn_lessRule = new javax.swing.JButton();
        jp_offer = new nifax.control.view.util.Jp_Tab();
        jp_restoration = new nifax.control.view.util.Jp_Tab();
        jp_stock = new nifax.control.view.util.Jp_Tab();
        jp_principalStock = new javax.swing.JPanel();
        jlbl_descStock = new javax.swing.JLabel();
        jtxf_descStock = new javax.swing.JTextField();
        jlbl_product = new javax.swing.JLabel();
        jcb_product = new javax.swing.JComboBox();
        jbtn_searchProduct = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jtxf_quantity = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jlbl_measureStock = new javax.swing.JLabel();
        jbtn_searchMonetStock = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox();
        jbtn_lessStock = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtb_stock = new javax.swing.JTable();
        jbtn_searchStore = new javax.swing.JButton();
        jbtn_plusStock = new javax.swing.JButton();
        jlbl_quantity = new javax.swing.JLabel();
        jlbl_storeStock = new javax.swing.JLabel();
        jp_menu = new javax.swing.JPanel();
        jbtn_save = new javax.swing.JButton();
        jbtn_search = new javax.swing.JButton();
        jbtn_delete = new javax.swing.JButton();
        jbtn_cancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jtp_container.setBackground(new java.awt.Color(51, 51, 51));
        jtp_container.setOpaque(true);

        jp_principalProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        jlbl_cost.setText("Costo : ");

        jlbl_descProduct.setText("Descripcion :");

        jlbl_category.setText("Categoria :");

        jcb_category.setEditable(true);

        jlbl_money.setText("Moneda : ");

        jcb_money.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtn_searchCategory.setText("...");
        jbtn_searchCategory.setPreferredSize(new java.awt.Dimension(52, 28));

        jbtn_searchMoneyProduct.setText("...");
        jbtn_searchMoneyProduct.setPreferredSize(new java.awt.Dimension(52, 28));

        jp_codesProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigos"));

        jlbl_barCode.setText("De barra : ");

        lbl_codeProduct.setText("De Producto : ");

        lbl_codeAlternative.setText("Alternativo  :");

        javax.swing.GroupLayout jp_codesProductLayout = new javax.swing.GroupLayout(jp_codesProduct);
        jp_codesProduct.setLayout(jp_codesProductLayout);
        jp_codesProductLayout.setHorizontalGroup(
            jp_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_codesProductLayout.createSequentialGroup()
                .addComponent(lbl_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_codesProductLayout.createSequentialGroup()
                .addGroup(jp_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_barCode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxf_codeProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(jtxf_barCode)
                    .addComponent(jtxtf_codeAlternative))
                .addContainerGap())
        );
        jp_codesProductLayout.setVerticalGroup(
            jp_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_codesProductLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jp_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_barCode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxf_barCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxf_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_codesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtf_codeAlternative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jp_principalProductLayout = new javax.swing.GroupLayout(jp_principalProduct);
        jp_principalProduct.setLayout(jp_principalProductLayout);
        jp_principalProductLayout.setHorizontalGroup(
            jp_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_principalProductLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jp_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbl_money, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl_category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl_cost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl_descProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jp_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_principalProductLayout.createSequentialGroup()
                        .addComponent(jcb_category, 0, 162, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_searchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_principalProductLayout.createSequentialGroup()
                        .addComponent(jcb_money, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_searchMoneyProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxf_descProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jtxf_cost))
                .addGap(10, 35, Short.MAX_VALUE))
            .addGroup(jp_principalProductLayout.createSequentialGroup()
                .addComponent(jp_codesProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_principalProductLayout.setVerticalGroup(
            jp_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_principalProductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_category, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_searchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_descProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxf_descProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxf_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jp_principalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_money, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_searchMoneyProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_codesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        jp_rulesProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Reglas de Cantidad"));

        jlbl_units.setText("unidades");

        jcb_measure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtn_searchMeasure.setText("...");

        jlbl_an.setText("Un");

        jlbl_equivalent.setText("equivale a ");

        jbtn_plusRule.setText("+");

        jtb_measures.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtb_measures);

        jbtn_lessRule.setText("-");

        javax.swing.GroupLayout jp_rulesProductLayout = new javax.swing.GroupLayout(jp_rulesProduct);
        jp_rulesProduct.setLayout(jp_rulesProductLayout);
        jp_rulesProductLayout.setHorizontalGroup(
            jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_rulesProductLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_rulesProductLayout.createSequentialGroup()
                        .addGroup(jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_rulesProductLayout.createSequentialGroup()
                                .addComponent(jlbl_an, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_rulesProductLayout.createSequentialGroup()
                                .addComponent(jlbl_equivalent, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxf_equivalent)
                            .addComponent(jcb_measure, 0, 168, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_rulesProductLayout.createSequentialGroup()
                                .addComponent(jbtn_plusRule, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_lessRule, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtn_searchMeasure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbl_units, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 0, 0))
        );
        jp_rulesProductLayout.setVerticalGroup(
            jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_rulesProductLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_an, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_measure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_searchMeasure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_units, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxf_equivalent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_equivalent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_rulesProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_plusRule)
                    .addComponent(jbtn_lessRule))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jp_productsLayout = new javax.swing.GroupLayout(jp_products);
        jp_products.setLayout(jp_productsLayout);
        jp_productsLayout.setHorizontalGroup(
            jp_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_rulesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jp_productsLayout.setVerticalGroup(
            jp_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_productsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_rulesProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_principalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtp_container.addTab("Producto", jp_products);

        javax.swing.GroupLayout jp_offerLayout = new javax.swing.GroupLayout(jp_offer);
        jp_offer.setLayout(jp_offerLayout);
        jp_offerLayout.setHorizontalGroup(
            jp_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        jp_offerLayout.setVerticalGroup(
            jp_offerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jtp_container.addTab("Oferta ", jp_offer);

        javax.swing.GroupLayout jp_restorationLayout = new javax.swing.GroupLayout(jp_restoration);
        jp_restoration.setLayout(jp_restorationLayout);
        jp_restorationLayout.setHorizontalGroup(
            jp_restorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        jp_restorationLayout.setVerticalGroup(
            jp_restorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jtp_container.addTab("Reposicion", jp_restoration);

        jp_principalStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        jlbl_descStock.setText("Descripcion  :");

        jlbl_product.setText("Producto : ");

        jcb_product.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtn_searchProduct.setText("...");
        jbtn_searchProduct.setPreferredSize(new java.awt.Dimension(52, 28));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Por deposito"));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlbl_measureStock.setText("Medida : ");

        jbtn_searchMonetStock.setText("...");
        jbtn_searchMonetStock.setPreferredSize(new java.awt.Dimension(52, 28));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtn_lessStock.setText("-");
        jbtn_lessStock.setPreferredSize(new java.awt.Dimension(52, 28));

        jtb_stock.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtb_stock);

        jbtn_searchStore.setText("...");
        jbtn_searchStore.setPreferredSize(new java.awt.Dimension(52, 28));

        jbtn_plusStock.setText("+");
        jbtn_plusStock.setPreferredSize(new java.awt.Dimension(52, 28));

        jlbl_quantity.setText("Cantidad : ");

        jlbl_storeStock.setText("Deposito :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_measureStock, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_searchMonetStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jbtn_plusStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn_lessStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jbtn_searchStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jlbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jtxf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_measureStock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn_searchMonetStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_searchStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_storeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_lessStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_plusStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jp_principalStockLayout = new javax.swing.GroupLayout(jp_principalStock);
        jp_principalStock.setLayout(jp_principalStockLayout);
        jp_principalStockLayout.setHorizontalGroup(
            jp_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_principalStockLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jp_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbl_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl_descStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxf_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_principalStockLayout.setVerticalGroup(
            jp_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_principalStockLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jp_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_product, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_principalStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxf_descStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_stockLayout = new javax.swing.GroupLayout(jp_stock);
        jp_stock.setLayout(jp_stockLayout);
        jp_stockLayout.setHorizontalGroup(
            jp_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_stockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_principalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(622, Short.MAX_VALUE))
        );
        jp_stockLayout.setVerticalGroup(
            jp_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_stockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_principalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jtp_container.addTab("Stock", jp_stock);

        jp_menu.setBackground(new java.awt.Color(51, 51, 51));
        jp_menu.setBorder(null);

        jbtn_save.setText("Guardar");

        jbtn_search.setText("Buscar");

        jbtn_delete.setText("Eliminar");

        jbtn_cancel.setText("Cancelar");

        javax.swing.GroupLayout jp_menuLayout = new javax.swing.GroupLayout(jp_menu);
        jp_menu.setLayout(jp_menuLayout);
        jp_menuLayout.setHorizontalGroup(
            jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menuLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jbtn_save)
                .addGap(10, 10, 10)
                .addComponent(jbtn_search)
                .addGap(10, 10, 10)
                .addComponent(jbtn_delete)
                .addGap(10, 10, 10)
                .addComponent(jbtn_cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_menuLayout.setVerticalGroup(
            jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_menuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_save)
                    .addComponent(jbtn_search)
                    .addComponent(jbtn_delete)
                    .addComponent(jbtn_cancel)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jtp_container)
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtp_container)
                .addGap(0, 0, 0)
                .addComponent(jp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtn_cancel;
    private javax.swing.JButton jbtn_delete;
    private javax.swing.JButton jbtn_lessRule;
    private javax.swing.JButton jbtn_lessStock;
    private javax.swing.JButton jbtn_plusRule;
    private javax.swing.JButton jbtn_plusStock;
    private javax.swing.JButton jbtn_save;
    private javax.swing.JButton jbtn_search;
    private javax.swing.JButton jbtn_searchCategory;
    private javax.swing.JButton jbtn_searchMeasure;
    private javax.swing.JButton jbtn_searchMonetStock;
    private javax.swing.JButton jbtn_searchMoneyProduct;
    private javax.swing.JButton jbtn_searchProduct;
    private javax.swing.JButton jbtn_searchStore;
    private javax.swing.JComboBox jcb_category;
    private javax.swing.JComboBox jcb_measure;
    private javax.swing.JComboBox jcb_money;
    private javax.swing.JComboBox jcb_product;
    private javax.swing.JLabel jlbl_an;
    private javax.swing.JLabel jlbl_barCode;
    private javax.swing.JLabel jlbl_category;
    private javax.swing.JLabel jlbl_cost;
    private javax.swing.JLabel jlbl_descProduct;
    private javax.swing.JLabel jlbl_descStock;
    private javax.swing.JLabel jlbl_equivalent;
    private javax.swing.JLabel jlbl_measureStock;
    private javax.swing.JLabel jlbl_money;
    private javax.swing.JLabel jlbl_product;
    private javax.swing.JLabel jlbl_quantity;
    private javax.swing.JLabel jlbl_storeStock;
    private javax.swing.JLabel jlbl_units;
    private javax.swing.JPanel jp_codesProduct;
    private javax.swing.JPanel jp_menu;
    private javax.swing.JPanel jp_offer;
    private javax.swing.JPanel jp_principalProduct;
    private javax.swing.JPanel jp_principalStock;
    private javax.swing.JPanel jp_products;
    private javax.swing.JPanel jp_restoration;
    private javax.swing.JPanel jp_rulesProduct;
    private javax.swing.JPanel jp_stock;
    private javax.swing.JTable jtb_measures;
    private javax.swing.JTable jtb_stock;
    private javax.swing.JTabbedPane jtp_container;
    private javax.swing.JTextField jtxf_barCode;
    private javax.swing.JTextField jtxf_codeProduct;
    private javax.swing.JTextField jtxf_cost;
    private javax.swing.JTextField jtxf_descProduct;
    private javax.swing.JTextField jtxf_descStock;
    private javax.swing.JTextField jtxf_equivalent;
    private javax.swing.JTextField jtxf_quantity;
    private javax.swing.JTextField jtxtf_codeAlternative;
    private javax.swing.JLabel lbl_codeAlternative;
    private javax.swing.JLabel lbl_codeProduct;
    // End of variables declaration//GEN-END:variables
}
