package designerPattern;

public class TurkeySandwich extends Sandwich {
	
	public TurkeySandwich() {
		description = "Turkey ";
	}
	
	@Override
	public double getCost() {
		System.out.println("Basic Turkey Sandwich costs: $5.00");
		return 4.50;
	}
}
