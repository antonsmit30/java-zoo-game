// Our zoo animals need a habitat right, will expand on this further
// will use the habitat to do some primitive data type training
// Note that all habitats are cubes :p
import java.lang.Math;

public class Habitat {

    private String type;
    private int length;
    private boolean hasAnimalPresent;

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

    public String getDetails(){
        return "Type: " + this.type + ", Area: " + this.getArea() + ", Animal Present: " + this.hasAnimalPresent;
    }

}
