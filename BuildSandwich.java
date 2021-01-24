package designerPattern;

public class BuildSandwich {
	public static void main(String[] args) {
		Sandwich freshSandwich1 = new HamSandwich();
		
		freshSandwich1 = new AmericanCheese(freshSandwich1);
		freshSandwich1 = new Mustard(freshSandwich1);
		
		
		Sandwich freshSandwich2 = new TurkeySandwich();
		
		freshSandwich2 = new Mustard(freshSandwich2);
		
		System.out.println(freshSandwich1.getDescription());
		System.out.println(freshSandwich1.getCost());
		System.out.println(freshSandwich2.getCost());
	}
}
