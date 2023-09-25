package Week1Assignment;

public class Browser {

	public static void main(String[] args) {
		Browser obj = new Browser();
		//obj.LaunchBrowser(null);
		obj.LaunchBrowser("Chrome");
		obj.loadUrl();
		
		}
	

	public static void LaunchBrowser(String BrowserName)
	{
		
	System.out.println(BrowserName+" "+"Browser launched successfully");
	//System.out.println(BrowserName);
	
	}
	public static void loadUrl()
	{
		
	System.out.println("Application url loaded successfully");
			// TODO Auto-generated method stub

	}

}
