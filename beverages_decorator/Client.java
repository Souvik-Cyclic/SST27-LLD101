package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
        System.out.println("Coffee");
		System.out.println(coffee.cost());
        coffee = new ChocolateDecorator(coffee);
        System.out.println(coffee.cost());
        coffee = new ChocolateDecorator(coffee);
        System.out.println(coffee.cost());
		
		Beverage chocolateCoffee = new Chocolate(coffee);
		System.out.println("Coffee with Chocolate");
		System.out.println(chocolateCoffee.cost());

		Beverage hazelnutChocolateCoffee = new Hazelnut(chocolateCoffee);
		System.out.println("Coffee with Chocolate and Hazelnut");
		System.out.println(hazelnutChocolateCoffee.cost());
	}

}