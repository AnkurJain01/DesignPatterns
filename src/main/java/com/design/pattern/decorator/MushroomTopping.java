package com.design.pattern.decorator;

public class MushroomTopping implements Topping {

	private Pizza pizza;

	public MushroomTopping(Pizza pizza){
		this.pizza = pizza;
	}

	public String description() {
		return pizza.description() + ":Mushroom Topping";
	}

	public double cost() {
		return 50.0 + pizza.cost();
	}

}
