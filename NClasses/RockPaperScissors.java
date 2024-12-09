import java.util.Random;

public class RockPaperScissors {
    private String mchoice;

    public RockPaperScissors() {

    }

    public RockPaperScissors(String mchoice) {
        this.mchoice = mchoice;
    }

    public String getMchoice() {
        Random rand = new Random();

        int chose = rand.nextInt(2);

        switch (chose) {
            case 0:
                mchoice = "Rock";
                break;
            case 1:
                mchoice = "Paper";
                break;
            case 2:
                mchoice = "Scissors";
            default:
                mchoice = null;
                break;
        }
        return mchoice;
    }

    public void setMchoice(String mchoice) {
        this.mchoice = mchoice;
    }


    
}
