package pl.gccalc;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfCreator {
    public static void createPdf(Aircraft aircraft) throws FileNotFoundException, DocumentException {

        String filename = "Weighing-sheet.pdf";
        Document document = new Document();

        PdfWriter.getInstance(document, new FileOutputStream(filename));


        document.open();

        Paragraph paragraph = new  Paragraph("\n");
        document.add(paragraph);
        Paragraph paragraph1 = new Paragraph("WEIGHING PROTOCOL");
        document.add(paragraph1);
        document.add(paragraph);












        PdfPTable table  = new PdfPTable(2);
        table.addCell("Left Wing kg:");
        table.addCell("aircraft.getLeftWingWeight().toString()");
        table.addCell("Right Wing kg:");
        table.addCell("4");
        table.addCell("Tailplane kg:");
        table.addCell("6");
        table.addCell("Fuselage kg.");
        table.addCell("6");
        table.addCell("Total Weight kg:");
        table.addCell("6");

        PdfPTable table2  = new PdfPTable(2);
        table2.addCell("L length ");
        table2.addCell("L length ");
        table2.addCell("A length ");
        table2.addCell("A length ");
        table2.addCell("Front Weight kg: ");
        table2.addCell("front");
        table2.addCell("Rear Weight kg: ");
        table2.addCell("rear");
        document.add(paragraph);
        PdfPTable table3  = new PdfPTable(2);
        table3.addCell("Gravity center position cm:");
        table3.addCell("33");




//        PdfPCell pdfPCell = new PdfPCell(new Phrase("Left Wing kg:"));
//        table.addCell(pdfPCell);
//        pdfPCell = new PdfPCell(new Phrase("Right Wing kg:"));
//        table.addCell(pdfPCell);
//        pdfPCell = new PdfPCell(new Phrase("Tailplane kg:"));
//        table.addCell(pdfPCell);
//
//        pdfPCell = new PdfPCell(new Phrase("Fuselage:"));
//        table.addCell(pdfPCell);

        table.addCell("1");
        table.addCell("2");
        table.addCell("3");
        table.addCell("4");
        table.addCell("5");
        table.addCell("6");


        document.add(table);
        document.add(paragraph);
        document.add(table2);
        document.add(paragraph);
        document.add(table3);






        document.close();

        System.out.println("koniec");
    }
}
