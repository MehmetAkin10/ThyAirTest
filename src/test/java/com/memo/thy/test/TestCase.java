package com.memo.thy.test;

import com.memo.thy.MainPage;
import com.memo.thy.Methods.Methods;
import com.memo.thy.SearchBoxPage;
import com.memo.thy.driver.BaseTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestCase extends BaseTest {



    @Test
    public void ThyTest(){
        Methods methods = new Methods();


        String title = "Türk Hava Yolları ® | Dünyanın En Çok Ülkesine Uçan Havayolu";
        String location ="Istanbul";

        MainPage mainPage = new MainPage(driver);
        String webDriverTitle = mainPage.getHomePageTitle();
        Assert.assertEquals(webDriverTitle, title);
        mainPage.getLoginPage(); //Pop-up kapatma

        SearchBoxPage searchBoxPage = new SearchBoxPage(driver);

        searchBoxPage.OneWayClick();
        searchBoxPage.searchCityClick();
        searchBoxPage.searchBox(location);
        /*
        WebElement searchButton = driver.findElement(By.cssSelector("li>a[href='https://www.turkishairlines.com/tr-int/arac-kiralama/']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)", searchButton);

         */
        searchBoxPage.CityScroll();
        methods.waitBySeconds(1);
        searchBoxPage.searchIstanbulClick();
        searchBoxPage.DateClick();
        //searchBoxPage.searchTamamClick();
        System.out.println("New Branch Fixes");





    }


}
