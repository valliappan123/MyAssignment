package Week3Assignment;

public class BankInfo extends AxisBank
{
	
public void Saving()
{
	System.out.println("Savings the Amount");
}
public void Fixed()
{
	System.out.println("Fixed deposit");

}
public void Deposit()
{
	System.out.println("Dposit the amount");
}

public static void main(String[] args) 
{
	BankInfo BI = new BankInfo();
	BI.Saving();
	BI.Fixed();
	BI.Deposit();
	BI.Deposit();
}
}
