public class Cat extends Animal  {

    Cat(){

    }

    Cat (String name){
        super(name);
    }

    @Override
    public String sounds() {
        System.out.println("Cat meows");
        return "Meow";
    }


}
