package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

        Dog fido = new Dog("Fido", "Happy Dog", 20, 35, 9, 10, 4, 10);
        Cat megan = new Cat("Megan", "Playful Cat", 10, 15, 8, 12, 3, 0);

        myVirtualPetShelter.add(fido);
        myVirtualPetShelter.add(megan);

        String userChoice = null;

        do {
            System.out.println("Welcome to Eric's Virtual Pet Shelter Game!!!");
            System.out.println("You can interact with pets in Eric's Virtual Pet Shelter game, and help take care of all the pets!");
            input.nextLine();

            System.out.println("These are the pets at the shelter");
            System.out.println("Hunger" + " " + "Thirst" + " " + "Boredom" + " " + "Happiness" + " " + "Tiredness");
            input.nextLine();

            myVirtualPetShelter.showAllOrganicPets();
            myVirtualPetShelter.showAllRoboticPets();
            input.nextLine();


            System.out.println("Choose a pet Dog or Cat, or you could choose a Robotic Dog or Cat please select to begin the game");
            userChoice = input.nextLine();

            System.out.println("Virtual Pet Shelter Menu Options");
            System.out.println("Now choose a option");
            System.out.println("Press 1 to show Organic pets");
            System.out.println("Press 2 to show Robotic pets");
            System.out.println("Press 3 to Feed pets");
            System.out.println("Press 4 to Water all pets");
            System.out.println("Press 5 to oil all Robotic Dog pets");
            System.out.println("Press 6 to charge all Robotic cat pets");
            System.out.println("Press 7 to Adopt a Organic pet or Robotic pet");
            System.out.println("Press 8 to Add pets");
            System.out.println("Press 9 to remove a Organic or a Robotic pet");
            System.out.println("Press 0 to Exit");
            userChoice = input.nextLine();

            if (userChoice.equals("1")) {
                System.out.println("You will show all Organic pets");
                System.out.println("Here is your Organic pets");
                myVirtualPetShelter.showAllOrganicPets();
            }
            if (userChoice.equals("2")) {
                System.out.println("You will show all Robotic pets");
                System.out.println("Here is your Robotic pets");
                myVirtualPetShelter.feedAll();
                myVirtualPetShelter.showAllRoboticPets();
            }
            if (userChoice.equals("3")) {
                System.out.println("You will Feed all Organic pets");
                System.out.println("Here is your pets");
                myVirtualPetShelter.feedAll();
                myVirtualPetShelter.showAllOrganicPets();
            }
            if (userChoice.equals("4")) {
                System.out.println("You can Water all Organic pets");
                System.out.println("Here is your Organic pets");
                myVirtualPetShelter.waterAll();
                userChoice = input.nextLine();
                myVirtualPetShelter.showAllOrganicPets();
            }

            if (userChoice.equals("5")) {
                System.out.println("You can oil all Robotic Dog pets");
                System.out.println("Here is your Robotic Dog pets");
                userChoice = input.nextLine();
                myVirtualPetShelter.showAllRoboticPets();

            }

            if (userChoice.equals("6")) {
                System.out.println("You can oil all Robotic Dog pets");
                System.out.println("Here is your Robotic Dog pets");
                userChoice = input.nextLine();
                myVirtualPetShelter.showAllRoboticPets();

            }


            if (userChoice.equals("7")) {
                System.out.println("You can adopt Organic or Robotic pets");
                System.out.println("Here is your Organic pets");
                System.out.println("Here is your Robotic Dog pets");
                userChoice = input.nextLine();
                myVirtualPetShelter.adopt(myVirtualPetShelter.findVirtualPet(userChoice));
                myVirtualPetShelter.showAllOrganicPets();

            }

            if (userChoice.equals("8")) {
                System.out.println("You can remove a Organic or Robotic pet");
                System.out.println("Here is your Organic pets");
                System.out.println("Here is your Robotic Dog pets");
                userChoice = input.nextLine();
                myVirtualPetShelter.showAllOrganicPets();

            }

            while (userChoice.equals("9")) {
                System.out.println("You can remove a Organic or Robotic pet");
                System.out.println("Here is your Organic and Robotic pets that you have left at the Shelter");
                userChoice = input.nextLine();
                myVirtualPetShelter.showAllOrganicPets();
                myVirtualPetShelter.showAllRoboticPets();

            }
            while ((!userChoice.equals("0"))) ;
            System.out.println("Thanks for visiting the Virtual Pet Shelter you may exit the game");

        }

    }

}



