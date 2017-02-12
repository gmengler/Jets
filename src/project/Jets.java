package project;

public class Jets {

//	initializing parameters
	private String model;
	private float speed;
	private int range;
	private double price;

//	constructor for aircraft
	public Jets(String model, float speed, int range, double price) {
		this.model = model;
		this.speed = (float) (speed * 0.001303);
		this.range = range;
		this.price = price;
	}
	
	
//	toString to print aircraft
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(5);
		builder.append("Model: ");
		builder.append(model);
		builder.append("\nMach: ");
		builder.append(speed);
		builder.append("\nRange: ");
		builder.append(range);
		builder.append("\nPrice (in millions): $");
		builder.append(price);
		builder.append("\n");
		return builder.toString();
	}


	public Jets() {
	}


//	getters/setters
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public float getSpeed() {
		return speed;
	}


	public void setSpeed(float speed) {
		this.speed = speed;
	}


//	public float getMach() {
//		return mach;
//	}
//
//
//	public void setMach(float mach) {
//		this.mach = mach;
//	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
}
