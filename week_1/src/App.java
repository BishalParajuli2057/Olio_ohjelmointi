import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna eläintarhalle nimi:");
        String zooName = scanner.nextLine();
        Zoo zoo = new Zoo(zooName);

        while (true) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.println("Mikä laji?");
                String species = scanner.nextLine();
                System.out.println("Anna eläimen nimi:");
                String name = scanner.nextLine();
                System.out.println("Anna eläimen ikä:");
                int age = scanner.nextInt();
                scanner.nextLine(); 

                Animal animal = new Animal(species, name, age);
                zoo.addanimal (animal);
            } else if (choice == 2) {
                zoo.listAnimals();
            } else if (choice == 3) {
                System.out.println("Kuinka monta kierrosta?");
                int rounds = scanner.nextInt();
                zoo.runAnimals(rounds);
                scanner.nextLine(); 
            } else if (choice == 0) {
                System.out.println("Kiitos ohjelman käytöstä.");
                break;
            } else {
                System.out.println("Syöte oli väärä");
            }
        }
    }
}
