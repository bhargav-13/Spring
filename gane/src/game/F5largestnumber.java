package game;


import java.io.*;
import java.lang.Math;
import java.util.*;

public class F5largestnumber {

  // public static int getLargest(int[] a, int total){
  // int temp;
  // for (int i = 0; i < total93; i++)
  //         {
  //             for (int j = i + 1; j < total; j++)
  //             {
  //                 if (a[i] > a[j])
  //                 {
  //                     temp = a[i];
  //                     a[i] = a[j];
  //                     a[j] = temp;
  //                 }
  //             }
  //         }
  //        return a[total-1];
  // }
  public static void main(String[] args)
    throws InterruptedException, IOException {
    // double m=Math.random()*100;
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.println(
      "\u001B[36m" + "\n the largest element among 5 numbers" + "\u001B[0m"
    );

    for (int i = 0; i < arr.length; i++) {
      double m = Math.random();

      arr[i] = (int) (m * 90 + 10);
      System.out.print("\033[1;95m" + arr[i] + "\033[0m" + "   ");
    }
    System.out.println();

    int max1 = arr[0];
    for (int i = 0; i < arr.length; i++) {
      max1 = Math.max(max1, arr[i]);
    }

    long startTime = System.currentTimeMillis();
    //Scanner sc = new Scanner(System.in);
    int s1 = sc.nextInt();
    long stopTime = System.currentTimeMillis();
    long reactionTime = stopTime - startTime;
    
    if (s1 == max1) {
      System.out.println(
        "Time take by you :- " + (double) reactionTime / 1000.0 + "s"
      );
      sc.close();
    } else System.out.println("\033[1;31m" + "Ye galat ho gya" + "\u001B[0m");
    // System.out.println("Largest: "+ max1);
  }
}