package com.design.pattern.observer.observable;

public class ObserverMain {

	public static void main(String[] args) {

		CountSubject subject = new CountSubject();
		subject.setName("Count Subject");
		subject.setCount(10);
		
		CountObserver obs1 = new CountObserver();
		obs1.setObserverName("OBS1");
		
		CountObserver obs2 = new CountObserver();
		obs2.setObserverName("OBS2");
		
		subject.addObserver(obs1);
		subject.setSubjectData(subject);
		
		subject.addObserver(obs2);
		
		subject.setCount(5);
		subject.setSubjectData(subject);
		
		subject.deleteObserver(obs2);
		
		subject.setName("New Subject");
		subject.setSubjectData(subject);
	}

}
