package designerPattern;

public class HamSandwich extends Sandwich{

	public HamSandwich() {
		description = "Ham ";

	}
	
	@Override
	public double getCost() {
		System.out.println("Basic Ham Sandwich costs: $5.00");
		return 5.00;
	}
}
