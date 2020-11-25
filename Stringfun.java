import java.util.Scanner;

 class Stringfun {
  public static void main(String[] args) {

  Scanner sc= new Scanner(System.in);
  System.out.print("Enter first string: ");
  String first= sc.nextLine();
  System.out.print("Entered string: "+first);
  
  System.out.print("\nEnter second string: ");
  String second= sc.nextLine();
  System.out.print("Entered string: "+second);

  int length = first.length();
  System.out.println("\nLenght of string is: " + length);

  String joinedString = first.concat(second);
  System.out.println("Joined string is: " + joinedString);
    
  String toUpperCase = first.toUpperCase();
  System.out.println("Upper case string is: " + toUpperCase);
  
  String toLowerCase = first.toLowerCase();
  System.out.println("Lower case string is: " + toLowerCase);

  boolean result = first.equals(second);
  System.out.println("Strings first and second are equal: " + result);

    }
}