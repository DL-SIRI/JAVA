package day5;

class Student
{
	int roll_no;
	String stu_name;
	double marks1,marks2,marks3,marks4;
	Student()
	{
		 roll_no =1001;
		 stu_name="siri";
		 marks1=25;
		 marks2=35;
		 marks3=45;
		 marks4=55;		
	}	
}
public class Main
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		System.out.println(s1.roll_no+" " + s1.stu_name+" "+s1.marks1);
		System.out.println(s1.marks2+" "+s1.marks3+" "+s1.marks4);
		Student s2 = new Student();
		System.out.println(s2.roll_no+" " + s2.stu_name+" "+s2.marks1);
		System.out.println(s2.marks2+" "+s2.marks3+" "+s2.marks4);
		
		
	}
}
	

