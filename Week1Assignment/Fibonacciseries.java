package Week1Assignment;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n=8;
		int f1=0;
		int f2=1;
		int f3;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=2;i<8;i++)
		{ 
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
			
			
			
		}
		// TODO Auto-generated method stub
       
	}

}
