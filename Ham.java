package designerPattern;

public class Ham extends SandwichDecorator{
	public Ham(Sandwich newSandwich){
		super(newSandwich);
	}
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempSandwich.getDescription() + "stuff now includes Ham\n";
	}

	@Override
	public double getCost() {
		System.out.println("Adding Ham costs $2.00");
		
		return tempSandwich.getCost() + 2.00;
	}
	
	public String setCategory() {
		
		return tempSandwich.setCategory() + " Meat";
	}
}
