package week_3;

public class Animal {
    String species;
    String name;
    int age;

    Animal(String newSpecies, String newName, int newAge){
        this.species = newSpecies;
        this.name = newName;
        this.age = newAge;
    }

    public String toString() {
        return species + ": " + name + ", " + age + " vuotta";
    }

    public void run(){
        System.out.println(name+"jouksee kovaa vauhtia!");
    }
    
}
