package buildingproject;

/**
 *
 * @author arw5550
 */
public class BuildingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Address a2 = new Address(1542, "Test Street", "San Jose","CA",95111);
        
        RectangularRanch ranch = new RectangularRanch(178000, "orange", "Harold Smith",3,4,5,a2);
        System.out.println(ranch.getInfo());
        System.out.println("Volume: " + ranch.calculateVolume());
        
        System.out.println("------------------------------------------");
        
        Address a1 = new Address(101, "Technology Drive","San Jose","CA",95110);
        
        CircularCilo cilo = new CircularCilo(126000, "green", "Bill Johnson",132,25,a1);
        System.out.println(cilo.getInfo());
        System.out.println("Volume: " + cilo.calculateVolume());
    }
    
}
