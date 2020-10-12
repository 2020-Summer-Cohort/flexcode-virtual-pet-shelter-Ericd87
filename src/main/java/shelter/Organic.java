package shelter;

public class Organic extends VirtualPet {

    protected int hunger;
    protected int thirst;
    protected int boredom;
    protected int happiness;
    protected int tiredness;

    public Organic(String name, String descriptions, int hunger, int thirst, int boredom, int happiness, int tiredness) {
        super(name, descriptions);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.happiness = happiness;
        this.tiredness = tiredness;

    }


    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getTiredness() {
        return tiredness;

    }

    public void feed() {
        hunger -= 9;

    }

    public void water() {

        thirst -= 15;
    }

}
