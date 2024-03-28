package Task8;

import java.util.Scanner;

public class DigitsinInteger {
    public static void main(String[]args)
    {
        System.out.println("enter the integer");
        Scanner scanner = new Scanner(System.in);
        int i =scanner.nextInt();
        int count = 0;

    while (i != 0) {
      // i = i/10
      i /= 10;
      ++count;
    }

    System.out.println("Number of digits in the given integer is : " + count);

    }
    
}
