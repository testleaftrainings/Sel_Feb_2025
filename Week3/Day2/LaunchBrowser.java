package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser extends LaunchEdgeBrowser {
	
	
	
	public void launch() {
		super.launch();
		System.out.println("Chrome");

	}
	
	
	public static void main(String[] args) {
		
		LaunchBrowser browser=new LaunchBrowser();
		browser.launch();
	}
	

}
