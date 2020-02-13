public class Animal {
    private String name;

    Animal(){

    }

    Animal(String name){
        this.name = name;
    }

    public String sounds(){
        System.out.println("");
        return "";
    }

    public String eat (){
        System.out.println(name + " eats");
        return "Food";
    }
}
