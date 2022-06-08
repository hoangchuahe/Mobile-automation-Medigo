package parallel_test;

import env.mainlogin;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class user {
    @Test
    public void test1() throws InterruptedException {
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
