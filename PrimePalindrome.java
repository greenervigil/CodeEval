class PrimePalindrome {

  private final static int MAX = 1000;
  private static int div;
  private static int prime;
  private static int num;
  private static int rev;

  public static void main(String [] args){
    for(num =2; num < MAX; num++){
      if (isPrime(num) && isPalindrome(num)){
        prime = num;
      }
    }
    System.out.println(prime);
  }


  //Test for Prime number
  public static boolean isPrime(int num){
      for(div = 2; div <= num/2; div++){
        if (num % div == 0){
          return false;
        }
      }
      return true;
  }

  //reverse the integer to test for possible palindrome
  // Modding by 10 extracts the rightmost digit
  //Multiply by 10 pushed left exposing a 0 to the right
  // Divide by 10 removes the rightmost digit
  public static int reverse(int number){
    rev = 0;
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
  }
