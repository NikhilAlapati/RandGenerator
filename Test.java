import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Random r = new Random();
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ct = 0;
        int r2 = 0;
        while (ct < 1000) {
            r2 = r.getRandom();
            if (r2 == 0) {
                zero++;
            }
            if (r2 == 1) {
                one++;
            }
            if (r2 == 2) {
                two++;
            }
            if (r2 == 3) {
                three++;
            }
            if (r2 == 4) {
                four++;
            }
            if (r2 == 5) {
                five++;
            }
            if (r2 == 6) {
                six++;
            }
            if (r2 == 7) {
                seven++;
            }
            if (r2 == 8) {
                eight++;
            }
            if (r2 == 9) {
                nine++;
            }
            ct++;
        }
        System.out.println(zero + " " + one + " " + two + " " + three + " " + four + " " + five + " " + six + "\n" + seven
                + " " + eight + " " + nine);


    }
}
