package hooks;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Setup {

	public static WebDriver driver; 
//before tab3a languae cucumber
	@Before
	public void initial() {
		
		driver= DriverManager.getdriver();
	}
	@BeforeStep
	public void  affiche() {
		System.out.println("etape en cours");
	}
	
	@AfterStep
	public void  TakeScreenShot(Scenario scenario) {
     final byte [] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
     scenario.attach(screenshot, "image/png", "image");
	}
	
	@After
	public void finish() {
		driver.close();
		
	}
}
