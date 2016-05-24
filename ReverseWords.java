import java.io.*;

public class ReverseWords {

  public static void main(String [] args) throws IOException{

    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        String [] ar = line.split("\\s");
        if (ar.length > 0){
          System.out.println(reverse(ar));
        }
      }

      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }

  //method to reverse the words in a string array
  public static String [] reverse(String [] array){
    return array.reverse();
  }
}
