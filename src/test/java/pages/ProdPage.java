package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * ProdPage — consolidated by TestForge from EXECUTED test runs.
 * Page URL: https://www.demoblaze.com/prod.html?idp_=1
 * Every locator below resolved successfully in a real browser execution.
 */
public class ProdPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public ProdPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h2.name")
    private WebElement productNameHeading;

    @FindBy(css = "h3.price-container")
    private WebElement productPriceElement;

    @FindBy(xpath = "//*[normalize-space()='Add to cart']")
    private WebElement addToCartButton;

    public boolean isProductNameHeadingVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(productNameHeading)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getProductNameHeadingText() {
        wait.until(ExpectedConditions.visibilityOf(productNameHeading));
        return productNameHeading.getText();
    }

    public boolean isProductPriceElementVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(productPriceElement)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getProductPriceElementText() {
        wait.until(ExpectedConditions.visibilityOf(productPriceElement));
        return productPriceElement.getText();
    }

    public boolean isAddToCartButtonVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(addToCartButton)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getAddToCartButtonText() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        return addToCartButton.getText();
    }

}
