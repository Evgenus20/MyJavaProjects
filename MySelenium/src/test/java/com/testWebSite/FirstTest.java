package com.testWebSite;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver_win32");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/?gl=UA&hl=ru");
    }
}
