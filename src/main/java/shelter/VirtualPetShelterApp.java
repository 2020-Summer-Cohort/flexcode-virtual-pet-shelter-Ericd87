package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

        VirtualPet virtualPet1 = new VirtualPet("Rabbit", "Hops", 20, 35, 9, 10, 4);
        VirtualPet virtualPet2 = new VirtualPet("Bird","Fly", 10, 15, 8, 12, 3);

        myVirtualPetShelter.add(virtualPet1);
        myVirtualPetShelter.add(virtualPet2);

        String userChoice = null;

        do{
            System.out.println("Welcome to Eric's Virtual Pet Shelter Game!!!");
            System.out.println("You can interact with pets in Eric's Virtual Pet Shelter game, and help take care of all the pets!");
            input.nextLine();

            System.out.println("These are the pets at the shelter");
            System.out.println("Hunger" + " " + "Thirst" + " " + "Boredom" + " " + "Happiness" + " " + "Tiredness");
            input.nextLine();

            myVirtualPetShelter.showAllPets();
            input.nextLine();


            System.out.println("Choose a pet Rabbit or Bird to begin the game");
            userChoice = input.nextLine();

            System.out.println("Virtual Pet Shelter Menu Options");
            System.out.println("Now choose a option");
            System.out.println("Press 1 to Show pets");
            System.out.println("Press 2 to Feed pets");
            System.out.println("Press 3 to Water all pets");
            System.out.println("Press 4 to Adopt a pet");
            System.out.println("Press 5 to Add pets");
            System.out.println("Press 6 to Exit");
            userChoice = input.nextLine();

            if (userChoice.equals("1")) {
                System.out.println("You will show all pets");
                System.out.println("Here is your pets");
                myVirtualPetShelter.showAllPets();
            }
            if (userChoice.equals("2")) {
                System.out.println("You will feed all pets");
                System.out.println("Here is your pets");
                myVirtualPetShelter.feedAll();
                myVirtualPetShelter.showAllPets();
            }
            if (userChoice.equals("3")) {
                System.out.println("You will water all pets");
                System.out.println("Here is your pets");
                myVirtualPetShelter.waterAll();
                myVirtualPetShelter.showAllPets();
            }
            if (userChoice.equals("4")){
                System.out.println("You can adopt a rabbit or bird");
                userChoice = input.nextLine();
                myVirtualPetShelter.adopt(myVirtualPetShelter.findVirtualPet(userChoice));
                myVirtualPetShelter.showAllPets();
            }

            if (userChoice.equals("5")){
                System.out.println("What's the name of your pet?");
                userChoice = input.nextLine();
                System.out.println("What is your pet's description?");
                String description = input.nextLine();
                myVirtualPetShelter.add(new VirtualPet(userChoice,description, 10, 15, 8, 12, 3));
                myVirtualPetShelter.showAllPets();
            }

        } while ((!userChoice.equals("6")));
        System.out.println("Thanks for visiting the Virtual Pet Shelter");

    }
    }

