
package virtualpetassignment;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        VirtualPet userPet = new VirtualPet();
        Boolean keepGoing = true;

        System.out.println("Welcome to Luke's Animal Sanctuary!");
        System.out.println("At our establishment, you get to be in charge of one of our lovely and adorable pets!");
        System.out.println("You will be responsible for keeping the pet fed, hydrated, entertained, and rested.");
        System.out.println("Make sure to maintain the stats of the pet! If any stat reaches zero, we will have to take the pet back for the day.");
        System.out.println("Let's get started, shall we?");
        System.out.println("What is the name of your pet?");
        String petName = input.nextLine();

        do {
            System.out.println(petName + " stats");
            System.out.println("Food: " + userPet.getFood());
            System.out.println("Hydration: " + userPet.getHydration());
            System.out.println("Play: " + userPet.getPlay());
            System.out.println("Rest: " + userPet.getRest());
            
            System.out.println("What would you like to do?");
            System.out.println("A. Feed " + petName);
            System.out.println("B. Hydrate " + petName);
            System.out.println("C. Play with " + petName);
            System.out.println("D. Let " + petName + " rest");
            System.out.println("E. Exit the game.");
            String userInput = input.nextLine();
            userInput = userInput.trim().toLowerCase();

            if(userInput.equals("a")) {
                System.out.println("You have fed " + petName + ".");
                userPet.feed();
            }
            if(userInput.equals("b")) {
                System.out.println("You have watered " + petName + ".");
                userPet.water();
            }
            if(userInput.equals("c")) {
                System.out.println("You have played with " + petName + ".");
                userPet.play();
            }
            if(userInput.equals("d")) {
                System.out.println("You have let " + petName + " rest.");
                userPet.rest();
            }
            if(userInput.equals("e")) {
                break;
            }
            userPet.tick();

            if (!userPet.isItOkay()) {
                System.out.println("Oh no! Looks like " + petName + " isn't feeling great.");
            }
            if (!userPet.isItDead()) {
                break;
            }

        } while (keepGoing);
        System.out.println("Thanks for visiting " + petName + ". Hope you enjoyed your stay!");
        input.close();
    }
}
