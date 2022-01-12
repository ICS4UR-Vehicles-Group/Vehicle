package GroupProject;

public class Dealership {
    String name, address;
    //Tree vehicles
    byte vehiclesNum;

    public Dealership(){
        name = null;
        address = null;
        vehiclesNum = 0;
    }

    public Dealership(String name, String address, byte n){
        this.name = name;
        this.address = address;
        vehiclesNum = n;
    }

    public String toString(){
        String r = "";
        r+="Dealership: "+name;
        r+="\nAddress: "+address;
        r+="\nVehicles:"+vehiclesNum;
        //r+=Tree
        return r;
    }

    
}
