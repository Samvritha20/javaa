class parents
{
    public void title()
    {
        System.out.println("Age of my parents");
    }
}
class age extends parents
{
    public void page()
    {
        System.out.println("My father has 50 years");
        System.out.println("My mother has 45 years");
    }
}
public class main
{
    public static void main(String[] args)
    {
        age parage = new age();
        parage.title();
        parage.page();
    }
}
