//Elections

//import java util libraries ArrayList and Scanner 
import java.util.ArrayList; 
import java.util.Scanner; 
 
//creating a new class Elections 
public class Elections { 
//Declaring a main method which is the starting point of JAVA programming. 
//It accepts two parameters String Array and arguments => String[] args 
//Creating new instances of the class Scanner and 2 new ArrayList instances. 
//One will contain an array of String data types and one will contain integer data type values 
 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);  
        ArrayList<String> names = new ArrayList(); 
        ArrayList<Integer> count = new ArrayList(); 
        ArrayList<String> equalVoteCount = new ArrayList(); 
///Initializing a new boolean variable, where initial value is false. 
//creating a new while loop which which will iterate over until the value is true. 
        boolean exitFromElect = false; 
        while (exitFromElect != true){ 
//prompts user to enter " ", "-1" to exit from loop, or the user needs to input the name of participant 
            System.out.println("Please leave the vote or press \" \" or \"-1\" to quit "); 
            String vote = input.nextLine(); 
            if (vote.equals(" ") || vote.equals("-1")){ 
                exitFromElect = true; 
                break; 
            } else { 
               exitFromElect = false; 
               } 
//Condition for checking out if the entered name is already within the existing ArrayList names. 
//If so it gets the index value of it 
//Variable getCountValue finds out what is the value of that particular index, and getCountValueInArray increments by +1 
//Then ArrayList count updates the particular index by getCountValueInArray 
//Else if such a name does not exist, it creates a new index and adds the participants name and ads a new initial value of 1 vote within the count Array List. 
            if (names.contains(vote)){ 
                   int voteValue = names.indexOf(vote); 
                   int getCountValue = count.get(voteValue); 
                   int getCountValueInArray = getCountValue + 1; 
                   count.set(voteValue, getCountValueInArray); 
            } else { 
                names.add(vote); 
                count.add(1);     
            } 
 
        } 
 
//This is the loop for checking out the highest vote quantity. 
//The first step is to initialise a new int variable 
//We are guessing that the first value is the largest, hence the first assigned value is related to ArrayList count in index 0. 
//System.out.println() used for to print a new line 
        int iterateNum = count.get(0); 
            System.out.println(); 
            for (int number = 0; number < count.size(); number++){ 
                float newNumb = count.get(number); 
                //Condition for assigning a new max value. 
                iterateNum = newNumb > iterateNum ? iterateNum = count.get(number) : iterateNum; 
                //Condition for printing out the participient name along with the vote count. 
                //If count quantity is equals to 1, it prints a singular word "vote" if 2 and more votes it prints a plural word "votes" 
                if(count.get(number)==1) { 
                    System.out.println(names.get(number) + " has got " + count.get(number) + " vote!"); 
                } else { 
                    System.out.println(names.get(number) + " has got " + count.get(number) + " votes!"); 
                } 
            } 
 
//Once the user enters either -1 or " ", the program exits the while loop 
//To a new integer variable we are assigning the index of the gathered max number in count ArrayList 
//Then we are finding the name based on the index value, and printing out the winner. 
        int findIndoexOfVote = count.indexOf(iterateNum); 
        String findIndoexOfname = names.get(findIndoexOfVote); 
//Java String equals() method compares two values, and returns true if the strings are equal, and false if not. 
//We are iterating over finding out if 2 or more values have identical qty of votes. 
//If equals we print statement saying that several participants have the same qty of votes 
 
        for (int i = 0; i < count.size(); i++) { 
            if (count.get(i).equals(iterateNum)) { 
                equalVoteCount.add(names.get(i)); 
            } 
        } 
//Another condition stating if the Array List size is equals or larger than 0, it means that there are 2 same vote values and no winner in elections 
//If not find it jumps to else statement confirming the winner 
        if(equalVoteCount.size()>= 2){ 
            System.out.println("\nThe same quantity ( " + iterateNum + " ) votes have got the below candidates:\n"); 
//For loop iterates over the loop getting all names who have the exact amount of votes. 
//It prints them out 
 
            for (int numberOfVotes = 0; numberOfVotes < equalVoteCount.size(); numberOfVotes = numberOfVotes+1){ 
                System.out.println(equalVoteCount.get(numberOfVotes)); 
            } 
            System.out.println("\nNo winner for tonight! Thank you"); 
 
        } else { 
            System.out.println("\nTodays election winner is " + findIndoexOfname + " with " + iterateNum + " votes!\n"); 
        } 
         
         
    } 
} 
 