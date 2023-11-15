import java.io.File;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GuessTheMovie {
    public static void main(String[] args) throws Exception {
        // Read the file
        File file = new File("movies.txt");
        Scanner fileScanner = new Scanner(file);
        // Ask the user for input
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 25);
        int lineCount = 0;
        String movie = null;

        // Pick a random movie title
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            lineCount += 1;

            if (lineCount == randomNumber) {
                movie = line;
            }
        }

        System.out.println(movie);


// Create dashes depending on the number of characters and a bigger space where the space belongs
        if (movie != null) {
            for (int i = 0; i < movie.length(); i++) {
                char currentChar = movie.charAt(i);

                if (currentChar == ' ') {
                    System.out.print("   ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }





            // If correct, replace the dash with the correct character
            // If wrong, reduce the number of guesses left
            // If guess correctly before end of tries, they win
        }
}