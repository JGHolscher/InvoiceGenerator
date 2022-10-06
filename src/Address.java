public class Address
{
    private String title;
    private String street;
    private String city;
    private String state;
    private String zip;





//constructor
    public Address(String title, String street, String city, String state, String zip) {
        this.title = title;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }



//getter and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     *
     * launch a console dialog using SafeInput to collect the data for the address and return the address
     * @return a instantiated Address Object
     */
    public Address getAddress()
    {

    }
}
