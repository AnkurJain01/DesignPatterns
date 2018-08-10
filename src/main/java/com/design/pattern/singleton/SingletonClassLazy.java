package com.design.pattern.singleton;

// Using Eager Initialization
public class SingletonClassLazy {

		// private instance, so that it can be
	  // accessed by only by getInstance() method
	  private static SingletonClassLazy instance;
	 
	  private SingletonClassLazy() 
	  {
	    // private constructor
	  }
	 
	  //method to return instance of class
	  public static SingletonClassLazy getInstance() 
	  {
	    if (instance == null) 
	    {
	      // if instance is null, initialize
	      instance = new SingletonClassLazy();
	    }
	    return instance;
	  }
}
