/*
Given numbers x and n, where n is a power of 2, print out the smallest multiple of n which is greater than or equal to x. Do not use division or modulo operator.

INPUT SAMPLE:

The first argument will be a path to a filename containing a comma separated list of two integers, one list per line. E.g.

13,8
17,16
OUTPUT SAMPLE:

Print to stdout, the smallest multiple of n which is greater than or equal to x, one per line. E.g.

16
32
*/
import java.io.*;

public class Multiples{
  public static void main(String [] args) throws IOException{
    //get input from a file
    String line = null;

    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        String [] arr = line.split(",");
        if (arr.length > 0){
          int n = Integer.parseInt(arr[0]);
          int m = Integer.parseInt(arr[1]);
          System.out.println(lowestMultiple(n, m));
        }
      }
      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
  public static int lowestMultiple(int cont, int start){
    int sum = 0;
    for (int i = 1; sum <= cont; i++){
        sum = start * i;
        //System.out.println(sum);
    }
    return sum;
  }
}
