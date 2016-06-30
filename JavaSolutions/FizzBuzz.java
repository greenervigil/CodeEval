/**
Write a program that prints out the final series of numbers where those divisible by X, Y and both are replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.
Your program should accept a file as its first argument. The file contains multiple separated lines; each line contains 3 numbers that are space delimited. The first number is the first divider (X), the second number is the second divider (Y), and the third number is how far you should count (N). You may assume that the input file is formatted correctly and the numbers are valid positive integers.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FizzBuzz{
  public static List<String> newArr = new ArrayList<>();

  public static void main(String [] args) throws IOException{
    String ln;

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((ln = br.readLine()) != null){
        String [] ar = ln.split(" ");
        if (ar.length > 0){
          replace(ar);
        }
        for (String e : newArr){
          System.out.print(e + " ");
        }
        System.out.println();
        newArr.clear();
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
  //replace method
  //method will replace the to f, B, or FB
  //will start at 1  and count up to n
  //method to replace the string if divisible
  public static void replace(String[] arr){
    int x = Integer.parseInt(arr[0]);
    int y = Integer.parseInt(arr[1]);
    int n = Integer.parseInt(arr[2]);

    for(int i =1; i <= n; i++){
      if((i % x == 0) && (i % y == 0)){
        newArr.add("FB");
      }else if (i % x == 0){
        newArr.add("F");
      }else if (i % y == 0){
        newArr.add("B");
      }else {
        newArr.add(Integer.toString(i));
      }
    }
  }
}
