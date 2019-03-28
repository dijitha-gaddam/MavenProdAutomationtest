package MavenDevautomationtest.MavenDevautomationtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Devemp_dashboardtest 
{
	@Test(retryAnalyzer=TestRetry.class)
	public void prodEmpLogin() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dijitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://devdashboard.modjoul.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	driver.findElement(By.name("username")).sendKeys("3-awstest@mailinator.com");
	driver.findElement(By.name("password")).sendKeys("modjoul105");
	driver.findElement(By.cssSelector("button[ng-click='login();']")).click();
	Thread.sleep(1*60*1000);
	Reporter.log("Dashboard Url: dashboard.modjoul.com",true);
	Reporter.log("Username: 3-awstest@mailinator.com",true);
	Reporter.log("password: **********",true);
	String LastActivityTime=driver.findElement(By.xpath("//div[contains(@class,'row ng-binding ng-scope')]")).getText();
	driver.findElement(By.partialLinkText("SCORECARD")).click();
	Thread.sleep(1*60*1000);
	driver.findElement(By.xpath("//span[contains(@class,'ng-binding')]")).click();
	Thread.sleep(500);
	String TotalWorkTime=driver.findElement(By.xpath("//div[contains(@class,'ng-binding ng-scope')]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	Thread.sleep(500);
	String walkingmetricactivity=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	String walkingstepcount=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
	String walkingdistance=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]")).getText();
	String walkingspeed=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	Thread.sleep(500);
	String totalbends=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	String bendingduration=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	Thread.sleep(500);
	String totaltwists=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	String twistingduration=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	Thread.sleep(500);
	String sittingstandingduration=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	String stationarymetricworktime=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[7]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	Thread.sleep(500);
	driver.findElement(By.xpath("//a[@id='DRIVING']//span[@class='ng-binding'][contains(text(),'DRIVING')]")).click();
	Thread.sleep(500);
	String drivingmetricactivity=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	String drivingdistance=driver.findElement(By.xpath("//div[@class='panel-body']//div[@class='panel-collapse collapse in']//div[@class='panel-body']//div[@class='scorecard-item-total ng-binding'][contains(text(),'0')]")).getText();
	Reporter.log(LastActivityTime,true);
    Reporter.log("Total work time is :"+" " + TotalWorkTime,true);
    Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
	Reporter.log("Walking duration is : " + " " + walkingmetricactivity,true);
	Reporter.log(" Walking step count is : " + " " + walkingstepcount,true);
	Reporter.log("Walking distance in miles is :"+" " +walkingdistance,true);
	Reporter.log("WalkingSpeed in miles/hour is : " +" " +walkingspeed,true);
	Reporter.log("-------------------------------------------------",true);
	Reporter.log("-------------------------------------------------",true);
	Reporter.log("Total Bend count is : "+" "+totalbends,true);
    Reporter.log("Bending duration is :"+ " " +bendingduration,true);
    Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
    Reporter.log("Total twistCount is : "+" " +totaltwists,true);
	Reporter.log("Twisting duration is : " + " "+twistingduration,true);
	Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
	Reporter.log("sitting/Standing duration is : "+ " "+sittingstandingduration,true);
	Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
    Reporter.log("Stationayworktime is :"+ " "+stationarymetricworktime,true);
    Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
	Reporter.log("Driving duration is " + " " + drivingmetricactivity,true);
	Reporter.log("Driving distance in miles is : "+" " +drivingdistance,true);
	Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[7]/li[4]/div[1]/button[1]")).click();
	//driver.findElement(By.cssSelector("button[ng-click='logout()']")).click();
	driver.close();
	
	

	
}


}
