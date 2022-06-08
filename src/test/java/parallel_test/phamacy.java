package parallel_test;

import env.mainlogin;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class phamacy {
    @Test
    public void test1() throws InterruptedException {
        AppiumDriver<MobileElement> driver = mainlogin.getDriver("emulator-5556", "xyz.medigo.pharmacy", "xyz.medigo.pharmacy.ui.login.loginpharcode.LoginPharCodeActivity");
        MobileElement el2 = (MobileElement) driver.findElementById("xyz.medigo.pharmacy:id/login_phar_code");
        el2.click();
        el2.sendKeys("cuongmedi");
        MobileElement el3 = (MobileElement) driver.findElementById("xyz.medigo.pharmacy:id/continue_button");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("xyz.medigo.pharmacy:id/login_email");
        el4.sendKeys("lekubin00@gmail.com");
        MobileElement el5 = (MobileElement) driver.findElementById("xyz.medigo.pharmacy:id/login_password");
        el5.click();
        el5.sendKeys("lekubin00");
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceIdMatches(\".*login_button.*\"))"));
        el7.click();

    }
}


