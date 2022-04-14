# university_tasks == JAVA
1) Write a Java program to print an American flag on the screen.

2) Write a Java program to compute body mass index (BMI). The program should take input values 
such as weight and height in order to calculate BMI and display it on the screen. In addition, the 
program should display to the user whether the calculated BMI result corresponds to underweight, 
healthy weight or overweight. 


3)Write a Java program to simulate an online store. The program should begin by 
displaying a list of products and their prices. There should be a minimum of 4 products 
offered. The program should ask the user to choose a product and then ask the user to 
enter the quantity they require of that product. The program should then allow the user 
to keep choosing more products and quantities until they enter something to indicate 
they want to end the program (e.g. a given number or ‘q’ or ‘exit’). The program should 
then tell the user the total amount for the products they have selected. 

4)Write a program Election that computes the tally in a write-in election, and 
announces the winner. Since the votes are write-in, there is no pre-determined set of 
candidates. Whoever appears the most in the votes is the winner. The user enters the 
individual votes, one vote per line, and ends entering with typing -1 or an empty line. To  
compute the tally, the program uses two arrays, a String [ ] variable (names), and an int 
[ ] variable (count). Upon receiving a single vote, the program checks if the name on the 
vote appears in names, and if it does, the program adds 1 to the value of the element in 
count. If the name does not appear in names, the program extends both arrays by one 
element, stores the name in names at the last position and store 1 in count at the last 
position. In this manner, the two arrays will have the same lengths. The initial length is 0 
for both arrays. 

5) Design a class named Account that contains: 
 
• A private int data field named id for the account (default 0). 
• A private double data field named balance for the account (default 0). 
• A private double data field named annualInterestRate that stores the current interest 
rate (default 0). Assume all accounts have the same interest rate. 
• A private Date data field named dateCreated that stores the date when the account 
was created. 
• A no-arg constructor that creates a default account. 
 
• A constructor that creates an account with the specified id and initial balance. 
 
• The accessor and mutator methods for id, balance, and annualInterestRate. 
• The accessor method for dateCreated.  
Page 8 of 8 
• A method named getMonthlyInterestRate() that returns the monthly interest rate. 
• A method named withdraw that withdraws a specified amount from the account. 
• A method named deposit that deposits a specified amount to the account. 
• Draw the UML diagram for the class. 
• Implement the class. Write a Java program that creates an Account object with an 
account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the 
withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and 
print the balance, the monthly interest, and the date when this account was created. 

==================================================================================================================================================
Python tasks
1)  Write a python program to simulate an online store. 
    The program should begin by displaying a list of products and their prices. 
    There should be a minimum of 4 products offered. The program should ask the user to choose a product and then ask the user to enter the quantity they require of that product. 
    The program should then allow the user to keep choosing more products and quantities until they enter something to indicate they want to end the program (e.g. a given number or ‘q’ or ‘exit’). 
    The program should then tell the user the total amount for the products they have selected.

2)  Create a class == student

3)  Create a class == bank account

4)  Create a Python class called PrinterAccount. This class should simulate a student’s account on the university’s printing service.
    Your class should have four data fields: 

    A variable self.name to store the student’s name 
    A variable self.student_ID to store the student’s ID 
    A variable self.balance to store the balance on the account, in pence 
    A variable self.pages_printed to store the number of pages the student has printed in total so far
    
    Write a constructor function (__init__) for your class, which takes three parameters: one for the student ID, one for their name, and one for the initial balance. The constructor should also set pages_printed to zero. 

    Next, add the following functions to your class: 

    print_account – this function should display the contents of all four variables listed above, using print() 
    print_balance - this function should print the current balance on the printer account, either in pence or in pounds 
    top_up - this function should add money to the printer account balance. The amount of money to add, in pence, should be passed as a parameter 
    print_document - this function should simulate printing a document. It should take three parameters, one called num_pages, 
    giving the number of pages to print, the second called paper_size, indicating if the printing is A3 or A4, and the third called is_colour, 
    indicating if the printing is monochrome or colour (True for colour, False for monochrome). 


    The print_document function should deduct the appropriate amount from the student’s printer account, 
    and should update the total number of pages the students has printed 
    As printing monochrome documents is free, no money should be deducted from the balance if is_colour is False, 
    but the variable pages_printed should be updated to keep track of how many pages the student has printed in total
    
    If is_colour is True, an appropriate amount should be deducted from the balance: 10p per page for A4 printing, or 20p per page for A3 printing. 
    The variable pages_printed should be updated to keep track of how many pages the student has printed in total 
    The print_document function should return a boolean value indicating whether or not there was enough credit in the account to print the document 
    If the account does not have enough money in it to print the document, no money should be deducted and the function should return False. 

    In your program, write code to test your PrinterAccount class. Call each of its functions, 
    giving suitable parameter values. Display enough output to show that the program is working correctly. 



    
