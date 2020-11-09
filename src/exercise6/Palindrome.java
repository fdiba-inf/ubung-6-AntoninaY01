package exercise6;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        
        
        int a;
        a = input.nextInt();

        assert a > 0 : "Fehler";
        
        int b = a;
        int c = b;

        int Antonina = 1;
        while (a / 10 != 0) {
          ++Antonina;
          a = a / 10;
        }

        int Stef [] = new int [Antonina];
        for (int i = 0; i < Stef.length; ++i) {
          Stef[i] = b % 10;
          b = b / 10;
        }
        int Simona = 0;
        for (int j = 0; j < Stef.length; ++j) {
          Simona = Simona * 10;
          Simona = Simona + Stef[j];
        }
        if (Simona == c) {
          System.out.println("Palindrome: true!");
        } else {
          System.out.println("Palindrome: false!");
        }

    }
}
