package com.design.pattern.singleton;

// Using Eager Initialization
public class SingletonClassStaticBlock {

	// public instance
	  public static SingletonClassStaticBlock instance;
	 
	  private SingletonClassStaticBlock() 
	  {
	    // private constructor
	  }
	 
	  {
	    // static block to initialize instance
	    instance = new SingletonClassStaticBlock();
	  }
}
