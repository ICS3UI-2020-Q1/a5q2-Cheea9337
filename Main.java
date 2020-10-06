import java.util.Scanner;
/**
 *
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    int userNum;

    do{
    // ask the user for a positive integer
    System.out.println("Please enter a positive integer");
    userNum = input.nextInt();
    } while(userNum <= 0);
    

    for(int count = 1; count <= userNum; count++){
      System.out.print(count);
    }
    
  }
}
