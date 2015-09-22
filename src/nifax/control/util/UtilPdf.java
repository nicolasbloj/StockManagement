package nifax.control.util;

import nifax.control.model.SaleDoc;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import nifax.control.view.panel.PanelSalesTicket;

/**
 *
 * @author NB
 */
public class UtilPdf {

    public static void generateSalePdf(SaleDoc saledoc, PanelSalesTicket panelSalesTicket) {

        String typeSaleDoc = panelSalesTicket.getTbp_containerTicket().getTitleAt(0);
        JTable table = panelSalesTicket.getTbl_ticket();

        Date date = Calendar.getInstance().getTime();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(date);        
        
        String path = "Sales/";
            
        path = new StringBuilder().append(path).toString();
            
        File f = new File(path);
        
        f.mkdirs();
        
        path = new StringBuilder().append(path).append(typeSaleDoc).append(saledoc.getId()).append(".pdf").toString();
        
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(path);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UtilPdf.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, Message.FileNotFoundException, Message.FileNotFoundExceptionTitle, JOptionPane.ERROR_MESSAGE);
        }

        if (file != null) {
            try {
                Document document = new Document();
                //Fonts
                Font fontItems = FontFactory.getFont("arial",
                    9,
                    Font.NORMAL,
                    BaseColor.BLACK);

                Font fontItemsTitle = FontFactory.getFont("arial",
                    9,
                    Font.BOLD,
                    BaseColor.BLACK);

                Font fontTitle = FontFactory.getFont("arial",
                    11,
                    Font.ITALIC,
                    BaseColor.BLACK);

                PdfWriter.getInstance(document, file).setInitialLeading(20);

                document.open();

                document.add(new Paragraph(
                    new StringBuilder(typeSaleDoc).append(" ").append(saledoc.getId()).append("             ").append(dateString).toString(),
                    fontTitle
                )
                );

                document.add(new Paragraph("   "));

                int indexIt = table.getColumnModel().getColumnIndex("IT");
                int indexCod = table.getColumnModel().getColumnIndex("CODIGO");
                int indexDesc = table.getColumnModel().getColumnIndex("DETALLE");
                int indexQuantity = table.getColumnModel().getColumnIndex("CANT X UN.");
                int indexPrice = table.getColumnModel().getColumnIndex("PREC");
                int indexAmount = table.getColumnModel().getColumnIndex("IMPORTE");
                String it;
                String code;
                String desc;
                String quantity;
                String price;
                String amount;

                PdfPTable tableItems = new PdfPTable(6);
                tableItems.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
                tableItems.addCell(new Paragraph("It", fontItemsTitle));
                tableItems.addCell(new Paragraph("Codigo", fontItemsTitle));
                tableItems.addCell(new Paragraph("Detalle", fontItemsTitle));
                tableItems.addCell(new Paragraph("Cantidad", fontItemsTitle));
                tableItems.addCell(new Paragraph("Precio", fontItemsTitle));
                tableItems.addCell(new Paragraph("Importe", fontItemsTitle));

                for (int i = 0; i < table.getRowCount(); i++) {
                    it = table.getValueAt(i, indexIt).toString();
                    code = table.getValueAt(i, indexCod).toString();
                    desc = table.getValueAt(i, indexDesc).toString();
                    quantity = table.getValueAt(i, indexQuantity).toString();
                    price = table.getValueAt(i, indexPrice).toString();
                    amount = table.getValueAt(i, indexAmount).toString();

                    tableItems.addCell(new Paragraph(it, fontItems));
                    tableItems.addCell(new Paragraph(code, fontItems));
                    tableItems.addCell(new Paragraph(desc, fontItems));
                    tableItems.addCell(new Paragraph(quantity, fontItems));
                    tableItems.addCell(new Paragraph(price, fontItems));
                    tableItems.addCell(new Paragraph(amount, fontItems));
                }

                document.add(tableItems);

                document.add(new Paragraph("   "));
                document.add(new Paragraph("   "));

                String iva21 = panelSalesTicket.getLbl_iva21Ticket().getText();
                String iva105 = panelSalesTicket.getLbl_iva105Ticket().getText();
                String subtotal = panelSalesTicket.getLbl_subTotalTicket().getText();
                String total = panelSalesTicket.getLbl_TotalTicket().getText();

                PdfPTable tableDescCalc = new PdfPTable(2);
                float[] headerWidths = {300, 60};
                tableDescCalc.setWidths(headerWidths);
                tableDescCalc.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

                PdfPTable tableDesc = new PdfPTable(1);
                tableDesc.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
                tableDesc.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
                tableDesc.addCell(new Paragraph("IVA 21%", fontItemsTitle));
                tableDesc.addCell(new Paragraph("IVA 10.5%", fontItemsTitle));
                tableDesc.addCell(new Paragraph("SUBTOTAL", fontItemsTitle));
                tableDesc.addCell(new Paragraph("TOTAL", fontItemsTitle));

                PdfPTable tableCalc = new PdfPTable(1);
                tableCalc.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

                tableCalc.addCell(new Paragraph(iva21, fontItems));
                tableCalc.addCell(new Paragraph(iva105, fontItems));
                tableCalc.addCell(new Paragraph(subtotal, fontItems));
                tableCalc.addCell(new Paragraph(total, fontItems));

                tableDescCalc.addCell(tableDesc);
                tableDescCalc.addCell(tableCalc);

                document.add(tableDescCalc);
                document.close();

                try {

                    Desktop.getDesktop().open(new File(path));

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, Message.IOException, Message.IOExceptionTitle, JOptionPane.ERROR_MESSAGE);
                }

            } catch (DocumentException ex) {
                Logger.getLogger(UtilPdf.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, Message.DocumentException, Message.DocumentExceptionTitle, JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
