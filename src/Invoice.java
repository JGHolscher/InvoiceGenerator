import java.util.ArrayList;

public class Invoice
{
    private Address customerAddress;
    private ArrayList<LineItem> lineItems;


    public Invoice()
    {
        lineItems = new ArrayList<LineItem>();

        //customerAddress = new Address();
        customerAddress.getAddress();
    }

    /**
     * generates a display to the console of the invoice data
     */
    public void displayInvoice()
    {

    };

    /**
     * Uses SafeInput to collect the data for lineItems in the Invoice
     */
    public void getInvoiceData()
    {
        boolean done = false;
        //getline Item data ... do while loop
        do{



        }while(!done);
    };

    /**
     * Uses SafeInput to collect the data for the address fields
     */
    public void getAddressData()
    {
        customerAddress.getAddress();
    };

    private double getTotalAmtDue()
    {
    //go through the line items and sum the line total to ge the total amt due

    };



}
