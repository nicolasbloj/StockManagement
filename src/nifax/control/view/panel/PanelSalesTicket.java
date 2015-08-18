package nifax.control.view.panel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import nifax.control.controller.Administration;
import nifax.control.controller.Operation;
import nifax.control.view.event.btn.Btn_adminAction;
import nifax.control.view.event.pnl.Pnl_panelSalesTicketListener;
import nifax.control.view.event.txf.Txf_ticketCodeProductListener;
import nifax.control.view.util.Pnl;

/**
 *
 * @author NB
 */
public class PanelSalesTicket extends Pnl{

    public PanelSalesTicket() {
        initComponents();
        addAncestorListener(new Pnl_panelSalesTicketListener(this));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbp_containerTicket = new nifax.control.view.util.Tbp();
        pnl_ticket = new nifax.control.view.util.Pnl_Tab();
        pnl_ticketProduct = new javax.swing.JPanel();
        lbl_ticketCodeProduct = new javax.swing.JLabel();
        lbl_ticketDescProduct = new javax.swing.JLabel();
        txf_ticketCodeProduct = new javax.swing.JTextField();
        lbl_ticketQuantityProduct = new javax.swing.JLabel();
        txf_ticketQuantityProduct = new javax.swing.JTextField();
        cbx_ticketDescProduct = new javax.swing.JComboBox();
        cbx_ticketPriceProduct = new javax.swing.JComboBox();
        cbx_ticketStoreProduct = new javax.swing.JComboBox();
        lbl_ticketStoreProduct = new javax.swing.JLabel();
        lbl_ticketPriceProduct = new javax.swing.JLabel();
        cbx_ticketMeasureProduct = new javax.swing.JComboBox();
        lbl_ticketMeasureProduct = new javax.swing.JLabel();
        pnl_ticketSideMenu = new javax.swing.JPanel();
        btn_ticketProductSearch = new javax.swing.JButton
        (new Btn_adminAction(this,Administration.LIST,"..."));
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pnl_ticketGral = new javax.swing.JPanel();
        lbl_ticketGralPrice = new javax.swing.JLabel();
        cbx_ticketGralStore = new javax.swing.JComboBox();
        cbx_ticketGralPrice = new javax.swing.JComboBox();
        lbl_ticketGralStore = new javax.swing.JLabel();
        scp_tblTicket = new javax.swing.JScrollPane();
        tbl_ticket = new javax.swing.JTable();
        pnl_totalTicket = new javax.swing.JPanel();
        lbl_textIva21Ticket = new javax.swing.JLabel();
        lbl_iva21Ticket = new javax.swing.JLabel();
        lbl_textIva105Ticket = new javax.swing.JLabel();
        lbl_iva105Ticket = new javax.swing.JLabel();
        lbl_textSubTotalTicket = new javax.swing.JLabel();
        lbl_subTotalTicket = new javax.swing.JLabel();
        lbl_textTotalTicket = new javax.swing.JLabel();
        lbl_TotalTicket = new javax.swing.JLabel();
        pnl_menuTicket = new javax.swing.JPanel();
        btn_emitTicket = new javax.swing.JButton(new nifax.control.view.event.btn.Btn_operationAction(this,Operation.EMIT,"Emitir"));

        pnl_ticketProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        lbl_ticketCodeProduct.setText("Codigo :");

        lbl_ticketDescProduct.setText("Descripcion :");

        txf_ticketCodeProduct.addKeyListener(new Txf_ticketCodeProductListener(this));

        lbl_ticketQuantityProduct.setText("Cantidad : ");

        txf_ticketQuantityProduct.setText("1");

        cbx_ticketDescProduct.setEditable(true);

        lbl_ticketStoreProduct.setText("Deposito : ");

        lbl_ticketPriceProduct.setText("Lista de precios : ");

        lbl_ticketMeasureProduct.setText("Medida :");

        javax.swing.GroupLayout pnl_ticketProductLayout = new javax.swing.GroupLayout(pnl_ticketProduct);
        pnl_ticketProduct.setLayout(pnl_ticketProductLayout);
        pnl_ticketProductLayout.setHorizontalGroup(
            pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ticketProductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_ticketProductLayout.createSequentialGroup()
                        .addComponent(lbl_ticketCodeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_ticketCodeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_ticketProductLayout.createSequentialGroup()
                        .addComponent(lbl_ticketDescProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_ticketDescProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_ticketProductLayout.createSequentialGroup()
                        .addComponent(lbl_ticketQuantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txf_ticketQuantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ticketProductLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_ticketPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ticketStoreProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_ticketProductLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_ticketMeasureProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_ticketStoreProduct, 0, 141, Short.MAX_VALUE)
                    .addComponent(cbx_ticketPriceProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_ticketMeasureProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnl_ticketProductLayout.setVerticalGroup(
            pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ticketProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ticketCodeProduct)
                    .addComponent(txf_ticketCodeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_ticketPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ticketPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ticketStoreProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ticketDescProduct)
                        .addComponent(cbx_ticketDescProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_ticketStoreProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ticketQuantityProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_ticketProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txf_ticketQuantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbx_ticketMeasureProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ticketMeasureProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        pnl_ticketSideMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_ticketProductSearch.setText("...");

        jButton3.setText("...");

        jButton4.setText("...");

        jButton5.setText("...");

        javax.swing.GroupLayout pnl_ticketSideMenuLayout = new javax.swing.GroupLayout(pnl_ticketSideMenu);
        pnl_ticketSideMenu.setLayout(pnl_ticketSideMenuLayout);
        pnl_ticketSideMenuLayout.setHorizontalGroup(
            pnl_ticketSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ticketProductSearch)
            .addComponent(jButton3)
            .addComponent(jButton4)
            .addComponent(jButton5)
        );
        pnl_ticketSideMenuLayout.setVerticalGroup(
            pnl_ticketSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ticketSideMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_ticketProductSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pnl_ticketGral.setBorder(javax.swing.BorderFactory.createTitledBorder("En general"));

        lbl_ticketGralPrice.setText("Lista de precios :");

        cbx_ticketGralStore.setEnabled(false);

        cbx_ticketGralPrice.setEnabled(false);

        lbl_ticketGralStore.setText("Deposito :");

        javax.swing.GroupLayout pnl_ticketGralLayout = new javax.swing.GroupLayout(pnl_ticketGral);
        pnl_ticketGral.setLayout(pnl_ticketGralLayout);
        pnl_ticketGralLayout.setHorizontalGroup(
            pnl_ticketGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ticketGralLayout.createSequentialGroup()
                .addGroup(pnl_ticketGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ticketGralPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ticketGralStore, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnl_ticketGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_ticketGralStore, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_ticketGralPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_ticketGralLayout.setVerticalGroup(
            pnl_ticketGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ticketGralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ticketGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_ticketGralPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ticketGralPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnl_ticketGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_ticketGralStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ticketGralStore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_ticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "IT", "CODIGO", "DETALLE", "PREC", "PREC C/IVA", "LISTA", "CANT X UN.", "CANT.", "MED", "DTO(%)", "COSTO", "RENT(%)", "IVA(%)", "IMPORTE", "IMPORTE C/IVA", "DEPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ticket.getTableHeader().setReorderingAllowed(false);
        scp_tblTicket.setViewportView(tbl_ticket);

        pnl_totalTicket.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));

        lbl_textIva21Ticket.setText("Iva al 21 % :");

        lbl_iva21Ticket.setText("$ 0.0");
        lbl_iva21Ticket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_textIva105Ticket.setText("Iva al 10.5 % :");

        lbl_iva105Ticket.setText("$ 0.0");
        lbl_iva105Ticket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_textSubTotalTicket.setText("Sub-Total : ");

        lbl_subTotalTicket.setText("$ 0.0");
        lbl_subTotalTicket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_textTotalTicket.setText("TOTAL : ");

        lbl_TotalTicket.setText("$ 0.0");
        lbl_TotalTicket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnl_totalTicketLayout = new javax.swing.GroupLayout(pnl_totalTicket);
        pnl_totalTicket.setLayout(pnl_totalTicketLayout);
        pnl_totalTicketLayout.setHorizontalGroup(
            pnl_totalTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_totalTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_totalTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_textIva21Ticket, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(lbl_textIva105Ticket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_totalTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_totalTicketLayout.createSequentialGroup()
                        .addComponent(lbl_iva105Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_textTotalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_TotalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_totalTicketLayout.createSequentialGroup()
                        .addComponent(lbl_iva21Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_textSubTotalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_subTotalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_totalTicketLayout.setVerticalGroup(
            pnl_totalTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_totalTicketLayout.createSequentialGroup()
                .addGroup(pnl_totalTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_textIva21Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iva21Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_textSubTotalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_subTotalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_totalTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_textIva105Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iva105Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_textTotalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_ticketLayout = new javax.swing.GroupLayout(pnl_ticket);
        pnl_ticket.setLayout(pnl_ticketLayout);
        pnl_ticketLayout.setHorizontalGroup(
            pnl_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_ticketLayout.createSequentialGroup()
                .addComponent(pnl_ticketProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_ticketGral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(pnl_ticketLayout.createSequentialGroup()
                .addComponent(pnl_ticketSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scp_tblTicket)
                .addContainerGap())
            .addGroup(pnl_ticketLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_totalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_ticketLayout.setVerticalGroup(
            pnl_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ticketLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnl_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_ticketProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_ticketGral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(pnl_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_ticketSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scp_tblTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_totalTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        tbp_containerTicket.addTab("Ticket ", pnl_ticket);

        pnl_menuTicket.setBackground(new java.awt.Color(51, 51, 51));
        pnl_menuTicket.setBorder(null);

        btn_emitTicket.setText("Emitir");

        javax.swing.GroupLayout pnl_menuTicketLayout = new javax.swing.GroupLayout(pnl_menuTicket);
        pnl_menuTicket.setLayout(pnl_menuTicketLayout);
        pnl_menuTicketLayout.setHorizontalGroup(
            pnl_menuTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuTicketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_emitTicket)
                .addGap(17, 17, 17))
        );
        pnl_menuTicketLayout.setVerticalGroup(
            pnl_menuTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuTicketLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_emitTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbp_containerTicket)
                    .addComponent(pnl_menuTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tbp_containerTicket)
                .addGap(0, 0, 0)
                .addComponent(pnl_menuTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JTable getTbl_ticket() {
        return tbl_ticket;
    }

    public JTextField getTxf_ticketCodeProduct() {
        return txf_ticketCodeProduct;
    }

    public JButton getBtn_emitTicket() {
        return btn_emitTicket;
    }
        
    public JComboBox getCbx_ticketDescProduct() {
        return cbx_ticketDescProduct;
    }

    public JComboBox getCbx_ticketGralPrice() {
        return cbx_ticketGralPrice;
    }

    public JComboBox getCbx_ticketGralStore() {
        return cbx_ticketGralStore;
    }

    public JComboBox getCbx_ticketPriceProduct() {
        return cbx_ticketPriceProduct;
    }

    public JComboBox getCbx_ticketStoreProduct() {
        return cbx_ticketStoreProduct;
    }
    
    public JLabel getLbl_TotalTicket() {
        return lbl_TotalTicket;
    }

    public JLabel getLbl_iva105Ticket() {
        return lbl_iva105Ticket;
    }

    public JLabel getLbl_iva21Ticket() {
        return lbl_iva21Ticket;
    }

    public JLabel getLbl_subTotalTicket() {
        return lbl_subTotalTicket;
    }

    public JLabel getLbl_textIva105Ticket() {
        return lbl_textIva105Ticket;
    }

    public JLabel getLbl_textIva21Ticket() {
        return lbl_textIva21Ticket;
    }

    public JLabel getLbl_textSubTotalTicket() {
        return lbl_textSubTotalTicket;
    }

    public JLabel getLbl_textTotalTicket() {
        return lbl_textTotalTicket;
    }

    public JLabel getLbl_ticketCodeProduct() {
        return lbl_ticketCodeProduct;
    }

    public JLabel getLbl_ticketDescProduct() {
        return lbl_ticketDescProduct;
    }

    public JLabel getLbl_ticketGralPrice() {
        return lbl_ticketGralPrice;
    }

    public JLabel getLbl_ticketGralStore() {
        return lbl_ticketGralStore;
    }

    public JLabel getLbl_ticketPriceProduct() {
        return lbl_ticketPriceProduct;
    }

    public JLabel getLbl_ticketQuantityProduct() {
        return lbl_ticketQuantityProduct;
    }

    public JLabel getLbl_ticketStoreProduct() {
        return lbl_ticketStoreProduct;
    }

    public JPanel getPnl_menuTicket() {
        return pnl_menuTicket;
    }

    public JPanel getPnl_ticket() {
        return pnl_ticket;
    }

    public JPanel getPnl_ticketGral() {
        return pnl_ticketGral;
    }

    public JPanel getPnl_ticketProduct() {
        return pnl_ticketProduct;
    }

    public JPanel getPnl_ticketSideMenu() {
        return pnl_ticketSideMenu;
    }

    public JPanel getPnl_totalTicket() {
        return pnl_totalTicket;
    }

    public JScrollPane getScp_tblTicket() {
        return scp_tblTicket;
    }

    public JTabbedPane getTbp_containerTicket() {
        return tbp_containerTicket;
    }

    public JTextField getTxf_ticketQuantityProduct() {
        return txf_ticketQuantityProduct;
    }

    public JButton getBtn_ticketProductSearch() {
        return btn_ticketProductSearch;
    }

    public JComboBox getCbx_ticketMeasureProduct() {
        return cbx_ticketMeasureProduct;
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_emitTicket;
    private javax.swing.JButton btn_ticketProductSearch;
    private javax.swing.JComboBox cbx_ticketDescProduct;
    private javax.swing.JComboBox cbx_ticketGralPrice;
    private javax.swing.JComboBox cbx_ticketGralStore;
    private javax.swing.JComboBox cbx_ticketMeasureProduct;
    private javax.swing.JComboBox cbx_ticketPriceProduct;
    private javax.swing.JComboBox cbx_ticketStoreProduct;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel lbl_TotalTicket;
    private javax.swing.JLabel lbl_iva105Ticket;
    private javax.swing.JLabel lbl_iva21Ticket;
    private javax.swing.JLabel lbl_subTotalTicket;
    private javax.swing.JLabel lbl_textIva105Ticket;
    private javax.swing.JLabel lbl_textIva21Ticket;
    private javax.swing.JLabel lbl_textSubTotalTicket;
    private javax.swing.JLabel lbl_textTotalTicket;
    private javax.swing.JLabel lbl_ticketCodeProduct;
    private javax.swing.JLabel lbl_ticketDescProduct;
    private javax.swing.JLabel lbl_ticketGralPrice;
    private javax.swing.JLabel lbl_ticketGralStore;
    private javax.swing.JLabel lbl_ticketMeasureProduct;
    private javax.swing.JLabel lbl_ticketPriceProduct;
    private javax.swing.JLabel lbl_ticketQuantityProduct;
    private javax.swing.JLabel lbl_ticketStoreProduct;
    private javax.swing.JPanel pnl_menuTicket;
    private javax.swing.JPanel pnl_ticket;
    private javax.swing.JPanel pnl_ticketGral;
    private javax.swing.JPanel pnl_ticketProduct;
    private javax.swing.JPanel pnl_ticketSideMenu;
    private javax.swing.JPanel pnl_totalTicket;
    private javax.swing.JScrollPane scp_tblTicket;
    private javax.swing.JTable tbl_ticket;
    private javax.swing.JTabbedPane tbp_containerTicket;
    private javax.swing.JTextField txf_ticketCodeProduct;
    private javax.swing.JTextField txf_ticketQuantityProduct;
    // End of variables declaration//GEN-END:variables
}
