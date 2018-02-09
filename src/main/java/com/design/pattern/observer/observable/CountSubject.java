package com.design.pattern.observer.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class CountSubject extends Observable{

	private int count;
	private String name;
	
	public int getCount(){
		return this.count;
	}
	
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setSubjectData(CountSubject sub){

		this.count = sub.getCount();
		this.name = sub.getName();
		
		setChanged();
		notifyObservers();
	}
}
