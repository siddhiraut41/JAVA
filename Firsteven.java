public class Firsteven{
    public static void main(String[] args)
    {
        int n = 2;
        int sum = 0;
        int i = 0;
        
        do {
            if(n%2==0)
             {
                i++;
                sum = sum + n;
            }
            n++;              
        }while(i<10); 
    System.out.println("Sum of first 10 even numbers is: " + sum);
    }
       
}