import java.util.ArrayList;

public class Dealership {
    String name, address;
    Tree vehiclesTree;
    byte vehiclesNum;
    float profit;
    private ArrayList<Vehicle> vehiclesList;

    public Dealership(){
        name = null;
        address = null;
        vehiclesNum = 0;
        profit = 0.0f;
        vehiclesTree = new Tree(null);
        vehiclesList = new ArrayList<Vehicle>();
    }

    public Dealership(String name, String address, byte n){
        this.name = name;
        this.address = address;
        vehiclesNum = n;
        profit = 0.0f;
        vehiclesTree = new Tree(null);
        vehiclesList = new ArrayList<Vehicle>();
    }

    public String toString(){
        String r = "";
        r+="Dealership: "+name;
        r+="\nAddress: "+address;
        r+="\nVehicles:"+vehiclesNum;
        r+="\nTree:";
        vehiclesTree.preOrder();
        return r;
    }

    /**
     * Adds vehicle to the binary tree
     * @param add
     */
    public void addVehicle (Vehicle newVehicle) {
        vehiclesList.add(newVehicle);
    }

    public void sortVehiclesByPrice (float price) {
        vehiclesTree = new Tree(null);
        byte differenceIndex = 0;
        
        for (byte i = 1; i < vehiclesList.size(); i++) {
            if((price - vehiclesList.get(i).price) < (vehiclesList.get(differenceIndex).price)) {
                differenceIndex = i;
            }
        }

        for(byte i = 0; i < vehiclesList.size(); i++) {
            if(i != differenceIndex) {
                vehiclesTree.insert(vehiclesList.get(i));
            }
        }
        
    }

}
