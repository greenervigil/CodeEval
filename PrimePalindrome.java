import java.lang.*;

class PrimePalindrome {

  private final static int MAX = 1000;
  private static int prime;
  private static int num = 2;
  static int rev = 0;

  public static void main(String [] args){

    // loop through 2 - 1000
    for(; num < MAX; num++){
      if (isPrime(num) && isPalindrome(num)){
        prime = num;
      }
    }
    System.out.println(prime);
  }

  //reverse the integer to test for possible palindrome
  // Modding by 10 extracts the rightmost digit
  //Multiply by 10 pushed left exposing a 0 to the right
  // Divide by 10 removes the rightmost digit
  public static int reverse(int number){

    while (num != 0){
      int digit = num % 10;
      rev = rev * 10 + digit;
      number = number / 10;
    }
    return rev;
  }

  //return true or false if the palindrome condition is met
  public static boolean isPalindrome(int num){
    return num == reverse(num);
    }
    //Test for Prime number
    public static boolean isPrime(int num){
        if (num == 2) {
          return true;
        }
        for(int div = 2; div <= num/2; div++){
          if (num % div == 0){
            return false;
          }
        }
        return true;
    }
  }
