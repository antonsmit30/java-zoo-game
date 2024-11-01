public class Bear implements Animal{

    protected String diet;
    protected String name;
    protected int age;
    protected String color;
    protected int size;

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

    public String getDetails(){
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Color: " + this.getColor();
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
