package com.design.pattern.singleton;

// Using Eager Initialization
public class SingletonClassLazyWithDoubleCheck {

	// private instance, so that it can be
	  // accessed by only by getInstance() method
	  private static SingletonClassLazyWithDoubleCheck instance;
	 
	  private SingletonClassLazyWithDoubleCheck() 
	  {
	    // private constructor
	  }
	 
	  public static SingletonClassLazyWithDoubleCheck getInstance()
	  {
	    if (instance == null) 
	    {
	      //synchronized block to remove overhead
	      synchronized (SingletonClassLazyWithDoubleCheck.class)
	      {
	        if(instance==null)
	        {
	          // if instance is null, initialize
	          instance = new SingletonClassLazyWithDoubleCheck();
	        }
	       
	      }
	    }
	    return instance;
	  }
}
