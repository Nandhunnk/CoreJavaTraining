package com.sbi;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account accObj1 = new Account();
		accObj1.setAcc(123, "Nandhu", "Saving", 48500.0);
		
		Account accObj2 = new Account();
		accObj2.setAcc(223, "Kamal", "Current", 95821.0);
		
		accObj1.showAcc();
		accObj2.showAcc();
		
		accObj1.accwithdraw(500);
		accObj2.accdep(200);
		
		accObj1.showAcc();
		accObj2.showAcc();	
		
		accObj1.accInt();
		accObj2.accInt();
		
		accObj1.showAcc();
		accObj2.showAcc();	
	}

}

class Account {
	int accNum;
	String accName;
	String accType;
	double accBal;
	
	void setAcc (int x, String y, String z, double w) 
	{
		accNum=x;
		accName=y;
		accType=z;
		accBal=w;
	}
	
	void showAcc() 
	{
		System.out.println("");
		System.out.println(accType+" Account Number  : "+accNum);
		System.out.println(accType+" Account Holder  : "+accName);
		System.out.println(accType+" Account Type    : "+accType);
		System.out.println("----------------------");
		System.out.println("Account Balance 	: "+accBal);
		System.out.println("----------------------");
	}
	
	double accwithdraw(double amountToWithdraw) 
	{
		System.out.println(accName+" is withdrawing..."+amountToWithdraw);
		accBal  = accBal - amountToWithdraw;
		return accBal;
	}
	
	double accdep(double amountToDeposit) 
	{
		System.out.println(accName+" is Depositing..."+amountToDeposit);
		accBal  = accBal + amountToDeposit;
		return accBal;
	}
	
	double accInt() 
	{
		System.out.println(accName+" Balance after Interset Rate is applied...");
		accBal  = accBal * 5.45;
		return accBal;
	}
}
