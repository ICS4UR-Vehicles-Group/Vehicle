package vehicledealership;

public class Motorcycle extends Vehicle {

	String type, engine;
	float enginedisplacement;
	boolean istwostroke;
	
	public Motorcycle() {
		super();
		String type, engine = null;
		float enginedisplacement = 0.0f;
		boolean istwostroke = true;
	}
	
	public Motorcycle(String type, String engine, float enginedisplacement, boolean istwostroke) {
		super();
		this.type = type;
		this.engine = engine;
		this.enginedisplacement = enginedisplacement;
		this.istwostroke = istwostroke;
	}
	
	public String toString() {
		
		String r = super.toString();
		r+="\nTypse: "+type;
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
