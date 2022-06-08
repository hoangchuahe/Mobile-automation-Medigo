package env;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class mainlogin {
    public static AppiumDriver<MobileElement> getDriver(String uid, String app, String action){
        AppiumDriver<MobileElement> driver;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("udid", uid);
        cap.setCapability("appPackage", app);
        cap.setCapability("appActivity", action);
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url, cap);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("[ERR] Could not create new session");
        }
        return driver;
    }


}
