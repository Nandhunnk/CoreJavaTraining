package com.sbi;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing Functions........");
		Dancer dancer = new Dancer();
		dancer.jump();
		dancer.twist();
		System.out.println("");
		System.out.println("Testing My Functions........");
		MyFunctions myFun = new MyFunctions();
		myFun.print();
		System.out.println("");
		myFun.age(40);
		System.out.println("");
		float addit = myFun.addi(10,20);
		System.out.println("Addition of 2 Numbers:"+addit);
		System.out.println("");
		double pi = myFun.pivalue();
		System.out.println("The Value of PI is:"+pi);
	}

}

class Dancer
{
	void dance() {
		System.out.println("Dancer is dancing");
	}
	void jump() {
		System.out.println("Dancer is Jumping");
	}
	void twist() {
		System.out.println("Dancer is Twisting");
	}
}

class MyFunctions
{
	void print() {
		System.out.println("Function 1: W/O Arguments and W/O Return Values");
	}
	
	void age(int ag) {
		System.out.println("Function 2: With Arguments but W/O Return Values");
		System.out.println("Your Age is :"+ag);
		
	}
	float addi(int fn, int ln ) {
		System.out.println("Function 3: With Arguments and With Return Values");
		return (fn+ln);
	}
	double pivalue() {
		System.out.println("Function 4: W/O Arguments but With Return Values");
		return (22/7.0);
	}
	
}