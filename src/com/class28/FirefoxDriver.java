package com.class28;

public class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("FirefoxDriver can open the browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("FirefoxDriver close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FirefoxDriver maximize window");
	}

	@Override
	public void findElement() {
		System.out.println("FirefoxDriver find something");
		
	}

}
