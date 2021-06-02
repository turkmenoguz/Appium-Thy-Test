package Elementler;

import io.appium.java_client.MobileElement;

public class LastPage extends Driver {

    public static MobileElement filtre = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_tvSortAndFilter");
    public static MobileElement fiyatFiltre = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/fr_booking_cbPrice");
    public static MobileElement filtreOnay = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFilterAndSort_btnApply");
    public static MobileElement ucusSecimi = (MobileElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
    public static MobileElement ucusTuru = (MobileElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
    public static MobileElement devamButon = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");

}
