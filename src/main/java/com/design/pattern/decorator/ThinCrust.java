package com.design.pattern.decorator;

public class ThinCrust implements Pizza {

	public String description() {
		return "This is a thin crust Pizza";
	}

	public double cost() {
		return 100.0;
	}

}
