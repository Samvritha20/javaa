public class quess
{
    public static void main(String[] args)
    {
        String[] pdt = {"book ","pen ","pencil ","ruler ","eraser ","sharpener "};
        int[] price = {40,10,10,15,15,10};
        System.out.println("Price of the products");
        
        for(int i = 0; i <= 5; i++)
        {
            System.out.print(pdt[i]);
            System.out.println(price[i]); 
        }
    }
}