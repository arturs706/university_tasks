class BankAccount: 
    def __init__(self, account_holder, account_number, balance): 
        self.account_number = account_number 
        self.balance = balance
        self.account_holder = account_holder 

    def print_balance(self): 
        print(f"Account balance for {self.account_holder}'s account {self.account_number} is: {str(self.balance)}")


    def withdraw (self,with_d):
        print (f'\n{self.account_holder} is withdrawing £{with_d} from the account.\nThe new balance is as follows:')
        self.balance = self.balance - with_d
        

    def deposit (self,depo):
        print (f'\n{self.account_holder} is depositing £{depo} to the account.\nThe new balance is as follows:')
        self.balance = self.balance + depo



account1 = BankAccount('Alice',"123456789", 10000.00) 
account2 = BankAccount('Bob','9955233222', 95688.28)
account3 = BankAccount('Jane','9856333255', -885533.32)
account4 = BankAccount('George','1112399999', 9909933.32)


account1.print_balance()
account2.print_balance()
account3.print_balance()
account4.print_balance()
account1.withdraw(100)
account1.print_balance()
account2.deposit(200)
account2.print_balance()
