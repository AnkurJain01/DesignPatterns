package com.design.pattern.observer.custom;

import java.util.ArrayList;
import java.util.List;

public class CountSubject implements Subject{

	private int count;
	private String name;
	private List<Subscriber> subscriberList;
	
	public CountSubject(){
		subscriberList = new ArrayList<Subscriber>();
	}
	
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

	public void subscribeObserver(Subscriber observer) {
		subscriberList.add(observer);
	}

	public void unsubscribeObserver(Subscriber observer) {
		subscriberList.remove(observer);
		
	}

	public void notifyObserver() {

		for(Subscriber observer: subscriberList){
			observer.update(this, null);
		}
	}
	
	public void setSubjectData(CountSubject sub){

		this.count = sub.getCount();
		this.name = sub.getName();
		
		notifyObserver();
	}
}
