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

public class detailproduk {
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
        @Given("user ada di halaman list produk")
        public void userAdaDiHalamanListProduk() {
            driver.findElement(By.xpath("//div[@class='app_logo']\"));

        }

        @When("user klik salah satu produk")
        public void userKlikSalahSatuProduk() {

            driver.findElement(By.xpath("//*[@id='item_4_img_link']")).click();
        }
        @Then("user dapat melihat detail produk")
        public void userDapatMelihatDetailProduk() {
            driver.findElement(By.xpath("//div[contains(@class, 'inventory_details_name')]");
        }
    }






