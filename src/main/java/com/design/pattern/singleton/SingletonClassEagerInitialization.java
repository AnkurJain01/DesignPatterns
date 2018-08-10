package com.design.pattern.singleton;

// Using Eager Initialization
public class SingletonClassEagerInitialization {

	public static SingletonClassEagerInitialization instance = new SingletonClassEagerInitialization();
	 
	  private SingletonClassEagerInitialization()
	  {
	    // private constructor
	  }
}
