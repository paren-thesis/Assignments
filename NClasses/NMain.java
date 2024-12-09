import javax.swing.JOptionPane;

public class NMain {
    public static Object input;
    private double principal;
    private double time;
    private double rate;

    public NMain(double principal, double time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;

    }
    
    public NMain() {

    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void  getSimpleInterest() {
        double simpleInterest = (principal * time * rate) / 100;
        String result = String.format("The simple interest calculated for the principal amount of GHC%5.2f\nAnd at a rate of %5.2f percent\nWith a %5.1f years period is GHC %5.2f", getPrincipal(), getRate(), getTime(), simpleInterest);
        JOptionPane.showMessageDialog(null, result, "Output", 1);
        
    }

}
