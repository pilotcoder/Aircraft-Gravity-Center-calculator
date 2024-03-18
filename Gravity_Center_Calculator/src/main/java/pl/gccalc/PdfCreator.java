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

        Paragraph paragraph = new  Paragraph(aircraft.toString());
        document.add(paragraph);
        Paragraph paragraph1 = new Paragraph("--------");
        document.add(paragraph1);
        Chunk chunk = new Chunk("chunk");
        document.add(chunk);
        document.add(chunk);
        document.add(paragraph1);
        document.add(paragraph1);
        paragraph1.add("aa");
        document.add(paragraph1);
        document.add(chunk);
        paragraph1 = new Paragraph();
        document.add(paragraph1);
        document.add(chunk);











//        PdfPTable table  = new PdfPTable(1);
//
//
//
//
//        PdfPCell header = new PdfPCell(new Phrase("Weighing Protocol"));
//        table.addCell(header);
//        header = new PdfPCell(new Phrase("Czas lotu godz:"));
//        table.addCell(header);
//        header = new PdfPCell(new Phrase("Czas lotu min:"));
//        table.addCell(header);
//
//        header = new PdfPCell(new Phrase("liczba lotów::"));
//        table.addCell(header);
//
//        table.addCell("1");
//        table.addCell("2");
//        table.addCell("3");
//        table.addCell("4");
//
//
//        document.add(table);
//
//
//
//
//

        document.close();

        System.out.println("koniec");
    }
}
