public class Main {
    public static void main(String[] args) {

        Printable printableRef;

        Document document = new Document(10);

        document.print();

        printableRef = document;

        printableRef.print();

        //printableRef.getPages();//don't have methods that are not from the interface
    }
}