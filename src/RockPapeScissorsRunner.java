import javax.swing.*;

public class RockPapeScissorsRunner {


    public enum RPSChoice {
        ROCK(new ImageIcon(RPSChoice.class.getResource("rock.png"))),
        PAPER(new ImageIcon(RPSChoice.class.getResource("paper.png"))),
        SCISSORS(new ImageIcon(RPSChoice.class.getResource("scissors.png")));

        private ImageIcon imgChoice;

        private RPSChoice(ImageIcon imgChoice) {
            this.imgChoice = imgChoice;
        }

        public ImageIcon getImageIcon(){
            return imgChoice;
        }

        public static void evaluate(){
            //TODO
        }

        public static RPSChoice randomChoice(){
            return values()[(int) (Math.random() * values().length)];
        }
    }
}
