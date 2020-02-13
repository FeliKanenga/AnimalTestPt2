public class Dog extends Animal {

    Dog(){

    }

    Dog(String name){
        super(name);
    }

    @Override
    public String sounds() {

        System.out.println("Dog barks");
        return "barks";
    }

}
