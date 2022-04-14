//import Scanner, ArrayList and HashMap classes from java.util library 
 
import java.util.Scanner; 
import java.util.ArrayList; 
import java.util.HashMap; 
 
//declaring a new Product Super-Class with 5 attributes also known as variables 
 
class Product { 
 
   private int product_id; 
   private String product_brand; 
   private String product_title; 
   private float product_price; 
   private int product_qty_available; 
  
// declaring a constructor with default values 
Product(){ 
    this.product_id = 0; 
    this.product_brand = "type_brand"; 
    this.product_title = "type_name"; 
    this.product_price = 0; 
    this.product_qty_available = 1; 
} 
 
//Declaring getters 
public int getProductId(){ 
    return product_id; 
} 
public String getProductBrand(){ 
    return product_brand; 
} 
public String getProductTitle(){ 
    return product_title; 
} 
public float getProductPrice(){ 
    return product_price; 
} 
public int getProductQtyAvailable(){ 
    return product_qty_available; 
} 
//Declaring setters 
void setProductDetails(int product_id, String product_brand, String product_title, float product_price, int product_qty_available){ 
    this.product_id = product_id; 
    this.product_brand = product_brand; 
    this.product_title = product_title; 
    this.product_price = product_price; 
    this.product_qty_available = product_qty_available; 
} 
 
//Creating a void method called showProductDetails. It generates the stock number starting from null until 100. 
//If Porduct qty is null, it prints out that particular product is not availale in stock. 
//Else the method prints out the product details 
//As this method does not return a value, it is a void method 
 
void showProductDetails(){ 
    int randomQtyNumber = (int)(Math.random() * 100); 
    product_qty_available = randomQtyNumber; 
    if(product_qty_available<=0){ 
        System.out.println(product_brand + " " + product_title + " out of stock\n");  
    } else { 
        System.out.println("Product ID: " + product_id); 
        System.out.println("Product brand: " + product_brand); 
        System.out.println("Product title: " + product_title); 
        System.out.println("Product price £: " + product_price); 
        System.out.println("Available in stock " + product_qty_available + "\n"); 
    } 
    } 
 
// Creating a new instance of the class Scanner 
//Creating a public methord returning the calculated total item price which needs to be added to totalprice array later on in the programm 
//It prompts user to enter the quantity required of chosen product 
//It also prints out that the particular product has been added to cart 
//Method returns the total value price for the chosen order 
 
public float countOrderDetails ( float item_price ) { 
   Scanner input = new Scanner(System.in); 
   System.out.println("Please enter the quantity of " + product_brand + " " + product_title + " to add"); 
   int enteredQuantity = input.nextInt(); 
   System.out.println("You succesfully added " + enteredQuantity + " " + product_brand + " " + product_title + " to the cart"); 
   float item_cart_price = (item_price*enteredQuantity); 
   return (item_cart_price); 
} 
 
//declaring 3 objects for products. This also extents the Product() class 
//Mobile phone, TV, Gaming Console. 
 
} 
class MobilePhone extends Product {} 
class TV extends Product {} 
class GamingConsole extends Product {} 
 
//declaring the main class 
 
