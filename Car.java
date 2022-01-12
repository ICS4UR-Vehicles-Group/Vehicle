public class Car extends Vehicle {
    String body_style, engine_config, fuel_type;
    int num_of_seats, num_of_cylinders;

    public Car()
    {
        super();
        this.body_style = null;
        this.engine_config = null;
        this.fuel_type = null;
        num_of_cylinders = 0;
        num_of_seats = 0;
    }


    public Car(String body_style, String engine_config, String fuel_type, int num_of_seats, int num_of_cylinders) {
        super();
        this.body_style = body_style;
        this.engine_config = engine_config;
        this.fuel_type = fuel_type;
        this.num_of_cylinders = num_of_cylinders;
        this.num_of_seats = num_of_seats;
    }

    public String toString()
    {
        String s = super.toString();
        s += "Body Style: " + body_style;
        s += "Engine Configuration: " + engine_config;
        s += "Fuel Type: " + fuel_type;
        s += "Num of Cylinders: " + num_of_cylinders;
        s += "Num of Seats: " + num_of_seats;

        return s;
    }
}
