package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PrintCustomer {
	Connection con;
	Statement stat;
	ResultSet res;
	PreparedStatement pre;
	int id;
	String fname;
	String lname;
	String address;
	String email;
	
	
	
	
	public PrintCustomer()
	
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment4", "root", "Success$132");
			System.out.println("Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void printData()
	{
		try
		{
			
						stat=con.createStatement();
					res=stat.executeQuery("select * from customer");
			while(res.next())
			{
				System.out.println(res.getInt("customer_id"));
				System.out.println(res.getString("customerc_fname"));
				System.out.println(res.getString("customer_lname"));
				System.out.println(res.getString("customer_address"));
				System.out.println(res.getString("customer_email"));
				System.out.println("===============================");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
////		PrintCustomer rd=new PrintCustomer();
////		
////		rd.printData();
////
////	}
	public static void main(String[] args) {
		int ch ;
		while(true) {
		Scanner sc=new Scanner(System.in);
		PrintCustomer c =new PrintCustomer();
	System.out.println("Enter Your Choice:-\n");
	System.out.println("1.Insert \n 2.Update \n 3.Delete \n 4. Display \n 5.Exit");
	ch=sc.nextInt();
	if(ch == 1 ) {
		c.insertData();
	}
	else if(ch ==2 ) {
		c.update();
		
	}
	else if(ch ==3) {
		c.delete();
	}
	else if(ch== 4)
	{
		c.printData();
	}
	else if(ch ==5) {
		System.exit(1);
	}
	else {
		System.out.println("Invalid entry");
	}
		}
		}
	public void insertData()

	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Customer Id");
			id=sc.nextInt();
			System.out.println("Enter First Name.");
			fname=sc.next();
			System.out.println("Enter Last Name.");
			lname=sc.next();
			System.out.println("Enter Address");
			address=sc.next();
			System.out.println("Enter Email");
			email=sc.next();
			
			pre=con.prepareStatement("insert into customer values(?,?,?,?,?)");
			pre.setInt(1,id);
			pre.setString(2,fname);
			pre.setString(3,lname);
			pre.setString(4,address);
			pre.setString(5,email);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Customer Details Committed..");
			else
				System.out.println("Customer Details are Not Committed..");
			pre.close();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void delete()
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id");
		i=sc.nextInt();
		try
		{
			pre=con.prepareStatement("delete from customer where id=?");
			pre.setInt(1,i);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Deleted...");
			else
				System.out.println("Record has not Deleted...");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void update()
	{
		int i;
		String Name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id");
		i=sc.nextInt();
		System.out.println("Enter Customer Name First  To Be updated");
		Name = sc.next();
		
		try
		{
			pre=con.prepareStatement("update customer set fname=? where id=?");
			pre.setString(1, Name);
			pre.setInt(2,i);
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Name updated for id is.."+i);
			else
				System.out.println("Name is not updated..");
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
