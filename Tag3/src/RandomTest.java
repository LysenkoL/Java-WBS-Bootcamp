import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
       /* java.util.Random zeitabhaengigerSchlussel = new java.util.Random();
        System.out.println(zeitabhaengigerSchlussel.nextInt());
        System.out.println(zeitabhaengigerSchlussel.nextInt());

        java.util.Random festgelegtenschlussel = new java.util.Random(123123);
        System.out.println(festgelegtenschlussel.nextInt());
        System.out.println(festgelegtenschlussel.nextInt());

        System.out.println(Math.random());
*/

        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));


    }



}