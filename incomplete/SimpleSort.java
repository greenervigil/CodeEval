/*
Write a program which sorts numbers.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Input example is the following

70.920 -38.797 14.354 99.323 90.374 7.581
-37.507 -3.263 40.079 27.999 65.213 -55.552
OUTPUT SAMPLE:

Print sorted numbers in the following way. Please note, that you need to print the numbers till the 3rd digit after the dot including trailing zeros.

-38.797 7.581 14.354 70.920 90.374 99.323
-55.552 -37.507 -3.263 27.999 40.079 65.213
*/
import java.io.*;
import java.util.*;

public class SimpleSort {
  public static void main(String [] args) throws IOException{

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      String ln;
      while ((ln = br.readLine()) != null){
        sort(ln);
        }
        br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }

  }
  public static void sort(String numbers) {
    String newString = "";
    String [] num = numbers.split(" ");
    List<Double> sortList = new ArrayList<>();
    for (String s : num){
      sortList.add(Double.parseDouble(s));
    }
    System.out.println(sortList);
    Collections.sort(sortList);
    for(Double d : sortList) {
      newString += String.format("%.3f", d.toString()) + " ";
    }
    System.out.println(newString);
  }
}
