package Calculator;

import java.util.HashMap;
import java.util.Scanner;

public class JavaProgramLogin {

    public boolean isLoggedIn(){
      Scanner scan = new Scanner(System.in);
      String username = "Razvan";
      String password = "parola1";

        System.out.println("Introdu username");
      String givenUserName = scan.next();
      System.out.println("Introdu parola");
      String givenPassword = scan.next();

      if (username.equals(givenUserName) && password.equals(givenPassword)){
          System.out.println("Te-ai logat cu succes!");
          return true;
      }else {
          System.out.println("Hopa! Ceva nu a mers bine");
          return false;
      }
    }
    public boolean loginSuccesful(){
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        }while (!repeat && count <=3);
        return repeat;
    }
}
