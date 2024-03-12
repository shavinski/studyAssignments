import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner to be used later for user input
        Scanner scanner = new Scanner(System.in);

        String[][] stateCapitals = {
                { "Alabama", "Montgomery" },
                { "Alaska", "Juneau" },
                { "Arizona", "Phoenix" },
                { "Arkansas", "Little Rock" },
                { "California", "Sacramento" },
                { "Colorado", "Denver" },
                { "Connecticut", "Hartford" },
                { "Delaware", "Dover" },
                { "Florida", "Tallahassee" },
                { "Georgia", "Atlanta" },
                { "Hawaii", "Honolulu" },
                { "Idaho", "Boise" },
                { "Illinois", "Springfield" },
                { "Indiana", "Indianapolis" },
                { "Iowa", "Des Moines" },
                { "Kansas", "Topeka" },
                { "Kentucky", "Frankfort" },
                { "Louisiana", "Baton Rouge" },
                { "Maine", "Augusta" },
                { "Maryland", "Annapolis" },
                { "Massachusetts", "Boston" },
                { "Michigan", "Lansing" },
                { "Minnesota", "St. Paul" },
                { "Mississippi", "Jackson" },
                { "Missouri", "Jefferson City" },
                { "Montana", "Helena" },
                { "Nebraska", "Lincoln" },
                { "Nevada", "Carson City" },
                { "New Hampshire", "Concord" },
                { "New Jersey", "Trenton" },
                { "New Mexico", "Santa Fe" },
                { "New York", "Albany" },
                { "North Carolina", "Raleigh" },
                { "North Dakota", "Bismarck" },
                { "Ohio", "Columbus" },
                { "Oklahoma", "Oklahoma City" },
                { "Oregon", "Salem" },
                { "Pennsylvania", "Harrisburg" },
                { "Rhode Island", "Providence" },
                { "South Carolina", "Columbia" },
                { "South Dakota", "Pierre" },
                { "Tennessee", "Nashville" },
                { "Texas", "Austin" },
                { "Utah", "Salt Lake City" },
                { "Vermont", "Montpelier" },
                { "Virginia", "Richmond" },
                { "Washington", "Olympia" },
                { "West Virginia", "Charleston" },
                { "Wisconsin", "Madison" },
                { "Wyoming", "Cheyenne" }
        };

        System.out.println(" ");
        System.out.println("Before the bubble sort");
        System.out.println("----------------------");

        // Prints state capitals before bubble sort
        for (String[] stateCapital : stateCapitals) {
            System.out.println(stateCapital[0] + " : " + stateCapital[1]);
        }

        // Bubble sort implementaion using Main method bubbleSort
        String[][] sortedCapitals = Main.bubbleSort(stateCapitals);

        System.out.println(" ");
        System.out.println("After the bubble sort");
        System.out.println("----------------------");

        // Prints state capitals after bubble sort
        for (String[] stateCapital : sortedCapitals) {
            System.out.println(stateCapital[0] + " : " + stateCapital[1]);
        }

        System.out.println(" ");
        System.out.println("When you want to be done, type q then enter, else enter all 50 captials");
        System.out.println("*** BE AWARE YOUR INPUT IS NOT CASE SENSITIVE ***");
        System.out.println("-------------------------------------------------");
        System.out.println("Enter capitals for the US states:");

        int score = 0;
        int stateCounter = 50;

        // Ask for user input until user presses enters q OR user names all 50 capitals,
        // returns score at end
        while (stateCounter > 0) {
            String userInput = scanner.nextLine();

            if (userInput.compareTo("q") == 0) {
                break;
            }

            for (String[] stateCapital : sortedCapitals) {
                if (userInput.compareTo(stateCapital[1]) == 0) {
                    score++;
                }
            }

            stateCounter--;
        }

        // At end of while loop, will print the user score
        System.out.println("Here is your score: " + score + "/50");
    }

    // Bubble sorts based of capital name in array of arrays
    public static String[][] bubbleSort(String[][] stateCapitals) {

        for (int i = 0; i < stateCapitals.length - 1; i++) {
            for (int j = 0; j < stateCapitals.length - 1; j++) {
                String currentCaptial = stateCapitals[j][1];
                String nextCapital = stateCapitals[j + 1][1];

                if (currentCaptial.compareTo(nextCapital) > 0) {
                    String[] temp = stateCapitals[j];
                    stateCapitals[j] = stateCapitals[j + 1];
                    stateCapitals[j + 1] = temp;
                }
            }
        }

        return stateCapitals;
    }
}