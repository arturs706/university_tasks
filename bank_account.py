class BankAccount: 
    def __init__(self, account_number, balance): 
        self.account_number = account_number 
        self.balance = balance 

    def print_balance(self): 
        print("Account balance for account " + self.account_number + " is: " + str(self.balance)) 


account1 = BankAccount("123456789", 1000.00) 
account2 = BankAccount('9955233222', 95688.28)
account3 = BankAccount('9856333255', -885533.32)


account1.print_balance()
account2.print_balance()
account3.print_balance()
