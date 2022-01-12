package vehicledealership;

public class Motorcycle extends Vehicle {

	String type, engine;
	float enginedisplacement;
	boolean istwostroke;
	
	
	public Motorcycle() {
		String type, engine = null;
		float enginedisplacement = 0.0f;
		boolean istwostroke = true;
	}
	
	public Motorcycle(String type, String engine, float enginedisplacement, boolean istwostroke) {
		this.type = type;
		this.engine = engine;
		this.enginedisplacement = enginedisplacement;
		this.istwostroke = istwostroke;
	}
	
	public static void main(String args[]) {
		
		Motorcycle m1 = new Motorcycle("Dirtbike", "V4", 5.4f, true);
		
		m1.mileage = 100;
		
		System.out.println(m1);
		
	}
	
	public String toString() {
		
		String r = super.toString();
		r+="\nType: "+type;
        r+="\nEngine: "+engine;
        r+="\nEnginedisplacement: "+enginedisplacement;
        if(istwostroke) {
        	r+="\n2 Stroke";
        }
        else 
        	r+="\n4 Stroke";
		return r;
	}
	
}
