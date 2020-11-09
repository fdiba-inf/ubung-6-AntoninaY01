package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        boolean Tony = false;

          
        do {
         String password = input.next();
        if (password.length() < 8) {
        }
        for (int i = 0; i < password.length(); ++i) {
          if (Character.isDigit(password.charAt(i))) {
            ++a;

          }

        
        if (!Character.isLetterOrDigit(password.charAt(i))) {
          Tony = false;
          break;
        }
        } 
        if (a >= 2) {
          Tony = true;
        } else {
          Tony = false;
        }

    } while (!Tony);
            
          System.out.println("Password: valid!");

      
        
    }
}
