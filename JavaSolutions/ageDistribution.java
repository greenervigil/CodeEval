/*
You're responsible for providing a demographic report for your local school district based on age. To do this, you're going determine which 'category' each person fits into based on their age.
The person's age will determine which category they should be in:

If they're from 0 to 2 the child should be with parents print : 'Still in Mama's arms'
If they're 3 or 4 and should be in preschool print : 'Preschool Maniac'
If they're from 5 to 11 and should be in elementary school print : 'Elementary school'
From 12 to 14: 'Middle school'
From 15 to 18: 'High school'
From 19 to 22: 'College'
From 23 to 65: 'Working for the man'
From 66 to 100: 'The Golden Years'
If the age of the person less than 0 or more than 100 - it might be an alien - print: "This program is for humans"
INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Each line of input contains one integer - age of the person:


1
2
0
19
OUTPUT SAMPLE:

For each line of input print out where the person is:


1
2
Still in Mama's arms
College
*/
import java.io.*;

public class ageDistribution {
  public static void main(String [] args) throws IOException{
    String ln;
    //try-catch to open the file provided by ARGS
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);

      while ((ln = br.readLine()) != null){
        System.out.println(distributeAge(Integer.parseInt(ln)));
      }
      br.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Could not open file.");
    }
  }
  public static String distributeAge(int age){
    if (age < 0 && age > 100) {
      return "This program is for humans";
    }
    if (age <= 0 && age >=2) {
      return "Still in Mama's arms";
    }else if (age >= 3 && age <= 4) {
      return "Preschool Maniac";
    }else if (age >= 5  && age <= 11) {
      return "Elementary school";
    }else if (age >= 12 && age <=14) {
      return "Middle school";
    }else if (age >= 15 && age <= 18) {
      return "High school";
    }else if (age >= 19 && age <= 22) {
      return "College";
    }else if (age >= 23 && age <= 65) {
      return "Working for the man";
    }else {
      return "The Golden Years";
    }
  }
}
