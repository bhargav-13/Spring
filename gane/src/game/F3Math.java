package game;

import java.io.*;
import java.lang.Math;
import java.util.*;

public class F3Math {

  public static void main(String[] args)
    throws InterruptedException, IOException {
    double m = Math.random() * 30;
    double m3 = Math.random() * 30;
    int m1 = (int) m + 1;
    int m2 = (int) m3 + 1;
    if (m2 > m1) {
      int temp = m1;
      m1 = m2;
      m2 = temp;
    }
    double m4 = Math.random() * 2;
    int m5 = (int) m4 + 0;

    System.out.println(
      "\u001B[36m" + "Answer the question as fast as possible" + "\u001B[0m"
    );
    System.out.println("3");
    Thread.sleep(1000);
    System.out.println("2");
    Thread.sleep(1000);
    System.out.println("1");
    Thread.sleep(1000);
    System.out.println("GO!!!!!!!!!");

    if (m5 == 0) {
      System.out.print(
        "\033[1;93m" +
        (int) m1 +
        "\u001B[0m"  +
        " + " +
        "\033[1;93m" +
        (int) m2 +
        "\u001B[0m" +
        "\033[1;93m" +
        " = " +
        "\u001B[0m"
      );
      int sum = m1 + m2;

      long startTime = System.currentTimeMillis();
      Scanner sc = new Scanner(System.in);
      int s1 = sc.nextInt();
      long stopTime = System.currentTimeMillis();
      long reactionTime = stopTime - startTime;

      if (s1 == sum) {
        System.out.println(
          "Time take by you :- " + (double) reactionTime / 1000.0 + "s"
        );
        sc.close();
      } else {
        System.out.println("\033[1;31m" + "Ye galat ho gya" + "\u001B[0m");
      }
    } else {
      System.out.print(
        "\033[1;93m" +
        (int) m1 +
        "\u001B[0m" +
        " - " +
        "\033[1;93m" +
        (int) m2 +
        "\u001B[0m" +
        "\033[1;93m" +
        " = " +
        "\u001B[0m"
      );
      int sub = m1 - m2;
      long startTime = System.currentTimeMillis();
      Scanner sc = new Scanner(System.in);
      int s2 = sc.nextInt();
      long stopTime = System.currentTimeMillis();
      long reactionTime = stopTime - startTime;

      if (s2 == sub) {
        System.out.println(
          "Time take by you :- " + (double) reactionTime / 1000.0 + "s"
        );
        sc.close();
      } else {
        System.out.println("\033[1;31m" + "Ye galat ho gya" + "\u001B[0m");
      }
    }
  }
}
