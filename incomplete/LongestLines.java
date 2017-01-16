import java.io.*;

public class LongestLines {
  public static void main(String [] args) throws IOException{

    String line = null;
    //look for file for input
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null){
        String [] arr = line.split(" | ");
        String [] ln = arr[0].split(" ");
        String con = arr[1].trim();

        for (String l : arr){
          System.out.println(l);
        }
        System.out.println(getWine(ln, con));
      }
      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
}
