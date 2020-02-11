public class MainProgram {
    public static void main(String[] args) {
        
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();

        home.makeAllSounds();

        home.adoptPet(dog1) ;
        home.makeAllSounds();

        home.adoptPet(cat1);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();
    }
}
