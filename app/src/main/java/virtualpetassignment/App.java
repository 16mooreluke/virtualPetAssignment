
package virtualpetassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class App {
    
    private static VirtualPetShelter userShelterPets = new VirtualPetShelter();

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        VirtualPet userPet1 = new VirtualPet("Bear", "This brown boy is very stinky!");
        VirtualPet userPet2 = new VirtualPet("Snickerdoodle", "This guy is full of trouble!");
        VirtualPet userPet3 = new VirtualPet("Meatball", "This boy loves to eat!");

        String userPetAdopt;

        userShelterPets.addPet(userPet1);
        userShelterPets.addPet(userPet2);
        userShelterPets.addPet(userPet3);
        Boolean keepGoing = true;

        System.out.println("Welcome to Luke's Animal Sanctuary!");
        System.out.println("Here we have a number of pets that need taken care of. Make sure to feed and water them, as well as play and let them rest.");
        System.out.println("You can choose to do so as a group or can tend to an individual pet.");
        System.out.println("You can also help a pet get adopted or admit a new pet into the shelter.");
        System.out.println("Due to budget constraints, we can only hold up to eight (8) pets currently.");
        System.out.println("Let's get started!");

        do {
            System.out.println("Here's how your current pets are doing.");
            displayPetStats();
            System.out.println();

            System.out.println("A. Work with a pet individually.");
            System.out.println("B. Feed all pets.");
            System.out.println("C. Water all pets.");
            System.out.println("D. Play with all pets");
            System.out.println("E. Let all pets rest.");
            System.out.println("F. Get a pet adopted.");
            System.out.println("G. Admit a new pet.");
            System.out.println("H. Hints on game mechanics.");
            System.out.println("I. Exit the game.");
            String userInput = input.nextLine();
            userInput = userInput.trim().toLowerCase();

            if(userInput.equals("a")) {
                System.out.println("Which pet would you like to work with?");
                String userPetChoice = input.nextLine();
                // for ()
                    

                }
            
            if(userInput.equals("b")) {
                System.out.println("You have fed all the pets!");
                userShelterPets.getFoodAll();
            }
            if(userInput.equals("c")) {
                System.out.println("You have watered all the pets.");
                userShelterPets.getHydrationAll();
            }
            if(userInput.equals("d")) {
                System.out.println("You have let all the pets play.");
                userShelterPets.getPlayAll();
            }
            if(userInput.equals("e")) {
                System.out.println("You have let all the pets rest.");
                userShelterPets.getRestAll();
            }
            if(userInput.equals("f")) {
                List<VirtualPet> pets = new ArrayList<VirtualPet>();
                // pets = userShelterPets.getAllPets();
                System.out.println("Which pet would you like to get adopted?");
                userPetAdopt = input.nextLine();
                int index;
                index = pets.indexOf(userPetAdopt);
                if (index != -1) {
                    pets.remove(index);
                } else {
                    System.out.println("There is no pet named " + userPetAdopt + " here, try another name!");
                }
            }
            if(userInput.equals("g")) {
                System.out.println("What is the name of the new pet?");
                String userPetAdmit = input.nextLine();
                System.out.println("Give me a brief description of " + userPetAdmit + ".");
                String userPetDescriptionAdmit = input.nextLine();
                VirtualPet pets = new VirtualPet(userPetAdmit, userPetDescriptionAdmit);
                userShelterPets.addPet(pets);

            }
            if(userInput.equals("h")) {
                System.out.println("Here's a hint! Yes, working with all the pets at once will increase the chosen stat by an amount.");
                System.out.println("However, working with an individual pet will increase the stat even more!");
                System.out.println("Some pets will come into the shelter with varying levels of stats, so make sure to balance working with groups and individuals as you need!");

            }
            if(userInput.equals("i")) {
                break;
            }
            userShelterPets.shelterTick();

            List<VirtualPet> pets = new ArrayList<VirtualPet>();
            pets = userShelterPets.getAllPets();
            for (VirtualPet thisPet : pets) {
                if (!thisPet.isItOkay()) {
                    System.out.println("Oh no! Looks like " + thisPet.getPetName() + " isn't feeling great.");
                }
                if (!thisPet.isItDead()) {
                    System.out.println(thisPet.getPetName() + " has been removed from the sanctuary");
                    // insert remove
                    // userShelterPets.removePet(thisPet);
                }
            }
        } while (keepGoing);
        System.out.println("Thanks for visiting, hope you enjoyed your stay!");
        input.close();
    }
    public static void displayPetStats() {
        List<VirtualPet> pets = new ArrayList<VirtualPet>();
        pets = userShelterPets.getAllPets();
        String lineString;
        String headings;
            headings = "\t" + "\t" + "\t"  + "\t" + "Food";
            headings += "\t" + "Water";
            headings += "\t" + "Play";
            headings += "\t" + "Rest";
            System.out.println(" ".repeat(50) + headings);
        for (VirtualPet thisPet : pets) {
            lineString = "\t" + thisPet.getFood();
            lineString += "\t" + thisPet.getHydration();
            lineString += "\t" + thisPet.getPlay();
            lineString += "\t" + thisPet.getRest();
            String nameStr = thisPet.getPetName();
            String petDescription = thisPet.getPetDescription();
            System.out.println(nameStr + " ".repeat(20 - nameStr.length()) + "|" + thisPet.getPetDescription() + " ".repeat(50 - petDescription.length()) + "|" + lineString);  
        }
    }
    
}
