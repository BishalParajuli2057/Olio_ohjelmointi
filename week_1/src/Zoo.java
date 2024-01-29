import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private List<Animal> animals;

  public Zoo(String name){
    this.name = name;
    this.animals = new ArrayList<>();
  }

  void addanimal (Animal animal){
    animals.add(animal);
  }

  void listAnimals(){
    System.out.println(name+" pitää sisällään seuraavat eläimet:");
    for (Animal animal : animals){
        System.out.println(animal);
    }
    }

    public void runAnimals (int rounds){
        for (int i=0; i<rounds; i++){
            for(Animal animal : animals){
                animal.run();
            }
        }
    }
}

