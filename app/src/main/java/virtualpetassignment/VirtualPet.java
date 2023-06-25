package virtualpetassignment;

import java.util.Random;

public class VirtualPet {
    private int food;
    private int hydration;
    private int play;
    private int rest;

    private String petName;
    private String petDescription;

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.food = getRandomNumber(20, 50);
        this.hydration = getRandomNumber(20, 50);
        this.play = getRandomNumber(20, 50);
        this.rest = getRandomNumber(20, 50);
    }

    public String getPetName() {
        return petName;
    }
    public String getPetDescription() {
        return petDescription;
    }
    public int getFood() {
        return food;
    }
    public int getHydration() {
        return hydration;
    }
    public int getPlay() {
        return play;
    }
    public int getRest() {
        return rest;
    }

    public void tick() {
        food -= 5;
        hydration -= 5;
        play -=  5;
        rest -= 5;
    }

    public void feed() {
        food += 30;
    }
    public void water() {
        hydration += 30;
    }
    public void play() {
        play += 30;
        hydration -= 5;
        rest -= 5;
    }
    public void rest() {
        rest += 30;
        play -= 5;
    }



    public boolean isItOkay() {
        Boolean petHealth = true;
        if (food <= 15) {
            petHealth = false;
        }
        if (hydration <= 15) {
            petHealth = false;
        }
        if (play <= 5) {
            petHealth = false;
        }
        if (rest <= 5) {
            petHealth = false;
        }
        return petHealth;
    }
    public boolean isItDead() {
        Boolean petHealth = true;
        if (food <= 0) {
            petHealth = false;
        }
        if (hydration <= 0) {
            petHealth = false;
        }
        if (play <= 0) {
            petHealth = false;
        }
        if (rest <= 0) {
            petHealth = false;
        }
        return petHealth;
    }

    public int getRandomNumber (int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
