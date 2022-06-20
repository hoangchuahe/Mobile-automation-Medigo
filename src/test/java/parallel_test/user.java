package parallel_test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class user {
    @Test
    public void user_test() throws InterruptedException {
        AppiumDriver<MobileElement> user;
        DesiredCapabilities cap = new DesiredCapabilities();
        // set account and app url
        cap.setCapability("app", "bs://d6ad265a7932455175b7a286c022817eab8f36ec");
        cap.setCapability("browserstack.user", "hongphmnht_rEBk4M");
        cap.setCapability("browserstack.key", "NJmuSSqNFNnRb4u8feqJ");
        // Specify device and os_version for testing
        cap.setCapability("device", "Google Pixel 4");
        cap.setCapability("os_version", "11.0");
        // Set other BrowserStack capabilities
        cap.setCapability("project", "First Java Project");
        cap.setCapability("build", "Java Android");
        cap.setCapability("name", "first_test");
        cap.setCapability("browserstack.networkLogs", "true");
        try {
            URL url = new URL("http://hub.browserstack.com/wd/hub");
            user = new AndroidDriver<MobileElement>(url, cap);
            user.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("[ERR] Could not create new session");
        }

        MobileElement user2 = user.findElementById("xyz.medigo.user:id/edtPhoneNumber");
        user2.sendKeys("0987654321");
        MobileElement user3 = user.findElementById("xyz.medigo.user:id/btnGetSMSCode");
        user3.click();
        MobileElement user4 = user.findElementById("xyz.medigo.user:id/txt_pin_entry");
        user4.sendKeys("123456");
        MobileElement user5 = user.findElementById("xyz.medigo.user:id/btnVerifySMSCode");
        user5.click();
        MobileElement user6 = user.findElementById("xyz.medigo.user:id/tv_allow_location");
        user6.click();
        MobileElement user7 = user.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        user7.click();

        MobileElement user8 = user.findElementById("xyz.medigo.user:id/home_address_location");
        user8.click();
        MobileElement user9 = user.findElementById("xyz.medigo.user:id/tv_address");
        user9.click();
        MobileElement user10 = user.findElementById("xyz.medigo.user:id/action_done");
        user10.click();
        MobileElement user11 = user.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView");
        user11.click();
        MobileElement user12 = user.findElementById("xyz.medigo.user:id/imgIconClose");
        user12.click();

        MobileElement user13 = user.findElementById("xyz.medigo.user:id/tvSearch");
        user13.click();
        MobileElement user14 = user.findElementById("xyz.medigo.user:id/edtSearch");
        user14.sendKeys("do");
        Thread.sleep(500);
        user.navigate().back();
        MobileElement user141 = user.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"999,999 đ/lọ\"))"));
        user141.click();
        MobileElement user142 = user.findElementById("xyz.medigo.user:id/tvBuyNow");
        user142.click();

        MobileElement user20 = user.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]");
        user20.click();
        MobileElement user21 = user.findElementById("xyz.medigo.user:id/tvNext");
        user21.click();
        MobileElement user22 = user.findElementById("xyz.medigo.user:id/tvOrderSucessView");
        user22.click();

        WebDriverWait wait = new WebDriverWait(user, 30);
        wait.until(ExpectedConditions.visibilityOf(user.findElementById("com.android.permissioncontroller:id/permission_allow_button")));
        MobileElement user23 = user.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        user23.click();
        MobileElement user24 = user.findElementById("xyz.medigo.user:id/audio_btn_answer");
        user24.click();

        WebDriverWait wait2 = new WebDriverWait(user, 30);
        wait2.until(ExpectedConditions.visibilityOf(user.findElementById("xyz.medigo.user:id/shipper_number")));
        user.navigate().back();
        MobileElement user26 = user.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup");
        user26.click();
        user.quit();
    }
}
