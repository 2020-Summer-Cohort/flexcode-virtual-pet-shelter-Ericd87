package shelter;

public class Cat extends Organic{

    private int litterWasteLevel;




    public Cat(String name, String descriptions, int hunger, int thirst, int boredom, int happiness, int tiredness, int litterWasteLevel) {
        super(name, descriptions, hunger, thirst, boredom, happiness, tiredness);
        this.litterWasteLevel = litterWasteLevel;

    }


    public int getLitterWasteLevel(){

        return litterWasteLevel;
    }


    public void cleanLitterBox(){
        litterWasteLevel = 0;
    }

    public void feed(){
        hunger -= 10;
        litterWasteLevel += 5;
    }

    //Dog class handles cageWasteLevel and you can walk () a dog
}
