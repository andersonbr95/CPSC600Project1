package designerPattern;

public class Mustard extends SandwichDecorator{
	public Mustard(Sandwich newSandwich){
		this.tempSandwich = newSandwich;
	}
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempSandwich.getDescription() + "adding Mustard\n";
	}

	public double getCost() {
		System.out.println("Adding Mustard Costs: $.50");
		return tempSandwich.getCost() + .50;
	}
}
