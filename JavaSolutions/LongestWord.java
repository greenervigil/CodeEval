/*
In this challenge you need to find the longest word in a sentence. If the sentence has more than one word of the same length you should pick the first one.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Input example is the following


1
2
some line with text
another line
Each line has one or more words. Each word is separated by space char.

OUTPUT SAMPLE:

Print the longest word in the following way.


1
2
some
another
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LongestWord {
  public static void main(String [] args) throws IOException{

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      String ln;
      while ((ln = br.readLine()) != null){
        String [] ar = ln.split("\\s");
        System.out.println(longest(ar));
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
  public static String longest(String [] words){
    String longest = "";
    int len = 0;
    for (String word : words){
      if (word.length() == len) {
      }else if (word.length() > len){
        len = word.length();
        longest = word;
      }
    }
    return longest;
  }
}
