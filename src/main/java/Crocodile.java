public class Crocodile implements Reptile {

    public static String PREFERRED_HABITAT = "MARSH";

    public boolean isHabitatCorrect(Habitat h){
        return h.getType() == PREFERRED_HABITAT;
    }
    

}
