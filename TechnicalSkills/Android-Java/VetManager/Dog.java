public class Dog {
    //field variables or gloabl variables
    private String name, breed, gender;
    private int age;

    //constructor - builds an object
    public Dog(String name, String breed, String gender, int age) {
        // this is to allow java to connect the name var to the object we call in other files
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }
    // no-arg Constructor
    public Dog(){}

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    // extra f(x)
    public void eat() {
        System.out.println(this.name + " the dog is munching on some shoes!");
    }
    public void sleep() {
        System.out.println("Is that a dog or a chainsaw");
    }
    public void poop() {
        System.out.println(this.name + "left a dinosaur size turd on the front porch");
    }
    // toString
    @Override
    public String toString(){
        return "Dog: " + this.name;
    }
}
