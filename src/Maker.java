
import java.util.Random;

public class Maker {
    public static void main(String[] args) {
        int max = 48;
        int min = 1;
        Random random = new Random();

        int s = random.nextInt(max)%(max-min+1) + min;
        System.out.println(s);
    }
}

