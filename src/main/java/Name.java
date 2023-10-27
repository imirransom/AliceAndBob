/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Name {

    public static void main(String[] args ){
        //creating object for scanner for input from the user


        while (true){
            //The scanner object and user inputs are placed inside the while loop so that it will
            //continuously loop if the user answers wrong and until the user meets the other two conditions
            //if placed outside the loop, the control flow will not work as intended and will create
            // an undesired infinite loop
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
            //using the equal. method to test strings for equality instead of "=="
            if (name.equals("alice") || name.equals("bob")) {
                System.out.println("Hello " +name+ "! Welcome back.");
                break;
            } else if (name.equals("quit")) {
                System.out.println("Ok, system will now shut down.");
                //This quits/exits the program
                System.exit(0);
            }else {
                System.out.println("Sorry, you are not Alice nor Bob! \nPlease bring Alice or Bob. Otherwise, input \"quit\"");

            }
        }
    }
}
