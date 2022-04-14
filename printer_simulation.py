class PrinterAccount:
    def __init__ (self, name, student_ID, balance, pages_printed):
        self.name = name
        self.student_ID = student_ID
        self.balance = balance
        self.pages_printed = pages_printed
        pages_printed = 0

    
    def print_account (self):
        print(f'Name: {self.name}\nStudent ID: {self.student_ID}\nBalance on account is £: {self.balance}\nPages printed: {self.pages_printed}') 



    def print_balance (self):
        print(f'The current balance in £ {float(round(self.balance,2))}') 


    def top_up (self):
        if print_document == False:
            low_amount = input ('Please enter the amount which you wish to top up is £: ')
            self.balance = self.balance + low_amount



    def print_document (self,num_pages, paper_size, is_colour):
        if self.balance < 0.10:
            print ('Please top up your balance')
            return False
            
        else:

            self.pages_printed = self.pages_printed + num_pages
            if paper_size == 'A3' and is_colour == True:
                self.balance = self.balance - (float(0.20)*num_pages)
                
            elif paper_size == 'A4' and is_colour == True:
                self.balance = self.balance - (float(0.10)*num_pages)
            elif paper_size == 'A4' or paper_size == 'A4' and not is_colour == True:
                print ('Free print')
            else:
                print ('Wrong paper size')


        

account1 = PrinterAccount ('Arturs', 21437262, 1.96, 0)
account1.print_account()
account2 = PrinterAccount ('Bob', 9088555, 89.96, 0)
account2.print_account()
account3 = PrinterAccount ('Jane', 21243462, -10.56, 0)
account3.print_account()
account3.print_document(15, 'A3', True)
account3.print_account()
