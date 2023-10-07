package mobileChargerProject;

public class MobileChargerAdapter implements MobileCharger {
    private NormalSocket120V socket120V;
    private NormalSocket240V socket240V;

    public MobileChargerAdapter(NormalSocket120V socket120V, NormalSocket240V socket240V) {
        this.socket120V = socket120V;
        this.socket240V = socket240V;
    }

    @Override
    public void chargeMobile() {
        // Adapt the voltage to 3V for mobile charging
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Adapting voltage to 3V for mobile charging");
        socket120V.supplyPower120V(); // Use 120V socket
        socket240V.supplyPower240V(); // Use 240V socket
        System.out.println();
        System.out.println("Mobile charging complete.");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
    }
}

