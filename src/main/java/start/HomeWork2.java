package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2 {
    WebDriver driver = new ChromeDriver();


    @Test
    public void ilCarroTest(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        pause(2000);

        WebElement logo = driver.findElement
                (By.xpath("//a[@class='logo']")); // 1
        logo.click();
        pause(2000);

        WebElement linkSearch = driver.findElement
                (By.xpath("//a[@href='/search']")); //2
        linkSearch.click();
        pause(2000);

        WebElement linkLetTheCar = driver.findElement
                (By.xpath("//a[@href='/let-car-work']")); //3
        linkLetTheCar.click();
        pause(2000);

        WebElement fieldLocation = driver.findElement
                (By.xpath("//input[@id='pickUpPlace']")); //4
        fieldLocation.sendKeys("Tel-a-Viv");

        WebElement fieldManufacture = driver.findElement
                (By.xpath("//input[@id='make']")); //5
        fieldManufacture.sendKeys("Germany");

        WebElement fieldModel = driver.findElement
                (By.xpath("//*[@formcontrolname = 'model']")); //6
        fieldModel.sendKeys("BMW");

        WebElement fieldYear = driver.findElement
                (By.xpath("//*[@formcontrolname = 'year']")); //7
        fieldYear.sendKeys("2025");


        WebElement fieldFuel = driver.findElement
                (By.xpath("//*[@id='fuel']")); // 8
        fieldFuel.click();
        pause(2000);

        WebElement btnSubmit = driver.findElement
                (By.xpath("//button[text()='Submit']")); //9
        System.out.println(btnSubmit.getText());

        WebElement linkTerms = driver.findElement
                (By.xpath("//a[text()='Terms of use']")); // 10
        linkTerms.click();
        pause(2000);

        WebElement linkSignup = driver.findElement
                (By.xpath("//a[@ng-reflect-router-link='registration']")); //11
        linkSignup.click();
        pause(2000);

        WebElement fieldName = driver.findElement
                (By.xpath("//*[@formcontrolname='firstName']")); //12
        fieldName.sendKeys("Petr");

        WebElement fieldLastname = driver.findElement
                (By.xpath("//*[starts-with(@formcontrolname,'last')]")); //13
        fieldLastname.sendKeys("Petrov");

        WebElement fieldEmail = driver.findElement
                (By.xpath("//*[@type='email']"));
        fieldEmail.sendKeys("petrov771@gmail.com"); //14

        WebElement fieldPassword = driver.findElement
                (By.xpath("//label[@for='password']")); //15
        fieldPassword.click();
        pause(2000);



        pause(2000);
        driver.quit();

    }

    public void pause(int time){

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
