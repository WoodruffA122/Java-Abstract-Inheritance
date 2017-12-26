package buildingproject;

/**
 *
 * @author arw5550
 */
public class Address 
{
    private int streetNum;
    private String streetName;
    private String city;
    private String state;
    private int zip;
    
    public Address(int streetNum, String streetName, String city, String state, int zip)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public String getInfo()
    {
        return "Address:\n" + streetNum + " " + streetName + "\n" + city+", "+state+" "+zip;
    }
}
