import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name){
        clients = new ArrayList<>();
        this.name = name;
    }

    public void addClient(Animal newAnimal){
        if (clients.contains(newAnimal)){
            System.out.println(newAnimal.getName() + " is already a client of " + name);
        } else {
            System.out.println("Welcome to " + name + " office, " + newAnimal.getName() + "!");
            clients.add(newAnimal);
        }
    }
}
