import java.util.*; 

public class FastFoodEmployee
{ 
 public static String burgerType; 
 public static String drinkType; 
 public static String fries; 
 
 public static void main(String...args)
 {
  Scanner stdin = new Scanner(System.in);
  
  //prompting the user to order a burger. 
  System.out.println("What kind of a burger would you like? "); 
  System.out.println("Please choose \"Hamburger\" or \"Cheeseburger\" or \"BaconBurger\" or \"VeggieBurger\". ");
     
   burgerType = stdin.nextLine(); 
  
   //comparing the users input to anything the user is likely to type in to order a burger. 
   if ((burgerType.equals("Hamburger"))||(burgerType.equals("Cheeseburger"))
   ||(burgerType.equals("Veggieburger"))||(burgerType.equals("hamburger"))||(burgerType.equals("cheeseburger"))
   ||(burgerType.equals("veggieburger"))||(burgerType.equals("HamBurger"))||(burgerType.equals("CheeseBurger"))
   ||(burgerType.equals("VeggieBurger"))||(burgerType.equals("burger"))||(burgerType.equals("Burger")))
   System.out.println("Great job!!"); 
   else 
   System.out.println("Please choose something from the burger menu.");
   
   //prompting the user to order french fries. 
  System.out.println(" "); 
  System.out.println("What kind of french fries do you want?"); 
  System.out.println("You can have \"french fries\" or \"Onion fries\" or \"garlic fries\" or \"curly fries\". "); 
  fries = stdin.nextLine();    
  
  //comparing the user input to anything that the user is likely to enter in for french fries
  if ((fries.equals("fries"))||(fries.equals("Fries"))
  ||(fries.equals("French Fries"))||(fries.equals("French fries"))||(fries.equals("FrenchFries"))
  ||(fries.equals("french fries"))||(fries.equals("frenchfries"))||(fries.equals("onionfries"))
  ||(fries.equals("onionfries"))||(fries.equals("Onionfries"))||(fries.equals("OnionFries"))
  ||(fries.equals("onoin fries"))||(fries.equals("Onion fries"))||(fries.equals("Onion Fries"))
  ||(fries.equals("curlyfries"))||(fries.equals("Curlyfries"))||(fries.equals("CurlyFries"))||(fries.equals("Curly Fries"))
  ||(fries.equals("garlicfries"))||(fries.equals("garlic fries")||(fries.equals("Garlic fries"))
  ||(fries.equals("Garlic Fries"))||(fries.equals("GarlicFries"))))
  System.out.println("Great job!!"); 
  else
  System.out.println("Please choose something from the french fry menu.");
  System.out.println(" "); 
  
  //prompting the user to order a drink. 
  System.out.println("What kind of drink would you like?");
  System.out.println("You can have \"Coke\" or \"Sprite\" or \"Dr Pepper\" or \"water\" "); 
  drinkType = stdin.nextLine(); 
  
  //comparing the user input to the drink menu 
  if((drinkType.equals("Coke"))||(drinkType.equals("coke"))||(drinkType.equals("Cocacola"))||(drinkType.equals("CocaCola"))||(drinkType.equals("cocacola"))
  ||(drinkType.equals("Coca Cola"))||(drinkType.equals("Coca cola"))||(drinkType.equals("coca cola"))
  ||(drinkType.equals("Sprite"))||(drinkType.equals("sprite"))||(drinkType.equals("Water"))||(drinkType.equals("water"))||(drinkType.equals("DrPepper"))||(drinkType.equals("drpepper"))
  ||(drinkType.equals("Dr Pepper"))||(drinkType.equals("dr pepper"))||(drinkType.equals("Dr pepper")))
  System.out.println("Great job!!!"); 
  else 
  System.out.println("Please choose one of the drink options from the drink menu.");
  System.out.println(" "); 
  
  //printing out the burger the user ordered if its on the menu. 
   if((burgerType.equals("Hamburger"))||(burgerType.equals("Cheeseburger"))
   ||(burgerType.equals("Veggieburger"))||(burgerType.equals("hamburger"))||(burgerType.equals("cheeseburger"))
   ||(burgerType.equals("veggieburger"))||(burgerType.equals("HamBurger"))||(burgerType.equals("CheeseBurger"))
   ||(burgerType.equals("VeggieBurger"))||(burgerType.equals("burger"))||(burgerType.equals("Burger")))
   System.out.println("You ordered a "+ burgerType +" from the burger menu."); 
   
   //printing out the fries the user ordered if its on the menu. 
   if ((fries.equals("fries"))||(fries.equals("Fries"))
  ||(fries.equals("French Fries"))||(fries.equals("French fries"))||(fries.equals("FrenchFries"))
  ||(fries.equals("french fries"))||(fries.equals("frenchfries"))||(fries.equals("onionfries"))
  ||(fries.equals("onionfries"))||(fries.equals("Onionfries"))||(fries.equals("OnionFries"))
  ||(fries.equals("onoin fries"))||(fries.equals("Onion fries"))||(fries.equals("Onion Fries"))
  ||(fries.equals("curlyfries"))||(fries.equals("Curlyfries"))||(fries.equals("CurlyFries"))||(fries.equals("Curly Fries"))
  ||(fries.equals("garlicfries"))||(fries.equals("garlic fries")||(fries.equals("Garlic fries"))
  ||(fries.equals("Garlic Fries"))||(fries.equals("GarlicFries"))))
  System.out.println("You ordered "+ fries +" from the french fries menu."); 
  
  //printing out the drink the user ordered if its on the menu. 
  if((drinkType.equals("Coke"))||(drinkType.equals("coke"))||(drinkType.equals("Cocacola"))||(drinkType.equals("CocaCola"))||(drinkType.equals("cocacola"))
  ||(drinkType.equals("Sprite"))||(drinkType.equals("sprite"))||(drinkType.equals("Water"))||(drinkType.equals("water"))||(drinkType.equals("DrPepper"))||(drinkType.equals("drpepper"))
  ||(drinkType.equals("Dr Pepper"))||(drinkType.equals("dr pepper"))||(drinkType.equals("Dr pepper")))
  System.out.println("You ordered a "+ drinkType +" from the drinks menu.");  
  
  //California Prop 65 warning
  System.out.println(" "); 
  System.out.println("Chemicals known in the state of California to cause cancer and "); 
  System.out.println("birth defects have known to have been found in products carried by this establishment. Prop 65. "); 
         
 }

}



   
  
  
      
      
      
      
      
      
      
      
      
      
      
      
