package com.sbi;

/*
 * 
 * Constructor
 * 
 * 	- a special function which has same name as of
 * the enclosing class
 * 
 * - does not have return type
 * - well it can take parameters
 * 
 * - it is automatically invoked during 
 *   the object creation process
 * 
 * - to initialize the data of the object
 */
public class Point {
	public static void main(String[] args) {
		Point1 pointObj1 = new Point1(10,20);
		Point1 pointObj2 = new Point1(100,200);
		Point1 pointObj3 = new Point1(300,400);
		
		Point3D point3Dobj1 = new Point3D(10,20,30);
		
		//pointObj1.show();
		System.out.println("pointObj1 : "+pointObj1);
		System.out.println("pointObj2 : "+pointObj2);
		System.out.println("pointObj3 : "+pointObj3);
		
		System.out.println("point3Dobj1 : "+point3Dobj1);
		
	
	}
}

class Point1 // extends Object 
{
	private int x;
	private int y;
	
	Point1() {
		System.out.println("Point() ctor called...");
		x = 0;
		y = 0;
	}
	Point1(int x, int y) {
		System.out.println("Point(int,int) ctor called...");
		this.x = x;
		this.y = y;
	}
	Point1(int x) {
		System.out.println("Point(int) ctor called...");
		this.x = x;
		this.y = 0;
	}
	void show() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	public String toString()
	{
		return "[ x :"+x+" and y :"+y+" ]" ;
	}
	
}

class Point3D{
	
	private int x;
	private int y;
	private int z;
	
	void Point1() {
		System.out.println("Point() ctor called...");
		x = 0;
		y = 0;
	}
	Point3D(int x, int y, int z) {
		System.out.println("Point3D(int,int,int) ctor called...");
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void Point1(int x) {
		System.out.println("Point(int) ctor called...");
		this.x = x;
		this.y = 0;
	}
	void show() {
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("z "+z);
	}
	public String toString()
	{
		return "[ x :"+x+" and y :"+y+" and z :"+z+"]" ;
	}
}