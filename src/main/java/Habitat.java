// Our zoo animals need a habitat right, will expand on this further
// will use the habitat to do some primitive data type training
// Note that all habitats are cubes :p
import java.lang.Math;

public class Habitat {

    private String type;
    private int length;
    private boolean hasAnimalPresent;

    private Animal[] animals = {};

    // Adds an animal to the habitat
    public void addToHabitat(Animal animal){
        // create new array of bigger size
        Animal[] animals = new Animal[this.animals.length + 1];
        // insert elements from old array into new one
        for (int i = 0; i < this.animals.length; i++){
            animals[i] = this.animals[i];
        }
        // insert our new animal (probably here needs some logic to check max animals in habitat :))
        animals[this.animals.length] = animal;
        // overwriting our current array...im sure this is stupid but it works
        this.animals = animals;

    }

    public double getArea(){
        return 6*(Math.pow(this.length, 2));
    }

    // implement constructor method
    public Habitat(){
        this.hasAnimalPresent = false;
    }

    public Habitat(String type, int length){
        this.type = type;
        this.length = length;
    }

    public String getType(){
        return this.type;
    }

    public String getDetails(){
        return "Type: " + this.type + ", Area: " + this.getArea() + ", Animal Present: " + this.hasAnimalPresent();
    }

    // Checks if animal present true or false
    private boolean hasAnimalPresent(){
        return this.animals.length > 0;
    }

    // list size of habitats
    public int getAnimalCount(){
        return this.animals.length;
    }

}
