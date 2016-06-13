/*
Print the size of a file in bytes.

INPUT:

The first argument to your program has the path to the file you need to check the size of.

OUTPUT SAMPLE:

Print the size of the file in bytes. E.g.

55
*/
import java.io.File;
public class FileSize {
  public static void main (String [] args){
      File fr = new File(args[0]);
      if (fr.exists()){
        long bytes = fr.length();
        System.out.println(bytes);
      }
    }
}
