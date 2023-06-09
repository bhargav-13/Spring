package game;

import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class F2typeReaction {

  public static void main(String[] args)
    throws InterruptedException, IOException {
    double m = Math.random() * 26;
    int m1 = (int) m + 97;
    //System.out.println((char)m1);
    System.out.println(
      "\u001B[36m" +
      "Enter the displayed character as fast as possible" +
      "\u001B[0m"
    );
    System.out.println("3");
    Thread.sleep(800);
    System.out.println("2");
    Thread.sleep(800);
    System.out.println("1");
    Thread.sleep(800);
    System.out.println("GO!!!!!!!!!");
    System.out.println("The Charachter is here");

    System.out.println("\033[1;93m" + (char) m1 + "\u001B[0m");

    long startTime = System.currentTimeMillis();
    Scanner sc = new Scanner(System.in);
    char s1 = sc.next().charAt(0);
    long stopTime = System.currentTimeMillis();
    long reactionTime = stopTime - startTime;
    System.out.println(reactionTime + "ms");
    
    if (s1 == m1) {
      System.out.println(
        "Time take by you :- " + (double) reactionTime / 1000.0 + "s"
      ); 
      sc.close();
    } else System.out.println("\033[1;31m" + "Ye galat ho gya" + "\u001B[0m");
  }
}
