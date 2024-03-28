package Task8;

import java.util.Scanner;

public class Swap {
   
    public static void main(String[]args)

    {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers a&b to swap");
        a=scanner.nextInt();
        b=scanner.nextInt();
            a=a+b;
            b=a-b;
            a=a-b;
        System.out.println("the numbers after swapping  a is " +a);
       System.out.println("the numbers after swapping b is " +b);
    }
}