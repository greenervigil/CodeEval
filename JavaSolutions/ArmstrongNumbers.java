/*
An Armstrong number is an n-digit number that is equal to the sum of the n'th powers of its digits. Determine if the input numbers are Armstrong numbers.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Each line in this file has a positive integer. E.g.


1
2
3
6
153
351
OUTPUT SAMPLE:

Print out True/False if the number is an Armstrong number or not. E.g.


1
2
3
True
True
False
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

  public static void main(String [] args) throws IOException{

    String line = null;
    //look for file for input
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        //variables
        double power;
        List<Double> numArray = new ArrayList<>();
        //split the line into an array
        String [] s = line.split("");
        //loop through string array and push it to an Integer
        //array List
        for (String e : s){
          numArray.add(Double.parseDouble(e));
        }
        //assign the power by the length of the list
        power = numArray.size();
        work(Double.parseDouble(line), numArray, power);
      }
      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  public static void work(double inputNumber, List<Double> list, double p){
    if (inputNumber <= 5){
      System.out.println(inputNumber);
    }else {
      System.out.println(inputNumber + " " + powerUp(list, p));
      System.out.println(evaluate(inputNumber, powerUp(list, p)));
    }
  }

  public static double powerUp(List<Double> numbers, double p) {
    double sum = 0;
    List<Double> newList = new ArrayList<>();
    //change the list value to the power value
    for (double i : numbers) {
      newList.add(Math.pow(i, p));
    }
    for (double x : newList) {
      sum += x;
    }
    return sum;
  }

  /*public static Boolean evaluate(double arr, double s){

    if (s == arr){
      return true;
    }else {
      return false;
    }
  }*/

  public static String evaluate(double arr, double s){

    if (s == arr){
      return "True";
    }else {
      return "False";
    }
  }
}
