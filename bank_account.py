class BankAccount: 
    def __init__(self, account_holder, account_number, balance): 
        self.account_number = account_number 
        self.balance = balance
        self.account_holder = account_holder 

    def print_balance(self): 
        print(f"Account balance for {self.account_holder}'s account {self.account_number} is: {str(self.balance)}")

    def print_name(self):
        print(f"Account holder for account nr: {self.account_number} is: {self.account_holder}")




account1 = BankAccount('Alice',"123456789", 1000.00) 
account2 = BankAccount('Bob','9955233222', 95688.28)
account3 = BankAccount('Jane','9856333255', -885533.32)
account4 = BankAccount('George','1112399999', 9909933.32)

print ('Creating four bank account objects and calling print_balance function\n')
account1.print_balance()
account2.print_balance()
account3.print_balance()
account4.print_balance()

print ('Calling the print_name function\n')

account1.print_name()
account2.print_name()
account3.print_name()
account4.print_name()
