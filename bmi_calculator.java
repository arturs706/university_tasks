// Create a BMI calculator
//import Scanner class from java.util library 

  
import java.util.Scanner; 
  
//import Scanner class from java.util library 
  
//We are creating a new class named BMI 
class BMI { 
    //Declaring a main method which is the starting point of JAVA programming. 
    //It accepts two parameters String Array and arguments => String[] args 
    public static void main(String[] args) { 
        // Creating a new instance of the class Scanner 
        Scanner input = new Scanner(System.in); 
  
        // Code in the loop will run, over and over again, as long as condition is not "true" 
        while(true){ 
            //Welcomes user requiring to enter chars either "i" or "m" 
  
            System.out.println("Welcome to BMI calculator. Please type  for \"m\" for \" Metric system\" or type \"i\" for an Imperial system"); 
            char chooseSys = input.next().charAt(0); 
  
            //if users has entered a letter "m" it will jump to the second condition. 
            if (chooseSys == 'm'){ 
  
                //Prompts user to input weight in lbs & height in inches. 
                //System.in reads inmput float units and assign them to pounds & inches variables respectively. 
  
                System.out.println("Please input your weight in \"kg\""); 
                float kilos = input.nextFloat(); 
                
                System.out.println("Please input your height in \"m\""); 
                float meters = input.nextFloat(); 
  
                //BMI formula for metric units == weight (kg) / [height (m)]2 
                //Also used Math.round for rounding a formula with 1 decimal place => ##.# 
  
                float roundBMIMet = Math.round((float)(kilos/((meters*meters))) * 100) / 100; 
  
                //Prints out BMI result 
  
                System.out.println("Your body mass index (BMI) is = " + roundBMIMet); 
  
                //Ternary operator used for condition == cond1? ifTrue1 : cond2? if True2 : ifFalse2 and so on. 
                //If BMI is 30 and above it is "Obese", if BMI is in range between 25-30 it is "Overweight", if between 18.5 and 25 it is "Healthy", everything below is "Underweight" 
  
                System.out.println(roundBMIMet>=30 
                ? "Obese" 
                :(roundBMIMet<=30 && roundBMIMet>=25) 
                ? "Overweight" 
                : (roundBMIMet<=25 && roundBMIMet>=18.5) 
                ? "Healthy" 
                : "Underweight" 
                ); 
  
                //Breaks the statement as the result has been displayed. 
                break; 
  
                //if users has entered a letter "i" it will jump to the second condition. 
            } else if (chooseSys == 'i') { 
  
                //Prompts user to input weight in lbs & height in inches. 
                //System.in reads inmput float units and assign them to pounds & inches variables respectively. 
  
                System.out.println("Please input your weight in \"lbs\""); 
                float pounds = input.nextFloat(); 
                System.out.println("Please input your height in \"inches\""); 
                float inches = input.nextFloat(); 
  
                //BMI formula for imperic units == [weight (lb) / height (in) / height (in)] x 703. 
                //Also used Math.round for rounding a formula with 1 decimal place => ##.# 
  
                float bmiInchResult = Math.round((float)(pounds/inches/inches*703) * 100) / 100; 
  
                //Prints out BMI result 
  
                System.out.println("Your BMI is " + bmiInchResult); 
  
                //Ternary operator used for condition == cond1? ifTrue1 : cond2? if True2 : ifFalse2 and so on. 
                //If BMI is 30 and above it is "Obese", if BMI is in range between 25-30 it is "Overweight", if between 18.5 and 25 it is "Healthy", everything below is "Underweight" 
                
                System.out.println(bmiInchResult>=30 
                ? "Obese" 
                :(bmiInchResult<30 && bmiInchResult>=25) 
                ? "Overweight" 
                : (bmiInchResult<25 && bmiInchResult>=18.5) 
                ? "Healthy" 
                : "Underweight" 
                ); 
  
                //Breaks the if statement 
  
                break; 
            } 
            /*if initially prompt letter is not "i" nor "n" it jumps to the else statement. 
            As the statement does not break, and it is not True, it will return to the beginning of the while loop.*/ 
  
            else { 
                System.out.println("The entered letter is neither \"m\" nor \"i\"\nPlease try again!"); 
            }     
        } 
  
        
    } 
} 