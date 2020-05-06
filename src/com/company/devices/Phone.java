package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    private static final String DEFAULT_APP_SERVER = "https://myappstore.com";
    private static final String DEFAULT_PROTOCOL = "https";
    private static final Integer DEFAULT_PORT = 443;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("hello, your battery is 2%");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price) {
            if (seller.phone == this) {
                buyer.phone = this;
                seller.phone = null;
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("Transaction closed, phone " + this + " sold to " + buyer.firstName);
            } else {
                throw new Exception("cannot sell stolen phones :| ");
            }
        } else {
            throw new Exception("not enough money man");
        }
    }


    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    public void installAnApp(String appName) throws MalformedURLException {
        installAnApp(appName, "latest");
    }

    public void installAnApp(String appName, String version) throws MalformedURLException {
        URL url = new URL(DEFAULT_PROTOCOL,
                DEFAULT_APP_SERVER,
                DEFAULT_PORT,
                appName + "-" + version);
        installAnApp(url);
    }

    public void installAnApp(URL url) {
        // autoryzacja do serwera
        // sprawdzenie stanu konta
        // sprawdzenie uprawnień użytkownika
        // ew. płatność
        // pobranie
        // weryfikacja aplikacji
        // instalacja
        // komunikacja z użytkownikiem
        // obsługa ewentualnych problemów

        System.out.println("app " + url.getFile() + " was installed");

    }
}
