/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;


import java.util.*;
/**
 *
 * @author jamez
 */
public class Menu 
{
  
      static Scanner scan = new Scanner(System.in);
    
   public static void menu()
   {
      System.out.println("Computer Teck");
      System.out.println("Please select one option");
      System.out.println("1) Product page");
      System.out.println("2) View shopping cart");
      System.out.println("3) Checkout");
      System.out.println("4) Contact");
      System.out.println("5) Exit");
      
     int input = scan.nextInt();
     
       switch (input) {
           case 1:
               products();
               break;
               
               case 2:
               shoppingCart();
               break;
               
               case 3:
               checkout(); 
               break;
               
               case 4:
               ContactInformation();
               break;
               
               case 5:
               break;
               
           default:
               throw new AssertionError();
       }  
   }
   
   public static void products()
   {
        System.out.println("you are in product page, select one option");
        System.out.println("A) Display laptop products");
        System.out.println("B) Display PC parts");
        
        String userinput = scan.next();
        char character = userinput.charAt(0);
        
        switch (character){
            case 'a':
            case 'A':
                System.out.println("You've selected Display laptop products!");
                System.out.println("laptop product displayed below");
                
                List<Product> laptops = Laptop.laptop();
                for (Product laptop : laptops)
                {
                    System.out.println(laptop);
                }
                break;
            case 'b':
            case 'B':
                System.out.println("You've selected Display PC parts!");
                System.out.println("PC parts displayed below \n");
                
                List<Product> parts = PCparts.part();
                for(Product part : parts)
                {
                    System.out.println(part);
                }
                break;
                
            default:
                System.out.println("Invalid input");
        }
        
   }
   
   public static void shoppingCart()
   {
        System.out.println("Shopping Cart");
   }
   public static void checkout()
   {
        System.out.println("Checkout"); 
   }
   public static void ContactInformation()
   {
        System.out.println("Contact Information");
   }
    
    
}
