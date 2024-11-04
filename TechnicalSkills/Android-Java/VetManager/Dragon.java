import java.util.ArrayList;

public class Dragon {
    String name, breed, gender;
    int age;
    ArrayList<String> tricks = new ArrayList<String>();
    public Dragon(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

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

    
    public void eat() {
        System.out.println(name + " the dragon is devouring a feast fit for a king!");
    }
    public void sleep() {
        System.out.println(name + " the dragon is snoozing on a mountain of treasure.");
    }
    public void poop() {
        System.out.println(name + " the dragon left a burning pile!");
    }
    public void getTricks(){
        System.out.println(this.tricks);
    }
    public void train(String newTrick) {
        tricks.add(newTrick);
    }
    @Override
    public String toString() {
        return "Dragon : " + this.name;
    }
}
