import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;


public class Pdf {

    public static void createPdf(){
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Shopping List.pdf"));
            document.open();
            document.add(new Paragraph("Shopping List"));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
