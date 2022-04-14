//import Scanner, ArrayList and HashMap classes from java.util library 
import java.text.DecimalFormat; 
import java.util.Scanner; 
import java.util.Date; 
 
class Account { 
 
   private int id; 
   private double balance; 
   private double annualInterestRate; 
   private Date dateCreated; 
  
// declaring a constructor with default values 
Account(){ 
    this.id = 0; 
    this.balance = 0; 
    this.annualInterestRate  = 0; 
} 
Account(int id, double balance, double annualInterestRate){ 
    this.id = (id); 
    this.balance = (balance); 
    this.annualInterestRate  = (annualInterestRate); 
} 
 
//Declaring getters also known as accessors 
public int getId(){ 
    return id; 
} 
public double getBalance(){ 
    return balance; 
} 
public double getAnnualInterestRate(){ 
    return annualInterestRate; 
} 
public Date getDateCreated(){ 
    return dateCreated; 
} 
 
//Declaring setters also known as mutators 
 
void setAccountDetails(int id, double balance, double annualInterestRate, Date dateCreated){ 
    this.id = id; 
    this.balance = balance; 
    this.annualInterestRate = annualInterestRate; 
    this.dateCreated = dateCreated; 
} 
 
public double getMonthlyInterestRate(){ 
    double monthlyInterestRate = ((balance/12) * annualInterestRate); 
    DecimalFormat df = new DecimalFormat("##.##");  
    df.setMaximumFractionDigits(2);  
    return df.format(monthlyInterestRate); 
} 
 
void withdraw(){ 
    Scanner input = new Scanner(System.in); 
    System.out.println("Please enter the withdrawal amount"); 
    double withdraw = input.nextDouble(); 
    balance = balance - withdraw; 
} 
void deposit(){ 
    Scanner input = new Scanner(System.in); 
    System.out.println("Please enter the deposit amount"); 
    double deposit = input.nextDouble(); 
    balance = balance + deposit; 
} 
} 
 
public class Bank_account { 
 
//Declaring a main method which is the starting point of JAVA programming. 
//It accepts two parameters String Array and arguments => String[] args 
// Creating new instances of the class Scanner, class ArrayList and HashMap (in Python also known as dictionaries) 
// We are creating 9 objects. 
public static void main(String[] args){ 
   Account account_nr1 = new Account(1122, 20000, 0.045); 
//    System.out.println(account_nr1.getId() + " " + account_nr1.getBalance() + " " + account_nr1.getAnnualInterestRate()+ " " + account_nr1.getDateCreated()); 
   account_nr1.withdraw(); 
   account_nr1.deposit(); 
   System.out.println(account_nr1.getBalance()); 
   System.out.println(account_nr1.getMonthlyInterestRate()); 
   account_nr1.getDateCreated(); 
   System.out.println(account_nr1.getId() + " " + account_nr1.getBalance() + " " + account_nr1.getAnnualInterestRate()+ " " + account_nr1.getDateCreated()); 
    
} 
} 