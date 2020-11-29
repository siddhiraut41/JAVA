// Illustrate method of overloading 
public class Add{  
static int add(int a,int b)
{
    return a+b;
    }  
static int add(int a,int b,int c)
{
    return a+b+c;
    }    
public static void main(String[] args) {  
Add Adder = new Add(); 
System.out.println(Adder.add(57,41));  
System.out.println(Adder.add(9,39,51));  
}
}  