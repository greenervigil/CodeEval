/**
Write a program that prints out the final series of numbers where those divisible by X, Y and both are replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.
Your program should accept a file as its first argument. The file contains multiple separated lines; each line contains 3 numbers that are space delimited. The first number is the first divider (X), the second number is the second divider (Y), and the third number is how far you should count (N). You may assume that the input file is formatted correctly and the numbers are valid positive integers.
*/
import java.io.*;


class FizzBuzz{

  public static void main(String [] args) throws IOException{
    //variables
    String line = null;
    int X;
    int Y;
    int N;

    //try-catch to open the file provided by ARGS 
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        String [] ar = line.split("\\s");
        System.out.println(ar);
        if (ar.length > 0){
          System.out.println(replace(ar));
        }
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  //method to replace the string if divisible
  public static String [] replace(String[] arr){
    int x = Integer.parseInt(arr[0]);
    int y = Integer.parseInt(arr[1]);
    int n = Integer.parseInt(arr[2]);
    String [] newArr;

    for(int i =1; i <= n; i++){
      if((Integer.parseInt(i) % x == 0) && (Integer.parseInt(i) % y == 0)){
        newArr.push("FB");
      }else if (Integer.parseInt(i) % x == 0){
        newArr.push("F");
      }else if (Integer.parseInt(i) % y == 0){
        newArr.push("B");
      }else {
        newArr.push(i.toString());
      }
    }
    return newArr;
  }
}
