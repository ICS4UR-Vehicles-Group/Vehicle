
/**
 * Write a description of class d here.
 *
 * @author (William)
 * @version (a version number or a date)
 */
 

public class Dealership {
    String name, address;
    //Tree vehicles
    byte vehiclesNum;
    float profit;

    public Dealership(){
        name = null;
        address = null;
        vehiclesNum = 0;
        profit = 0.0f;
    }

    public Dealership(String name, String address, byte n){
        this.name = name;
        this.address = address;
        vehiclesNum = n;
        profit = 0.0f;
    }

    public String toString(){
        String r = "";
        r+="Dealership: "+name;
        r+="\nAddress: "+address;
        r+="\nVehicles: "+vehiclesNum;
        r+= "\nProfit: " + this.profit;
        //r+=Tree
        return r;
    }
    
    public void sellVehical(){
        
    }
    
    

    
}