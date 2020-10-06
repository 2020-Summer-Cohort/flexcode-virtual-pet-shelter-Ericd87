package shelter;

import org.junit.jupiter.api.Test;


import java.util.Collection;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    VirtualPetShelter petTest = new VirtualPetShelter();


    VirtualPet virtualPet1 = new VirtualPet("Rabbit", "Hops", 20, 35, 9, 10, 4);
    VirtualPet virtualPet2 = new VirtualPet("Bird","Fly", 10, 15, 8, 12, 3);




@Test
public void ShouldReturnVirtualPetName(){
       petTest.add(virtualPet1);
       VirtualPet retrievedVirtualPet = petTest.findVirtualPet(virtualPet1.getName());
       assertEquals(retrievedVirtualPet, virtualPet1);
}

@Test
public void ShouldReturnVirtualPetDescriptions() {
    petTest.add(virtualPet2);
    VirtualPet retrievedVirtualPet = petTest.findVirtualPet(virtualPet2.getName());
    assertEquals(retrievedVirtualPet, virtualPet2);

    }

@Test
public void shouldGetAllPets() {
    petTest.add(virtualPet1);
    petTest.add(virtualPet2);
   Collection<VirtualPet> allPets = petTest.getAllPets();
    assertEquals(allPets, containsInAnyOrder(virtualPet1,virtualPet2));


    }


@Test
public void shouldBeAbleToRemoveAPet(){
    petTest.add(virtualPet1);
    petTest.adopt(virtualPet1);
    petTest.add(virtualPet2);
    petTest.adopt(virtualPet2);
    VirtualPet retrievedVirtualPet1 = petTest.findVirtualPet("Rabbit");
    VirtualPet retrievedVirtualPet2 = petTest.findVirtualPet("Bird");
    assertEquals(retrievedVirtualPet1, null);
    assertEquals(retrievedVirtualPet2, null);


    }

@Test
public void ShouldFeedAllPets(){
    petTest.add(virtualPet1);
    petTest.add(virtualPet2);
    petTest.feedAll();
    assertEquals(virtualPet1.getHunger(), 11);
    assertEquals(virtualPet2.getHunger(), 1);
    }

@Test
public void ShouldWaterAllPets(){
    petTest.add((virtualPet1));
    petTest.add(virtualPet2);
    petTest.waterAll();
    assertEquals(virtualPet1.getThirst(), 20);
    assertEquals(virtualPet2.getThirst(), 0);

    }




}




