package nhan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(isDivisibleByFive(50));
		System.out.println("Beer");
    }

    public static boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }
}
