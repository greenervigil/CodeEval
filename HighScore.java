/**
  The first argument is a path to a file. Each line includes a test case with a table. Table rows are separated by pipes '|'. All table rows contain scores for each category, so all lines are of an equal length.

  You need to print the highest score for each category.
  */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HighScore {

  public static void main(String [] args) throws IOException{
    //get input from a file
    String line = null;

    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){

        System.out.println(splitLine(line));
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  /*split the input line into a 2 dimensional array and convert
    the string variable to integers.
  */
  public static List<Integer> splitLine(String scores){
    List<Integer> newArray = new ArrayList<>();
    String [] strArray = scores.split(" | ");

    for (String s : strArray){
      String [] arr = s.split(" ");
      for (String sub : arr){
        System.out.println(Integer.parseInt(sub));
        newArray.push(Integer.parseInt(sub));
      }
    }
    return newArray;
  }
}
