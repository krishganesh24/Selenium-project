package SeleniumChallenges;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;

public class PDFReadandWrite {

	public static  void main(String[] args) throws IOException {

		
		
PdfReader pdf = new PdfReader("C:\\Core Java Interview Questions.pdf");

if(pdf.isOpenedWithFullPermissions()){
	
	int page=pdf.getNumberOfPages();
	for(int i=0;i < page; i++) {
		 //  String text = reader.extractTextFromPage(i);

		
	 byte[] text = pdf.getPageContent(i);
	 
	   System.out.println("Page " + i + ": " +text.toString()); 

 }
	
	pdf.close();
	
		
	}

	}
}
