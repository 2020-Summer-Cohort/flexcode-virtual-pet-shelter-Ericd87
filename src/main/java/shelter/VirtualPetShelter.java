package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> virtualPets = new HashMap<>();

    public void add(VirtualPet virtualPetToAdd) {
        virtualPets.put(virtualPetToAdd.getName(), virtualPetToAdd);

    }
    public VirtualPet findVirtualPet(String name) {
        return virtualPets.get(name);
    }

    public Collection<VirtualPet> getAllPets() {
        return virtualPets.values();
    }

    public void adopt(VirtualPet virtualPet1) {
        virtualPets.remove(virtualPet1.getName(), virtualPet1);

    }

    public void feedAll() {
    //for all virtual pets... loop over them and feed each one
        //for each VirtualPet called pet IN the virtualPets collection
        for(VirtualPet pet : virtualPets.values()){
            pet.feed();
        }
    }


    public void waterAll() {
        for (VirtualPet pet : virtualPets.values()) {
            pet.water();
        }
    }

    public void showAllPets() {
        for (VirtualPet pet : virtualPets.values()) {
            System.out.println(pet.getName() + " " + pet.getDescriptions() + " " + pet.getHunger() + " " + pet.getThirst() + " " + pet.getBoredom() + " " + pet.getHappiness() + " " + pet.getTiredness());
        }
    }
}
