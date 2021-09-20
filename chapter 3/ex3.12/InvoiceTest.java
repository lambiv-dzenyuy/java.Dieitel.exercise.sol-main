// import java.util.Scanner;

public class InvoiceTest 
{

    public static void main(String[] args)
    {
        //create two invoice objects
        Invoice invoice1 = new Invoice("ch01", "keyboard", 5, 500);
        Invoice invoice2 = new Invoice("ch02", "mouse", 7, 200);

        //display the variables for each object
        System.out.printf("%ninvoice1%npartNumber: %s,%ndescription: %s,%nquantity: %d,%nprice for one item: %.2f%n%n%n",
        invoice1.getPartNumber(),invoice1.getDescription(),invoice1.getQuantity(), invoice1.getPricePerItem());
        System.out.printf("%ninvoice2%npartNumber: %s,%ndescription: %s,%nquantity: %d,%nprice for one item: %.2f%n%n%n",
        invoice2.getPartNumber(),invoice2.getDescription(),invoice2.getQuantity(), invoice2.getPricePerItem());

        //display invoice for each object
        System.out.printf("invoice1: %d %s were sold for %.2f%n",
        invoice1.getQuantity(), invoice1.getDescription(), invoice1.getInvoiceAmount());
        System.out.printf("invoice2: %d %s were sold for %.2f%n",
        invoice2.getQuantity(), invoice2.getDescription(), invoice2.getInvoiceAmount());

        
    }
    
}
