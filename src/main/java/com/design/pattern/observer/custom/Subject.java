package com.design.pattern.observer.custom;

public interface Subject {

	public void subscribeObserver(Subscriber observer);
	
	public void unsubscribeObserver(Subscriber observer);
	
	public void notifyObserver();
}
