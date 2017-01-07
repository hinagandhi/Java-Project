package com.hina.myapp.pojo;
import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfWriter;

public class PdfReportView extends AbstractPdfView
{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document pdfdoc, PdfWriter pdfwriter, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Font font_helvetica_16_normal_blue = new Font(Font.HELVETICA, 16, Font.NORMAL, Color.BLUE); 
		Font font_courier_16_italic_red = new Font(Font.COURIER, 16, Font.ITALIC, Color.RED);
		Font font_times_16_bold_green = new Font(Font.TIMES_ROMAN, 18, Font.BOLD, Color.GREEN);
		
		Chunk c1 = new Chunk("Chunk 1", font_courier_16_italic_red);
		Chunk c2 = new Chunk("Chunk 2", font_courier_16_italic_red);
		
		Phrase phr1 = new Phrase("Phrase 1", font_helvetica_16_normal_blue);
		Phrase phr2 = new Phrase("Phrase 2", font_helvetica_16_normal_blue);
		
		Paragraph prg1 = new Paragraph("Paragraph 1", font_times_16_bold_green);
		Paragraph prg2 = new Paragraph("Paragraph 2", font_times_16_bold_green);
		
		pdfdoc.add(c1);
		pdfdoc.add(c2);
		
		pdfdoc.add(phr1);
		pdfdoc.add(phr2);
		
		pdfdoc.add(prg1);
		pdfdoc.add(prg2);
	}

	
		
	}


