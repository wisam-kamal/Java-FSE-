public interface Document {
    void open();
}

class WordDocument implements Document {
    public void open(){
        System.out.println("Opening Word Document") ;
    }
}

class PDFDocument implements Document {
    public void open(){
        System.out.println("Opening PDF Document") ;
    }
}

class ExcelDocument implements Document {
    public void open(){
        System.out.println("Opening Excel Document") ;
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument() ;
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument() ;
    }
}

class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument() ;
    }
}



