package PDFSearcherPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException; 
import org.apache.pdfbox.*;
import org.apache.pdfbox.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ParsePDF {

	public static boolean ParsePDF (String word, String filepath) throws IOException {
		
		 byte[] thePDFFileBytes = readFileAsBytes(filepath);
	        PDDocument pddDoc = PDDocument.load(thePDFFileBytes);
	        PDFTextStripper reader = new PDFTextStripper();
	        String pageText = reader.getText(pddDoc);
	        boolean containword = pageText.contains(word);
	        pddDoc.close();
	        return containword;
	}
	
	private static byte[] readFileAsBytes(String filePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        return IOUtils.toByteArray(inputStream);
}
	
}
