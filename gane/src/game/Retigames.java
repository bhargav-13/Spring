package game;

import java.io.*;
import java.util.*;

class Retigames {

  public static void main(String[] args)
    throws InterruptedException, IOException {
    Scanner s = new Scanner(System.in);
    System.out.println(
      "\u001B[34m" +
      "**********************************************************"+
      "\u001B[0m"
    );
    System.out.println(
      "\u001B[34m" +
      "*" +
      "\u001B[0m" +
      "\033[1;91m" +
      "                 WELCOME TO RETIGAMES                   " +
      "\u001B[0m" +
      "\u001B[34m" +
      "*" +
      "\u001B[0m"
    );
    System.out.println(
      "\u001B[34m" +
      "*" +
      "\u001B[0m" +
      "\u001B[33m" +
      "   It will test your reaction time in different ways    " +
      "\u001B[0m" +
      "\u001B[34m" +
      "*" +
      "\u001B[0m"
    );
    System.out.println(
      "\u001B[34m" +
      "**********************************************************" +
      "\u001B[0m"
    );
    for (int num = 1; num != 0;) {

      System.out.println(
        "\u001B[31m" +
        "Enter 1 :-" +
        "\u001B[0m" +
        "\u001B[32m" +
        " for Type reaction" +
        "\u001B[0m"
      );
      System.out.println(
        "\u001B[31m" +
        "Enter 2 :-" +
        "\u001B[0m" +
        "\u001B[32m" +
        " for Math game" +
        "\u001B[0m"
      );
      System.out.println(
        "\u001B[31m" +
        "Enter 3 :- " +
        "\u001B[0m" +
        "\u001B[32m" +
        "for Finding largest number from given number" +
        "\u001B[0m"
      );
      System.out.println(
        "\u001B[31m" +
        "Enter 0 :- " +
        "\u001B[0m" +
        "\u001B[32m" +
        "for Exiting game" +
        "\u001B[0m"
      );
      
      num = 0;
      if (s.hasNextInt()) {
    	    num = s.nextInt();
    	} else {
    	    System.out.println("No more input");
    	    // consume any remaining input
    	}
      if (num > 4 || num < 0) System.out.println(
        "\u001B[34m" + "Please enter valid number" + "\u001B[0m"
      );
      switch (num) {
        case 1:
          System.out.println();
          System.out.println("The game is started");
          F2typeReaction.main(args);
          break;
        case 2:
          System.out.println();
          F3Math.main(args);
          break;
        case 3:
          System.out.println();
          F5largestnumber.main(args);
          break;
      }

    }
    s.close();
  }
}