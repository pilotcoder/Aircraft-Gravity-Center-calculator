package pl.gccalc;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

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

//        PdfPTable table  = new PdfPTable(4);
//
//
//
//
//        PdfPCell header = new PdfPCell(new Phrase("Data lotu:"));
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
