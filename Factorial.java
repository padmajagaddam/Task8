package Task8;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("eneter the number to find factorial");
        int num = scanner.nextInt();
        double k=1;
        for(int i=1;i<=num;i++)
        {
             k = k*i;
        }
        System.out.println("the factorial of given number " +num +"is" + k);
    }
    
}
