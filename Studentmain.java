package day4;
class Student
{
	int roll_no;
	String stu_name;
	double marks1,marks2;
	float marks3,marks4;
	public void average()
	{
		double avg=(marks1+marks2+marks3+marks4)/4;
		System.out.println("Average marks is" +avg);
	}
}

public class Studentmain 
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		System.out.println("s1.roll no before assignment" + s1.roll_no);
		s1.roll_no=1001;
		System.out.println("s1 roll no"+s1.roll_no);
		System.out.println("s1 student name before assignment" + s1.stu_name);
		s1.stu_name="rohith";
		System.out.println("s1"+s1.stu_name);
		System.out.println("s1 marks1 before assignment" + s1.marks1);
		s1.marks1=88;
		System.out.println("s1 marks"+s1.marks1);
		System.out.println("s1 marks2 before assignment" + s1.marks2);
		s1.marks2=88;
		System.out.println("s1 marks2"+s1.marks2);
		System.out.println("s1 marks3 before assignment" + s1.marks3);
		s1.marks3=89.0f;
		System.out.println("s1 marks"+s1.marks3);
		System.out.println("s1 marks4 before assignment" + s1.marks4);
		s1.marks4=88;
		System.out.println("s1 marks2"+s1.marks4);
		s1.average();
	}
}
