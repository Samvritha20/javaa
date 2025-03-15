public class methods
{
    static void calculateGrade()
    {
        int mark = 80;

        if(mark >= 90){
            System.out.println("Grade A");
        }else if(mark >= 75){
            System.out.println("Grade B");
        }else if(mark >= 50){
            System.out.println("Grade c");
        }else if(mark <= 49){
            System.out.println("Grade F");
        }

    }
    public static void main(String[] args)
    {
        calculateGrade();
    }
}
