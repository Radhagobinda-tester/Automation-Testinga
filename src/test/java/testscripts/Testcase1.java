package testscripts;

import org.testng.AssertJUnit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.loginPage;

@Test
public class Testcase1 extends BaseClass {
	
public void tc1() throws IOException, InterruptedException {
	
	loginPage l = new loginPage(driver);
	l.nameFieldTextbox(pdata.getPropertyFileData("name"));
	Thread.sleep(10000);
	l.emailFieldTextBox(pdata.getPropertyFileData("ename"));
	Thread.sleep(10000);
	l.passwordFieldTextBox(pdata.getPropertyFileData("pname"));
	Thread.sleep(10000);
	l.reenterpasswordFieldTextBox(pdata.getPropertyFileData("rname"));
	Thread.sleep(10000);
	l.submitButton();
	

	
	Thread.sleep(10000);

	
     
    // Find the element by its locator
    WebElement element = driver.findElement(By.xpath("(//input[@placeholder='First and last name'])[1]"));

    // Get the text from the element
    String text = element.getText();

    // Assert the expected text value
    AssertJUnit.assertEquals(text, "Enter your name");
       
	Thread.sleep(10000);

 // Find the element by its locator
    WebElement element2 = driver.findElement(By.xpath("(//input[@placeholder='At least 6 characters'])[1]"));

    // Get the text from the element
    String text1 = element2.getText();

    // Assert the expected text value
    AssertJUnit.assertEquals(text1, pdata.getPropertyFileData("enamefield"));
       
	Thread.sleep(10000);

    
    // Find the element by its locator
    WebElement element3 = driver.findElement(By.xpath("(//input[@name='passwordCheck'])[1]"));

    // Get the text from the element
    String text2 = element3.getText();

    // Assert the expected text value
    
	

	

}
}
