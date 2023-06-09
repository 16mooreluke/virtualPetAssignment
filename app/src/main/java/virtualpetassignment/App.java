
package virtualpetassignment;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        VirtualPet petStats = new VirtualPet();
        Boolean keepGoing = true;

        System.out.println("Welcome to Luke's Animal Sanctuary!");
        System.out.println("At our establishment, you get to be in charge of one of our lovely and adorable pets!");
        System.out.println("You will be responsible for keeping the pet fed and watered, entertained, and rested.");
        System.out.println("Each time you start an activity, it will take an amount of turns listed next to the action.");
        System.out.println("Make sure to maintain the stats of the pet! If any reach zero it's game over!");
        System.out.println("Let's get started, shall we?");
        System.out.println("What is the name of your pet?");
        String petName = input.nextLine();

        do {
            System.out.println(petName + "stats");
            System.out.println("Food/Water: " + nutrients);
            System.out.println("Play: " + play);
            System.out.println("Rest: " + rest);
            
            System.out.println("What would you like to do?");
            System.out.println("1. Feed/water" + petName);
            System.out.println("2. Play with" + petName);
            System.out.println("3. Let " + petName + " rest");



        } while (keepGoing);

        System.out.println("Thanks for visiting " + petName + ". Hope you enjoyed your stay!");


        input.close();
    }
}
