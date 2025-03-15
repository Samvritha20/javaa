// A toll system charges different amounts based on the type of 
// vehicle and offers discounts for frequent travelers.

// Requirements: If the vehicle type is "Car," the toll fee is ₹100. 
// If the vehicle type is "Truck," the toll fee is ₹200. 
// If the vehicle has an RFID pass, apply a 10% discount. 
// Implement a method to calculate the toll fee. Use a loop to process multiple vehicles.

import java.util.Scanner;
public class randd{
    public static void main(String[]args) {

        System.out.println("Choice 1 : Car");
        System.out.println("Choice 2 : Truck");  

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the choice");
        int vehicle = s1.nextInt();

        switch(vehicle)
        {
            case 1 : System.out.println("The toll fee is 100");
            break;

            case 2 : System.out.println("The toll fee is 200");
            break;

            default : System.out.println("Invalid choice");
        }
        Scanner s2 = new Scanner(System.in);
        System.out.println("Do you have RFID pass: 1 : Yes or 2 : No");
        int  choice = s2.nextInt();

        switch(choice)
        {
            case 1 : System.out.println("You have got a 10% discount");
            break;

            case 2 : System.out.println("Sorry Pay the full amount");
            break;

            default : System.out.println("Invalid choice");
        }


    }
}
