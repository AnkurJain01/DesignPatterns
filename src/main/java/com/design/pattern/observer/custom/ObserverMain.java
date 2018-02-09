package com.design.pattern.observer.custom;

public class ObserverMain {

	public static void main(String[] args) {

		CountSubject subject = new CountSubject();
		subject.setName("Count Subject");
		subject.setCount(10);
		
		CountObserver obs1 = new CountObserver(subject);
		obs1.setObserverName("OBS1");
		
		CountObserver obs2 = new CountObserver(subject);
		obs2.setObserverName("OBS2");
		
		subject.setCount(5);
		subject.setSubjectData(subject);
		
		subject.unsubscribeObserver(obs2);
		
		subject.setName("New Subject");
		subject.setSubjectData(subject);
	}

}
