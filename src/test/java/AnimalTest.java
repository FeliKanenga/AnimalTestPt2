import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    @Test
    public void TestDogSound(){
        Dog dog = new Dog();
        Assert.assertEquals(dog.sounds(),"barks");
    }

    @Test
    public void TestDogEats(){
        Dog dog = new Dog();
        Assert.assertEquals(dog.eat(),"Food");
    }
    @Test
    public void TestCatSound(){
        Cat cat = new Cat();
        Assert.assertEquals(cat.sounds(),"Meow");
    }

    @Test
    public void TestCatEats(){
        Cat cat = new Cat();
        Assert.assertEquals(cat.eat(),"Food");
    }


}
