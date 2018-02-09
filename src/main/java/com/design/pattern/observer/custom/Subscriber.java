package com.design.pattern.observer.custom;

public interface Subscriber {

	public void update(Subject sub, Object arg);
	
	public void display(Subject sub);
}
