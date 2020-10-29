package config;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	public static File img= null;
	public static String sucess = "evidencias\\sucess\\";
	public static String fail = "evidencias\\fail\\";	
	public static int x=1;
	public static String url = "https://www.petz.com.br/blog/";
	
	public void browserChrome() {		
		try {
	
			System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
			driver = new FirefoxDriver();		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	protected void btnLimpar() throws InterruptedException {
		driver.findElement(By.linkText("Limpar")).click();
		Thread.sleep(2000);
	}
	
	public static void evidencias(File img, String caminho, String nomeImg) {		
		try {			
			FileUtils.copyFile(img,new File(caminho+nomeImg));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
