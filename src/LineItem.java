import java.util.Scanner;

public class LineItem
{
    private Product product;
    private int quantity;
    int lineTotal;

    Scanner in;

    public LineItem(){ in = new Scanner(System.in); }


    public LineItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;

    }


    public void getLineItemData()
    {
        product = new Product();
        product.getProductData();
        getQuantityData();
        getLineTotal();
    }


    public double getLineTotal(){return lineTotal;}

    public void setLineTotal(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;

        //multiply the quantity by the unit price to get the line total
        lineTotal = quantity * (int) product.getUnitPrice();
    };

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getQuantityData()
    {
        setQuantity(SafeInput.getInt(in,"Enter Product Quantity"));
    }

}
