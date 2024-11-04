import java.util.ArrayList;
import java.util.Scanner;

public class VetManager {
    // ArrayLists to hold different types of animals
    private static ArrayList<Dog> dogs = new ArrayList<>();
    private static ArrayList<Cat> cats = new ArrayList<>();
    private static ArrayList<Dragon> dragons = new ArrayList<>();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                printMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                switch (choice) {
                    case 1:
                        addAnimal(scanner);
                        break;
                    case 2:
                        viewAnimals();
                        break;
                    case 3:
                        modifyAnimal(scanner);
                        break;
                    case 4:
                        removeAnimal(scanner);
                        break;
                    case 5:
                        // saveAndClose();
                        break;
                    case 6:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
            scanner.close();
        }
        private static void printMenu() {
            System.out.println("\n--- Vet Management System ---");
            System.out.println("1. Add Animal");
            System.out.println("2. View Animals");
            System.out.println("3. Modify Animal");
            System.out.println("4. Remove Animal");
            System.out.println("5. Save and Close");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
        }
    
        private static void addAnimal(Scanner scanner){
            // ask the user for species
            // ask the user for name, breed, gender, age
            
            System.out.println("Choose a species: \n\t1. Dog\t2. Cat\t3. Dragon");
            int species = scanner.nextInt();

            System.out.println("What is the name?");
            String name = scanner.next();
            System.out.println("What is the breed?");
            String breed = scanner.nextLine();
            breed = scanner.next();
            System.out.println("What is the gender?");
            String gender = scanner.nextLine();
            gender = scanner.next();
            System.out.println("What is the age?");
            int age = scanner.nextInt();
            
            //create the animal

            switch (species) {
                case 1:
                    Dog d = new Dog(name, breed, gender, age);
                    dogs.add(d);
                    System.out.println(d);
                    break;
                case 2:
                    cats.add(new Cat(name, breed, gender, age));
                    break;
                case 3:
                    dragons.add(new Dragon(name, breed, gender, age));
                    break;
            }
    
            //add the aniaml to the appropriate arraylist

            System.out.println(name+" successfully added");
        }

        private static void viewAnimals(){
            System.out.println("\n--------- DOGS ---------");
            for(Dog dog:dogs){
                System.out.println(dog);
            }
            System.out.println("\n--------- CATS ---------");
            for(Cat cat:cats){
                System.out.println(cat);
            }
            System.out.println("\n--------- DRAGONS ---------");
            for(Dragon dragon:dragons){
                System.out.println(dragon);
            }
        }

        private static void modifyAnimal(Scanner scanner){
            //choose the species... boy, wouldn't this be nice to have a search f(x)
            System.out.println("Choose a species: \n\t1. Dog\t2. Cat\t3. Dragon");
            int species = scanner.nextInt();

            String name = "";
            switch(species){
                case 1:
                    System.out.println("Which Dog? (name)");
                    System.out.println("\n--------- DOGS ---------");
                    for(Dog dog:dogs){
                        System.out.println(dog);
                    }
                    name = scanner.next();
                    break;
                case 2:
                    System.out.println("Which Cat? (name)");
                    System.out.println("\n--------- CATS ---------");
                    for(Cat cat:cats){
                    System.out.println(cat);
                    }
                    name = scanner.next();
                    break;
                case 3:
                    System.out.println("Which Dragon? (name)");
                    System.out.println("\n--------- DRAGONS ---------");
                    for(Dragon dragon:dragons){
                    System.out.println(dragon);
                    }
                    name = scanner.next();
                    break;
            }
        
            System.out.println("Choose the property: \n\t1. Name\t2. Breed\t3. Gender\t4. Age");
            int property = scanner.nextInt();
            
            String newInfo = "";
            switch(property){
                case 1:

                    System.out.println("What would you like to change it to?");
                    newInfo = scanner.next();
                    
                    if(species==1){
                        for(Dog dog:dogs){
                            if(dog.getName().equals(name)){
                                dog.setName(newInfo);
                            }
                        }
                    }
                    else if(species==2){
                        for(Cat cat:cats){
                            if(cat.getName().equals(name)){
                                cat.setName(newInfo);
                            }
                        }
                    }
                    else{
                        for(Dragon dragon:dragons){
                            if(dragon.getName().equals(name)){
                                dragon.setName(newInfo);
                            }
                        }
                    }
                case 2:

                    System.out.println("What would you like to change it to?");
                    newInfo = scanner.next();

                    if(species==1){
                        for(Dog dog:dogs){
                            if(dog.getName().equals(name)){
                                dog.setBreed(newInfo);
                            }
                        }
                    }
                    else if(species==2){
                        for(Cat cat:cats){
                            if(cat.getName().equals(name)){
                                cat.setBreed(newInfo);
                            }
                        }
                    }
                    else{
                        for(Dragon dragon:dragons){
                            if(dragon.getName().equals(name)){
                                dragon.setBreed(newInfo);
                            }
                        }
                    }
                case 3:

                    System.out.println("What would you like to change it to?");
                    newInfo = scanner.next();

                    if(species==1){
                        for(Dog dog:dogs){
                            if(dog.getName().equals(name)){
                                dog.setGender(newInfo);
                            }
                        }
                    }
                    else if(species==2){
                        for(Cat cat:cats){
                            if(cat.getName().equals(name)){
                                cat.setGender(newInfo);
                            }
                        }
                    }
                    else{
                        for(Dragon dragon:dragons){
                            if(dragon.getName().equals(name)){
                                dragon.setGender(newInfo);
                            }
                        }
                    }
                case 4:
                    System.out.println("What would you like to change it to?");
                    int newAge = scanner.nextInt();
                    if(species==1){
                        for(Dog dog:dogs){
                            if(dog.getName().equals(name)){
                                dog.setAge(newAge);
                            }
                        }
                    }
                    else if(species==2){
                        for(Cat cat:cats){
                            if(cat.getName().equals(name)){
                                cat.setAge(newAge);
                            }
                        }
                    }
                    else{
                        for(Dragon dragon:dragons){
                            if(dragon.getName().equals(name)){
                                dragon.setAge(newAge);
                            }
                        }
                    }
            }

        }

        private static void removeAnimal(Scanner scanner){
            System.out.println("Choose a species: \n\t1. Dog\t2. Cat\t3. Dragon");
            int species = scanner.nextInt();
            if(species==1){
                System.out.println("Which Dog? (name)");
                    System.out.println("\n--------- DOGS ---------");
                    for(Dog dog:dogs){
                        System.out.println(dog);
                    }
                    String name = scanner.next();
                for(Dog dog:dogs){
                    if(dog.getName().equals(name)){
                        dogs.remove(name);
                    }
                }
            }
            else if(species==2){
                System.out.println("Which Cat? (name)");
                    System.out.println("\n--------- CATS ---------");
                    for(Cat cat:cats){
                    System.out.println(cat);
                    }
                    String name = scanner.next();

                for(Cat cat:cats){
                    if(cat.getName().equals(name)){
                        cats.remove(name);
                    }
                }
            }
            else{

                System.out.println("Which Dragon? (name)");
                    System.out.println("\n--------- DRAGONS ---------");
                    for(Dragon dragon:dragons){
                    System.out.println(dragon);
                    }
                    String name = scanner.next();

                for(Dragon dragon:dragons){
                    if(dragon.getName().equals(name)){
                        dragons.remove(name);
                    }
                }
            }
        }

}