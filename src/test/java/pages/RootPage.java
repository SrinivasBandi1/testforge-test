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
 * RootPage — consolidated by TestForge from EXECUTED test runs.
 * Page URL: https://www.demoblaze.com/
 * Every locator below resolved successfully in a real browser execution.
 */
public class RootPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public RootPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#narvbarx")
    private WebElement navigationBar;

    @FindBy(css = "#nava")
    private WebElement pRODUCTStoreBrandLink;

    @FindBy(css = "#cat")
    private WebElement cATEGORIESLink;

    @FindBy(xpath = "//button[normalize-space()='Phones'] | //a[normalize-space()='Phones'] | //*[@role='button'][normalize-space()='Phones']")
    private WebElement phonesCategoryLink;

    @FindBy(xpath = "//button[normalize-space()='Laptops'] | //a[normalize-space()='Laptops'] | //*[@role='button'][normalize-space()='Laptops']")
    private WebElement laptopsCategoryLink;

    @FindBy(xpath = "//*[normalize-space()='Monitors']")
    private WebElement monitorsCategoryLink;

    @FindBy(xpath = "//button[normalize-space()='Samsung galaxy s6'] | //a[normalize-space()='Samsung galaxy s6'] | //*[@role='button'][normalize-space()='Samsung galaxy s6']")
    private WebElement samsungGalaxyS6ProductLink;

    @FindBy(css = "#login2")
    private WebElement logInNavLink;

    @FindBy(css = "#signin2")
    private WebElement signUpNavLink;

    @FindBy(css = "#cartur")
    private WebElement cartNavLink;

    @FindBy(xpath = "//button[normalize-space()='Nokia lumia 1520'] | //a[normalize-space()='Nokia lumia 1520'] | //*[@role='button'][normalize-space()='Nokia lumia 1520']")
    private WebElement nokiaLumia1520ProductLink;

    @FindBy(xpath = "//*[normalize-space()='Sony vaio i5']")
    private WebElement sonyVaioI5ProductLink;

    @FindBy(xpath = "//*[normalize-space()='Sony vaio i7']")
    private WebElement sonyVaioI7ProductLink;

    @FindBy(css = "#prev2")
    private WebElement previousPaginationButton;

    @FindBy(css = "#next2")
    private WebElement nextPaginationButton;

    @FindBy(css = "#tbodyid")
    private WebElement productListingContainer;

    @FindBy(xpath = "//*[normalize-space()='Contact']")
    private WebElement contactNavLink;

    public boolean isNavigationBarVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(navigationBar)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getNavigationBarText() {
        wait.until(ExpectedConditions.visibilityOf(navigationBar));
        return navigationBar.getText();
    }

    public boolean isPRODUCTStoreBrandLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(pRODUCTStoreBrandLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPRODUCTStoreBrandLinkText() {
        wait.until(ExpectedConditions.visibilityOf(pRODUCTStoreBrandLink));
        return pRODUCTStoreBrandLink.getText();
    }

    public boolean isCATEGORIESLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(cATEGORIESLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCATEGORIESLinkText() {
        wait.until(ExpectedConditions.visibilityOf(cATEGORIESLink));
        return cATEGORIESLink.getText();
    }

    public void clickPhonesCategoryLink() {
        wait.until(ExpectedConditions.elementToBeClickable(phonesCategoryLink));
        phonesCategoryLink.click();
    }

    public boolean isPhonesCategoryLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(phonesCategoryLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPhonesCategoryLinkText() {
        wait.until(ExpectedConditions.visibilityOf(phonesCategoryLink));
        return phonesCategoryLink.getText();
    }

    public void clickLaptopsCategoryLink() {
        wait.until(ExpectedConditions.elementToBeClickable(laptopsCategoryLink));
        laptopsCategoryLink.click();
    }

    public boolean isLaptopsCategoryLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(laptopsCategoryLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getLaptopsCategoryLinkText() {
        wait.until(ExpectedConditions.visibilityOf(laptopsCategoryLink));
        return laptopsCategoryLink.getText();
    }

    public boolean isMonitorsCategoryLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(monitorsCategoryLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getMonitorsCategoryLinkText() {
        wait.until(ExpectedConditions.visibilityOf(monitorsCategoryLink));
        return monitorsCategoryLink.getText();
    }

    public void clickSamsungGalaxyS6ProductLink() {
        wait.until(ExpectedConditions.elementToBeClickable(samsungGalaxyS6ProductLink));
        samsungGalaxyS6ProductLink.click();
    }

    public boolean isSamsungGalaxyS6ProductLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(samsungGalaxyS6ProductLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getSamsungGalaxyS6ProductLinkText() {
        wait.until(ExpectedConditions.visibilityOf(samsungGalaxyS6ProductLink));
        return samsungGalaxyS6ProductLink.getText();
    }

    public boolean isLogInNavLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(logInNavLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getLogInNavLinkText() {
        wait.until(ExpectedConditions.visibilityOf(logInNavLink));
        return logInNavLink.getText();
    }

    public boolean isSignUpNavLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(signUpNavLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getSignUpNavLinkText() {
        wait.until(ExpectedConditions.visibilityOf(signUpNavLink));
        return signUpNavLink.getText();
    }

    public void clickCartNavLink() {
        wait.until(ExpectedConditions.elementToBeClickable(cartNavLink));
        cartNavLink.click();
    }

    public boolean isCartNavLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(cartNavLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCartNavLinkText() {
        wait.until(ExpectedConditions.visibilityOf(cartNavLink));
        return cartNavLink.getText();
    }

    public void clickNokiaLumia1520ProductLink() {
        wait.until(ExpectedConditions.elementToBeClickable(nokiaLumia1520ProductLink));
        nokiaLumia1520ProductLink.click();
    }

    public boolean isNokiaLumia1520ProductLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(nokiaLumia1520ProductLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getNokiaLumia1520ProductLinkText() {
        wait.until(ExpectedConditions.visibilityOf(nokiaLumia1520ProductLink));
        return nokiaLumia1520ProductLink.getText();
    }

    public boolean isSonyVaioI5ProductLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(sonyVaioI5ProductLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getSonyVaioI5ProductLinkText() {
        wait.until(ExpectedConditions.visibilityOf(sonyVaioI5ProductLink));
        return sonyVaioI5ProductLink.getText();
    }

    public boolean isSonyVaioI7ProductLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(sonyVaioI7ProductLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getSonyVaioI7ProductLinkText() {
        wait.until(ExpectedConditions.visibilityOf(sonyVaioI7ProductLink));
        return sonyVaioI7ProductLink.getText();
    }

    public boolean isPreviousPaginationButtonVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(previousPaginationButton)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPreviousPaginationButtonText() {
        wait.until(ExpectedConditions.visibilityOf(previousPaginationButton));
        return previousPaginationButton.getText();
    }

    public void clickNextPaginationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(nextPaginationButton));
        nextPaginationButton.click();
    }

    public boolean isNextPaginationButtonVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(nextPaginationButton)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getNextPaginationButtonText() {
        wait.until(ExpectedConditions.visibilityOf(nextPaginationButton));
        return nextPaginationButton.getText();
    }

    public boolean isProductListingContainerVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(productListingContainer)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getProductListingContainerText() {
        wait.until(ExpectedConditions.visibilityOf(productListingContainer));
        return productListingContainer.getText();
    }

    public boolean isContactNavLinkVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(contactNavLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getContactNavLinkText() {
        wait.until(ExpectedConditions.visibilityOf(contactNavLink));
        return contactNavLink.getText();
    }

}
