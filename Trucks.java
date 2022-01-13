import java.util.*;

/**
 * Write a description of class d here.
 *
 * @author (Kurt Hertz)
 * @version (1/12/2022)
 */
public class Trucks extends Vehicle {

    // instance variables
    String model, fuelType, engine, cargo;
    int cargoWight;
    boolean shifting;
    
    //declaring scanner to get user input
    Scanner in = new Scanner(System.in);

    //defalut constructor
    public Trucks(){
        this.model = "TBD";
        this.fuelType = "TBD";
        this.cargo = "Nothing";
        this.cargoWight = 0;
        this.shifting = false;
        this.engine = "TBD";
    }

    //all constructor;
    public Trucks(String model, String engine, String fuelType, String cargo, int cargoWight, boolean shifting){
        this.model = model;
        this.fuelType = fuelType;
        this.cargo = cargo;
        this.cargoWight = cargoWight;
        this.shifting = shifting;
        this.engine = engine;
    }

    public Trucks(String type, String engine, String fuelType){
        this.model = model;
        this.fuelType = fuelType;
        this.cargoWight = 0;
        this.shifting = false;
        this.engine = engine;
    }

    //to string outputs the type and the fuelType
    public String toString(){
        if(this.shifting = false){
            return ("Type: " + this.model + "/nEngine: " + this.engine + "/n Fuel type: " + this.fuelType + "/ncargoWight: " + this.cargoWight + "/n It has manual shifting");
        }
        else{
            return ("Type: " + this.model + "/nEngine: " + this.engine + "/n Fuel type: " + this.fuelType + "/ncargoWight: " + this.cargoWight + "/nIt has automatic shifting");
        }
        
    }
    
    public void addCargo(){
        String newCargo = "";
        int newWight = 0;
        
        System.out.println("What cargo are you adding to the vehicle?");
        newCargo = in.nextLine();
        System.out.println("How much does the cargo weigh");
        newWight = in.nextInt();
        
        if(cargo.equals("Nothing")){
            this.cargo = newCargo;
        }
        else{
            this.cargo += ", "+ newCargo;
        }
        
        cargoWight += newWight; 
    }
    
    
}
