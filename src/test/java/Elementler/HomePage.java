package Elementler;

import io.appium.java_client.MobileElement;

public class HomePage extends Driver {

    public static MobileElement cookieAccept = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frPrivacy_btnAccept");
    public static MobileElement booking = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/acMain_btnBooking");

}
