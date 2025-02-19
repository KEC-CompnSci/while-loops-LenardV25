
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      String repeated = repeatWord("", 0);
      System.out.println(repeated);
      String pyramid = createPyramid(0);
      String FizzBuzz = countTo(3);
      
    }
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
       
        // TODO: Implement this method
        // Use a while loop to build a string that repeats the word
        // Words should be separated by single spaces
        // No trailing space at the end

        //System.out.println("Give a a phrase to repeat?");
        //word = scanner.nextLine();

        //System.out.println("Repeat how many times?");
        //times = scanner.nextInt();
        String sentence = word;
        if (times == 0 ) {
            return "";
        }
        while (times > 1) {
            //System.out.print(word + " ");
            sentence = sentence + " " + word;
            times--;
        }
        return sentence;
    
    }
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
        // TODO: Implement this method
        // Use nested while loops:
        // - Outer loop for each row
        // - Inner loop to repeat the number
        // Use \n for newlines
        //System.out.println("What's the height of this pyramid?" );
        //maxNumber = scanner.nextInt();
        int inner = 1;     
        int inside = 1 ;


        while (inner <= maxNumber) {
            int digits = 1;

            while (digits <= inner) {
                //System.out.print(inner+ " ");
                inside = inner;
                digits++;

            }
            System.out.print("\n");
            inner++;

        }
    }
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        // TODO: Implement this method
        // Use a while loop
        // Use string concatenation
        // Numbers/words should be separated by spaces
        // No trailing space at the end

        //System.out.println("How high do you wish to count?");
        //maxNumber = scanner.nextInt();
        int count = 1;
        
        String both = "FizzBuzz";
        String buzz = "Buzz";
        String fizz = "Fizz";


        while (count <= maxNumber) {
            if (count % 15 == 0) {
                //System.out.print("FizzBuzz" + " ");
                count++;
                return both + " ";
                
            }
            else if (count % 5 == 0) {
                //System.out.print("Buzz" + " ");
                count++;
                return buzz + " ";

            }
            else if (count % 3 == 0 ) {
                //System.out.print("Fizz" + " ");
                count++;    
                return fizz + " ";

            }
            else {
                //System.out.print(count + " ");
                count++;
                 

            }
        count++;
        }
        

    }
    
  
}