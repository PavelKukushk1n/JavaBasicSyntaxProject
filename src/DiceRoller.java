import java.util.Random;

public class DiceRoller {

    void roll() {
        Random random = new Random();
        int number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
