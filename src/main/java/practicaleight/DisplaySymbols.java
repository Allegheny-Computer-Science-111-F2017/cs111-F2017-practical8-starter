package practicaleight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 * The DisplaySymbols class will input a symbol and a count and create a
 * symbolic triangular display in the terminal window.
 **/

public class DisplaySymbols {

  /**
   * Display the symbol in a single triangle.
   **/
  public static void displaySymbolInTriangle(int maximumRows, String symbol) {
    // TODO: Add a full implementation of this method, leveraging
    // the source code that is provided from the textbook
  }

  /**
   * Display the symbol in a double triangle.
   **/
  public static void displaySymbolInDoubleTriangle(int maximumRows, String symbol) {
    // TODO: Add a full implementation of this method, leveraging the
    // source code from the displaySymbolInTriangle method and your knowledge
    // of iteration constructs, especially the for loop
  }

  /**
   * Perform user input and display the symbols correctly. Note that this
   * program will display the symbol in a single triangle and a double triangle.
   * The program will also display output about reading from the file.
   **/
  public static void main(String[] args) {

    // Step One: Declare the symbolting file and scanner
    File symbolsInputFile = null;
    Scanner scanner = null;

    // Step Two: Connect the scanner to the input file
    try {
      symbolsInputFile = new File("inputs/symbols_input.txt");
      scanner = new Scanner(symbolsInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the file.");
    }

    // Step Three: Display a welcome message
    System.out.println("Gregory M. Kapfhammer " + new Date());
    System.out.println();

    // Step Four: Read in the symbol from the file
    System.out.println("I will read in a symbol from a file.");
    String chosenSymbol;
    chosenSymbol = scanner.nextLine();
    System.out.println("Okay, I read in the symbol " + chosenSymbol + ".");
    System.out.println();

    // Step Five: Read in the number of symbols from the file
    System.out.println("I will read in the number of rows from a file.");
    int chosenRows;
    chosenRows = scanner.nextInt();
    System.out.println("Okay, I read in the row count of " + chosenRows + ".");
    System.out.println();

    // Step Six: Call a method to display the single triangular shape
    System.out.println("Now, I will display a single triangle.");
    System.out.println();
    displaySymbolInTriangle(chosenRows, chosenSymbol);
    System.out.println();

    // Step Seven: Call a method to display the double triangular shape
    System.out.println("Now, I will display a double triangle.");
    System.out.println();
    displaySymbolInDoubleTriangle(chosenRows, chosenSymbol);

    // Step Eight: Display the closing message
    System.out.println();
    System.out.print("Thank you for using the DisplaySymbols program.");
  }

}
