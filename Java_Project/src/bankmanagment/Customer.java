package bankmanagment;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Customer {
	
	private double balance;      // new Account balance

			int bankAccount;
			String name;
			int interest;
			int charges;
			
			
			
			
			
		  //Employee class constructor 
		  public Customer(int bAcc, String customerName, double balance2, int intr, int chrg){
		     bankAccount = bAcc;
		     name = customerName;
		     balance=balance2;  
		     interest = intr;
		     charges=chrg;
		     
		  }
		  
		  // method to show the account details
		public void showData(){
		   System.out.print("ACCOUNT NO is= "+bankAccount  + "\n  " + " CUSTOMER Name = "+name +"\n"+
				   "Balance is  " +balance+" \n"+" interest rate is  "+interest+"\n"+
				   "Yearly charges are "+ charges +"\n"+"Withdrawl charges are $2 everytime")
		   ;
		   System.out.println();
		 }
		
		
			
		// method to create a .txt file 
		
		public void fileCreate() throws FileNotFoundException {
			
			PrintWriter file2 = new PrintWriter(bankAccount+".txt"  );
			file2.println("Account no is"+bankAccount);
			file2.println("Name of customer :"+name);
			file2.println("BAlance of an account:"+balance);
			file2.println("interest rate for account :"+interest);
			file2.println("Yearly charges for the account "+charges);
			file2.println("withdrawl charges  $2 everytime ");
			
			file2.close();
			
			
			
		} 
		
	}


