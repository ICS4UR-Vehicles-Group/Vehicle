public class Vehicle
{
    //Instance variables
    float price, residualValue;
    short year;
    int mileage;
    String name, plate;
    
    //Default contructor
    public Vehicle(){
        price = 0.00f;
        residualValue = 0.0f;
        year = 0;
        mileage = 0;
        name = null;
        plate = null;
    }
    
    //Constructor
    public Vehicle(float price, float residualValue, short year, String name, String plate, int mileage){
        this.price = price;
        this.residualValue = residualValue;
        this.year = year;
        this.name = name;
        this.plate = plate;
        this.mileage = mileage;
    }
    
    //toString
    public String toString(){
        String r = "";
        r+="Name: "+name;
        r+="Plate: "+plate;
        r+="Year: "+year;
        r+="Price: "+price;
        r+="Mileage: "+mileage;
        return r;
    }

    //Add distance
    public void drive(int distance){
        mileage += distance;
    }

    //Accident decreases value fo car
    public void accident(float decrease){
        residualValue -= decrease;
    }
}
