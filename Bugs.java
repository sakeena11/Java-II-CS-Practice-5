/**
  * Bugs.java
  * @description Generates "Bugs in the code" song
  * @author Sakeena Younus
  * @version 1.0 2022-01-31
*/
import java.util.Scanner;

public class Bugs {
  //_____attributes_____
  private int bugs;
  private Scanner scan = new Scanner(System.in);
  //_____methods_____

  /** constructor */
  public Bugs() {

  }

  public void setBugs() {
    System.out.println("Hi! What's your name?");
    String s = scan.nextLine(); //taking input from user as a String
    System.out.println("Hi " + s + "!");
    System.out.println("How many bugs do you have?");
    bugs = scan.nextInt();
    scan.nextLine(); //get rid of lurking new line character
  }

  public void printSong() {
    while(bugs > 0) {
      bugs--;
      switch(bugs) {
        case 1:
        System.out.println("There are " + bugs + " bugs in my code today,\n" + bugs +
                        " bug in my code");
        System.out.println("I found one and I solved it.");
          System.out.println("Now there are no bugs in my code today.");
          break;

        case 2:
            System.out.println("There are " + bugs + " bugs in my code today,\n" + bugs +
                        " bug in my code");
            System.out.println("I found one and I solved it.");
            System.out.println("Now there is 1 bug in my code today.");
            System.out.print("Press enter to continue");
            scan.nextLine();
            break;

          default:
            System.out.println("There are " + bugs + " bug in my code today,\n" + bugs +
                                " bug in my code");
            System.out.println("Now there are " + bugs + " bugs in my code.");
            System.out.println("There are " + bugs + " bugs in my code today,\n" + bugs +
                                " bugs in my code");
            System.out.println("I found one and I solved it.");
            System.out.print("Press enter to continue");
            scan.nextLine();
      }  // end of switch statement
    } //end of while loop
  } //end of printSong method


  public static void main(String[] args) {
    Bugs myBugs = new Bugs();
    myBugs.setBugs(); // calls setBugs
    myBugs.printSong(); // calls song

  } // end main method


} //end of class
