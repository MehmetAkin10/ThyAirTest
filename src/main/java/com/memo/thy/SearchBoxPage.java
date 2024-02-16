package com.memo.thy;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBoxPage extends BasePage {
    By searchBoxBy = By.cssSelector("input[id='general-booker-to']");
    By searchBoxBy2 = By.xpath("//div[@class='port-list-wrapper-item-text multi']");
    By searchBoxScroll = By.cssSelector("li>a[href='https://www.turkishairlines.com/tr-int/arac-kiralama/']");
    By OneWayBy = By.id("one-way");
    By DatesBy = By.xpath("//div[1]/span[@class='date-view date-view-text-cell']");
    By DateScroll = By.xpath("//img[@src='https://cdn.turkishairlines.com/m/16a1746c7150923a/original/touristanbul.jpg']");
    By SelectDate = By.xpath("//div[4]//div[@class='vc-day id-2024-03-01 day-1 day-from-end-31 weekday-6 weekday-position-5 weekday-ordinal-1 weekday-ordinal-from-end-5 week-1 week-from-end-5 is-first-day in-month on-top vc-day-box-center-center']");
    By searchBoxTamam = By.xpath("//div[@class='right-panel']//button[@class='button']");

    By searchBoxUcus= By.xpath("//span[text()='Uçuş ara']");

    public SearchBoxPage(WebDriver driver) {
        super(driver);
    }

    public void DateClick(){
        click(DatesBy,50);
        //scrollWithAction();
        click(SelectDate,50);
    }

    public void searchCityClick(){
        click(searchBoxBy,10);
    }

    public void OneWayClick(){
        click(OneWayBy,10);
    }

    public void searchBox(String keyword) {
        driver.findElement(searchBoxBy).sendKeys(keyword);
        //scrollWithAction(searchBoxScroll);
    }

    public void CityScroll(){
        scrollWithAction(searchBoxScroll);

    }
    public void searchIstanbulClick(){
        click(searchBoxBy2,10);
    }

    public void searchTamamClick(){
        click(searchBoxTamam,10);

        click(searchBoxUcus,10);

    }


    //public void clickOverlay() {
    //}
}

