/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingproject;

/**
 *
 * @author arw5550
 */
public class RectangularRanch extends Building
{
    private double length;
    private double width;
    private double height;
    
    public RectangularRanch(double purchaceCost, String buildingColor, String ownerName, double length, double width, double height, Address address)
    {
        //super to get Building constructor
        super(purchaceCost, buildingColor, ownerName, address);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public String getInfo()
    {
        return super.getInfo() + "\nLength: " + this.length + "\nWidth: " + this.width + "\nHeight: " + this.height;
    }
    
    @Override
    public double calculateVolume()
    {
        return length * width * height;
    }
    
}