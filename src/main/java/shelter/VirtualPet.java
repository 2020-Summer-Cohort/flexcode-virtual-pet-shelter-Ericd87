package shelter;

public class VirtualPet {

    private String name;
    private String descriptions;
    private int hunger;
    private int thirst;
    private int boredom;
    private int happiness;
    private int tiredness;
    private Object VirtualPet;

    public String getPetName(){ return getPetName(); }

    public String getPetDescriptions(){ return getPetDescriptions(); }


    public VirtualPet(String name, String descriptions){

    this.name = name;
    this.descriptions = descriptions;
    }

    public VirtualPet(String name, String descriptions, int hunger, int thirst, int boredom, int happiness, int tiredness){
    this.name = name;
    this.descriptions = descriptions;
    this.hunger = hunger;
    this.thirst = thirst;
    this.boredom = boredom;
    this.happiness = happiness;
    this.tiredness = tiredness;
    }

    public String getName(){
        return name;
    }

    public String getDescriptions(){ return descriptions; }

    public int getHunger() {
        return hunger;
    }

    public int getThirst(){
        return thirst;
    }

    public int getBoredom(){
        return boredom;
    }

    public int getHappiness(){
        return happiness;
    }

    public int getTiredness(){ return tiredness;

    }

    public void feed(){
        hunger -= 9;

    }


    public void water() {
        thirst -=15;
    }
}


