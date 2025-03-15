class vehiclee 
{
    public void wheels()
    {
        System.out.println(" Wheels of cars");
    }
}
class car extends vehiclee
{
    public void four()
    {
        System.out.println(" A car has four wheels");
    }
}
public class vehicle 
{
    public static void main(String[] args)
    {
        car mycar = new car();
        mycar.wheels();
        mycar.four();
    }
}