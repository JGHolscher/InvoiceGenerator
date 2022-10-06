import java.util.Scanner;

public class Product
{
    private String name;
    private double unitPrice;


    Scanner in;

    public Product()
    {
        in = new Scanner(System.in);
    }

    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Collect the Product Name and the Unit Price using scanner and return a Product Object
     * @return a instantiated Product Object
     */
    public void getProductData()
    {
        setName(SafeInput.getNonZeroLenString(in, "Enter Product Name: "));
        setUnitPrice(SafeInput.getDouble(in, "Enter the Unit Price: "));
    }

}
