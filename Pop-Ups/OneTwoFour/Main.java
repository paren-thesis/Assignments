public class Main {
    public static void main(String[] args) {
        RanGenVal rgVal = new RanGenVal();

        System.out.println("Airtime: " + rgVal.rAirtime());
        System.out.println("SMS Units: " + rgVal.rSMS());
        System.out.println("Voice Time: " + rgVal.rVoice());
        
        // Optional: Display all default values without random generation
        rgVal.setGenerateRandom(false); // Disable random generation
        rgVal.setAirtime(20.00);
        rgVal.setSMSunits(50.00);
        rgVal.setVoice(120.00);

        System.out.println("\n[Non-Random Values]");
        System.out.println("Airtime: " + rgVal.rAirtime());
        System.out.println("SMS Units: " + rgVal.rSMS());
        System.out.println("Voice Time: " + rgVal.rVoice());
    }
}
