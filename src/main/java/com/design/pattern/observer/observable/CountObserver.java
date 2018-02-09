package com.design.pattern.observer.observable;

import java.util.Observable;
import java.util.Observer;

public class CountObserver implements Observer {

	private String observerName;
	
	/**
	 * @return the observerName
	 */
	public String getObserverName() {
		return observerName;
	}

	/**
	 * @param observerName the observerName to set
	 */
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public void display(Observable sub) {

		CountSubject countSub = (CountSubject) sub;
		
		System.out.println("Observer Name:" + observerName);
		
		System.out.println("Subject Count:" + countSub.getCount());
		System.out.println("Subject Name:" + countSub.getName());
		
	}

	public void update(Observable o, Object arg) {
		if(o instanceof CountSubject)
			display(o);
	}
	
}
