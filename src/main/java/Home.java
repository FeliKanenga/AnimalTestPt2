import java.util.ArrayList;

public class Home {
    public String object;

    ArrayList<Animal> pet = new ArrayList<Animal>();


    public void adoptPet(Animal object)   {
        pet.add(object);
        System.out.println("This prints : ");
    }

    public void makeAllSounds(){

        for (Animal i: pet) {
            i.sounds();
        }

    }

}
