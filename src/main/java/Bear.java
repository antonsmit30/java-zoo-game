public class Bear extends Mammal{


    public Bear(){
        this.diet = "fish";
    }

    public Bear(String name, int age, String color, int size)
    {
        this.name = name;
        this.age = age;
        this.color = color;
        this.setSize(size);
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

    // lets overLoad the setSize method, as bears cannot be smaller than 3
    public void setSize(int s) throws ArithmeticException{

        if (s < 3)
            throw new ArithmeticException("Bears cannot be smaller than 3. Value: " + s);
        else if (s > 10)
            throw new ArithmeticException("Bears cannot be larger  than 10. Value: " + s);
        else
            this.size = s;
    }


}
