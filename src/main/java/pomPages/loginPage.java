package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
           @FindBy(xpath="(//input[@placeholder='First and last name'])[1]")
           private WebElement nameField;
           
           @FindBy(xpath="(//input[@name='email'])[1]")
           private WebElement emailField;
           
           @FindBy(xpath="(//input[@placeholder='At least 6 characters'])[1]")
           private WebElement passwordField;
	       
           @FindBy(xpath="(//input[@name='passwordCheck'])[1]")
           private WebElement reenterpasswordField;
            
           @FindBy(xpath="(//input[@type='submit'])[1]")
           private WebElement submitbtn;
             
           
           public loginPage(WebDriver driver) {
        	   
        	PageFactory.initElements(driver, this);   
        	   
           }
	       
           
          /* public void nameField() {
        	    nameField.click();
        	 }
        	 */
           public void nameFieldTextbox(String name) {
        	   nameField.sendKeys(name);
           }
           
           /*  public void emailFieldTextBox() {
        	   emailField.click();
        	 }
        	 */
           public void emailFieldTextBox(String name) {
        	   emailField.sendKeys(name);
           }
           
          /* public void passwordFieldTextBox() {
        	   passwordField.click();
        	 }
        	 */
           public void passwordFieldTextBox(String name) {
        	   passwordField.sendKeys(name);
           }

          /* public void reenterpasswordFieldTextBox() {
        	   reenterpasswordField.click();
        	 }
        	 */
           public void reenterpasswordFieldTextBox(String name) {
        	   reenterpasswordField.sendKeys(name);
           }
           
           public void submitButton() {
        	   submitbtn.click();
        	 }
           
           


		
}
