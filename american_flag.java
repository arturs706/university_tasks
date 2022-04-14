//American flag
public class American_flag { 
    //Declaring a main method which is the starting point of JAVA programming. 
    //It accepts two parameters String Array and arguments => String[] args 
 
    public static void main(String[]args){ 
    //iterating over the outer loop 5 times as there are 5 lines of the below string line. 
    //We use continue, as second line with 5 stars must be iterated 1 time less. 
    //printing over "* * * * * * ===========================================" x5 times 
        for (int i = 1; i<6; i++){ 
            System.out.println("* * * * * * ==========================================="); 
            if(i==5){ 
                continue; 
            } 
    //iterating over the inner loop 5 times as there are 4 lines of the below string line. 
    //printing over " * * * * *  ===========================================" x4 times 
    //on the 5 time it will be exluded as per the task requirements 
 
            for(int y = 1; y<=1; y++) 
             
                System.out.println(" * * * * *  ===========================================");                              
  } 
    //iterating over another loop 6 times as there are 6 lines of the below string line following after the first part of the code. 
    //printing over "=======================================================" x6 times 
 
  for (int z = 1; z<7; z++){ 
    System.out.println("======================================================="); 
  } 
} 
} 