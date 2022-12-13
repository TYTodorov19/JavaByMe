public class Person extends Mammal implements Animal {
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public Person(int age)
    {

    }

    @Override
    public void eat() {
        System.out.println("Person is eating..");
    }

    @Override
    public void main() {

    }

    @Override
    public void walk() {
        System.out.println("Person is walking..");
    }

    @Override
    public void test(String text)
    {
        System.out.println("Testing in Mammal");
    }
}
