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
abstract public class Building 
{
    private double purchaceCost;
    private String buildingColor;
    private String ownerName;
    private Address address;// = new Address(101, "Technology Drive","San Jose","CA",95110);
    
    public Building(double purchaceCost, String buildingColor, String ownerName, Address address)
    {
        this.purchaceCost = purchaceCost;
        this.buildingColor = buildingColor;
        this.ownerName = ownerName;
        this.address = address;
    }
    
    public String getInfo()
    {
        return "Purchace Cost: " + this.purchaceCost + "\nBuilding Color: " + this.buildingColor + "\nOwner Name: " + this.ownerName + "\n\n" + this.address.getInfo() + "\n";
    }
    
    abstract public double calculateVolume();
}
