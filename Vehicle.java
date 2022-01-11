public class Vehicle
{
    float price;
    short year;
    int mileage;
    String name, plate;
    
    public Vehicle(){
        price = 0.00f;
        year = 0;
        mileage = 0;
        name = null;
        plate = null;
    }
    
    public Vehicle(float price, short year, String name, String plate, int mileage){
        this.price = price;
        this.year = year;
        this.name = name;
        this.plate = plate;
        this.mileage = mileage;
    }
    
    public String toString(){
        String r = "";
        r+="Name: "+name;
        r+="Plate: "+plate;
        r+="Year: "+year;
        r+="Price: "+price;
        r+="Mileage: "+mileage;
        return r;
    }
}
