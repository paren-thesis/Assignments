import java.util.Random;

public class RanGenVal extends Values {
    private Random gen = new Random();
    private boolean generateRandom = true;

    public boolean isGenerateRandom() { return generateRandom; }
    public void setGenerateRandom(boolean generateRandom) { this.generateRandom = generateRandom; }

    public RanGenVal() {
        super(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    public RanGenVal(double airtime, double SMSunits, double voice, double Just4You, double bundle, double borrowed) {
        super(airtime, SMSunits, voice, Just4You, bundle, borrowed);
    }

    public String rAirtime() {
        if (isGenerateRandom() && getAirtime() == 0.00) {
            double number = gen.nextDouble() * 300;
            return String.format("GHC%5.2f", number);
        } else {
            return String.format("GHC%5.2f", getAirtime());
        }
    }

    public String rSMS() {
        if (isGenerateRandom() && getSMSunits() == 0.0) {
            int number = gen.nextInt(2000) + 1;
            return String.format("SMS: %d", number);
        } else {
            return String.format("SMS: %.0f", getSMSunits());
        }
    }

    public String rVoice() {
        if (isGenerateRandom() && getVoice() == 0.0) {
            int number = gen.nextInt(200) + 1;
            return String.format("Voice: %d minutes", number);
        } else {
            return String.format("Voice: %.0f minutes", getVoice());
        }
    }
}
