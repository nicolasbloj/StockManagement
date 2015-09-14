package nifax.control.view.util.ww;

import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author NB
 */
public class WWPanel extends javax.swing.JPanel {

    private final WWFilter filter;

    public WWPanel(final WWFilter filter,final WWTableModel tableModel,final String panelName) {
        initComponents();
        this.filter = filter;
        this.tbl_gral.setModel(tableModel);
        this.pnl_gralFilter.setBorder(javax.swing.BorderFactory.createTitledBorder(filter.getTitle()));
        this.setName(panelName);
        initFiltersRow(filter.getListFilterRow());
    }

    private void initFiltersRow(ArrayList<WWFilterRow> listFilters) {
        javax.swing.GroupLayout pnl_gralFilter_Layout = new javax.swing.GroupLayout(pnl_gralFilter);
        pnl_gralFilter.setLayout(pnl_gralFilter_Layout);

        GroupLayout.ParallelGroup pgH = pnl_gralFilter_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        GroupLayout.SequentialGroup groupH = pnl_gralFilter_Layout.createSequentialGroup().addContainerGap();
        GroupLayout.ParallelGroup pgH_int = pnl_gralFilter_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);

        GroupLayout.ParallelGroup pgV = pnl_gralFilter_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        GroupLayout.SequentialGroup groupV = pnl_gralFilter_Layout.createSequentialGroup().addGap(15, 15, 15);

        for (int i = 0; i < listFilters.size(); i++) {
            pgH_int.addGroup(pnl_gralFilter_Layout.createSequentialGroup()
                .addComponent(listFilters.get(i).getLabel(), 150, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listFilters.get(i).getComponent(), javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            groupV.addGroup(pnl_gralFilter_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(listFilters.get(i).getLabel(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(listFilters.get(i).getComponent(), javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);

        }

        pnl_gralFilter_Layout.setHorizontalGroup(pgH.addGroup(groupH.addGroup(pgH_int).addContainerGap()));
        pnl_gralFilter_Layout.setVerticalGroup(pgV.addGroup(groupV));
    }

    public WWFilter getFilter() {
        return filter;
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

    public JButton getBtn_save() {
        return btn_save;
    }

    public JButton getBtn_search() {
        return btn_search;
    }

    public JPanel getPnl_gralFilter() {
        return pnl_gralFilter;
    }

    public JPanel getPnl_menu() {
        return pnl_menu;
    }

    public JScrollPane getScp_gral() {
        return scp_gral;
    }

    public JScrollPane getScp_gralFilter() {
        return scp_gralFilter;
    }

    public JTable getTbl_gral() {
        return tbl_gral;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scp_gralFilter = new javax.swing.JScrollPane();
        pnl_gralFilter = new javax.swing.JPanel();
        scp_gral = new javax.swing.JScrollPane();
        tbl_gral = new javax.swing.JTable();
        pnl_menu = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_list = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        pnl_gralFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));

        javax.swing.GroupLayout pnl_gralFilterLayout = new javax.swing.GroupLayout(pnl_gralFilter);
        pnl_gralFilter.setLayout(pnl_gralFilterLayout);
        pnl_gralFilterLayout.setHorizontalGroup(
            pnl_gralFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        pnl_gralFilterLayout.setVerticalGroup(
            pnl_gralFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        scp_gralFilter.setViewportView(pnl_gralFilter);

        tbl_gral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scp_gral.setViewportView(tbl_gral);

        pnl_menu.setOpaque(false);

        btn_save.setText("Guardar");

        btn_search.setText("Buscar");

        btn_delete.setText("Eliminar");

        btn_list.setText("Listar");

        btn_cancel.setText("Cancelar");

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addContainerGap()
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
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_search)
                    .addComponent(btn_delete)
                    .addComponent(btn_list)
                    .addComponent(btn_cancel))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(scp_gralFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(scp_gral, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scp_gralFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(scp_gral, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_list;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JPanel pnl_gralFilter;
    private javax.swing.JPanel pnl_menu;
    private javax.swing.JScrollPane scp_gral;
    private javax.swing.JScrollPane scp_gralFilter;
    private javax.swing.JTable tbl_gral;
    // End of variables declaration//GEN-END:variables
}
