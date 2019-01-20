import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Brandon Ong
 * period # 3
 *
 */
public class RoadTrip
{
    //list of geo locations
    //your code goes here
    private ArrayList <GeoLocation> locations = new ArrayList <GeoLocation>();
    /**
     * Constructor reads in the geo locations from the given file and adds them to 
     * the list
     * @param fname - file name
     */
    public RoadTrip(String fname)
    {
    	//your code goes here
    	try
    	{
    	   Scanner in = new Scanner(new File(fname));
    	   while(in.hasNextLine())
       	{
       	   String place = in.next();
       	   double latitude = in.nextDouble();
       	   double longitude = in.nextDouble();
       	   addStop(place, latitude, longitude);
       	}
    	}
    	catch(Exception e)
    	{
    	   
    	}
    	
    	
    }
    /**
     * Create a GeoLocation and add it to the road trip
     * @param name - name of the geo location
     * @param latitude - latitude in degrees
     * @param longitude - longitude in degrees
     */
   
    public void addStop(String name, double latitude, double longitude)
    {
        //your code goes here
        GeoLocation temp = new GeoLocation(name, latitude, longitude);
        locations.add(temp);
        
    }

    /**
     * Get the total number of stops in the trip
     * @return total number of stops
     */
    public int getNumberOfStops()
    {
        //your code goes here
        return locations.size();
    }

    /**
     * Get the total miles of the trip
     * @return the total miles
     */
    
    public double getTripLength()
    {
        //your code goes here
        
        double distance = 0;
        int n;
        for(n=0;n<locations.size()-1;n++)
        {
           double thisDistance = locations.get(n).distanceFrom(locations.get(n+1));
           distance+= thisDistance;
        }
        return distance;
    }

    /**
     * Return a formatted toString of the trip
     * @return information about the trip
     */
     
    public String toString()
    {
        //your code goes here
        String list ="";
        int n=0;
        while(n<locations.size())
        {
           GeoLocation temp = locations.get(n);
           list+=temp.toString()+"\n";
           n++;
        }
        list+="Stops: "+getNumberOfStops()+"\n";
        list+="Total miles: "+getTripLength()+" miles\n";
        return list;
    }
}
