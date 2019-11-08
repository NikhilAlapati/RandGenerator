import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Random number generator 0-9 uses 1 million digits of PI
 *
 * @author Nikhil Alapati
 */
public class Random {
    // a new array of 1 million elements
    private int[] arr = new int[1000000];
    private int counter = 0;
    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public Random() throws FileNotFoundException {
        counter = Integer.parseInt(sdf.format(cal.getTime()).substring(sdf.format(cal.getTime()).lastIndexOf(":") + 1));
        Scanner s = new Scanner(new File("pi.txt"));
        while (s.hasNext()) {
            String numbers = s.nextLine();
            for (int i = 0; i < numbers.length(); i++) {
                arr[i] = Integer.parseInt(numbers.substring(i, i + 1));
            }
        }
    }

    public int getRandom() {
        if (counter == arr.length) {
            counter = Integer.parseInt(sdf.format(cal.getTime()).substring(sdf.format(cal.getTime()).lastIndexOf(":") + 1));
        }
        counter++;
        return arr[counter - 1];
    }
}
