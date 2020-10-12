package shelter;

import org.junit.jupiter.api.Test;


import java.util.Collection;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    VirtualPetShelter petTest = new VirtualPetShelter();


    Dog fido  = new Dog("Fido", "Happy Dog", 20, 35, 9, 10, 4, 10);
    Cat megan = new Cat("Megan","Playful Cat", 10, 15, 8, 12, 3, 0);




@Test
public void ShouldReturnVirtualPetName(){
       petTest.add(fido);
       VirtualPet retrievedVirtualPet = petTest.findVirtualPet(fido.getName());
       assertEquals(retrievedVirtualPet,fido);
}

@Test
public void ShouldReturnVirtualPetDescriptions() {
    petTest.add(megan);
    VirtualPet retrievedVirtualPet = petTest.findVirtualPet(megan.getName());
    assertEquals(retrievedVirtualPet, megan);

    }

@Test
public void shouldGetAllPets() {
    petTest.add(fido);
    petTest.add(megan);
   Collection<VirtualPet> allPets = petTest.getAllPets();
    assertEquals(allPets, containsInAnyOrder(fido,megan));


    }


@Test
public void shouldBeAbleToRemoveAPet(){
    petTest.add(fido);
    petTest.adopt(fido);
    petTest.add(megan);
    petTest.adopt(megan);
    VirtualPet retrievedVirtualPet1 = petTest.findVirtualPet("Fido");
    VirtualPet retrievedVirtualPet2 = petTest.findVirtualPet("Megan");
    assertEquals(retrievedVirtualPet1, null);
    assertEquals(retrievedVirtualPet2, null);


    }

@Test
public void ShouldFeedAllPets(){
    petTest.add(fido);
    petTest.add(megan);
    petTest.feedAll();
    assertEquals(fido.getHunger(), 11);
    assertEquals(megan.getHunger(), 1);
    }

@Test
public void ShouldWaterAllPets(){
    petTest.add((fido));
    petTest.add(megan);
    petTest.waterAll();
    assertEquals(fido.getThirst(), 20);
    assertEquals(megan.getThirst(), 0);

    }

}




