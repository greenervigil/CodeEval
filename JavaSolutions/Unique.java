/*
You are given a sorted list of numbers with duplicates. Print out the sorted list with duplicates removed.

INPUT SAMPLE:

File containing a list of sorted integers, comma delimited, one per line. E.g.

1
2
1,1,1,2,2,3,3,4,4
2,3,4,5,5
OUTPUT SAMPLE:

Print out the sorted list with duplicates removed, one per line.
E.g.


1
2
1,2,3,4
2,3,4,5
*/
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Unique {
  public static void main(String [] args) throws IOException{
    String ln;
    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);

      while ((ln = br.readLine()) != null){
        String newString = "";
        String [] ar = ln.split(",");
        List<Integer> numbers = new ArrayList<>();
        for (String s : ar) {
          if (numbers.contains(Integer.parseInt(s))){
            continue;
          }else{
            numbers.add(Integer.parseInt(s));
            newString += s + ",";
          }
        }
        int index = (newString.length() - 1);
        System.out.println(newString.substring(0, index));
      }
      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
}
