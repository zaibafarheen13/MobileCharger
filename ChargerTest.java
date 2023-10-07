package mobileChargerProject;

public class ChargerTest {
    public static void main(String[] args) {
        NormalSocket120V socket120V = new NormalSocket120V();
        NormalSocket240V socket240V = new NormalSocket240V();

        MobileCharger mobileCharger = new MobileChargerAdapter(socket120V, socket240V);
        mobileCharger.chargeMobile();

        MultiMobileChargerAdapter multiCharger = new MultiMobileChargerAdapter(socket120V, socket240V);
        multiCharger.chargeMobileAt5V();
        multiCharger.chargeMobileAt12V();
    }
}

