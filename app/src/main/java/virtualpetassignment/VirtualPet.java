package virtualpetassignment;

public class VirtualPet {
    private int food = 9;
    private int hydration = 8;
    private int play = 5;
    private int rest = 7;

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
        food -= 1;
        hydration -= 1;
        play -=  1;
        rest -= 1;
    }

    public void feed() {
        food += 4;
    }
    public void water() {
        hydration += 4;
    }
    public void play() {
        play += 5;
        food -= 2;
        hydration -= 3;
        rest -= 3;
    }
    public void rest() {
        rest += 6;
        play -= 4;
    }

    public boolean isItOkay() {
        Boolean petHealth = true;
        if (food <= 3) {
            petHealth = false;
        }
        if (hydration <= 3) {
            petHealth = false;
        }
        if (play <= 3) {
            petHealth = false;
        }
        if (rest <= 3) {
            petHealth = false;
        }
        return petHealth;
    }
    public boolean isItDead() {
        Boolean petHealth = true;
        if (food == 0) {
            petHealth = false;
        }
        if (hydration == 0) {
            petHealth = false;
        }
        if (play == 0) {
            petHealth = false;
        }
        if (rest == 0) {
            petHealth = false;
        }
        return petHealth;
    }

}
