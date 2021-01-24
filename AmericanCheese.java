package designerPattern;

public class AmericanCheese extends SandwichDecorator {
	public AmericanCheese(Sandwich newSandwich){
		this.tempSandwich = newSandwich;
	}
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempSandwich.getDescription() + "adding american cheese\n";
	}
	
	public double getCost() {
		System.out.println("Adding American Cheese Costs $1.00");
		return tempSandwich.getCost() + 1.00;
	}
}
