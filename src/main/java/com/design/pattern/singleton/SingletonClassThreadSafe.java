package com.design.pattern.singleton;

// Using Eager Initialization
public class SingletonClassThreadSafe {

	// private instance, so that it can be
	  // accessed by only by getInstance() method
	  private static SingletonClassThreadSafe instance;
	 
	  private SingletonClassThreadSafe() 
	  {
	    // private constructor
	  }
	 
	 //synchronized method to control simultaneous access
	  synchronized public static SingletonClassThreadSafe getInstance() 
	  {
	    if (instance == null) 
	    {
	      // if instance is null, initialize
	      instance = new SingletonClassThreadSafe();
	    }
	    return instance;
	  }
}
