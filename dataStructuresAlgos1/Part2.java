import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Part2 {
    public static void main(String[] args) {
        // Add scanner for future user input
        Scanner scanner = new Scanner(System.in);

        // Create a hash map which will store Key Value pairs as strings
        HashMap<String, String> stateCapitals = new HashMap<String, String>();

        // Adding state capital key value pairs
        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        stateCapitals.put("Colorado", "Denver");
        stateCapitals.put("Connecticut", "Hartford");
        stateCapitals.put("Delaware", "Dover");
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("Georgia", "Atlanta");
        stateCapitals.put("Hawaii", "Honolulu");
        stateCapitals.put("Idaho", "Boise");
        stateCapitals.put("Illinois", "Springfield");
        stateCapitals.put("Indiana", "Indianapolis");
        stateCapitals.put("Iowa", "Des Moines");
        stateCapitals.put("Kansas", "Topeka");
        stateCapitals.put("Kentucky", "Frankfort");
        stateCapitals.put("Louisiana", "Baton Rouge");
        stateCapitals.put("Maine", "Augusta");
        stateCapitals.put("Maryland", "Annapolis");
        stateCapitals.put("Massachusetts", "Boston");
        stateCapitals.put("Michigan", "Lansing");
        stateCapitals.put("Minnesota", "Saint Paul");
        stateCapitals.put("Mississippi", "Jackson");
        stateCapitals.put("Missouri", "Jefferson City");
        stateCapitals.put("Montana", "Helena");
        stateCapitals.put("Nebraska", "Lincoln");
        stateCapitals.put("Nevada", "Carson City");
        stateCapitals.put("New Hampshire", "Concord");
        stateCapitals.put("New Jersey", "Trenton");
        stateCapitals.put("New Mexico", "Santa Fe");
        stateCapitals.put("New York", "Albany");
        stateCapitals.put("North Carolina", "Raleigh");
        stateCapitals.put("North Dakota", "Bismarck");
        stateCapitals.put("Ohio", "Columbus");
        stateCapitals.put("Oklahoma", "Oklahoma City");
        stateCapitals.put("Oregon", "Salem");
        stateCapitals.put("Pennsylvania", "Harrisburg");
        stateCapitals.put("Rhode Island", "Providence");
        stateCapitals.put("South Carolina", "Columbia");
        stateCapitals.put("South Dakota", "Pierre");
        stateCapitals.put("Tennessee", "Nashville");
        stateCapitals.put("Texas", "Austin");
        stateCapitals.put("Utah", "Salt Lake City");
        stateCapitals.put("Vermont", "Montpelier");
        stateCapitals.put("Virginia", "Richmond");
        stateCapitals.put("Washington", "Olympia");
        stateCapitals.put("West Virginia", "Charleston");
        stateCapitals.put("Wisconsin", "Madison");
        stateCapitals.put("Wyoming", "Cheyenne");

        System.out.println(" ");
        // Loop through HashMap to display the content
        for (String i : stateCapitals.keySet()) {
            System.out.println(i + " : " + stateCapitals.get(i));
        }

        // Cast the HashMap into TreeMap using the built in TreeMap
        // This will automatically sort our new TreeMap for us and create a binary tree!
        TreeMap<String, String> newStateCapitals = new TreeMap<String, String>(stateCapitals);

        System.out.println(" ");
        System.out.println("Please enter a state and we will return you the capital!");
        System.out.println("--------------------------------------------------------");

        // Ask for user input and gets the proper capital for the state entered
        String userInput = scanner.nextLine();
        String capital = newStateCapitals.get(userInput);

        // Checks wheter the user input is a valid state or not
        if (capital != null) {
            System.out.println(capital + " is the capital of " + userInput);
        } else {
            System.out.println("Looks like you did not enter a correct state!");
        }
    }
}
