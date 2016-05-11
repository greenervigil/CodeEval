/**
* Write a program which determines the largest prime palindrome less *than 1000.
**/
class PrimePalindrome {

  final static int MAX = 1000;
  static int prime;
  static int num = 2;
  
  public static void main(String [] args){

    // loop through 2 - 1000
    while (num <= MAX){
      if (isPrime(num) && isPalindrome(num)){
        prime = num;
      }
      num++;
    }
    System.out.println(prime);
  }
  */

  //reverse the integer to test for possible palindrome
  // Modding by 10 extracts the rightmost digit
  //Multiply by 10 pushed left exposing a 0 to the right
  // Divide by 10 removes the rightmost digit
  public int reverse(int num){
    int rev = 0;
    while (num != 0){
      int digit = num % 10;
      rev = rev * 10 + digit;
      num = num / 10;
    }
    return rev;
  }

  //return true or false if the palindrome condition is met
  public boolean isPalindrome(int num){
    return num == reverse(num);
    }

    //Test for Prime number
    public boolean isPrime(int num){
        if (num == 2) return true;
        for(int div = 2; div <= num/2; div++){
          if (num % div == 0) return false;
        }
        return true;
    }
  }
