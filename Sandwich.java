package designerPattern;

public abstract class Sandwich {
	String description;
	
	public String getDescription() {
		return "Your sandwich contains " + description + " and we're adding";
	}
	
	public abstract double getCost();
}
