package companyquestions;
import java.util.*;


public class Main5 {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    CA ca=new CA();
    SA sa=new SA();
    System.out.println("1.Current Account\n2.Savings Account");
    int a=s.nextInt();
    switch(a)
                       {  
                         case 1:
                         {
                           System.out.println("Name ");
                           ca.setName(s.next());
                           System.out.println("Account Number");
                           ca.setNumber(s.nextInt());
                           System.out.println("Account Balance");
                           ca.setBalance(s.nextDouble());
                           System.out.println("Enter the start Date(yyyy-mm-dd)");
                           ca.setStartdate(s.next());
                           System.out.println("Enter the Years");
                           ca.setYear(s.nextInt());
                           ca.display();
                           
                           
                           break;
                         }
                         case 2:
                         {
                        	 System.out.println("Name ");
                             sa.setName(s.next());
                             System.out.println("Account Number");
                             sa.setNumber(s.nextInt());
                             System.out.println("Account Balance");
                             sa.setBalance(s.nextDouble());
                             System.out.println("Enter the start Date(YYYY-mm-dd)");
                             sa.setStartdate(s.next());
                             System.out.println("Enter the Years");
                             sa.setYear(s.nextInt());
                             sa.display();
                           
                           
                           break;
                         }
                         default:
                         System.out.println("enter valid");
                       }   
    
    
  }
}
interface Mcharge
{
  public double computeMC();
}
class Account
{
  String name;
  int number;
  double balance;
  String startdate;
  int year;
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getStartdate() {
	return startdate;
}
public void setStartdate(String string) {
	this.startdate = string;
}}
class CA extends Account implements Mcharge
{
  int mc=100;
  public double computeMC()
  {
		return mc*getYear()+200;
  }
  public void display()
  {
	  System.out.printf("Maintainence Charge For Current Account %.2f",computeMC());
  }
  
}
class SA extends Account implements Mcharge
{
  int mc=50;
  public double computeMC()
  {
 
     return 2*mc*getYear()+50; 
  }
  public void display()
  {
	  System.out.printf("Maintainence Charge For Current Account %.2f",computeMC());
  }
}


