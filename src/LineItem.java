import java.util.Scanner;

public class LineItem
{
    private Product product;
    private int quantity;

    Scanner in;

    public LineItem(){
        in = new Scanner(System.in);
        product = new Product();
        product = getProduct();

        //Get the Product Item name and UnitPrice?

        //Get the quantity for this Line Item?

    }



    public LineItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }

    public void getlineItemData()
    {
        product.getProductData();
        quantity.get
    }

    public double getLineTotal(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
        //multiply the quantity by the unit price to get the line total

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
        setQuantity(SafeInput.getInt(in,"Enter Product Quantity: "))
    }
}
