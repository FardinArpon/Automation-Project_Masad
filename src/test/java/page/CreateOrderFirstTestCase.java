package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateOrderFirstTestCase {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id = "groupNode_order_management_1")
    WebElement orderManagementLink;
    @FindBy(id = "itemNode_order_management_order_management_1")
    WebElement orderManagement;
    @FindBy(xpath = "//span[@class='xrf']")
    WebElement createOrder;
    @FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")
    WebElement businessUnit;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:partyNameId::content")
    WebElement customer;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:orderType1Id::content']")
    WebElement orderType;
    @FindBy(xpath = "//img[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:searchIcoId::icon']")
    WebElement lookingGlass;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp:value00::content']")
    WebElement itemNumber;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:efqrp::search")
    WebElement itemSearch;
//    @FindBy(xpath = "//span[contains(text(),'100063')]")
    @FindBy(xpath = "//span[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:0:effcpDescription::content']")
    WebElement baconSelect;
    @FindBy(xpath = "//span[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:1:effcpDescription::content']")
    WebElement chickenSelect;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:Popup1:0:Advan1:0:rstab:_ATp:table1:2:effcpDescription")
    WebElement fuelCharge;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:itemNumberId2:cb1")
    WebElement clickOk;
    @FindBy(xpath = "//span[contains(text(),'Add')]")
    WebElement addingItem;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:sdi2::icon")
    WebElement shippingDetails;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")
    WebElement requestType;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:id1::content']")
    WebElement requestDate;
    @FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:shipMethodId::content']")
    WebElement shippingMethod;
    @FindBy(xpath = "//span[@class='xrf'][contains(text(),'Save')]")
    WebElement save;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submit;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:createLineQuantity::content")
    WebElement addingQuantity;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:pc1:t1:c1")
    WebElement actionsToWarehouse;
    @FindBy(xpath = "//span[contains(text(),'Update Lines')]")
    WebElement updateLines;
    @FindBy(xpath = "//label[contains(text(),'Warehouse')]")
    WebElement warehouse;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:2:SP1:_selectAttribs::move")
    WebElement rightArrow;
    @FindBy(xpath = "//span[contains(text(),'ext')]")
    WebElement warehouseNext;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:t2:0:integerValueId::content")
    WebElement warehouseValue;
    @FindBy(xpath = "//span[contains(text(),'ave and Close')]")
    WebElement saveAndClose;
    @FindBy(id = "pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:3:SP2:cb1")
    WebElement warehouseYes;
    @FindBy(xpath = "//div[contains(text(),'The values provided for the combination of attributes 300000344363920,300000050628924 are invalid.')]")
    WebElement errorMessage;


    public CreateOrderFirstTestCase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void createOrder() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        Actions keyPress = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("groupNode_order_management_1")));
        orderManagementLink.click();
        Thread.sleep(1000);
        orderManagement.click();
        Thread.sleep(20000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='xrf']")));
        createOrder.click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")));
        businessUnit.click();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.xpath( "//select[@id='pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:soc3::content']")));
        select.selectByVisibleText("CFA Supply");
        Thread.sleep(3000);
        customer.click();
        Thread.sleep(3000);
        customer.sendKeys("Chapel Hill FSU");
        Thread.sleep(7000);
        orderType.click();
        Thread.sleep(7000);
        orderType.sendKeys("Hot Route Order");
        Thread.sleep(5000);

        lookingGlass.click();
        Thread.sleep(5000);
        itemNumber.sendKeys("100063");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        baconSelect.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
        addingItem.click();
        Thread.sleep(5000);

        lookingGlass.click();
        Thread.sleep(5000);
        itemNumber.sendKeys("102084");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        chickenSelect.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
        addingQuantity.clear();
        Thread.sleep(1000);
        addingQuantity.sendKeys("2");
        Thread.sleep(1000);
        addingItem.click();
        Thread.sleep(5000);

        lookingGlass.click();
        Thread.sleep(5000);
        itemNumber.sendKeys("999102");
        Thread.sleep(1000);
        itemSearch.click();
        Thread.sleep(5000);
        fuelCharge.click();
        Thread.sleep(3000);
        clickOk.click();
        Thread.sleep(7000);
        addingItem.click();
        Thread.sleep(5000);

        actionsToWarehouse.click();
        Thread.sleep(3000);
        updateLines.click();
        Thread.sleep(6000);
        warehouse.click();
        Thread.sleep(3000);
        rightArrow.click();
        Thread.sleep(1000);
        warehouseNext.click();
        Thread.sleep(4000);
        warehouseValue.click();
        Thread.sleep(1000);
        warehouseValue.sendKeys("GADC2 - GA DC2 Cartersville, GA");
        saveAndClose.click();
        Thread.sleep(4000);
        warehouseYes.click();
        Thread.sleep(4000);

        shippingDetails.click();
        requestType.click();
        Thread.sleep(2000);
        Select select1 = new Select(driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_order_management_order_management:0:_FOTsr1:1:AP1:r5:0:soc1::content")));
        select1.selectByVisibleText("Arrive on");
        Thread.sleep(3000);
        requestDate.clear();
        Thread.sleep(1000);
        requestDate.sendKeys("5/07/22 11:00 AM");
        Thread.sleep(1000);
        shippingMethod.click();
        Thread.sleep(3000);
        save.click();
        Thread.sleep(10000);
        submit.click();
        Thread.sleep(20000);
    }
}
