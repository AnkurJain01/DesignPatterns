package com.design.pattern.decorator;

public class DecoratorMain {

	public static void main(String[] args) {

		ThinCrust thinCrustPizza = new ThinCrust();

		Topping thinCrustTopping = new CheeseTopping(thinCrustPizza);
		thinCrustTopping = new MushroomTopping(thinCrustTopping);

		System.out.println(thinCrustTopping.description());
		System.out.println(thinCrustTopping.cost());

		PanCrust panCrustPizza = new PanCrust();

		Topping panCrustTopping = new CheeseTopping(panCrustPizza);

		System.out.println(panCrustTopping.description());
		System.out.println(panCrustTopping.cost());
	}

}
