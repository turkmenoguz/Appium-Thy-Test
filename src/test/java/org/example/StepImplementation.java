package org.example;


import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepImplementation extends HookImp {

    @Step("<second> Saniye Bekle")
    public void waitElement(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }

    @Step("Bilet al butonuna tıkla <element>")
    public void biletAl1(String element) {

        driver.findElement(By.id(element)).click();
    }

    @Step("Id li <element> elemente tikla")
    public void clickElementById(String element) {
        driver.findElement(By.id(element)).click();
    }

    @Step("Idli <element> elementi bul ve <key> degeri yaz")
    public void sendKey(String element, String key) {
        driver.findElement(By.id(element)).sendKeys(key);
    }

    @Step("Xpath li <element> elemente tikla")
    public void clickElementByXpath(String element) {
        driver.findElement(By.xpath(element)).click();
    }

    @Step({"Uçuş liste kontrol et"})
    public void listControl() {
        Assert.assertTrue("com.turkishairlines.mobile:id/frFlightSearch_rvFlight", true);
    }


/*
    @Step("<second> Saniye Bekle")
    public void waitElement(int second) throws InterruptedException {
        Thread.sleep(second*1000);
    }

    @Step("Id li <element> elemente tikla")
    public void clickElementById(String element){

        driver.findElement(By.id(element)).click();
    }

    @Step("Cerezleri kabul ete bas")
    public void cerezKabul(){
        cookieAccept.click();
    }

    @Step({"Bilet al basılır"})
    public void biletAlı(){
        booking.click();
    }

    @Step("Tek yon seçilir")
    public void tekYon(){
     tekYon.click();
    }

    @Step("Kalkış yapılacak havaalanı seçilir")
    public void kalkısHavaalanı(){
        havaalanıSec.click();
    }

    @Step("Arama butonuna <key> yazılır")
    public void aramaButonu(String key){
        aramaButton.sendKeys(key);
    }

    @Step("Kalkış havaalanı alt listeden onaylanır")
    public void listeOnay(){
        onay.click();
    }


    @Step("İniş yapılacak havaalanı seçilir")
    public void inishavalanı(){
        nereye.click();
    }

    @Step("İnilecek havaalanı alt listeden onaylanır")
    public void inisOnay(){
        nereyeOnay.click();
    }

    @Step("Tarih seçimi için tarihe basılır.")
    public void tarih(){
        tarihSecimi.click();
    }

    @Step("Gün seçimi yapılır")
    public void gunSecimi(){
        gunSecimi.click();
    }

    @Step("Kişi sayısı arttırılır")
    public void kisiSayisi(){
        kisiSayısıArttır.click();
    }

    @Step("Uçuş aranır")
    public void uygunUcusAra(){
        ucusAra.click();
    }

    @Step("Fiyat sıralaması için filtreye basılır")
    public void filtre(){
        filtre.click();
    }

    @Step("Fiyata göre listelenir")
    public void uygunFiyat(){
        fiyatFiltre.click();
    }


    @Step("Filtre onayı için tamam basılır")
    public void filtreOnay(){
        filtreOnay.click();
    }

    @Step("Uçuş seçimi yapılır")
    public void ucusSecimiYap(){
        ucusSecimi.click();
    }
    @Step("Uygun ucuş türü seçilir")
    public void ucusTuru(){
        ucusTuru.click();
    }

    @Step("devam butonun basilir")
    public void devamButonuBas(){
        devamButon.click();
    }

*/

}