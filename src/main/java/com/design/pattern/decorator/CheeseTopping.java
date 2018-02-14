package com.design.pattern.decorator;

public class CheeseTopping implements Topping {
	
	private Pizza pizza;
	
	public CheeseTopping(Pizza pizza){
		this.pizza = pizza;
	}

	public String description() {
		return pizza.description() + ":Cheese Topping";
	}

	public double cost() {
		return 75.0 + pizza.cost();
	}

}
