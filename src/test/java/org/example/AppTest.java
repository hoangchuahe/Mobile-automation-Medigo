package org.example;

import env.mainlogin;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;


public class AppTest {

    public static void main(String [] args) throws InterruptedException {

    }

    @Test
    public void user() throws InterruptedException {
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
    @Test
    public void phamacy() throws InterruptedException {
        AppiumDriver<MobileElement> user = mainlogin.getDriver("emulator-5554", "xyz.medigo.user", "xyz.medigo.user.ui.login.LoginActivity");
        //Thread.sleep(1000);
        MobileElement e4 = (MobileElement) user.findElementById("xyz.medigo.user:id/edtPhoneNumber");
//        el4.click();
        e4.sendKeys("0848226326");
        MobileElement e5 = (MobileElement) user.findElementById("xyz.medigo.user:id/btnGetSMSCode");
        e5.click();
        MobileElement e6 = (MobileElement) user.findElementById("xyz.medigo.user:id/txt_pin_entry");
        e6.click();
        e6.sendKeys("123456");
        MobileElement e7 = (MobileElement) user.findElementById("xyz.medigo.user:id/btnVerifySMSCode");
        e7.click();
        //Thread.sleep(1000);
        MobileElement e8 = (MobileElement) user.findElementById("xyz.medigo.user:id/tv_allow_location");
        e8.click();
        MobileElement e9 = (MobileElement) user.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        e9.click();
    }
}
