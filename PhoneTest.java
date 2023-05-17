package com.sbi;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		myPhone.dial();
		byte b=123;
		myPhone.dial(b);
		myPhone.dial("Nandhu");
		byte cntrycode=91;
		myPhone.dial(cntrycode,123458789);
		myPhone.dial(123458789L,cntrycode);
		myPhone.dial(b);
		
	}

}

class Phone
{
	void dial() 
	{ //techneck
		System.out.println("dial() nowhere ... ");
	}
	void dial(byte intercom) 
	{ //techneck
		System.out.println("dial(byte) nowhere ... "+intercom);
	}
	void dial(String name) 
	{ //techneck
		System.out.println("dial(String) nowhere ... "+name);
	}
	void dial(byte code,long num) 
	{ //techneck
		System.out.println("dial(byte,long) nowhere ... +"+code+" "+num);
	}
	void dial(long num,byte code) 
	{ //techneck
		System.out.println("dial(long,byte) nowhere ... +"+code+" "+num);
	
	}
}