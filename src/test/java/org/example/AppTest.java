package org.example;
import java.net.MalformedURLException;
import java.net.URL;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.remote.*;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    public void main(String [] argns) throws MalformedURLException {

        Firstest();
    }

    @Test
    public void Firstest() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "iOS");
        cap.setCapability("platformVersion", "15.5");
        cap.setCapability("deviceName", "iPhone 11");
        cap.setCapability("automationName", "XCUITest");
        cap.setCapability("app", "/Users/phamquanghuy/Downloads/ios-uicatalog-master/UIKitCatalog/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        IOSDriver driver = new IOSDriver(url, cap);
        System.out.println("Success");
    }
}
