import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name){
        performers = new ArrayList<>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public boolean addPerformer(Performer newPerformer){
        if (performers.contains(newPerformer)){
            return false;
        }
        performers.add(newPerformer);
        return true;
    }

    public boolean removePerformer(Performer performerToRemove){
        if (performers.contains(performerToRemove)){
            performers.remove(performerToRemove);
            return true;
        }
        return false;
    }

    public double averagePerformerAge(){
        double sum = 0;
        int num = 0;
        for (Performer performer : performers){
            sum += performer.getAge();
            num ++;
        }
        return sum / num;
    }

    public ArrayList<Performer> performersOverAge(int ageLimit){
        ArrayList<Performer> overAge = new ArrayList<>();
        for (Performer performer : performers){
            if (performer.getAge() >= ageLimit){
                overAge.add(performer);
            }
        }
        return overAge;
    }

    public void groupRehearsal(){
        for (Performer performer : performers){
            System.out.println("REHEARSAL CALL! " + performer.getName());
            if (performer instanceof Comedian){
                ((Comedian) performer).rehearse(false);
            } else {
                performer.rehearse();
            }
        }
    }

    public void cabaretShow(){
        for (Performer performer : performers) {
            System.out.println("Welcome to the cabaret! Next act up... " + performer.getName());
            if (performer instanceof Dancer){
                ((Dancer) performer).pirouette(2);
            }
            performer.perform();
        }
    }
}
