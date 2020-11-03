package exercise6;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");

        int p = input.nextInt();
        assert p > 0;
        
          int reversedNumber = 0;
          int manipulatedNumber = p;
          while (manipulatedNumber >0) {
            reversedNumber = (reversedNumber * 10) + (manipulatedNumber % 10);
            manipulatedNumber /=10;
          }
         boolean palindrome = p == reversedNumber;
         System.out.println("Palindrome: " + palindrome);
    }
}
