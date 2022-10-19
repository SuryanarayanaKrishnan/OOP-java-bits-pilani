class Student 
{ 
	String name;
	int age;
	public Student (String aName, int aAge) 
	{
		name = aName; age = aAge;
	}
	public void display() 
	{
	   System.out.println ("I am " + name + " of age " + age);
	}
   public void calcCGPA() { } 
}
public class StudentTester 
{
	public static void main (String[] args) 
	{
		Student s1 = new Student("abc", 10);
		s1.display();
	}
}                                        
