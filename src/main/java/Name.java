/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Name {

    public static void main(String[] args ){
        //creating object for scanner for input from the user
        Scanner scanner = new Scanner(System.in);
        //prompting the user to input their name
        System.out.println("Hello! What is your name? ");
        //when user inputs their name, it will go to next line and save to
        //the string "name"
        String name = scanner.nextLine();
        //declaring the variable to name.toLowerCase() will make it so even if the user
        //uses lower case to input their name or upper case, the input will be accepted and return
        //true since it will return lower case no matter the users camile casing
        name = name.toLowerCase();

        while (true){
            //using the equal. method to test strings for equality instead of "=="
            if (name.equals("alice") || name.equals("bob")) {
                System.out.println("Hello " +name+ "! Welcome back.");
                break;
            } else {
                System.out.println("Sorry, you are not Alice nor Bob! Program will now shut down.");
                //This quits/exits the program
                System.exit(0);
            }
        }
    }
}
