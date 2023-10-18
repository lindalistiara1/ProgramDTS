package ProgramDTS.cucumber.stepDef;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkout {
    WebDriver driver;
    String baseurl="https://saucedemo.com/";

    @FindBy(xpath = "//span[@class='title']")
    public FluentWebElement spanCheckoutYourInformation;


    @Given("Halaman login saucedemo")
    public void Halaman_login_saucedemo(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.get(baseurl);

        //Assertion
        String loginPageAssert = driver.findElement(By.xpath("//h2(contains(text(),'Swag')]")).getText();
        @Given("user berada di halaman keranjang")
        public void userBeradaDiHalamanKeranjang() {
            driver.findElement(By.xpath("\"//span[@class='Your Cart']\"));

        }

        @When("user klik tombol checkout")
        public void userKlikTombolCheckout() {

            driver.findElement(By.xpath("//*[@id='checkout']")).click();
        }
        @Then("user dapat melihat halaman checkout information")
        public void userDapatMelihatHalamanCheckoutInformation() {
            driver.findElement(By.xpath("\"//span[@class='Your Information']\");
        }
    }






