package Task8;
import java.util.Scanner;
public class Senior {
    public static void main(String[]args)
    {
       System.out.println("enter the age of the person") ;
       Scanner scanner = new Scanner(System.in);
       int i= scanner.nextInt();
    if(i>60)
    {
        System.out.println("The person of age " + i + " is senior citizen");
    }
    else{
        System.out.println("the person is not senior citizen");
    }
    }
    
}
