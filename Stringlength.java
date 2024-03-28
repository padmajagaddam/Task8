package Task8;

import java.util.Scanner;

public class Stringlength {
    public static void main (String[]args)
    {
        System.out.println("enter a string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
       // System.out.println(s);
        System.out.println("the length of the string " + s + " is " + s.length());

    }
    
}
