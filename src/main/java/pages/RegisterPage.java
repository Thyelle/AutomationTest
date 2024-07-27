package pages;

import core.DriverFectory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.Elements.*;


public class RegisterPage extends DriverFectory {
    public WebDriverWait wait;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void clickRecruitment(){
        driver.findElement(By.xpath(RecruitmentMenu)).click();
    }
    public void addButton(){
        driver.findElement(By.xpath(BtnAdd)).click();
    }
    public String getNameScreen(){
        return driver.findElement(By.xpath(LabelAddCandidate)).getText();
    }

    public void registerCandidate(){
        driver.findElement(By.xpath(FirstName)).sendKeys("Thyelle");
        driver.findElement(By.xpath(MeddleName)).sendKeys("Serres");
        driver.findElement(By.xpath(LastName)).sendKeys("Durgante");
        driver.findElement(By.xpath(ClickVacancy)).click();
        driver.findElement(By.xpath(SelectVacancy)).click();
        driver.findElement(By.xpath(EmailCantact)).sendKeys("thyelle.durgante@gmail.com");
        driver.findElement(By.xpath(ContactNumber)).sendKeys("51991654141");
        driver.findElement(By.xpath(Keywords)).sendKeys("I passed the selection process");
        driver.findElement(By.xpath(Notes)).sendKeys("I am ready to work at the company");
        driver.findElement(By.xpath(ConsentToKeepData)).click();
        driver.findElement(By.xpath(BntSave)).click();
    }
    public void clickSave(){
        driver.findElement(By.xpath(BntSave)).click();

    }
    public String getConfirmRegistration(){
        return driver.findElement(By.xpath(ApplicationStage)).getText();
    }


}
