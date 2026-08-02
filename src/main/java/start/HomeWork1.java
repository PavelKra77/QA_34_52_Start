package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork1 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void telranEduTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((10)));
        driver.get("https://telranedu.web.app/home");
        pause(2000);


        WebElement Phonebook = driver.findElement(By.cssSelector("h1:first-child")); //1
        System.out.println(Phonebook.getTagName());
        // System.out.println(Phonebook.getText());

        WebElement body = driver.findElement(By.tagName("body")); //2
        System.out.println(body.getTagName());

        WebElement ReactContactsApp = driver.findElement //3
                (By.cssSelector("div.container h2"));
        System.out.println(ReactContactsApp.getTagName());
        System.out.println(ReactContactsApp.getText());

        WebElement ForQATesting = driver.findElement //4
                (By.cssSelector("div.container h3"));
        System.out.println(ForQATesting.getTagName());
        System.out.println(ForQATesting.getText());

        WebElement Navbar = driver.findElement //5
                (By.cssSelector("div [class*='navbar']"));
        System.out.println(Navbar.getTagName());
        System.out.println(Navbar.getText());

        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']")); //6
        btnAbout.click();


        WebElement ContactsWebApplication = driver.findElement
                (By.cssSelector("div[class^='about_main'] h1")); //7
        System.out.println(ContactsWebApplication.getTagName());
        System.out.println(ContactsWebApplication.getText());

        WebElement TestApp = driver.findElement
                (By.cssSelector("div[class^='about_main'] h2")); //8
        System.out.println(TestApp.getTagName());
        System.out.println(TestApp.getText());

        WebElement Logo = driver.findElement
                (By.cssSelector("div[class*='about_main'] > p")); //9
        System.out.println(Logo.getTagName());
        System.out.println(Logo.getText());

        WebElement btnLogin = driver.findElement(By.cssSelector("a[href='/login']")); //10
        btnLogin.click();
        pause(2000);

        WebElement Email = driver.findElement(By.cssSelector("input[name ='email']")); //11
        Email.click();
        pause(2000);

        WebElement Password = driver.findElement(By.cssSelector("input[name ='password']")); //12
        Password.click();
        pause(2000);
        driver.quit();
    }
        @Test
        public void ilCarroTest(){
            driver.get("https://ilcarro.web.app/search");
            driver.manage().window().maximize();
            pause(2000);

            WebElement logo = driver.findElement
                    (By.cssSelector("a[class='logo']")); //1
            logo.click();
            pause(2000);

            WebElement linkSearch = driver.findElement
                    (By.cssSelector("a[href='search']")); // 2
            linkSearch.click();
            pause(3000);

            WebElement cityInput = driver.findElement(By.id("city")); //3
            cityInput.click();
            pause(2000);

            WebElement dates = driver.findElement(By.id("dates"));  //4
            dates.click();
            pause(2000);

            WebElement buttonYalla = driver.findElement
                    (By.cssSelector("button[type='submit']")); //5
            System.out.println(buttonYalla.getTagName());
            driver.navigate().back();

            WebElement linkTerms = driver.findElement //6
                    (By.cssSelector("a.navigation-link[href='/terms-of-use']"));//6
            linkTerms.click();
            pause(2000);

            WebElement signUp = driver.findElement
                    (By.cssSelector("a[href*='registration']")); //7
            signUp.click();
            pause(2000);

            WebElement fieldName = driver.findElement(By.cssSelector("input#name")); //8
            fieldName.click();
            pause(2000);

            WebElement checkBox = driver.findElement
                    (By.cssSelector("label.checkbox-label.terms-label")); //9
            checkBox.click();
            pause(2000);

            WebElement logIn = driver.findElement
                    (By.cssSelector("a[href*='login']")); //10
            logIn.click();
            pause(2000);
            driver.quit();

        }

        public void pause(int time){

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }}







