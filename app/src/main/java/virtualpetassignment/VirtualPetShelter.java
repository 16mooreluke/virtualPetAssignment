package virtualpetassignment;

import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {

    private List<VirtualPet> pets = new ArrayList<VirtualPet>();

    public void addPet(VirtualPet newPet) {
        pets.add(newPet);
    }
    public void removePet(VirtualPet removePet) {
        // pets.remove();
    }
    
    private int foodAll;
    private int hydrationAll;
    private int playAll;
    private int restAll;

    private int trainingLevel;

    public List<VirtualPet> getAllPets() {
        return pets;
    }

    public void getFoodAll() {
        for (VirtualPet thisPet : pets) {
            thisPet.feed();
        }
    }
    public void getHydrationAll() {
        for (VirtualPet thisPet : pets) {
            thisPet.water();
        }    
    }
    public void getPlayAll() {
        for (VirtualPet thisPet : pets) {
            thisPet.play();
        }    
    }
    public void getRestAll() {
        for (VirtualPet thisPet : pets) {
            thisPet.rest();
        }    
    }

    public void shelterTick() {
        for (VirtualPet thisPet : pets) {
            thisPet.tick();
        }  
    }



}
