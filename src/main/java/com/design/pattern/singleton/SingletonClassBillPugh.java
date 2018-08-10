package com.design.pattern.singleton;

// Using Eager Initialization
public class SingletonClassBillPugh {

	private SingletonClassBillPugh() 
	  {
	    // private constructor
	  }
	 
	  // Inner class to provide instance of class
	  private static class BillPughSingleton
	  {
	    private static final SingletonClassBillPugh INSTANCE = new SingletonClassBillPugh();
	  }
	 
	  public static SingletonClassBillPugh getInstance() 
	  {
	    return BillPughSingleton.INSTANCE;
	  }
}
