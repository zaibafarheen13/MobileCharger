package mobileChargerProject;

public class MultiMobileChargerAdapter extends MobileChargerAdapter {
    public MultiMobileChargerAdapter(NormalSocket120V socket120V, NormalSocket240V socket240V) {
        super(socket120V, socket240V);
    }

    public void chargeMobileAt5V() {
        // Adapt the voltage to 5V for mobile charging
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Adapting voltage to 5V for mobile charging");
        super.chargeMobile();
        System.out.println();
    }

    public void chargeMobileAt12V() {
        // Adapt the voltage to 12V for mobile charging
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Adapting voltage to 12V for mobile charging");
        super.chargeMobile();
        System.out.println();
    }
}

