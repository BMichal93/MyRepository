package PDFSearcherPackage;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFtoString {
	public static String toString (String filepath) throws IOException {
	
	StringBuilder sb =  new StringBuilder();
	try (PDDocument document = PDDocument.load(new File(filepath))) {
	    document.getClass();
	    if (!document.isEncrypted()) {
	        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	        stripper.setSortByPosition(true);
	        PDFTextStripper tStripper = new PDFTextStripper();
	        String pdfFileInText = tStripper.getText(document);
	        String lines[] = pdfFileInText.split("\\r?\\n");
	        for (String line : lines) {
	            sb.append(line);
	        }
	            
	    	
	        }
	    return sb.toString();
	}
}
}



