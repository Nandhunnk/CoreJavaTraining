package com.sbi;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight ft = new Flight(123,"Indica",1530,"CBD","MUM");
		System.out.println(ft);
	}

}

class Flight{
	
	private int flightno;
	private String flightCarrier;
	private int flighttime;
	private String source;
	private String destination;
	
	public Flight(int flightno, String flightCarrier, int flighttime, String source, String destination) {
		super();
		this.flightno = flightno;
		this.flightCarrier = flightCarrier;
		this.flighttime = flighttime;
		this.source = source;
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Flight [flightno=" + flightno + ", flightCarrier=" + flightCarrier + ", flighttime=" + flighttime
				+ ", source=" + source + ", destination=" + destination + "]";
	}
	
	
	
	
}