/*
Given two integers N and M, calculate N Mod M (without using any inbuilt modulus operator).

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Each line in this file contains two comma separated positive integers. E.g.

20,6
2,3
You may assume M will never be zero.

OUTPUT SAMPLE:

Print out the value of N Mod
*/
import java.io.*;
public class NmodM {
  public static void main (String [] args) throws IOException{
    String line = null;

    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        String [] arr = line.split(",");
        if (arr.length > 0){
          int n = Integer.parseInt(arr[0]);
          int m = Integer.parseInt(arr[1]);
          System.out.println(mod(n, m));
        }
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
  public static int mod(int n, int m){
    int div = n / m;
    return n - (div * m);
  }
}
