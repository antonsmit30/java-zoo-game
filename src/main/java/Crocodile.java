public class Crocodile implements Reptile {

    public static String PREFERRED_HABITAT = "MARSH";
    public static String DIET = "fish";
    protected String name;
    protected int age;
    protected String color;
    protected int size;

    // implement methods
    public boolean isHabitatCorrect(Habitat h){
        return h.getType() == PREFERRED_HABITAT;
    }

    public String getDiet(){
        return Crocodile.DIET;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getColor(){
        return this.color;
    }


}
