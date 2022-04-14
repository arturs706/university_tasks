# Write a python program to simulate an online store. 
# The program should begin by displaying a list of products and their prices. 
# There should be a minimum of 4 products offered. 
# The program should ask the user to choose a product and then ask the user to enter the quantity they require of that product. 
# The program should then allow the user to keep choosing more products and quantities 
# until they enter something to indicate they want to end the program (e.g. a given number or ‘q’ or ‘exit’). 
# The program should then tell the user the total amount for the products they have selected.

global main_list
main_list = {}
print (f'Hello and welcome. Please see our available items and prices below:\n ')
class Groceries:
    def __init__(self, item, price):
        self.item = item
        self.price = price
        main_list[self.item] = self.price


banana = Groceries('banana', 0.15)
apple = Groceries('apple', 0.22)
orange = Groceries('orange', 0.42)
lime = Groceries('lime', 0.29)
tomato = Groceries('tomato', 0.45)
carrot = Groceries('carrot', 0.11)

fruit_list = {}
new_list = [] 
alt_list = []
total = 0
net_cost = 0

print (main_list)


def shops():
    global total
    ctn = ''

    while ctn != 'c':
        try:
            choose = input('Please choose items from the list above: \n').lower()
            quant = int(input('Please choose quantity:\n'))
            if quant <0:
                print ('Due to Covid-19 we are no longer accepting returns. Please try again')
            else:
                new_list = [choose]*(quant)
                alt_list.extend(new_list)
                total = main_list.get(choose)
                total = total*quant
                global net_cost
                net_cost = total + net_cost
                ctn = input("Please press 'c' for checkout or RETURN to shopping list:\n").lower()
        except (ValueError, TypeError):
            print ('An ERROR! Please try again')
    else:
        print ('\nPlease see your shopping bag below:\n ')
        for i in main_list:
            if 'orange' in i and not (alt_list.count('orange') == 0):
                fruit_list["Orange's"] = alt_list.count(i)
            elif 'banana' in i and not (alt_list.count('banana') == 0):
                fruit_list["Banana's"] = alt_list.count(i)
            elif 'tomato' in i and not (alt_list.count('tomato') == 0):
                fruit_list["Tomato's"] = alt_list.count(i)
            elif 'carrot' in i and not (alt_list.count('carrot') == 0):
                fruit_list["Carrot's"] = alt_list.count(i)
            elif 'apple' in i and not (alt_list.count('apple') == 0):
                fruit_list["Apple's"] = alt_list.count(i)             
exi = 0
while exi != 2:
    shops()
    print (fruit_list) 
    exi = int(input(f"\nPress '1' to return to main menu or '2' to exit to finalise purchase or continue:\n"))          
else:
    discount = input("please 'Y' if you have a MagicShop client card for a discount\n").lower
    if discount == 'y':
        print (f'\nTotal amount to pay is £{round(net_cost,2)}\n\n')
    else:
        print (f'\nTotal amount to pay is £{round(net_cost*0.95,2)}\n\n')

print ('Thank you for shopping with MagicShop!')
