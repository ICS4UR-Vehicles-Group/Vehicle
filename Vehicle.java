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
    public Vehicle(float price, short year, String name, String plate, int mileage){
        this.price = price;
        this.residualValue = price;
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
        r+="Residual Value: "+residualValue;
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

    public int compareTo(Vehicle comparison) {
        return (int)(this.price - comparison.price);
    }
}
