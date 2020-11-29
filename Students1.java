// Constructor overloading
public class Students1 {

	String Name;
	int Rollno;
	String Branch;
	Students1()
	{
		Name = "Siddhi";Rollno = 41;Branch = "EXTC";
	}
	Students1(String str, int num, String abc)
	{
		Name = str;
		Rollno = num;
		Branch = abc;
	}
	void display()
	{
		System.out.println("Name is "+Name);
		System.out.println("Rollno is "+Rollno);
		System.out.println("Branch is "+Branch);
	}
	public static void main(String[] args)
	{
		Students1 obj = new Students1();
		Students1 obj1 = new Students1("Neha",43,"IT");
		obj.display();
		obj1.display();
	}
}