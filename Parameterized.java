package day5;
class Student1
{
	int roll_no;
	String stu_name;
	Student1(int roll_no1, String stu_name1)
	{
		roll_no=roll_no1;
		stu_name=stu_name1;	
	}
}
public class Parameterized {
	public static void main(String[] args)
	{
		Student1 s1 =new Student1(1001,"Siri");
		System.out.println(s1.roll_no+" " + s1.stu_name+" ");
	}
	

}
