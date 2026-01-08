import java.util.Random;


public class RandomBeispiel {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("10 zufällige Ganzzahlen zwischen 1 und 100: ");
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println(randomNumber);

        }
    }
}
