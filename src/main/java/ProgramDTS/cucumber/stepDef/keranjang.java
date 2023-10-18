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

public class keranjang {
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

        @When("user klik tombol add to cart")
        public void userKlikTombolAddToCart() {
            driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
        }
        @Then("produk tertambah di keranjang")
        public void produkTertambahDiKeranjang() {
            driver.findElement(By.xpath("\"//span[@class='shopping_cart_badge']\");
        }
    }






