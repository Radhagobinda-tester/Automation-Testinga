package testscripts;

import org.testng.AssertJUnit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
	
	/*Assert.assertEquals(driver.getText(),pdata.getPropertyFileData("namefield"))
	Assert.assertEquals(driver.getTitle(),pdata.getPropertyFileData("enamefield"));
	Assert.assertEquals(driver.getTitle(),pdata.getPropertyFileData("pnamefield"));
	//Assert.assertEquals(driver.getTitle(),pdata.getPropertyFileData("rnamefield"));
	*/
	
	Thread.sleep(10000);

	
     //name
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
    AssertJUnit.assertEquals(text2, pdata.getPropertyFileData("pnamefield"));
    /*
    // Find the element by its locator
    WebElement element4 = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));

    // Get the text from the element
    String text3 = element4.getText();

    // Assert the expected text value
    AssertJUnit.assertEquals(text3, pdata.getPropertyFileData("rnamefield"));
       
}
	*/
	
	

	

}
}
