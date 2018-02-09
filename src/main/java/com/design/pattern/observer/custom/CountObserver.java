package com.design.pattern.observer.custom;

public class CountObserver implements Subscriber {

	private Subject subject;
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

	public CountObserver(Subject subject) {

		this.subject = subject;
		subject.subscribeObserver(this);
	}

	public void update(Subject sub, Object arg) {
		display(sub);
	}

	public void display(Subject sub) {

		CountSubject countSub = (CountSubject) sub;
		
		System.out.println("Observer Name:" + observerName);
		
		System.out.println("Subject Count:" + countSub.getCount());
		System.out.println("Subject Name:" + countSub.getName());
		
	}
	
}
