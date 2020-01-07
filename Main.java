import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter all scores to find min and max");
        System.out.println("enter a negative number when you done");
        System.out.println("this program will find min and max");
        System.out.println("first enter max and then all regualar scores");
        double max = keyboard.nextDouble();
        double min = max;
        double next = keyboard.nextDouble();
        while (next >= 0)
        {
            if(next > max)
                max = next;
            else if(next < min)
                min = next;
            next = keyboard.nextDouble();

        }
        System.out.println("max is: " + max);
        System.out.println("min is: " + + min);

    }
}
