package nifax.control.view.panel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import nifax.control.view.event.btn.Btn_deleteGralAction;
import nifax.control.view.event.btn.Btn_saveGralAction;
import nifax.control.view.event.btn.Btn_listGralAction;
import nifax.control.view.util.Pnl;

/**
 *
 * @author NB
 */
public class PanelGeneralAdmin extends Pnl {

    public PanelGeneralAdmin() {
        initComponents();
    }

    public JButton getBtn_saveGral() {
        return btn_save;
    }

    public JLabel getLbl_descGral() {
        return lbl_descGral;
    }

    public JLabel getLbl_profitGral() {
        return lbl_profitGral;
    }

    public JPanel getPnl_loadGral() {
        return pnl_loadGral;
    }

    public JPanel getPnl_menuGral() {
        return pnl_menuGral;
    }

    public JTabbedPane getTbp_gral() {
        return tbp_gral;
    }

    public JTextField getTxf_descGral() {
        return txf_descGral;
    }

    public JTextField getTxf_profitGral() {
        return txf_profitGral;
    }

    public JButton getBtn_cancel() {
        return btn_cancel;
    }

    public JButton getBtn_delete() {
        return btn_delete;
    }

    public JButton getBtn_list() {
        return btn_list;
    }

    public JButton getBtn_search() {
        return btn_search;
    }

    public JPanel getPnl_principal() {
        return pnl_principal;
    }

    public JScrollPane getScp_gral() {
        return scp_gral;
    }

    public JTable getTbl_gral() {
        return tbl_gral;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbp_gral = new javax.swing.JTabbedPane();
        pnl_loadGral = new nifax.control.view.util.Pnl_Tab();
        pnl_principal = new javax.swing.JPanel();
        txf_profitGral = new javax.swing.JTextField();
        lbl_profitGral = new javax.swing.JLabel();
        lbl_descGral = new javax.swing.JLabel();
        txf_descGral = new javax.swing.JTextField();
        scp_gral = new javax.swing.JScrollPane();
        tbl_gral = new javax.swing.JTable();
        pnl_menuGral = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton(new Btn_saveGralAction(this));
        btn_search = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton(new Btn_deleteGralAction(this));
        btn_list = new javax.swing.JButton(new Btn_listGralAction(this));
        btn_cancel = new javax.swing.JButton();

        pnl_principal.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        txf_profitGral.setVisible(false);

        lbl_profitGral.setVisible(false);
        lbl_profitGral.setText("Rentabilidad :");

        lbl_descGral.setText("Descripcion : ");

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_principalLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addComponent(lbl_descGral, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_descGral, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addComponent(lbl_profitGral, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_profitGral, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descGral, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_descGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_profitGral, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_profitGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        tbl_gral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "ID", "DESCRIPCION", "RENTABILIDAD "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_gral.getTableHeader().setReorderingAllowed(false);
        scp_gral.setViewportView(tbl_gral);

        javax.swing.GroupLayout pnl_loadGralLayout = new javax.swing.GroupLayout(pnl_loadGral);
        pnl_loadGral.setLayout(pnl_loadGralLayout);
        pnl_loadGralLayout.setHorizontalGroup(
            pnl_loadGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loadGralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_gral, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        pnl_loadGralLayout.setVerticalGroup(
            pnl_loadGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_loadGralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_loadGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scp_gral, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbp_gral.addTab("Gral", pnl_loadGral);

        pnl_menuGral.setBackground(new java.awt.Color(51, 51, 51));
        pnl_menuGral.setBorder(null);

        btn_save.setText("Guardar");

        btn_search.setText("Buscar");

        btn_delete.setText("Eliminar");

        btn_list.setText("Listar");

        btn_cancel.setText("Cancelar");

        javax.swing.GroupLayout pnl_menuGralLayout = new javax.swing.GroupLayout(pnl_menuGral);
        pnl_menuGral.setLayout(pnl_menuGralLayout);
        pnl_menuGralLayout.setHorizontalGroup(
            pnl_menuGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuGralLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_list)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_menuGralLayout.setVerticalGroup(
            pnl_menuGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuGralLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_menuGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(tbp_gral)
            .addComponent(pnl_menuGral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbp_gral)
                .addGap(0, 0, 0)
                .addComponent(pnl_menuGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_list;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel lbl_descGral;
    private javax.swing.JLabel lbl_profitGral;
    private javax.swing.JPanel pnl_loadGral;
    private javax.swing.JPanel pnl_menuGral;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JScrollPane scp_gral;
    private javax.swing.JTable tbl_gral;
    private javax.swing.JTabbedPane tbp_gral;
    private javax.swing.JTextField txf_descGral;
    private javax.swing.JTextField txf_profitGral;
    // End of variables declaration//GEN-END:variables
}
