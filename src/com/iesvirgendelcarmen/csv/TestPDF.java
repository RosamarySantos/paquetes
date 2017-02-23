package com.iesvirgendelcarmen.csv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class TestPDF {
	public static final String DEST = "pdfs/ejemplo1.pdf";
	public static void main(String[] args) {
		new TestPDF().createPdf(DEST);

	}
	 public void createPdf(String dest){
		 Document document = new Document(); 
		 try {
			PdfWriter.getInstance(document, new FileOutputStream(dest));
			document.open();
	        Font chapterFont = FontFactory.getFont(
	        		FontFactory.HELVETICA, 16, Font.BOLDITALIC);
	        Font paragraphFont = FontFactory.getFont(
	        		FontFactory.HELVETICA, 12, Font.NORMAL);
	        Chunk chunk = new Chunk("TÍTULO DE MI PRIMER DOCUMENTO PDF", chapterFont);
	        Chapter chapter = new Chapter(new Paragraph(chunk), 1);
	        chapter.setNumberDepth(0);
	        chapter.add(new Paragraph("Mi primer párrafo\n"
	        		+ "Debe aparecer un salto de línea", paragraphFont));
	        document.add(chapter);
	        document.close();
		} catch (FileNotFoundException e) {
			System.out.println("No localizo fichero");
		} catch (DocumentException e) {
			System.out.println("Fallo al crear el documento");

		}
	 }
}
