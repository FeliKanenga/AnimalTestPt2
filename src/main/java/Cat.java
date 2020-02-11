public class Cat extends Animal  {

    private String name = "Storm";

    @Override
    public String sounds() {
        System.out.println("Cat meows");
        return "Meow";
    }

    @Override
    public String eat (){
        System.out.println(name +" eats");
        return super.eat();

    }
}
