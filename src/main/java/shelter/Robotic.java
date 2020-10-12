package shelter;

public class Robotic extends VirtualPet{

    protected int oil;
    protected int charge;


    public Robotic(String name, String descriptions, int oil, int charge) {
        super(name, descriptions);
        this.oil = oil;
        this.charge = charge;
    }


    public void oil() {
        oil -= 15;

    }

    public void charge(){
        charge -= 25;
    }



    public int getOil() {
        return oil;
    }

    public int getCharge() {
        return charge;
    }


}
