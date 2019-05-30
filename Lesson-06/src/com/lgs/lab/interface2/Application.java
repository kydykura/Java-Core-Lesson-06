package com.lgs.lab.interface2;

public class Application {

	public static void main(String[] args) {
	
		MyCalculator mc = new MyCalculator(27, 8); 
		mc.plus();
		mc.minus();
		mc.multiply();
		mc.devide();
	}

}
