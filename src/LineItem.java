public class LineItem
{
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }

    public double getLineTotal()
    {
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
}
