public class Main
{
    public static void main(String[] args)
    {
        Invoice invoice;


        //get the data for the invoice
        invoice = new Invoice();

        //get Address Data
        invoice.getAddressData();

        //get Line Item Data
        invoice.getInvoiceData();

        //display the results
        invoice.displayInvoice();
    }
}