package env;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class mainlogin {
    public static AppiumDriver<MobileElement> getDriver(String device, String app, String version){
        AppiumDriver<MobileElement> driver;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", app);
        // Specify device and os_version for testing
        cap.setCapability("device", device);
        cap.setCapability("os_version", version);
        // Set other BrowserStack capabilities
        cap.setCapability("project", "First Java Project");
        cap.setCapability("build", "Java Android");
        cap.setCapability("name", "first_test");
        cap.setCapability("browserstack.user", "hongphmnht_867wko");
        cap.setCapability("browserstack.key", "zJNtdj3Fi5ZHmiGcWoBY");
        try {
            URL url = new URL("http://hub.browserstack.com/wd/hub");
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
