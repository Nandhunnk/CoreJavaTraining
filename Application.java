import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;

class Application {
	public static void main(String[] args) {
		try {
			
			System.out.println("\t\t\tWelcome to State Bank of India");
			System.out.println("\nPlease fill the below details for opening an account with SBI");
					
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			//Connection conn =	DriverManager.getConnection("jdbc:oracle:thin:"+ "@localhost:1521:XE","scott","tiger");
			
			conn.setAutoCommit(false); //TRANSACTION can be started
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO APPLICANT (applicationid,applicantname,applicantaddress,applicantpan,applicantmobile,appliedfor,applicationstatus) VALUES (?,?,?,?,?,?,'SUBMIT')");
			
			Scanner scanner1 = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			Scanner scanner3 = new Scanner(System.in);
			Scanner scanner4 = new Scanner(System.in);
			Scanner scanner5 = new Scanner(System.in);
			Scanner scanner6 = new Scanner(System.in);
			
			System.out.println("\nPlease Enter Application Id:");
			String newAppId  = scanner1.nextLine();
			
			System.out.println("\nPlease Enter Applicant Name:");
			String newAppName  = scanner2.nextLine();
			
			System.out.println("\nPlease Enter Applicant Address:");
			String newAppAdd  = scanner3.nextLine();
			
			System.out.println("\nPlease Enter Applicant PAN:");
			String newAppPan  = scanner4.nextLine();
			
			System.out.println("\nPlease Enter Applicant Mobile:");
			String newAppMob  = scanner5.nextLine();
			
			System.out.println("\nPlease Enter Applicant applied for SB/CA:");
			String newAppAcc  = scanner6.nextLine();
			
			pst.setString(1, newAppId);
			pst.setString(2, newAppName);
			pst.setString(3, newAppAdd);
			pst.setString(4, newAppPan);
			pst.setString(5, newAppMob);
			pst.setString(6, newAppAcc);
			
			System.out.println("Application Submitted Successfully....");

			System.out.println("Would you like to confirm (yes/no) : ");
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("yes")) {
				int rows = pst.executeUpdate();
				conn.commit();
				System.out.println(rows + "Application Submitted Successfully...");
			}
			else {
				System.out.println("Application Failed to Submit...");
			}
						
			System.out.println("Trying to close the DB connection....");
			pst.close();
			conn.close();
			System.out.println("Disconnected from the DB");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		approveapplication();
	}
	
	public static void approveapplication()
	{		
		
		System.out.println("\nApprove or Reject Application");
		
		try {
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		//Connection conn =	DriverManager.getConnection("jdbc:oracle:thin:"+ "@localhost:1521:XE","scott","tiger");
		
		conn.setAutoCommit(false); //TRANSACTION can be started
		
		PreparedStatement apv = conn.prepareStatement("UPDATE APPLICANT set applicationstatus='APPROVED' where applicationid=?");
		PreparedStatement rej = conn.prepareStatement("UPDATE APPLICANT set applicationstatus='REJECT' where applicationid=?");
		
		System.out.println("\nPlease find Applications List");	
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(" select APPLICATIONID,APPLICANTNAME,applicationstatus from APPLICANT where applicationstatus='SUBMIT'");
		
		while(rs.next()) {
			System.out.println("APPLICANTID    		: "+rs.getInt(1));
			System.out.println("APPLICANTNAME 		: "+rs.getString(2));
			System.out.println("applicationstatus  	: "+rs.getString(3));
			System.out.println("---------------------------------------");
		}	
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("\nPlease Enter Application ID:");
		String applicationid  = scanner1.nextLine();
		
		apv.setString(1, applicationid);
		rej.setString(1, applicationid);
		
		System.out.println("Would you like to approve (yes/no) : ");
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		if(answer.equalsIgnoreCase("yes")) {
			int rows = apv.executeUpdate();
			conn.commit();			
			System.out.println( "Application approved successfully...");
		}
		else {
			int rows = rej.executeUpdate();
			conn.commit();		
			System.out.println("Application rejected...");
		}		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

