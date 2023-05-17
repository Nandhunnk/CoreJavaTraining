package com.sbi;

public class PersonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ppl p = new Ppl('M',23,"Jane",'L');
		Ppl p2 = new Ppl('F',23,"Julie",'U');
		
		Ticket tkt = new Ticket();
		System.out.println("Ticket is : "+tkt);
		
		Ticketing g = tkt.done(p, p2);
		System.out.println("Ticket : "+g);
		
		
	}

}

class Ticketing
{
	String Berth;
	int seat;
	
	public Ticketing(String Berth, int seat) {
		super();
		this.Berth = Berth;
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "Ticket [Berth=" + Berth + ", Seat=" + seat + "]";
	}
	
}

class Ticket
{
	void gettktinfo(Ppl x) { // here x is a proxy of person1
		System.out.println("Getting Ticket Info...");
		x.setName("Julie"); //
		x.setGender('F');
		x.setAge(25);
		x.setSeat('L');
	}
	
	Ticketing done(Ppl x, Ppl y) {
		System.out.println("Ticket Booking For "+x.getName()+" and "+y.getName());
		Ticketing Ticketing = new Ticketing("Ticket Book For "+x.getName()+"",'A');
		return Ticketing;
	}
}

class Ppl{
	private char gender;
	private int age;
	private String name;
	private char seat;
	
	public Ppl(char gender, int age, String name,char seat) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.seat = seat;
	}
	
		@Override
	public String toString() {
		return "ppl [gender=" + gender + ", age=" + age + ", name=" + name + ", seat=" + seat + "]";
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSeat() {
		return seat;
	}
	public void setSeat(char seat) {
		this.seat = seat;
	}
	
	
}