public class Ecommerce_simulation { 
 
//Declaring a main method which is the starting point of JAVA programming. 
//It accepts two parameters String Array and arguments => String[] args 
// Creating new instances of the class Scanner, class ArrayList and HashMap (in Python also known as dictionaries) 
// We are creating 9 objects. 
public static void main(String[] args){ 
    Scanner input = new Scanner(System.in); 
    ArrayList<Float>totalCart = new ArrayList<>(); 
    HashMap<String, Float> orders = new HashMap<String, Float>(); 
    MobilePhone mobile_1 = new MobilePhone(); 
    MobilePhone mobile_2 = new MobilePhone(); 
    GamingConsole gamingConsole_1 = new GamingConsole(); 
    GamingConsole gamingConsole_2 = new GamingConsole(); 
    GamingConsole gamingConsole_3 = new GamingConsole(); 
    GamingConsole gamingConsole_4 = new GamingConsole(); 
    GamingConsole gamingConsole_5 = new GamingConsole(); 
    TV tv_1 = new TV(); 
    TV tv_2 = new TV(); 
 
    // Creating 9 items with different attributes 
 
    mobile_1.setProductDetails(1, "Apple", "Iphone Pro Max 13", 1048.99f, mobile_1.getProductQtyAvailable()); 
    mobile_2.setProductDetails(2, "Apple", "Iphone Pro 13", 948.99f, mobile_2.getProductQtyAvailable()); 
    gamingConsole_1.setProductDetails(3, "Sony", "PlayStation 4", 239.99f, gamingConsole_1.getProductQtyAvailable()); 
    gamingConsole_2.setProductDetails(4, "Sony", "PlayStation 5 Digital Edition", 359.99f, gamingConsole_2.getProductQtyAvailable()); 
    gamingConsole_3.setProductDetails(5, "Sony", "PlayStation 5", 498.99f, gamingConsole_3.getProductQtyAvailable()); 
    gamingConsole_4.setProductDetails(6, "Nintendo", "Switch", 248.99f, gamingConsole_4.getProductQtyAvailable()); 
    gamingConsole_5.setProductDetails(7, "Xbox", "Series", 645.99f, gamingConsole_5.getProductQtyAvailable()); 
    tv_1.setProductDetails(8, "Samsung", "UE50AU9007KXXU TV", 595.99f, tv_1.getProductQtyAvailable()); 
    tv_2.setProductDetails(9, "LG 70", "70UP77006LB TV", 695.99f, tv_2.getProductQtyAvailable()); 
 
    // Printing these 9 items, so customer can see what to choose 
 
    mobile_1.showProductDetails(); 
    mobile_2.showProductDetails(); 
    gamingConsole_1.showProductDetails(); 
    gamingConsole_2.showProductDetails(); 
    gamingConsole_3.showProductDetails(); 
    gamingConsole_4.showProductDetails(); 
    gamingConsole_5.showProductDetails(); 
    tv_1.showProductDetails(); 
    tv_2.showProductDetails(); 
   
    // Now we need to initialize the very first value to character variable compX. 
 
    char compX = ' '; 
 
    // Loop will be iterated until the user will enter char "x" 
    while ( compX != 'x' ){ 
    // We prompt user to enter the number of ID provided in the list of products printed out earlier. 
        System.out.println("Please choose items which you wish to add to your cart.\nThe entered number is associated with the product ID");       
        int enteredNumber = input.nextInt(); 
    // As we have only 9 products, they need to choose from 1-9 
        if (enteredNumber > 0 && enteredNumber < 10){ 
    //Switch statements allows to choose an option from given 9 products 
            switch(enteredNumber){ 
    //All 9 products have the same logic 
    //Declaring floating value returnedTotalValue to which we assign the total price for product 1.  
    //We apply our declared method countOrderDetails to objects, passing .product_price as a parameter. 
    //The function returns the particular order calculation 
    //There is a condition which states that if order key is already within the HashMap, it does not add the key, however the quantity increments 
    //The way we are getting qty is to total calculated amount divide to the product price 
    //Else it adds the product and the price to the HASH MAP Array 
    //In the end we add the total price to the ArrayList array for calculating the total bill 
                case 1: { 
 
                    float returnedTotalValue = mobile_1.countOrderDetails(mobile_1.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(mobile_1.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(mobile_1.getProductTitle(), ((orders.get(i))+((float)assigned/mobile_1.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(mobile_1.getProductTitle(), (float)assigned/mobile_1.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                case 2: { 
 
                    float returnedTotalValue = mobile_2.countOrderDetails(mobile_2.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(mobile_2.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(mobile_2.getProductTitle(), ((orders.get(i))+((float)assigned/mobile_2.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(mobile_2.getProductTitle(), (float)assigned/mobile_2.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                case 3: { 
 
                    float returnedTotalValue = gamingConsole_1.countOrderDetails(gamingConsole_1.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(gamingConsole_1.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(gamingConsole_1.getProductTitle(), ((orders.get(i))+((float)assigned/gamingConsole_1.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(gamingConsole_1.getProductTitle(), (float)assigned/gamingConsole_1.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                case 4: { 
 
                    float returnedTotalValue = gamingConsole_2.countOrderDetails(gamingConsole_2.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(gamingConsole_2.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(gamingConsole_2.getProductTitle(), ((orders.get(i))+((float)assigned/gamingConsole_2.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(gamingConsole_2.getProductTitle(), (float)assigned/gamingConsole_2.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                case 5: { 
 
                    float returnedTotalValue = gamingConsole_3.countOrderDetails(gamingConsole_3.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(gamingConsole_3.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(gamingConsole_3.getProductTitle(), ((orders.get(i))+((float)assigned/gamingConsole_3.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(gamingConsole_3.getProductTitle(), (float)assigned/gamingConsole_3.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                case 6: { 
 
                    float returnedTotalValue = gamingConsole_4.countOrderDetails(gamingConsole_4.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(gamingConsole_4.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(gamingConsole_4.getProductTitle(), ((orders.get(i))+((float)assigned/gamingConsole_4.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(gamingConsole_4.getProductTitle(), (float)assigned/gamingConsole_4.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                case 7: { 
 
                    float returnedTotalValue = gamingConsole_5.countOrderDetails(gamingConsole_5.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(gamingConsole_5.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(gamingConsole_5.getProductTitle(), ((orders.get(i))+((float)assigned/gamingConsole_5.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(gamingConsole_5.getProductTitle(), (float)assigned/gamingConsole_5.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                case 8: { 
 
                    float returnedTotalValue = tv_1.countOrderDetails(tv_1.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(tv_1.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(tv_1.getProductTitle(), ((orders.get(i))+((float)assigned/tv_1.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(tv_1.getProductTitle(), (float)assigned/tv_1.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                case 9: { 
 
                    float returnedTotalValue = tv_2.countOrderDetails(tv_2.getProductPrice()); 
                    float assigned = returnedTotalValue; 
                    if (orders.containsKey(tv_2.getProductTitle())){ 
                    for (String i : orders.keySet()) {  
                        orders.put(tv_2.getProductTitle(), ((orders.get(i))+((float)assigned/tv_2.getProductPrice())));  
                        } 
                    } else { 
                        orders.put(tv_2.getProductTitle(), (float)assigned/tv_2.getProductPrice()); 
                    } 
                    totalCart.add(assigned); 
                    break;  
                } 
                
            } 
 
            //After chosen products above, there is now an option to choose the next action, either go directly to checkout, to continue shopping or view the cart 
            System.out.println("Please press \"x\" to checkout, \"y\" to continue shopping or \"i\" to view the cart"); 
            //Assigning a new char to compx variable 
            compX = input.next().charAt(0); 
            //condition states if entered value is "i" 
            if (compX == 'i') { 
            //it iterates now through the HashMap array called "orders", getting the Keys and Values 
            //We also applying a method to convert float value to integer 
                for (String i : orders.keySet()) { 
                    int item_qty = orders.get(i).intValue(); 
            //It now prints out the list of names and item qty 
                System.out.println("Name: " + i + " Quantity: " + item_qty); 
            // Now we need to initialize the very first value to float variable totalCartAmount. 
         
                float totalCartAmount = 0; 
            //Now we are iterating over calculatint the total cart price 
                for(int x = 0; x<totalCart.size(); x++){  
                totalCartAmount = totalCartAmount + totalCart.get(x);  
                } 
            //Now it prints over the total cart value 
                System.out.println("Total to pay is £: " + totalCartAmount); 
            //Now it prompts to enter the char for further action 
                System.out.println("Please press \"x\" for checkout and finish shoppping or \"y\" to continue "); 
                compX = input.next().charAt(0); 
            //If entered value is x, it quits from the loop 
                if (compX == 'x') { 
                    return; 
            //If entered value is y, it continue to the loop 
            //if entered value is not "x", "y" or "i", while loop will be iterated over until the entered value is == "x", "y" or "i" 
                } else if(compX == 'y') { 
                    continue; 
                } else { 
                    boolean isInput = false; 
                    char validateInput = ' '; 
                    while ( isInput == false ) { 
                        System.out.println("Please type the right letter"); 
                        validateInput = input.next().charAt(0); 
                        isInput = (validateInput == 'x' || validateInput == 'y') ? true : false; 
                    } 
                } 
                } 
                 
                 
            } 
        //If entered id is not a value from 1 to 9, it brings an error 
        } else { 
            System.out.println("Such product id does not exist. Please try again!"); 
        } 
         
        } 
        //it iterates now through the HashMap array called "orders", getting the Keys and Values 
        //We also applying a method to convert float value to integer 
        //It prints out the list with items in cart 
        for (String i : orders.keySet()) { 
            int item_qty = orders.get(i).intValue(); 
        System.out.println("Name: " + i + " Quantity: " + item_qty); 
        } 
        //it iterates now through the ArrayList array getting the total price. 
        float totalCartAmount = 0; 
        for(int x = 0; x<totalCart.size(); x++){  
        totalCartAmount = totalCartAmount + totalCart.get(x);   
          
        } 
        //it prints out the total bill 
 
        System.out.println("\nTotal to pay is £: " + totalCartAmount); 
} 
} 