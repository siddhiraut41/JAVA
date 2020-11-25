import java.util.Scanner;
public class Calculator{
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter two numbers: ");

    double n1 = reader.nextDouble();
    double n2 = reader.nextDouble();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = reader.next().charAt(0);

    double result;

    switch (operator) {
      case '+':
        result = n1 + n2;
        break;

      case '-':
        result = n1 - n2;
        break;

      case '*':
        result = n1 * n2;
        break;

      case '/':
        result = n1 / n2;
        break;

      default:
        System.out.printf("Error! operator is incorrect");
        return;
    }

    System.out.println(n1 + " " + operator + " " + n2 + " = " + result);
  }
}