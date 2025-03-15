import java.util.Scanner;
public class scanswitch{
    public static void main(String[]args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the choice");
        int coffee = s1.nextInt();

        switch(coffee)
        {
            case 1 : System.out.println("Espresso : 100");
            break;

            case 2 : System.out.println("frapachino : 150");
            break;

            case 3 : System.out.println("capocino : 100");
            break;

            case 4 : System.out.println("black tea : 50");
            break;

            case 5 : System.out.println("black coffee : 50");
            break;

            case 6 : System.out.println("milk tea : 80 ");
            break;

            case 7 : System.out.println("milk coffee : 80");
            break;

            case 8 : System.out.println("ice tea : 40");
            break;

            case 9 : System.out.println("mocha latte : 100 ");
            break;

            default : System.out.println("Invalid input");                                                
        }
    }
}