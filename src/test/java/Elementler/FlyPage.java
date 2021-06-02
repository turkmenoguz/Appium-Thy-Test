package Elementler;

import io.appium.java_client.MobileElement;

public class FlyPage extends  Driver{

    public static MobileElement tekYon = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    public static MobileElement havaalanıSec = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
    public static MobileElement aramaButton = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    public static MobileElement onay = (MobileElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    public static MobileElement nereye = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvToCode");
    public static MobileElement nereyeOnay = (MobileElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    public static MobileElement tarihSecimi = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
    public static MobileElement gunSecimi = (MobileElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
    public static MobileElement tarihOnay = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
    public static MobileElement kisiSayısıArttır = (MobileElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
    public static MobileElement ucusAra = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");

}
