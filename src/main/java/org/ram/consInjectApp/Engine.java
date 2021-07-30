package org.ram.consInjectApp;

public class Engine {
	private int engineNumber;
	private int horsePower;
	private String engineType;
	public Engine(int engineNumber, int horsePower, String engineType) {
		super();
		this.engineNumber = engineNumber;
		this.horsePower = horsePower;
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", horsePower=" + horsePower + ", engineType=" + engineType
				+ "]";
	}
	
}
