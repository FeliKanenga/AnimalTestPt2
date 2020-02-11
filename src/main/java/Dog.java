public class Dog extends Animal {

    private String name = "Rax";

    @Override
    public String sounds() {

        System.out.println("Dog barks");
        return "barks";
    }
    @Override
    public String eat (){
        System.out.println( name + " eats");
        return super.eat();
    }
}
