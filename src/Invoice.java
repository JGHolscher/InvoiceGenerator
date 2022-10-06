import java.util.ArrayList;

public class Invoice
{
    private Address customerAddress;
    private ArrayList<LineItem> lineItems;


    public Invoice()
    {
        lineItems = new ArrayList<LineItem>();
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
        //getline Item data ... do while loop

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
