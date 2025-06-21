public class Main {
    public static void main(String[] args) {
        DocumentFactory wordfactory = new WordDocumentFactory();
        DocumentFactory pdffactory = new PDFDocumentFactory();
        DocumentFactory excelfactory = new ExcelDocumentFactory();

        Document worddoc = wordfactory.createDocument();
        Document pdfdoc= pdffactory.createDocument();
        Document exceldoc = excelfactory.createDocument();

        worddoc.open();
        pdfdoc.open();
        exceldoc.open();
    }
}