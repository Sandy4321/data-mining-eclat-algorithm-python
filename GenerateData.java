import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * Created by Aydin Rzayev on 4/21/2018.
 */
public class GenerateData {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("dataset4.txt", "UTF-8");
        // dataset will be generated in the location where this java file was run

        // This for loop will write 600 lines
        for(int i = 0; i < 600; i++){
            int random;
            // This random generator will create a RANDOM number (1 to 20) of items in each line
            random = getRandomNumberInRange(1, 20);
            writer.print(random); // writing the number of elements in line

            for(int j = 0; j < random; j++){
                // This random will put RANDOM number of products with ids from 1 to 30
                writer.print(" " + getRandomNumberInRange(1, 30));
            }
            // line break
            writer.println();
        }
        // writer closed
        writer.close();
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
