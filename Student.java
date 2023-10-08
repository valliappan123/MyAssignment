package Week3Assignment;

public class Student {
	public void student(int id)
	{
		System.out.println("student ID no is"+id);
	}
	public void student(String name,String Email)
	{
		System.out.println("student Email id"+Email+"Student name is "+name);
	}
	public void student(double phoneno)
	{
		
		System.out.println("Student phoneno is"+phoneno);
	}
	public static void main(String[] args) {
		Student S = new Student();
		S.student(24);
		S.student("Valliappan","valliappanvinoth650@gmail.com");
		S.student(1234567899);
		
	}

}
