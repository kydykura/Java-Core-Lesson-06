package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{

	
	public int a,b;
	
	MyCalculator(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void plus() {
		System.out.println(a + "+" + b + "= " + (a+b));
}

	@Override
	public void minus() {
		System.out.println(a + "-" + b + "= " + (a-b));
}

	@Override
	public void multiply() {
		System.out.println(a + "*" + b + "= " + (a*+b));
}

	@Override
	public void devide() {
		System.out.println(a + "/" + b + "= " + (a/b));
	}

}
