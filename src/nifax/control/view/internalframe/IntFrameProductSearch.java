package nifax.control.view.internalframe;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import nifax.control.controller.Searching;
import nifax.control.view.event.txf.Txf_searchProduct;

/**
 *
 * @author NB
 */
public class IntFrameProductSearch extends javax.swing.JInternalFrame {

    public IntFrameProductSearch(JLayeredPane layeredPane) {
        initComponents();

        Dimension frameMainSize = layeredPane.getSize();
        Dimension intFrameSize = getSize();
        int width = (frameMainSize.width - intFrameSize.width) / 2;
        int height = (frameMainSize.height - intFrameSize.height) / 2;

        setLocation(width, height);
        setResizable(true);
        setClosable(true);
        setVisible(true);
        
        this.toFront();
        this.requestFocus();
        this.txf_codeProduct.requestFocus();
    }

    public JLabel getLbl_alternativeProduct() {
        return lbl_alternativeProduct;
    }

    public JLabel getLbl_catProduct() {
        return lbl_catProduct;
    }

    public JLabel getLbl_codeProduct() {
        return lbl_codeProduct;
    }

    public JLabel getLbl_descProduct() {
        return lbl_descProduct;
    }

    public JPanel getPnl_searchProd() {
        return pnl_searchProd;
    }

    public JScrollPane getScp_availability() {
        return scp_availability;
    }

    public JScrollPane getScp_offer() {
        return scp_offer;
    }

    public JScrollPane getScp_prices() {
        return scp_prices;
    }

    public JScrollPane getScp_products() {
        return scp_products;
    }

    public JTable getTbl_availability() {
        return tbl_availability;
    }

    public JTable getTbl_offer() {
        return tbl_offer;
    }

    public JTable getTbl_prices() {
        return tbl_prices;
    }

    public JTable getTbl_products() {
        return tbl_products;
    }

    public JTextField getTxf_alternativeProduct() {
        return txf_alternativeProduct;
    }

    public JTextField getTxf_catProduct() {
        return txf_catProduct;
    }

    public JTextField getTxf_codeProduct() {
        return txf_codeProduct;
    }

    public JTextField getTxf_descProduct() {
        return txf_descProduct;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_searchProd = new javax.swing.JPanel();
        lbl_codeProduct = new javax.swing.JLabel();
        lbl_alternativeProduct = new javax.swing.JLabel();
        lbl_catProduct = new javax.swing.JLabel();
        lbl_descProduct = new javax.swing.JLabel();
        txf_alternativeProduct = new javax.swing.JTextField();
        txf_catProduct = new javax.swing.JTextField();
        txf_codeProduct = new javax.swing.JTextField();
        txf_descProduct = new javax.swing.JTextField();
        scp_products = new javax.swing.JScrollPane();
        tbl_products = new javax.swing.JTable();
        scp_availability = new javax.swing.JScrollPane();
        tbl_availability = new javax.swing.JTable();
        scp_offer = new javax.swing.JScrollPane();
        tbl_offer = new javax.swing.JTable();
        scp_prices = new javax.swing.JScrollPane();
        tbl_prices = new javax.swing.JTable();

        setVisible(true);

        lbl_codeProduct.setText("Codigo :");

        lbl_alternativeProduct.setText("Codigo Alt : ");
        lbl_alternativeProduct.setEnabled(false);

        lbl_catProduct.setText("Categoria :");

        lbl_descProduct.setText("Descripcion :");

        txf_alternativeProduct.setEnabled(false);

        txf_catProduct.addKeyListener(new Txf_searchProduct(this,Searching.CATEGORY,Searching.SEARCH_PRODUCT));

        txf_codeProduct.addKeyListener(new Txf_searchProduct(this,Searching.CODE,Searching.SEARCH_PRODUCT));

        txf_descProduct.addKeyListener(new Txf_searchProduct(this,Searching.DESCRIPTION,Searching.SEARCH_PRODUCT));

        javax.swing.GroupLayout pnl_searchProdLayout = new javax.swing.GroupLayout(pnl_searchProd);
        pnl_searchProd.setLayout(pnl_searchProdLayout);
        pnl_searchProdLayout.setHorizontalGroup(
            pnl_searchProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_searchProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_searchProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_searchProdLayout.createSequentialGroup()
                        .addComponent(lbl_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_searchProdLayout.createSequentialGroup()
                        .addComponent(lbl_alternativeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_alternativeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(pnl_searchProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_searchProdLayout.createSequentialGroup()
                        .addComponent(lbl_descProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_descProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_searchProdLayout.createSequentialGroup()
                        .addComponent(lbl_catProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_catProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_searchProdLayout.setVerticalGroup(
            pnl_searchProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_searchProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_searchProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_descProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_codeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_searchProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_alternativeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_catProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_alternativeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_catProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        tbl_products.addKeyListener(new nifax.control.view.event.tbl.Tbl_productListener(this));
        tbl_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Categoria", "Costo", "Iva ", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_products.getTableHeader().setReorderingAllowed(false);
        scp_products.setViewportView(tbl_products);

        tbl_availability.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fisico", "Disponible", "Comprometido", "Medida", "Depo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_availability.getTableHeader().setReorderingAllowed(false);
        scp_availability.setViewportView(tbl_availability);

        tbl_offer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant.", "Desc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_offer.getTableHeader().setReorderingAllowed(false);
        scp_offer.setViewportView(tbl_offer);

        tbl_prices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_prices.setEnabled(false);
        scp_prices.setViewportView(tbl_prices);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scp_prices)
                    .addComponent(pnl_searchProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(scp_offer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scp_products, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scp_availability, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_searchProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scp_products, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(scp_availability, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scp_offer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(scp_prices, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_alternativeProduct;
    private javax.swing.JLabel lbl_catProduct;
    private javax.swing.JLabel lbl_codeProduct;
    private javax.swing.JLabel lbl_descProduct;
    private javax.swing.JPanel pnl_searchProd;
    private javax.swing.JScrollPane scp_availability;
    private javax.swing.JScrollPane scp_offer;
    private javax.swing.JScrollPane scp_prices;
    private javax.swing.JScrollPane scp_products;
    private javax.swing.JTable tbl_availability;
    private javax.swing.JTable tbl_offer;
    private javax.swing.JTable tbl_prices;
    private javax.swing.JTable tbl_products;
    private javax.swing.JTextField txf_alternativeProduct;
    private javax.swing.JTextField txf_catProduct;
    private javax.swing.JTextField txf_codeProduct;
    private javax.swing.JTextField txf_descProduct;
    // End of variables declaration//GEN-END:variables
}
