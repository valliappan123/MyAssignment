package Week1Assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n=10;	
		boolean flag = true;
		for(int i=2;i<n;i++)
		{
			if(n%2==0)
				flag = false;
				break;
				
			}
			if(flag)
				System.out.println(n + " is a prime number");
			else
				System.out.println(n + " is not a prime number");
		// TODO Auto-generated method stub

	}

}
