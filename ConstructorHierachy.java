package com.sbi;

public class ConstructorHierachy {
	public static void main(String[] args) {
		Clock clock = new Clock();
		clock.showtime();
		
		System.out.println("-------------------");
		Watch watch = new Watch();
		watch.Analog();
		watch.Digital();
		watch.showtime();
		
		
		System.out.println("-------------------");
		SmartWatch swatch = new SmartWatch();
		swatch.Heartrate();
		swatch.StepCount();
		swatch.Digital();
		swatch.showtime();
	}
}
class Clock
{
	Clock() {
		super();
		System.out.println("Clock() ctor");
	
	}
	void showtime() {
		System.out.println("Clock is showing Time ");
	}
}
class Watch extends Clock
{
	Watch() {
		super();
		System.out.println("\tWatch() ctor");
		
	}
	void Analog() {
		System.out.println("Watch is Analog....");
	}
	void Digital() {
		System.out.println("Watch is Digital...with Stop Watch....");
	}
	void showtime() {
		System.out.println("Watch shows time in  Analog or Digital or Both ");
	}
}
class SmartWatch extends Watch 
{
	SmartWatch() {
		super(); // means invoke teh nearest super class ctor...
		System.out.println("\t\tSmartWatch() ctor");
		//throw new RuntimeException("gadbad");
	}
	void Heartrate() {
		System.out.println("SmartWatch Monitors HeartBeat ...");
	}
	void StepCount() {
		System.out.println("SmartWatch calculates Step Count......");
	}
	void Digital() {
		System.out.println("SmartWatch is Digital...with HeartBeat....");
	}
	void showtime() {
		System.out.println("SmartWatch shows time in  Analog or Digital or Both with features ");
	}
}
/*
 * 		Person
 * 		|gender,dob, address
 * 		|
 * 		Student
 * 		| rollno,collegename,degree,marksheets
 * 		Employee
 * 			empno,desg,dept,basic, hra,da,ta		
 * 
 * Employee e = new Employee();
 * 
 */
