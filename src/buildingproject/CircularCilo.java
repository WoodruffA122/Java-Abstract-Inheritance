package buildingproject;

/**
 *
 * @author arw5550
 */
public class CircularCilo extends Building
{
    private double circumference;
    private double height;
    
    public CircularCilo(double purchaceCost, String buildingColor, String ownerName, double circumference, double height, Address address)
    {
        super(purchaceCost, buildingColor, ownerName, address);
        this.circumference = circumference;
        this.height = height;
    }
    
    @Override
    public String getInfo()
    {
        return super.getInfo() + "\nCircumference: " + this.circumference + "\nHeight: " + this.height;
    }
    
    @Override
    public double calculateVolume()
    {
        return (height * Math.pow(circumference, 2))/(4 * Math.PI);
        //calculation works
        //((c^2)*h)/4pi
    }
    
}
