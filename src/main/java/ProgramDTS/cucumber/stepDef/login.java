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

public class login {
    WebDriver driver;
    String baseurl="https://saucedemo.com/";

    @Given("Halaman login saucedemo")
    public void Halaman_login_saucedemo(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.get(baseurl);

        //Assertion
        String loginPageAssert = driver.findElement(By.xpath("//h2(contains(text(),'Swag')]")).getText();


    @When("user input username yang valid")
    public void userInputUsernameYangValid() {
        driver.findElement(By.id("Username")).sendKeys("standard_user");
    }

    @And("user input password yang valid")
    public void userInputPasswordYangValid() {
        driver.findElement(By.id("Password")).sendKeys("secret_sauce");
    }
    @And("klik tombol login")
    public void klikTombolLogin() {
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
    }

    @Then("user dapat login ke aplikasi")
    public void userDapatLoginKeAplikasi() {
        driver.findElement(By.xpath("//div[@class='app_logo']\""));
    }
}
