package GroupProject;

public class Vehicle
{
    float price;
    short year;
    String name, plate;
    
    public Vehicle(){
        price = 0.00f;
        year = 0;
        name = null;
        plate = null;
    }
    
    public Vehicle(float price, short year, String name, String plate){
        this.price = price;
        this.year = year;
        this.name = name;
        this.plate = plate;
    }
    
    public String toString(){
        String r = "";
        r+="Name: "+name;
        r+="Plate: "+plate;
        r+="Year: "+year;
        r+="Price: "+price;
        return r;
    }
}

