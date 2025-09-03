import java.util.Scanner;

/**
 * My solution to the "Find the Minimum" problem.
 * The program reads an integer N followed by N integers,
 * and prints the smallest one.
 *
 * I tested it with a few inputs and it seems to work fine.
 * If there's a better way to handle large numbers, I'm open to suggestions!
 */
public class MinimumFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First, read how many numbers we are going to process
        int n = scanner.nextInt();

        // I decided to assume the first number is the smallest for now
        long min = scanner.nextLong();

        // Now we loop through the rest of the numbers
        for (int i = 1; i < n; i++) {
            long currentNumber = scanner.nextLong();

            // If we find a smaller number, we update our 'min'
            if (currentNumber < min) {
                min = currentNumber;
            }
        }

        // Finally, we print the smallest number found
        System.out.println(min);

        // Always good to close the scanner
        scanner.close();
    }
}