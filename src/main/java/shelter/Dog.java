package shelter;

public class Dog extends Organic{

    private int cageWasteLevel;



    public Dog(String name, String descriptions, int hunger, int thirst, int boredom, int happiness, int tiredness, int cageWasteLevel) {
        super(name, descriptions, hunger, thirst, boredom, happiness, tiredness);
        this.cageWasteLevel = cageWasteLevel;
    }

    public int getCageWasteLevel(){
        return cageWasteLevel;
    }

    public void cleanCage(){

        cageWasteLevel  = 0;
    }

    public void feed(){
        hunger -= 20;
        cageWasteLevel += 10;

    }

    public void water(){
        thirst -= 15;
    }



}
