//  A company needs to calculate employee salaries based on their job roles.
// Create a base class Employee with attributes name, baseSalary, and a method calculateSalary(). 
// Create two subclasses: 
// Manager: Gets a 20% bonus. 
// Developer: Gets a 10% bonus. 
// Use a loop to calculate salaries for multiple employees. 
// Print the final salary using if conditions.

public class samplee {

    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }
        if (isPremiumMember) totalPrice *= 0.95;
        if (totalPrice > 5000) totalPrice *= 0.90;
        return totalPrice;
    }

    public static void main(String[] args) {
        int[] prices = {1000, 2000, 1500, 2500};
        boolean isPremiumMember = true;
        System.out.println("Total Price: ₹" + calculateTotalPrice(prices, isPremiumMember));
    }
}
