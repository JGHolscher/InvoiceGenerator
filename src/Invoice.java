import java.util.ArrayList;
import java.util.Scanner;

public class Invoice
{
    private Address customerAddress;
    private LineItem lineItem;
    private ArrayList<LineItem> lineItemArrayList;
    private double amtDue = 0;

    Scanner in = new Scanner(System.in);

    public Invoice()
    {
        lineItemArrayList = new ArrayList<LineItem>();
        lineItem = new LineItem();
        customerAddress = new Address();
    }

    /**
     * Uses SafeInput to collect the data for lineItems in the Invoice
     */
    public void getInvoiceData()
    {
        boolean cont = true;
        //get line Item data
        do{
            LineItem li = new LineItem();

            //product & quantity
            li.getLineItemData();
            lineItemArrayList.add(li);

            cont = SafeInput.getYNConfirm(in, "Would you like to add another Product?");

        }while(cont);
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
        //get the total amount due -- add all line Totals
        for (LineItem list : lineItemArrayList) {
           this.amtDue += list.getLineTotal();
        }
        return amtDue;
    };


    /**
     * generates a display to the console of the invoice data
     */
    public void displayInvoice()
    {
        System.out.println("Invoice \n");
        System.out.println(customerAddress.getTitle());
        System.out.println(customerAddress.getStreet());
        System.out.println(customerAddress.getCity() + ", " + customerAddress.getState() + " " + customerAddress.getZip());

        System.out.println("==========================================================================================================");//^done
        System.out.printf("%-30s %-30s %-30s %-30s", "Item", "Price", "Qty", "Total");

        for (LineItem list : lineItemArrayList) {
            System.out.println("\n");
            System.out.printf("%-30s %-30.2f %-30s %-30.2f", list.getProduct().getName(), list.getProduct().getUnitPrice(), list.getQuantity(), list.getLineTotal());
        }

        System.out.println("\n==========================================================================================================");

        System.out.printf("%-30s %-30.2f", "Amount Due:", getTotalAmtDue());


    };

}
