package com.design.pattern.decorator;

public class PanCrust implements Pizza {

	public String description() {
		return "This is a pan crust Pizza";
	}

	public double cost() {
		return 125.0;
	}

}
