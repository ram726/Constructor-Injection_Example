package org.ram.consInjectApp;

import java.util.List;

public class BmwImpl  implements ICar{
	private int id;
	private String color;
	private Engine engine;
	private List<String> wheels;
	public BmwImpl(int id, String color, Engine engine, List<String> wheels) {
		super();
		this.id = id;
		this.color = color;
		this.engine = engine;
		this.wheels = wheels;
	}
	public void drive() {
		System.out.println("BMW Car Details.");
		System.out.println("BMW Id: "+id);
		System.out.println("BMW color: "+color);
		System.out.println(engine);
		System.out.println("Bmw Wheels: "+wheels);
	}
	
	
	

}
