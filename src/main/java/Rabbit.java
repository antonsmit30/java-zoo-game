public class Rabbit extends Mammal {
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
