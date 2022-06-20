package parallel_test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class pharmacy {
    @Test
    public void pharmacy() throws InterruptedException {
        AppiumDriver<MobileElement> driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        // set account and app url
        cap.setCapability("app", "bs://14441978112bf040038ac8ec2b7baf8bf6b4fc25");
        cap.setCapability("browserstack.user", "hongphmnht_867wko");
        cap.setCapability("browserstack.key", "zJNtdj3Fi5ZHmiGcWoBY");
        // Specify device and os_version for testing
        cap.setCapability("device", "Samsung Galaxy S10e");
        cap.setCapability("os_version", "9.0");
        // Set other BrowserStack capabilities
        cap.setCapability("project", "First Java Project");
        cap.setCapability("build", "Java Android");
        cap.setCapability("name", "first_test");
        cap.setCapability("browserstack.networkLogs", "true");
        try {
            URL url = new URL("http://hub.browserstack.com/wd/hub");
            driver = new AndroidDriver<MobileElement>(url, cap);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("[ERR] Could not create new session");
        }
        MobileElement pharmacy2 = driver.findElementById("xyz.medigo.pharmacy:id/login_phar_code");
        pharmacy2.sendKeys("cuongmedi");
        MobileElement pharmacy3 = driver.findElementById("xyz.medigo.pharmacy:id/continue_button");
        pharmacy3.click();
        MobileElement pharmacy4 = driver.findElementById("xyz.medigo.pharmacy:id/login_email");
        pharmacy4.sendKeys("lalala@gmail.com");
        MobileElement pharmacy5 = driver.findElementById("xyz.medigo.pharmacy:id/login_password");
        pharmacy5.sendKeys("123123");
        MobileElement pharmacy6 = driver.findElementById("xyz.medigo.pharmacy:id/login_button");
        pharmacy6.click();

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById("xyz.medigo.pharmacy:id/btn_accept")));
        MobileElement pharmacy7 = driver.findElementById("xyz.medigo.pharmacy:id/btn_accept");
        pharmacy7.click();
        MobileElement pharmacy8 = driver.findElementById("xyz.medigo.pharmacy:id/button_call_free");
        pharmacy8.click();
        MobileElement pharmacy9 = driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        pharmacy9.click();

        Thread.sleep(5000);

        MobileElement pharmacy10 = driver.findElementById("xyz.medigo.pharmacy:id/audio_btn_end");
        pharmacy10.click();
        MobileElement pharmacy11 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.TextView");
        pharmacy11.click();

        MobileElement pharmacy12 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView");

        Thread.sleep(500);
        swipeElementAndroid(pharmacy12,"RIGHT", (AndroidDriver) driver, 800);

        MobileElement pharmacy13 = driver.findElementById("xyz.medigo.pharmacy:id/btn_yes");
        pharmacy13.click();
        MobileElement pharmacy14 = driver.findElementById("xyz.medigo.pharmacy:id/tvViewOrder");
        pharmacy14.click();

        Thread.sleep(500);
        driver.navigate().back();
        driver.quit();
    }

    public static void swipeElementAndroid(MobileElement el, String dir, AndroidDriver driver, int s) {
        final int ANIMATION_TIME = 500; // ms

        final int PRESS_TIME = 500; // ms
        Rectangle rect = el.getRect();
        PointOption pointOptionStart, pointOptionEnd;
        pointOptionStart = PointOption.point(rect.x, rect.y);
        switch (dir) {
            case "DOWN": // from up to down
                pointOptionEnd = PointOption.point(rect.x , rect.y - s);
                break;
            case "UP": // from down to up
                pointOptionEnd = PointOption.point(rect.x , rect.y + s);
                break;
            case "LEFT": // from right to left
                pointOptionEnd = PointOption.point(rect.x - s, rect.y);
                break;
            case "RIGHT": // from left to right
                pointOptionEnd = PointOption.point(rect.x + s, rect.y);
                break;
            default:
                throw new IllegalArgumentException("swipeElementAndroid(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeElementAndroid(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}


