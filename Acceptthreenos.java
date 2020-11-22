import java.util.Scanner;
public class Acceptthreenos{
    public static void main(String[] args){
        int n1, n2, n3;
        System.out.println("Enter Three numbers : ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2= in.nextInt();
        n3= in.nextInt();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}