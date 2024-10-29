public class Rabbit implements Animal {

    protected String diet;
    protected String name;
    protected int age;
    protected String color;
    protected int size;

    public Rabbit(){
        this.diet = "grass";
    }

    public Rabbit(String name, int age, String color)
    {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getDiet()
    {
        return this.diet;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getColor(){
        return this.color;
    }
}
