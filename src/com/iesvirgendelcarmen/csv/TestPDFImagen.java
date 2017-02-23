package com.iesvirgendelcarmen.csv;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImage;
import com.itextpdf.text.pdf.PdfIndirectObject;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class TestPDFImagen {
	public static final String SRC = "pdfs/ejemplo1.pdf";
    public static final String DEST = "pdfs/ejemplo1_con_imagen.pdf";
    public static final String IMG = "imagenes/imagen.jpg";
	public static void main(String[] args) {
		manipulatePdf(SRC, DEST);

	}
	 public static void manipulatePdf(String src, String dest){
		 try {
			PdfReader reader = new PdfReader(src);
	        PdfStamper stamper = new PdfStamper(
	        		reader, new FileOutputStream(dest));
	        Image image = Image.getInstance(IMG);
	        PdfImage stream = new PdfImage(image, "", null);
	        stream.put(new PdfName("ITXT_SpecialId"),
	        		new PdfName("123456789"));
	        PdfIndirectObject ref = stamper.getWriter().addToBody(stream);
	        image.setDirectReference(ref.getIndirectReference());
	        image.setAbsolutePosition(10, 15);
	        
	        PdfContentByte over = stamper.getOverContent(1);
	        over.addImage(image);
	        stamper.close();
	        reader.close();
		} catch (IOException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
